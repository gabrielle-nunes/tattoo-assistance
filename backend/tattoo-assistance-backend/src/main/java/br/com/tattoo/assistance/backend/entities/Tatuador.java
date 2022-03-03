package br.com.tattoo.assistance.backend.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.tattoo.assistance.backend.dto.TatuadorDTO;

@Entity(name = "tatuador")
public class Tatuador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Email
	private String email;
	private String nome;
	private String senha;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cliente> cliente;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Agendamento> agendamento;

	public Tatuador(String email, String senha, String nome, List<Cliente> cliente,
			List<Agendamento> agendamento) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.cliente = cliente;
		this.agendamento = agendamento;
	}

	public Tatuador() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}

	public static Tatuador convert(TatuadorDTO tatuadorDTO) {
		Tatuador tatuador = new Tatuador();
		tatuador.setAgendamento(tatuadorDTO.getAgendamento());
		tatuador.setCliente(tatuadorDTO.getCliente());
		tatuador.setEmail(tatuadorDTO.getEmail());
		tatuador.setNome(tatuadorDTO.getNome());
		tatuador.setSenha(tatuadorDTO.getSenha());

		return tatuador;
	}

}
