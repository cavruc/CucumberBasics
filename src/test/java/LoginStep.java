import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
   @Given("I navigate to the login page")
    public void aaa(){

   }

    @And ("I enter username as admin and password as admin")
    public void bbb(){

    }
    @And ("I click login button")
    public void ccc(){

    }
    @Then ("I should see the userform page")
    public void ddd(){
        throw new PendingException();
    }
}
