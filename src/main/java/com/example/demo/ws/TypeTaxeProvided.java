package com.example.demo.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.TypeTaxe;

@RestController
@RequestMapping("gestion-notification/Dgi")
public class TypeTaxeProvided {
	@Autowired
	private TypeTaxeProvided typetaxeService;

	@GetMapping("/refTypeTaxe/{refTypeTaxe}")
	public TypeTaxe findByRefTypeTaxe(@PathVariable String refTypeTaxe) {
	return typetaxeService.findByRefTypeTaxe(refTypeTaxe);
}

@DeleteMapping("/refTypeTaxe/{refTypeTaxe}")
public int deleteByRefTypeTaxe(@PathVariable String refTypeTaxe) {
	return typetaxeService.deleteByRefTypeTaxe(refTypeTaxe);
}

	
	

}
