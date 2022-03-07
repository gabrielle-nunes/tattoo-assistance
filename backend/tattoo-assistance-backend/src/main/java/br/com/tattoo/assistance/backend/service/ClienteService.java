package br.com.tattoo.assistance.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tattoo.assistance.backend.dto.ClienteDTO;
import br.com.tattoo.assistance.backend.entities.Cliente;
import br.com.tattoo.assistance.backend.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
		Cliente cliente = clienteRepository.save(Cliente.convert(clienteDTO));
		return ClienteDTO.convert(cliente);
	}

}
