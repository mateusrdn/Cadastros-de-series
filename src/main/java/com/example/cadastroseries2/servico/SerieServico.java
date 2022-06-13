package com.example.cadastroseries2.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastroseries2.SerieRepositorio;
import com.example.cadastroseries2.model.Serie;

@Service
public class SerieServico {

	@Autowired
	private SerieRepositorio repositorio;
	
	public List<Serie> getSerie(){
		return (List<Serie>) repositorio.findAll();
	}
	
	public Optional<Serie> getSerieById(int id) {
		return repositorio.findById(id);
	}
	
	public Serie getSerieByNome(String nome) {
		return repositorio.findByNome(nome);
	}
	
	public void create(Serie serie) {
		repositorio.save(serie);
	}
	
	public void delete(int id) {
		repositorio.deleteById(id);
	}
	
	public void update(Serie serie) {
		repositorio.save(serie);
	}
	
	
}
