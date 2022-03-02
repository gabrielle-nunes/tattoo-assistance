package br.com.tattoo.assistance.backend.dto;

import java.math.BigDecimal;
import java.util.Date;

import br.com.tattoo.assistance.backend.entities.Agendamento;
import br.com.tattoo.assistance.backend.enums.TamanhoTatuagem;

public class AgendamentoDTO {

	private Date diaHora;
	private BigDecimal valorPagoAdiantado;
	private String localTatuado;
	private TamanhoTatuagem tamanhoTatuagem;

	public Date getDiaHora() {
		return diaHora;
	}

	public void setDiaHora(Date diaHora) {
		this.diaHora = diaHora;
	}

	public BigDecimal getValorPagoAdiantado() {
		return valorPagoAdiantado;
	}

	public void setValorPagoAdiantado(BigDecimal valorPagoAdiantado) {
		this.valorPagoAdiantado = valorPagoAdiantado;
	}

	public String getLocalTatuado() {
		return localTatuado;
	}

	public void setLocalTatuado(String localTatuado) {
		this.localTatuado = localTatuado;
	}

	public TamanhoTatuagem getTamanhoTatuagem() {
		return tamanhoTatuagem;
	}

	public void setTamanhoTatuagem(TamanhoTatuagem tamanhoTatuagem) {
		this.tamanhoTatuagem = tamanhoTatuagem;
	}
	
	public static AgendamentoDTO convert(Agendamento agendamento) {
		AgendamentoDTO agendamentoDTO = new AgendamentoDTO();
		agendamentoDTO.setDiaHora(agendamento.getDiaHora());
		agendamentoDTO.setLocalTatuado(agendamento.getLocalTatuado());
		agendamentoDTO.setTamanhoTatuagem(agendamento.getTamanhoTatuagem());
		agendamentoDTO.setValorPagoAdiantado(agendamento.getValorPagoAdiantado());
		
		return agendamentoDTO;
	}

}
