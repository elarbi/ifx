package fr.irit.ifclipse.injection;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.controller.IFClipseController;

public abstract class UpdateImpactStrategyImpl implements UpdateImpactStrategy {

	protected IFClipseController ctlr;

	protected Resource injectXML(String s) {
		return ctlr.getInjector()
				.inject(new BufferedInputStream(new ByteArrayInputStream(s
						.getBytes())));
	}

}
