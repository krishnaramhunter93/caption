package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Vechile;
import com.example.repository.VechileRepository;
import com.example.service.VechileService;
@Service
public class VechileServiceImpl implements VechileService {
	@Autowired
	VechileRepository vechileRepository;

	@Override
	public List<Vechile> getVechile(Vechile vechile) {
		// TODO Auto-generated method stub
		return vechileRepository.findAll();
	}

	@Override
	public Vechile createVechile(Vechile vechile) {
		
		return vechileRepository.save(vechile);
	}

	@Override
	public void deleteVechileById(Long id) {
		// TODO Auto-generated method stub
		vechileRepository.deleteById(id);;;
	}

	@Override
	public Vechile getVechileById(Long id) {
		
		return vechileRepository.findById(id).orElse(null);
	}

}
