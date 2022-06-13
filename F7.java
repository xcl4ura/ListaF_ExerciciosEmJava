package listaF;

import java.util.Scanner;

/*Desenvolva um programa para ler tr�s valores (X, Y e Z). O programa dever� verificar se estes
tr�s valores podem ser os comprimentos dos lados de um tri�ngulo e, se forem, verificar se � um
tri�ngulo eq�il�tero, is�sceles ou escaleno. Se eles n�o forem um tri�ngulo, escrever uma
mensagem.
Propriedades e defini��es dos tri�ngulos:
- O comprimento de cada lado de um tri�ngulo � menor do que a soma dos comprimentos
dos outros dois lados;

- Chama-se tri�ngulo eq�il�tero ao tri�ngulo que tem os comprimentos dos tr�s lados
iguais;

- Chama-se tri�ngulo is�sceles ao tri�ngulo que tem os comprimentos de dois lados
iguais. Portanto, todo tri�ngulo eq�il�tero � tamb�m is�sceles;

- Chama-se tri�ngulo escaleno ao tri�ngulo que tem os comprimentos de seus tr�s lados
diferentes.*/



public class F7 {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		
		System.out.println("Insira o lado 1 do tri�ngulo: \n");
		lado1 = meuScanner.nextInt();
		
		System.out.println("Insira o lado 2 do tri�ngulo: \n");
		lado2 = meuScanner.nextInt();
		
		System.out.println("Insira o lado 3 do tri�ngulo: \n");
		lado3 = meuScanner.nextInt();

		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
			
			
			if (lado1 == lado2 && lado1==lado3 && lado2==lado3) {
				
				System.out.println("Esse tri�ngulo � equil�tero!");
				
				
			}else if (lado1 == lado2 || lado1==lado3 || lado2==lado3){
				
				
				System.out.println("Esse tri�ngulo � is�celes!");
				
			}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				
				
				System.out.println("Esse tri�ngulo � escaleno!");
				
			}
				
			
				
			}else {
				
				System.out.println("Os valores apresentados n�o formam um tri�ngulo");
			}
				
		}
		
	}


