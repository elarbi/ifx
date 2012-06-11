package fr.irit.ifclipse.transformer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage;

public class TransformerContext {

	protected String sourceEPackageUri;
	protected String targetEPackageUri;

	// source and target metamodel names in the ATL ASM module
	protected String sourceMetamodelName;
	protected String targetMetamodelName;
	protected ASM trafoModule;

	public static TransformerContext getDefaultIFConfigContext(URL asmURL) {
		return new TransformerContext(IFConfigPackage.eNS_URI,
				IFConfigPackage.eNS_URI, "IFConfig", "IFConfig_out", asmURL);
	}

	public static TransformerContext getDefaultScenarioContext(URL asmURL) {
		return new TransformerContext(ScenarioPackage.eNS_URI,
				ScenarioPackage.eNS_URI, "Scenario", "Scenario_out", asmURL);
	}

	public TransformerContext(String sourceEPackageUri,
			String targetEPackageUri, String sourceMetamodelName,
			String targetMetamodelName, URL trafoModuleUrl) {
		super();
		this.sourceEPackageUri = sourceEPackageUri;
		this.targetEPackageUri = targetEPackageUri;
		this.sourceMetamodelName = sourceMetamodelName;
		this.targetMetamodelName = targetMetamodelName;
		trafoModule = buildTrafoASM(trafoModuleUrl);

	}

	protected ASM buildTrafoASM(URL trafoModuleURL) {
		ASM asm = null;
		try {
			asm = buildTrafoASM(trafoModuleURL.openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asm;
	}

	protected ASM buildTrafoASM(InputStream trafoModuleInStream) {
		ASM asm = null;
		asm = new ASMXMLReader().read(new BufferedInputStream(
				trafoModuleInStream));
		return asm;
	}

}
