package watchFace.chronoFace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import watchFace.chronoFace.service.ChronoService;

@RestController
public class chronoController {
	
	@Autowired
	private ChronoService chronoService;
	
	private int scriptNumber;

	@RequestMapping(path="setRefills/{scriptNumber}",produces = "application/json")
	public int determineRefillsetter(@PathVariable int scriptNumber){
		this.scriptNumber = scriptNumber;
		System.out.println("set refills has been triggered");
		return this.scriptNumber;
	}
	
	@RequestMapping(path="determineRefills",produces = "application/json")
	public int determineRefills(){
		scriptNumber = chronoService.refillCheck(scriptNumber);
		System.out.println("determine refills has been triggered");
		return scriptNumber;
	}
}
