package oopIntro;

import java.security.PublicKey;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int fak = 1;
		for (int i = 5; i > 1; i--) {
			fak = fak * i;
			System.out.println(fak);
		}

	}

}

class A {

	public int Fak(int n) {return (n==0||n==1)?1:n*Fak(n*1);}
}
