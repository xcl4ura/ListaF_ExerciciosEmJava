package listaF;

import java.util.Scanner;

/*Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa de
desenvolvimento de softwares. O programa deverá solicitar a leitura do código e o salário atual do
funcionário e realizar o reajuste salarial de acordo com a tabela abaixo. O programa deverá
apresentar o salário antigo, o novo salário, o valor do reajuste e a função do funcionário. */

public class F6 {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		
		int  cod;
		double salarioAnt, salarioNov, reajuste; 
		String nome;
		
		System.out.println("Insira seu nome: \n");
		nome= meuScanner.nextLine();
		
		System.out.println("Insira o seu salário atual: \n");
		salarioAnt = meuScanner.nextDouble();
		
		System.out.println("Insira o código para o reajuste: \n");
		cod = meuScanner.nextInt();
		
		if (cod==1){
			
			reajuste = (salarioAnt * 0.05);
			
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo salário de " + nome + ", avaliado em "+ salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua função é a de Operador.");
		}else if (cod==2){
			
			reajuste = (salarioAnt * 0.1);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo salário de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua função é a de Programador.");
		}else if (cod==3){
			
			reajuste = (salarioAnt * 0.15);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo salário de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua função é a de Analista.");
		}else if (cod==4) {
			
			reajuste = (salarioAnt * 0.25);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo salário de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua função é a de Gerente.");
		}   
		

	}

}
