package br.com.tattoo.assistance.backend.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.tattoo.assistance.backend.entities.Agendamento;
import br.com.tattoo.assistance.backend.entities.Cliente;
import br.com.tattoo.assistance.backend.entities.Tatuador;

public class TatuadorDTO {

	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String senha;
	@NotBlank
	private String nome;

	@JsonIgnore
	private List<Cliente> cliente = new ArrayList<Cliente>();
	@JsonIgnore
	private List<Agendamento> agendamento = new ArrayList<Agendamento>();

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

	public static TatuadorDTO convert(Tatuador tatuador) {
		TatuadorDTO tatuadorDTO = new TatuadorDTO();
		tatuadorDTO.setEmail(tatuador.getEmail());
		tatuadorDTO.setNome(tatuador.getNome());
		tatuadorDTO.setSenha(tatuador.getSenha());
		tatuadorDTO.setAgendamento(tatuador.getAgendamento());
		tatuadorDTO.setCliente(tatuador.getCliente());

		return tatuadorDTO;
	}

}
