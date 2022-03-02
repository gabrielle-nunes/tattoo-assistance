package br.com.tattoo.assistance.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tattoo.assistance.backend.dto.TatuadorDTO;
import br.com.tattoo.assistance.backend.entities.Tatuador;
import br.com.tattoo.assistance.backend.repository.TatuadorRepository;

@Service
public class TatuadorService {
	
	@Autowired
	private TatuadorRepository tatuadorRepository;
	
	public TatuadorDTO cadastrar(TatuadorDTO tatuadorDTO) {
		Tatuador tatuador = tatuadorRepository.save(Tatuador.convert(tatuadorDTO));
		return TatuadorDTO.convert(tatuador);
	}

}
