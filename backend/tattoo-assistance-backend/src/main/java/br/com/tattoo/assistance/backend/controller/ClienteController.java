package br.com.tattoo.assistance.backend.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tattoo.assistance.backend.dto.ClienteDTO;
import br.com.tattoo.assistance.backend.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping("/cadastro")
	@Transactional
	public ClienteDTO cadastrarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
		return clienteService.cadastrarCliente(clienteDTO);
	}
}
