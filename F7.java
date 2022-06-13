package listaF;

import java.util.Scanner;

/*Desenvolva um programa para ler três valores (X, Y e Z). O programa deverá verificar se estes
três valores podem ser os comprimentos dos lados de um triângulo e, se forem, verificar se é um
triângulo eqüilátero, isósceles ou escaleno. Se eles não forem um triângulo, escrever uma
mensagem.
Propriedades e definições dos triângulos:
- O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos
dos outros dois lados;

- Chama-se triângulo eqüilátero ao triângulo que tem os comprimentos dos três lados
iguais;

- Chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados
iguais. Portanto, todo triângulo eqüilátero é também isósceles;

- Chama-se triângulo escaleno ao triângulo que tem os comprimentos de seus três lados
diferentes.*/



public class F7 {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		
		System.out.println("Insira o lado 1 do triângulo: \n");
		lado1 = meuScanner.nextInt();
		
		System.out.println("Insira o lado 2 do triângulo: \n");
		lado2 = meuScanner.nextInt();
		
		System.out.println("Insira o lado 3 do triângulo: \n");
		lado3 = meuScanner.nextInt();

		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
			
			
			if (lado1 == lado2 && lado1==lado3 && lado2==lado3) {
				
				System.out.println("Esse triângulo é equilátero!");
				
				
			}else if (lado1 == lado2 || lado1==lado3 || lado2==lado3){
				
				
				System.out.println("Esse triângulo é isóceles!");
				
			}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				
				
				System.out.println("Esse triângulo é escaleno!");
				
			}
				
			
				
			}else {
				
				System.out.println("Os valores apresentados não formam um triângulo");
			}
				
		}
		
	}


