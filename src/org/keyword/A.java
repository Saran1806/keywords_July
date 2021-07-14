package org.keyword;

public class A extends SuperThis {
	@Override
	public void add() {
		System.out.println(super.i);
		System.out.println(this.j);
		super.add();
	}
	
	int j = 89;

	public static void main(String[] args) {
		A a = new A();
		a.add();
	}

}
