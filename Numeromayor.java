package Actividad2;

import java.util.Scanner;
public class Numeromayor {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int mayor;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese numero a:");
		a = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese numero b:");
		b = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese numero c:");
		c = entrada2.nextInt();
		
		if((a>b)&&(a>c)) {
			mayor=a;
		}
		else if((b>a)&&(b>c)) {
			mayor=b;
		}
		else {
			mayor=c;
		}
		
		System.out.println("el mayor entre "+a+","+b+","+c+" es "+mayor);
		
		entrada.close();
		entrada1.close();
		entrada2.close();
	}
}
