package com.annotationsandreflections.healthcheckpro;

public class LabTestController {

	@PublicAPI
	@AppInfo(description = "get list of available lab test")
	public void getAllTests() {}
	
	@RequiresAuth
	@AppInfo(description = "Book a lab test")
	public void bookTest() {}
	
	public void deleteTest() {
		
	}
}
