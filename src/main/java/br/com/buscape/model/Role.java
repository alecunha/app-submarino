package br.com.buscape.model;

import br.com.buscape.enumtype.CardinalPointEnum;
import br.com.buscape.enumtype.CommandEnum;

public class Role {

	public Position update(Position position, CommandEnum command) {
		CardinalPointEnum direction = position.getDirection();
		if (command.equals(CommandEnum.R)) {
			position.setDirection(direction.right());
		} else if (command.equals(CommandEnum.L)) {
			position.setDirection(direction.left());
		} else if(command.equals(CommandEnum.M)) {
			position = updateMove(position, direction);
		} else if(command.equals(CommandEnum.U)) {
			int z = position.getZ() + 1;
			position.setZ(z);
		} else if(command.equals(CommandEnum.D)) {
			int z = position.getZ() - 1;
			position.setZ(z);
		}
		  
		return position;	
	}

	public Position updateMove(Position position, CardinalPointEnum direction) {
		if (direction.equals(CardinalPointEnum.NORTE)) {
			int y = position.getY() + 1;
			position.setY(y);
		} else if (direction.equals(CardinalPointEnum.SUL)) {
			int y = position.getY() - 1;
			position.setY(y);
		} else if (direction.equals(CardinalPointEnum.LESTE)) {
			int x = position.getX() + 1;
			position.setX(x);
		} else if (direction.equals(CardinalPointEnum.OESTE)) {
			int x = position.getX() - 1;
			position.setX(x);
		}
		return position;
	}
	 
	
}
