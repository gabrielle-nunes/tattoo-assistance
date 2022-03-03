package br.com.tattoo.assistance.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tattoo.assistance.backend.dto.TatuadorDTO;
import br.com.tattoo.assistance.backend.entities.Tatuador;
import br.com.tattoo.assistance.backend.exceptions.TatuadorNotFoundException;
import br.com.tattoo.assistance.backend.repository.TatuadorRepository;

@Service
public class TatuadorService {
	
	@Autowired
	private TatuadorRepository tatuadorRepository;
	
	public TatuadorDTO cadastrarTatuador(TatuadorDTO tatuadorDTO) {
		Tatuador tatuador = tatuadorRepository.save(Tatuador.convert(tatuadorDTO));
		return TatuadorDTO.convert(tatuador);
	}
	
	//adicionar tratamento
	public TatuadorDTO excluirTatuador(Long id) /*throws TatuadorNotFoundException*/ {
		Optional<Tatuador> tatuador = tatuadorRepository.findById(id);
		if(tatuador.isPresent()) {
			tatuadorRepository.delete(tatuador.get());
		}
		//throw new TatuadorNotFoundException();
		return null;
	}

}
