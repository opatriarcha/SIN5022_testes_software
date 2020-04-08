package eler.each.usp;


import each.usp.ach2006.adaptedfromcsc326.eler.Recipe;
import each.usp.ach2006.adaptedfromcsc326.eler.exceptions.InvalidValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecipeTest {
	/*Testa a cria��o de uma receita
	 
	 */
	
	@Test
	public void testCreateValidRecipe() throws InvalidValueException{
		Recipe recipe = new Recipe("Coffee",50,4,0,1,0);
		//se nao lan�ar exce��o � porque a receita foi criada
		assertEquals(50,recipe.getPrice());
	}
}
