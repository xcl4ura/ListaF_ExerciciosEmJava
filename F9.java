package listaF;

import java.util.Scanner;

/*Desenvolver um programa que efetue a leitura de um valor num�rico inteiro e apresente-o caso
este valor seja divis�vel por 4 e 5. N�o sendo divis�vel por 4 e 5 o programa dever� apresentar a
mensagem �N�o � divis�vel por 4 e 5�. */


public class F9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, conta1, conta2;

		System.out.println("Insira um n�mero: \n");
		num = sc.nextInt();
		
		//conta1 = num / 4;
		
		conta1 = num / 4;
		conta2 = num / 5;
		
		if (conta1==0 && conta2 == 0) {
			
			System.out.println("Divis�vel por 5");
			
		}else {
			
			System.out.println("N�o � divisivel");
			
		}
		
		
	}

}
