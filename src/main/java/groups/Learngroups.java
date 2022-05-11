package groups;
import org.testng.annotations.Test;

public class Learngroups {

	@Test(groups={"sanity","functional"})
	public void loginPage()  {
		System.out.println("Login is successful");
		throw new RuntimeException();
	}
		
	@Test(groups="smoke", dependsOnGroups="sanity",alwaysRun=true)
	public void mergeLead() {
		System.out.println("Merged two leads");
	}
	
	
	@Test(groups="sanity")
	public void deleteLead() {
		System.out.println("Deleted the lead");
	}
	
}
