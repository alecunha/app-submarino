package br.com.buscape.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.buscape.enumtype.CardinalPointEnum;
import br.com.buscape.model.Position;
import br.com.buscape.service.NavigationService;

public class RoleTest {

	NavigationService ns = new NavigationService();
	
	@Test
	public void navigationTest () {
		String line = "RMMLMMMDDLL";
		
		Position p = ns.execute(line);
		
		Assert.assertTrue(p.getX() == 2);
		Assert.assertTrue(p.getY() == 3);
		Assert.assertTrue(p.getZ() == -2);
		Assert.assertTrue(p.getDirection().equals(CardinalPointEnum.SUL));
		
	}
}
