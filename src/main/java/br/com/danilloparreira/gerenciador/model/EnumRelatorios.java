package br.com.danilloparreira.gerenciador.model;

public enum EnumRelatorios {
	USUARIO("Usuario"), PERFIL("Perfil");

	private String descricao;

	private EnumRelatorios(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
