package com.example.service;

import java.util.List;

import com.example.dao.Vechile;

public interface VechileService {

	List<Vechile> getVechile(Vechile vechile);

	Vechile createVechile(Vechile vechile);

	void deleteVechileById(Long id);

	Vechile getVechileById(Long id);

}
