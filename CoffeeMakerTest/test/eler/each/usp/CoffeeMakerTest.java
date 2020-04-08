package eler.each.usp;

import each.usp.ach2006.adaptedfromcsc326.eler.CoffeeMaker;
import each.usp.ach2006.adaptedfromcsc326.eler.Recipe;
import each.usp.ach2006.adaptedfromcsc326.eler.exceptions.AmountOfRecipeException;
import each.usp.ach2006.adaptedfromcsc326.eler.exceptions.DuplicatedRecipeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest {
	
	private CoffeeMaker CM;
	private Recipe r1;
	private Recipe r2;


	@BeforeEach
	public void setUp() throws Exception {
		CM = new CoffeeMaker();
		r1 = new Recipe("Coffee",50,4,0,1,0);
		r2 = new Recipe("Hot Chocolate",75,0,3,1,3);
	}
	
	
	/* Testa adicionar uma receita
	 * 
	 */
	@Test
	public void testAddOneRecipe() throws AmountOfRecipeException, DuplicatedRecipeException{
		boolean ok = CM.addRecipe(r1);
		assertTrue(ok);
	}
	
}
