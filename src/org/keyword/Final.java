package org.keyword;

public class Final {
	
	public final void add() {
		int i = 4;
		System.out.println(i);
	}
	int j = 10;
	public final void sub() {
		System.out.println(j);
		System.out.println(j++);

	}
public static void main(String[] args) {
	
	Final fn = new Final();
	fn.add();
	fn.sub();
}
}
