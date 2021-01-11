package com.nidal.dojoninjas.services;

import org.springframework.stereotype.Service;

import com.nidal.dojoninjas.models.Ninja;
import com.nidal.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
}