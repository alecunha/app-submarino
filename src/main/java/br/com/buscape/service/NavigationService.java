package br.com.buscape.service;

import org.springframework.stereotype.Service;

import br.com.buscape.enumtype.CardinalPointEnum;
import br.com.buscape.enumtype.CommandEnum;
import br.com.buscape.model.Position;
import br.com.buscape.model.Role;

@Service
public class NavigationService {

	private Role role = new Role();
	
	public Position execute(String line) {
		Position position = new Position(0,0,0, CardinalPointEnum.NORTE);
		
		for (char c : line.toCharArray()) {
			CommandEnum command = CommandEnum.valueOf(String.valueOf(c));
			position = role.update(position, command);
		}
		
		return position;
	}
}
