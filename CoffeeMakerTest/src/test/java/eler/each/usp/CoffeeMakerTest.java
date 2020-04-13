package eler.each.usp;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import each.usp.ach2006.adaptedfromcsc326.eler.Recipe;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author orlando
 */
public class CoffeeMakerTest extends TestCase{
    

    @BeforeAll
    public void setup(){
        FixtureFactoryLoader.loadTemplates("eler.each.usp.templates");
    }
    
    @Test
    public void testTemplate(){
        FixtureFactoryLoader.loadTemplates("eler.each.usp.templates");
        Recipe recipe = Fixture.from(Recipe.class).gimme("valid");
        System.out.println("OK");
        System.out.println("recipe");
    }

}
