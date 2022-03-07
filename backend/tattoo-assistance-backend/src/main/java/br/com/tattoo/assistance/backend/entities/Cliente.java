package br.com.tattoo.assistance.backend.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.tattoo.assistance.backend.dto.ClienteDTO;

@Entity(name = "cliente")
public class Cliente {

	@Id
	private String cpf;
	private String nome;
	private LocalDateTime  dataNascimento;
	private String telefone;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente")
	private List<Agendamento> agendamento;

	public Cliente(String cpf, String nome, LocalDateTime  dataNascimento, String telefone, List<Agendamento> agendamento) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.agendamento = agendamento;
	}

	public Cliente() {
	}

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

	public static Cliente convert(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setAgendamento(clienteDTO.getAgendamento());
		cliente.setCpf(clienteDTO.getCpf());
		cliente.setDataNascimento(clienteDTO.getDataNascimento());
		cliente.setNome(clienteDTO.getNome());
		cliente.setTelefone(clienteDTO.getTelefone());

		return cliente;
	}

}
