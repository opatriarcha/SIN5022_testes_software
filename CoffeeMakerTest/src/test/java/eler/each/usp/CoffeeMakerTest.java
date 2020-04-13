package eler.each.usp;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import each.usp.ach2006.adaptedfromcsc326.eler.CoffeeMaker;
import each.usp.ach2006.adaptedfromcsc326.eler.Recipe;
import each.usp.ach2006.adaptedfromcsc326.eler.exceptions.InvalidValueException;
import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author orlando
 */
public class CoffeeMakerTest extends TestCase{
    
    /*
| ID | Entrada          | Oráculo            | Classe de Equivalência |
|----|------------------|--------------------|------------------------|
|1   | nome="teste"     | true               | C1, V1                 |
|2   | nome=""          | false              | C2, V2                 |
|3   | nome="  "        | false              | C2, V2.1               |
|4   | preco = 5        | true               | C3, V3                 |
|5   | preco = -1       | false              | C4, V4                 |
|6   | preco = 0        | false              | C4, V5                 |
|7   | amtCoffee = 5    | true               | C5, V5                 |
|8   | amtCoffee = -1   | false              | C6, V6                 |
|9   | amtChocolate = 5 | true               | C7, V7                 |
|10  | amtChocolate = -1| false              | C8, V8                 |
|11  | amtSugar = 5     | true               | C9, V9                 |
|12  | amtSugar = -1    | false              | C10, V10               |
|13  | amtMilk = 5      | true               | C11, V11               |
|14  | amtMilk = -1     | false              | C12, V12               |
|15  |amtSugar=1, amtChocolate=1,  amtMilk=1 amtCoffee=1  (V13) <br>AmtSugar=1, amtChocolate=0,  amtMilk=0 amtCoffee=0  (V15)<br>	amtSugar=0, amtChocolate=1,  amtMilk=0 amtCoffee=0  (V16)<br>	amtSugar=0, amtChocolate=0,  amtMilk=0 amtCoffee=1  (V17)<br>|amtSugar=0, amtChocolate=0,  amtMilk=0 amtCoffee=0 <br> 	V14|
    */

    @BeforeAll //not working
    static void setup(){
        System.out.println("beforeall");
        FixtureFactoryLoader.loadTemplates("eler.each.usp.templates");
    }
    
    @BeforeEach //not working
    public void setupEachTest(){
        System.out.println("beforeEach");
        FixtureFactoryLoader.loadTemplates("eler.each.usp.templates");
    }
    
    static{ //working gabiarra
        FixtureFactoryLoader.loadTemplates("eler.each.usp.templates");
    }
    
    @Test//ID1
    public void testValid(){              
        assertNotNull(Fixture.from(Recipe.class).gimme("valid01"));
    }
    
    @Test//ID2
    public void testInvalidName(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe("nameEmpty"));
        
    }
    
    @Test//ID3
    public void testInvalidNameWithOnlySpaces(){               
        assertThrows(InvalidValueException.class, () -> Fixture.from(Recipe.class).gimme("nameOnlySpaces"));
    }
    
    @Test//ID4
    public void testInvalidNegativePrice(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe( "negativePrice"));        
    }
    
    @Test //ID 7   | amtCoffee = 5    | true               | C5, V5                 |
    public void testValidRecipeCofee() throws Exception{               
        assertNotNull(gimmeRecipe("valid5UnitsEach"));        
    }
    
    @Test//ID8   | amtCoffee = -1   | false              | C6, V6                 |
    public void testNegativeAmountCoffee(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe("cofeeNegative"));        
    }
    
    @Test //ID9   | amtChocolate = 5 | true               | C7, V7                 |
    public void testValidRecipeChocolate() throws Exception{               
        assertNotNull(gimmeRecipe("valid5UnitsEach"));        
    }
    
    @Test//ID10  | amtChocolate = -1| false              | C8, V8                 |
    public void testNegativeAmountChocolate(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe("chocolateNegative"));        
    }
    
    @Test //ID11  | amtSugar = 5     | true               | C9, V9                 |
    public void testValidRecipeSugar() throws Exception{               
        assertNotNull(gimmeRecipe("valid5UnitsEach"));        
    }
    
    @Test//ID12  | amtSugar = -1    | false              | C10, V10               |
    public void testNegativeAmountSugar(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe("sugarNegative"));        
    }

    @Test //ID13  | amtMilk = 5      | true               | C11, V11               |
    public void testValidRecipeMilk() throws Exception{               
        assertNotNull(gimmeRecipe("valid5UnitsEach"));        
    }
    
    @Test//ID14  | amtMilk = -1     | false              | C12, V12               |    
    public void testNegativeAmountMilk(){               
        assertThrows(InvalidValueException.class, () -> gimmeRecipe("milkNegative"));        
    }
    
    
    /**
     * Return the correct Fixture or translate the inner exception.
     * @param fixtureName The fixture name from template
     * @return the fixture complete.
     * @throws Exception the inner exception raised.
     */
    private Recipe gimmeRecipe(String fixtureName) throws Exception{
        try{
            Recipe recipe = Fixture.from(Recipe.class).gimme(fixtureName);
            //return Fixture.from(Recipe.class).gimme(fixtureName);
            return recipe;
        }catch(Exception ex){
            Exception innerException = (Exception) ex.getCause();
            throw innerException;
        }        
    }
    
    /**
     * Return the correct Fixture or translate the inner exception.
     * @param fixtureName The fixture name from template
     * @return the fixture complete.
     * @throws Exception the inner exception raised.
     */
    private Recipe gimmeCofeeMaker(String fixtureName) throws Exception{
        try{
            return Fixture.from(CoffeeMaker.class).gimme(fixtureName);
        }catch(Exception ex){
            Exception innerException = (Exception) ex.getCause();
            throw innerException;
        }        
    }
    

}
