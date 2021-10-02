package qdo.kata;

public enum RomanNumberValue {
	I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

	private int value;

	RomanNumberValue(int value){
		this.value = value;
	}

	public int value() {
		return value;
	}
}
