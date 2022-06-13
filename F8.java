package listaF;

import java.util.Scanner;

/* Desenvolva um programa para efetuar a leitura de três valores (A, B e C) e apresentar os
valores dispostos em ordem crescente. */


public class F8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int val1,val2,val3;
		
		System.out.println("Insira o valor 1: ");
		val1 = sc.nextInt();
		
		System.out.println("Insira o valor 2: ");
		val2 = sc.nextInt();
		
		System.out.println("Insira o valor 3: ");
		val3 = sc.nextInt();
		
		/*123
		132
		231
		213
		312
		321*/
		
		if(val1 > val2 && val1>val3 && val2>=val3){
			
			System.out.println(val1 + " " + val2 + " " + val3);
			
		}else if (val1 > val2 && val1>=val3 && val3>val2 ){
			
		System.out.println(val1 + " " + val3 + " " + val2);
			
		}else if (val2 > val1 && val2 > val3 && val3 > val1) {
			
			System.out.println(val2 + " " + val3 + " " + val1);
			
		}else if (val2 > val1 && val2 >val3 && val1 > val3 ) {
			
			
			System.out.println(val2 + " " + val1 + " " + val3);
			
		}else if (val3 > val2 && val3 > val1 && val1 > val2) {
			
			
			System.out.println(val3 + " " + val1 + " " + val2);
			
		}else if (val3 > val2 && val3 > val1 && val2 > val1) {
			
			System.out.println(val3 + " " + val2 + " " + val1);
			
			
		}
		
		
	}

}
