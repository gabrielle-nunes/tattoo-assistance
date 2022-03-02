package br.com.tattoo.assistance.backend.enums;

public enum TamanhoTatuagem {
	
	PEQUENA("Pequena"),
	MEDIA("Média"),
	GRANDE("Grande");
	
	private String descricao;

	TamanhoTatuagem(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
        return descricao;
    }
}
