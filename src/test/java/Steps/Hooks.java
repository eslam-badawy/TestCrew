package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

import com.stc.base.Base;

public class Hooks extends Base {
    public Hooks() throws IOException {
    }

    @Before
    public void runsBeforeAnyScenario(){
        initializeBrowser();

    }

    @After
    public void tearDown() {
            driver.quit(); 
    }
}
