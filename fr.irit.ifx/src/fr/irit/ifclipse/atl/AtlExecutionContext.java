package fr.irit.ifclipse.atl;

import org.eclipse.emf.ecore.resource.Resource;

public class AtlExecutionContext {

	Resource sourceMM;
	Resource targetMM;
	Resource sourceM;
	public String sourceMetamodelName;
	public String targetMetamodelName;

	public AtlExecutionContext(Resource sourceMM, Resource targetMM,
			Resource sourceM, String sourceMetamodelName,
			String targetMetamodelName) {
		super();
		this.sourceMM = sourceMM;
		this.targetMM = targetMM;
		this.sourceM = sourceM;
		this.sourceMetamodelName = sourceMetamodelName;
		this.targetMetamodelName = targetMetamodelName;
	}

}
