package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Vechile;
import com.example.service.VechileService;

@RestController
@RequestMapping("/api1")
public class VechileController {

	@Autowired
	private VechileService vechileService;

	@GetMapping("/getVechile")
	public List<Vechile> getVechile(@RequestBody Vechile vechile) {

		return vechileService.getVechile(vechile);

	}
	@GetMapping
	public Vechile getVechileById(@PathVariable Long id) {
		return vechileService.getVechileById(id);
	}

	@PostMapping("/createVechile")
	public Vechile createVechile(@RequestBody Vechile vechile) {

		return vechileService.createVechile(vechile);
	}

	@DeleteMapping("/{id}")
	public void deleteVechileById(@PathVariable Long id) {
		vechileService.deleteVechileById(id);

	}
	

	@PutMapping("/updateVechhile")
	public Vechile updateVechhile(@PathVariable Long id, @RequestBody Vechile updatevechile) {
		Vechile vh = vechileService.getVechileById(id);
		if (vh != null) {
			vh.setModelNumber(updatevechile.getModelNumber());
			vh.setOwnerName(updatevechile.getOwnerName());
			vh.setvName(updatevechile.getvName());
			return vechileService.createVechile(updatevechile);
		}

		return null;

	}

}
