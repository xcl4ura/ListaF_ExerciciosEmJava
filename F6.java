package listaF;

import java.util.Scanner;

/*Desenvolva um programa para calcular o reajuste salarial dos funcion�rios de um empresa de
desenvolvimento de softwares. O programa dever� solicitar a leitura do c�digo e o sal�rio atual do
funcion�rio e realizar o reajuste salarial de acordo com a tabela abaixo. O programa dever�
apresentar o sal�rio antigo, o novo sal�rio, o valor do reajuste e a fun��o do funcion�rio. */

public class F6 {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		
		int  cod;
		double salarioAnt, salarioNov, reajuste; 
		String nome;
		
		System.out.println("Insira seu nome: \n");
		nome= meuScanner.nextLine();
		
		System.out.println("Insira o seu sal�rio atual: \n");
		salarioAnt = meuScanner.nextDouble();
		
		System.out.println("Insira o c�digo para o reajuste: \n");
		cod = meuScanner.nextInt();
		
		if (cod==1){
			
			reajuste = (salarioAnt * 0.05);
			
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo sal�rio de " + nome + ", avaliado em "+ salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua fun��o � a de Operador.");
		}else if (cod==2){
			
			reajuste = (salarioAnt * 0.1);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo sal�rio de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua fun��o � a de Programador.");
		}else if (cod==3){
			
			reajuste = (salarioAnt * 0.15);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo sal�rio de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua fun��o � a de Analista.");
		}else if (cod==4) {
			
			reajuste = (salarioAnt * 0.25);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println("O antigo sal�rio de " + nome + ", avaliado em " + salarioAnt + " foi reajustado para " + salarioNov + 
					". Pois foi acrescentado o valor de " + reajuste + ". \n Sua fun��o � a de Gerente.");
		}   
		

	}

}
