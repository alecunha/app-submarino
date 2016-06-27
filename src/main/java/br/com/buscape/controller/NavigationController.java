package br.com.buscape.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.buscape.service.NavigationService;

@RestController//(value="/navegacao")
public class NavigationController {

	@Autowired
	NavigationService navigationService;
	
	@RequestMapping(value="/linha-comando/{line}",method = RequestMethod.GET)
	@ResponseBody
	public String getPosition(@PathVariable String line) {
		return navigationService.execute(line).toString();
	}
}
