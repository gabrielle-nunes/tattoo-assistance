package br.com.tattoo.assistance.backend.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import br.com.tattoo.assistance.backend.entities.Agendamento;
import br.com.tattoo.assistance.backend.entities.Cliente;

public class ClienteDTO {

	@NotBlank
	private String cpf;
	@NotBlank
	private String nome;
	//@NotBlank
	private LocalDateTime dataNascimento;
	@NotBlank
	private String telefone;
	
	private List<Agendamento> agendamento = new ArrayList<Agendamento>();

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}

	public static ClienteDTO convert(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setCpf(cliente.getCpf());
		clienteDTO.setDataNascimento(cliente.getDataNascimento());
		clienteDTO.setNome(cliente.getNome());
		clienteDTO.setTelefone(cliente.getTelefone());
		clienteDTO.setAgendamento(cliente.getAgendamento());
		
		return clienteDTO;
		
	}


}
