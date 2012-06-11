package fr.irit.ifclipse.transformer;


public class IF2VDTransformer extends ResourceTransformer {
	// executer une query.atl qui rend un ifconfig qui dira qsq je veux
	// diagnostiquer (contentProvider)
	// et seulement après executer la transfo ci-dessus qui dit comment je veux
	// le representer (labelProvide)
	// Cette transfo devra prendre en param 2 model : ifconfig et le model du
	// DSL de representation
	//
	// private String sourceMetamodelName2;
	// private String sourceEPackageUri2;
	// private String vdModelPath;
	//
	// public IF2VDTransformer() {
	// URL trafoModuleURL = IF2VDTransformer.class
	// .getResource("resources/IFConfig2VisualDiagnostic.asm");
	// buildTrafoASM(trafoModuleURL);
	// sourceEPackageUri = IFConfigPackage.eNS_URI;
	// sourceEPackageUri2 = VDMappingPackage.eNS_URI;
	// sourceMetamodelName = "IFConfig";
	// sourceMetamodelName2 = "VDMapping";
	// vdModelPath = "D:/eclipse/vdResources/mapping.xmi";
	//
	// targetEPackageUri = VisualDiagnosticPackage.eNS_URI;
	// targetMetamodelName = "VisualDiagnostic";
	//
	// }
	//
	// @Override
	// protected void updateTargetResource(final EMFModel targetM) {
	//
	// EList<EObject> targetMContents = targetM.getResource().getContents();
	// if (targetMContents.size() > 0) {
	//
	// if (targetMContents.get(0) instanceof VisualDiagnostic) {
	// VisualDiagnostic visualD = (VisualDiagnostic) targetMContents
	// .get(0);
	// controller.updateVisualDRes(visualD);
	// }
	//
	// }
	//
	// }
	//
	// @Override
	// public void notifyChanged(Notification notification) {
	// if (notification.getEventType() == Notification.ADD
	// || notification.getEventType() == Notification.SET) {
	// if (notification.getNotifier() instanceof Resource) {
	// try {
	// if (notification.getNotifier() instanceof Resource) {
	//
	// EMFInjector injector = new EMFInjector();
	// emfVmLauncher = new EMFVMLauncher();
	// emfVmLauncher.initialize(Collections
	// .<String, Object> emptyMap());
	//
	// // load source MM 1
	// EMFReferenceModel sourceMM = (EMFReferenceModel) emfModelFactory
	// .newReferenceModel();
	// injector.inject(sourceMM, EPackage.Registry.INSTANCE
	// .getEPackage(sourceEPackageUri).eResource());
	//
	// // load source MM 2
	// EMFReferenceModel sourceMM2 = (EMFReferenceModel) emfModelFactory
	// .newReferenceModel();
	// injector.inject(sourceMM2, EPackage.Registry.INSTANCE
	// .getEPackage(sourceEPackageUri2).eResource());
	//
	// // load target MM
	// EMFReferenceModel targetMM = (EMFReferenceModel) emfModelFactory
	// .newReferenceModel();
	// injector.inject(targetMM, EPackage.Registry.INSTANCE
	// .getEPackage(targetEPackageUri).eResource());
	//
	// // load source M 1
	// EMFModel sourceM = (EMFModel) emfModelFactory
	// .newModel(sourceMM);
	// injector.inject(sourceM,
	// (Resource) notification.getNotifier());
	// emfVmLauncher.addInModel(sourceM, "IN1",
	// sourceMetamodelName);
	//
	// // load source M 2
	// EMFModel sourceM2 = (EMFModel) emfModelFactory
	// .newModel(sourceMM2);
	//
	// InputStream vdXmiFile = new FileInputStream(vdModelPath);
	// injector.inject(sourceM2, vdXmiFile,
	// Collections.<String, Object> emptyMap());
	// emfVmLauncher.addInModel(sourceM2, "IN2",
	// sourceMetamodelName2);
	//
	// // load target M
	// EMFModel targetM = (EMFModel) emfModelFactory
	// .newModel(targetMM);
	// emfVmLauncher.addOutModel(targetM, "OUT",
	// targetMetamodelName);
	//
	// // launch the transfo
	//
	// emfVmLauncher.launch(ILauncher.RUN_MODE,
	// new NullProgressMonitor(),
	// Collections.<String, Object> emptyMap(),
	// trafoModule);
	//
	// updateTargetResource(targetM);
	//
	// }
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (ATLCoreException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// }
	// }
}
