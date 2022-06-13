package com.example.cadastroseries2.controle;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cadastroseries2.model.Serie;
import com.example.cadastroseries2.servico.SerieServico;

@Controller
public class SerieControle {

	@Autowired
	private SerieServico servico;
	
	@RequestMapping("/series")
	public String getSeries(Model model) {
		model.addAttribute("series", servico.getSerie());
		return "series";	
	}
	
	@GetMapping("/idSerie")
	@ResponseBody
	public Optional<Serie> getSerieById(Integer Id, Model model){
		return servico.getSerieById(Id);
	}
	
	@GetMapping("/nomeserie")
	@ResponseBody
	public Serie getSerieById(String nome, Model model){
		return servico.getSerieByNome(nome);
	}
	
	@RequestMapping(value="/update", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String updateSerie(Serie serie) {
		servico.update(serie);
		return "redirect:/series";
	}
	
	@RequestMapping(value="/create", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String createSerie(Serie serie) {
		servico.create(serie);
		return "redirect:/series";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET })
	public String deleteSerie(Integer Id) {
		servico.delete(Id);
		return "redirect:/series";
	}
}
