import junit.framework.Assert;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by INSZ on 12/11/2015.
 */
public class RestMiauSteps {

    private String url;
    private ContactHelper contactHelper;
    private Contact contact;

    @Given ("a url $url")
    public void givenStep(String url){
        url = "http://jsonplaceholder.typicode.com";
        contactHelper = new ContactHelper("site","user", "password", url);
    }

    @When("I send a message")
    public void whenStep(){
        contact = contactHelper.GetContact(1);
    }


    @Then ("I get an id $id")
    public void thenStep(int id){
        Assert.assertEquals("Test fail",1,contact.id);
    }

}
