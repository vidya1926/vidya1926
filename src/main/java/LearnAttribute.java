import org.testng.annotations.Test;

public class LearnAttribute {

	
	@Test(dependsOnMethods={"getLiscence","passTest"},alwaysRun=true)
	public void driverCar() {
		System.out.println("Wish to drive a car");
	}
	
	@Test
	public void getLiscence() {
		System.out.println("get the Liscence");
		throw new RuntimeException();
	}
	
	@Test
	public void passTest() {
		System.out.println("Pass the test to get liscence");
	}
	
	
}
