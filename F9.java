package listaF;

import java.util.Scanner;

/*Desenvolver um programa que efetue a leitura de um valor numérico inteiro e apresente-o caso
este valor seja divisível por 4 e 5. Não sendo divisível por 4 e 5 o programa deverá apresentar a
mensagem “Não é divisível por 4 e 5”. */


public class F9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, conta1, conta2;

		System.out.println("Insira um número: \n");
		num = sc.nextInt();
		
		//conta1 = num / 4;
		
		conta1 = num / 4;
		conta2 = num / 5;
		
		if (conta1==0 && conta2 == 0) {
			
			System.out.println("Divisível por 5");
			
		}else {
			
			System.out.println("Não é divisivel");
			
		}
		
		
	}

}
