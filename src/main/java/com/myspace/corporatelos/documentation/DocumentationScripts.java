package com.myspace.corporatelos.documentation;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DocumentationScripts implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public DocumentationScripts() {
	}
	public static void prepareProcessesList(
			org.kie.api.runtime.process.ProcessContext kcontext) {
		try {

			java.util.ArrayList procList = new java.util.ArrayList();
			boolean modifiedFlag = Boolean.parseBoolean(kcontext.getVariable(
					"isModifiedFacility").toString());
			boolean newFlag = Boolean.parseBoolean(kcontext.getVariable(
					"isNewFacility").toString());
			if (newFlag) {
				procList.add("CorporateLOS.CompleteDocPrepReview");
				procList.add("CorporateLOS.ChooseDocumentGenerationAndDeliveryMethods");
				procList.add("CorporateLOS.SelectDocuments");
				procList.add("CorporateLOS.GenerateDocuments");
				procList.add("CorporateLOS.DocumentPackageReview");
				procList.add("CorporateLOS.DocumentDelivery");
				procList.add("CorporateLOS.DocumentStorage");
			}
			kcontext.setVariable("processesList", procList);
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		}
	}

}