package br.com.buscape.enumtype;

public enum CommandEnum {

	L("esquerda"),
	R("direita"),
	M("mover"),
	U("subir"),
	D("descer");
	
	private String value;
	
	private CommandEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
