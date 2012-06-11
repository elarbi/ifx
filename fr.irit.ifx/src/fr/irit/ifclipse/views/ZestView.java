package fr.irit.ifclipse.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphContentProvider;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;

import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement;
import fr.irit.ifclipse.visual.patterns.ComDiag.Message;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph;

public class ZestView extends ViewPart implements IZoomableWorkbenchPart {
	public static final String ID = "fr.irit.ifclipse.views.ZestView";
	private GraphViewer viewer;

	public void createPartControl(Composite parent) {
		viewer = new GraphViewer(parent, SWT.BORDER);
		LayoutAlgorithm layout = setLayout();
		viewer.setLayoutAlgorithm(layout, true);
		viewer.applyLayout();
		// fillToolBar();
	}

	public void refresh(Resource resource) {

		if (resource.getContents().size() > 0) {
			EObject eObj = resource.getContents().get(0);

			if (eObj instanceof ZestGraph) {
				comDiag2ZestGraph((ZestGraph) eObj);
			}
			if (eObj instanceof ComDiag) {
				comDiag2ZestGraph((ComDiag) eObj);
			}

		}

	}

	private LayoutAlgorithm setLayout() {
		LayoutAlgorithm layout;
		// layout = new
		// SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		// layout = new
		// TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		// layout = new
		// GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		// layout = new
		// HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		layout = new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		return layout;

	}

	@Deprecated
	private void comDiag2ZestGraph(ComDiag comDiag) {
		viewer.setContentProvider(new ComDiagContentProvider());
		viewer.setLabelProvider(new ComDiagLabelProvider()); // I should reuse
																// EMF generated
																// one
		viewer.setInput(comDiag);
	}

	private void comDiag2ZestGraph(ZestGraph zestGraph) {
		viewer.setContentProvider(new ZestContentProvider());
		// I should reuse
		// EMF generated
		// one
		viewer.setLabelProvider(new ZestLabelProvider());
		viewer.setInput(zestGraph);
	}

	static class ZestContentProvider implements IGraphContentProvider {

		public Object getSource(Object obj) {
			if (obj instanceof GraphConnection) {
				GraphConnection c = (GraphConnection) obj;
				return c.getSourceNode();
			}
			return null;
		}

		public Object[] getElements(Object input) {
			// returns messages.
			if (input instanceof ZestGraph) {
				ZestGraph graph = (ZestGraph) input;
				List<GraphConnection> connections = new ArrayList<GraphConnection>();
				for (GraphItem elt : graph.getItems()) {
					if (elt instanceof GraphConnection)
						connections.add((GraphConnection) elt);
				}

				return connections.toArray();
				// return messages.toArray(new Object[messages.size()]) ;
				// labels.toArray(new String[labels.size()]));
			} else
				return null;
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub

		}

		public Object getDestination(Object obj) {
			if (obj instanceof GraphConnection) {
				GraphConnection c = (GraphConnection) obj;
				return c.getTargetNode();
			}
			return null;

		}

	}

	static class ZestLabelProvider extends LabelProvider {
		// final Image image =
		// Display.getDefault().getSystemImage(SWT.ICON_WARNING);

		public Image getImage(Object element) {
			// if (element.equals("Rock") || element.equals("Paper")
			// || element.equals("Scissors")) {
			// return image;
			// }
			return null;
		}

		public String getText(Object elt) {
			if (elt instanceof GraphItem) {
				return ((GraphItem) elt).getText();
			} else
				return null;
		}
	}

	static class ComDiagContentProvider implements IGraphContentProvider {

		public Object getSource(Object rel) {
			if (rel instanceof Message) {
				Message m = (Message) rel;
				return m.getSource();
			}
			return null;
		}

		public Object[] getElements(Object input) {
			// returns messages.
			if (input instanceof ComDiag) {
				ComDiag diag = (ComDiag) input;
				List<Message> messages = new ArrayList<Message>();
				for (ComDiagElement elt : diag.getElements()) {
					if (elt instanceof Message)
						messages.add((Message) elt);
				}

				return messages.toArray();
				// return messages.toArray(new Object[messages.size()]) ;
				// labels.toArray(new String[labels.size()]));
			} else
				return null;
		}

		public Object getDestination(Object rel) {
			if (rel instanceof Message) {
				Message m = (Message) rel;
				return m.getTarget();
			}
			return null;

		}

		public double getWeight(Object connection) {
			return 0;
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

	static class ComDiagLabelProvider extends LabelProvider {
		// final Image image =
		// Display.getDefault().getSystemImage(SWT.ICON_WARNING);

		public Image getImage(Object element) {
			// if (element.equals("Rock") || element.equals("Paper")
			// || element.equals("Scissors")) {
			// return image;
			// }
			return null;
		}

		public String getText(Object elt) {
			if (elt instanceof ComDiagElement) {
				return ((ComDiagElement) elt).getName();
			} else
				return null;
		}
	}

	public void setFocus() {
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public AbstractZoomableViewer getZoomableViewer() {
		// TODO Auto-generated method stub
		return null;
	}

}
