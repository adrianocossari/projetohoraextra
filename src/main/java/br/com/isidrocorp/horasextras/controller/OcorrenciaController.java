package br.com.isidrocorp.horasextras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.horasextras.dao.OcorrenciaDAO;
import br.com.isidrocorp.horasextras.model.Ocorrencia;

@RestController
public class OcorrenciaController {

	@Autowired
	private OcorrenciaDAO dao;
	
	@GetMapping("/ocorrencias/{id}")
	public Ocorrencia buscarDetalhesPeloId(@PathVariable int id) {
		Ocorrencia oc = dao.findById(id).orElse(null);
		return oc;
	}
	
	
}
