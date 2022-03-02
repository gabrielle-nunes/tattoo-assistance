package br.com.tattoo.assistance.backend.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.tattoo.assistance.backend.enums.TamanhoTatuagem;

@Entity(name = "agendamento")
public class Agendamento {

	@Temporal(TemporalType.TIMESTAMP)
	private Date diaHora;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal valorPagoAdiantado;
	private String localTatuado;
	private TamanhoTatuagem tamanhoTatuagem;
	
	public Agendamento(Date diaHora, BigDecimal valorPagoAdiantado, String localTatuado
			,TamanhoTatuagem tamanhoTatuagem) {
		this.diaHora = diaHora;
		this.valorPagoAdiantado = valorPagoAdiantado;
		this.localTatuado = localTatuado;
		this.tamanhoTatuagem = tamanhoTatuagem;
	}

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

}
