package tests;


import org.testng.annotations.Test;

// Then this is where we write our tests that will actually run to test the Login
// So since our tools are stored in our Base class, we need to at least inherit the Base class
// so that we can have access to whatever we want in that Base class
public class LoginTests extends Base {

    // So the simplicity here suggests that we created a test method that fetches that homePage child from the Base class
    // since we have access, and that homePage child holds access to a method called clickLoginButton which is located in
    // the HomePage class
    @Test
    public void testLoginButton() throws InterruptedException {
       homePage.clickLoginButton();
    }

}
