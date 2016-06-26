package br.com.buscape.enumtype;

public enum CardinalPointEnum {

	NORTE,
	LESTE,
	SUL,
	OESTE;
	
	public CardinalPointEnum right() {
        return values()[(this.ordinal()+1)];
    }
	
	public CardinalPointEnum left() {
		if (ordinal() == 0) {
			return values()[values().length - 1];
		}
        return values()[(this.ordinal()-1)];
    }
}
