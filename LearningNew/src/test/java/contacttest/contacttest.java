package contacttest;

import org.testng.annotations.Test;

public class contacttest {
	@Test(groups= "regressionTest")
	public void createContactTest() {
		System.out.println("Execute createcontact");

	}

	@Test(groups="regressionTest")
	public void editOrgTest() {
		System.out.println("Execute editcontact");
	}
}
