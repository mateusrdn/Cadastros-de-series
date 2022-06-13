package com.example.cadastroseries2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cadastroseries2.model.Serie;


@Repository
public interface SerieRepositorio extends CrudRepository<Serie, Integer>{
	Serie findByNome(String nome);
	
}
