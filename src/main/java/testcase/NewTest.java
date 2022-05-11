package testcase;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test()
  public void runCreateLead() {
	  System.out.println("Createlead");
	  throw new RuntimeException();
  }
    
  @Test()
  public void editLead() {
	  System.out.println("editLead");
  }
  
  @Test()
  public void deleteLead() {
	  System.out.println("deleteLead");
  }
}
