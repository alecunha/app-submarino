package br.com.buscape.test;
import org.junit.Assert;
import org.junit.Test;

import br.com.buscape.enumtype.CardinalPointEnum;

public class DirectionTest {

	private CardinalPointEnum c = CardinalPointEnum.NORTE;
	
	@Test
	public void testNext() {	
		Assert.assertTrue(c.right().equals(CardinalPointEnum.LESTE));
	}
	
	@Test
	public void testPrevious() {
		Assert.assertTrue(c.left().equals(CardinalPointEnum.OESTE));
	}
}
