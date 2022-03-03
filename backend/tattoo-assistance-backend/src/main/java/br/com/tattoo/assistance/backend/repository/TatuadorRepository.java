package br.com.tattoo.assistance.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tattoo.assistance.backend.entities.Tatuador;

@Repository
public interface TatuadorRepository extends JpaRepository<Tatuador, Long>{
	
	Tatuador findByEmail(String email);

}
