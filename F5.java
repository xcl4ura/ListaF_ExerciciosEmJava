package listaF;

import java.util.Scanner;

/*Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa.
O programa deverá solicitar a leitura do código e o salário atual do funcionário e realizar o reajuste
salarial de acordo com a tabela abaixo. O programa deverá apresentar os seguintes valores: salário
antigo, salário novo e reajuste.

REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;

*/



public class F5 {

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
			
			System.out.println(nome+ " o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para" + salarioNov);
		}else if (cod==2){
			
			reajuste = (salarioAnt * 0.1);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println(nome+ " o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para: " + salarioNov);
		}else if (cod==3){
			
			reajuste = (salarioAnt * 0.15);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println(nome+ " o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para: " + salarioNov);
		}else if (cod==4){
			
			reajuste = (salarioAnt * 0.2);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println(nome+ " o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para: " + salarioNov);
		}else if (cod==5){
			
			reajuste = (salarioAnt * 0.25);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println(nome+ " o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para: " + salarioNov);
		}else if (cod==6){
			
			reajuste = (salarioAnt * 0.3);
			salarioNov = reajuste + salarioAnt;
			
			System.out.println(nome+ ", o seu antigo salário, avaliado em: " + salarioAnt + " foi reajustado para: " + salarioNov);
		}     
		
	}

}
