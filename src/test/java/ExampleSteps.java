import com.sun.org.apache.xpath.internal.SourceTree;
import org.jbehave.core.annotations.*;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.steps.BeforeOrAfterStep;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.StepCandidate;
import org.junit.Assert;

import java.util.List;

/**
 * Created by INSZ on 11/11/2015.
 */
public class ExampleSteps {

    private int number1;
    private int number2;
    private int number3;

    @Given("number1 1 and number2 2")
    public void firstGiven(int number1, int number2) {
        number1 = 1;
        number2 = 2;
        Assert.assertEquals("The input is not an integer", 1, number1);
        Assert.assertEquals("The input is not an integer", 2, number2);

    }

    @When("I call the sum function")
    public void firstWhen() {

        number3 = Calculator.addition(number1, number2);
        System.out.println("The result is: " + number3);
        System.out.println("sss " + number3);
    }

    @Then("it returns number3 3 which is the result of number1 1 plus number2 2")
    public void firstThen(@Named("number1")int number1, @Named("number2")int number2, @Named("number3")int number3)
    {
        number1 = 1;
        number2 = 2;
        number3 = Calculator.addition(number1, number2);
        Assert.assertEquals("Test failed.", 3, number3);
        Assert.assertEquals("Test failed.", 3, number1);
        Assert.assertEquals("Test failed.", 3, number2);

    }
}
