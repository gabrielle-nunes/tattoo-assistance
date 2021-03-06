package br.com.tattoo.assistance.backend.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tattoo.assistance.backend.dto.TatuadorDTO;
import br.com.tattoo.assistance.backend.exceptions.TatuadorNotFoundException;
import br.com.tattoo.assistance.backend.service.TatuadorService;

@RestController
@RequestMapping("/tatuador")
public class TatuadorController {

	@Autowired
	private TatuadorService tatuadorService;
	
	@PostMapping("/cadastro")
	@Transactional
	public TatuadorDTO cadastrarTatuador(@Valid @RequestBody TatuadorDTO tatuadorDTO) {
		return tatuadorService.cadastrarTatuador(tatuadorDTO);
	}
	
	@DeleteMapping("/excluirConta/{id}")
	@Transactional
	public TatuadorDTO excluirTatuador(@PathVariable Long id) throws TatuadorNotFoundException {
		return tatuadorService.excluirTatuador(id);
	}
}
