package listaF;

import java.util.Scanner;

/* Desenvolva  um  programa  para  auxiliar  uma  escolinha  de  futebol  na  classifica��o  das categorias das equipes de futebol.
 *  O programa dever� ler a idade da crian�a e apresentar o nome da categoria em a crian�a deve jogar, atrav�s da tabela abaixo.  
 */

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		String alu;
		int idade;
		
		System.out.println("Insira o nome do aluno: ");
		alu = meuScanner.nextLine();
		
		System.out.println("Insira a idade do aluno: ");
		idade = meuScanner.nextInt();
		
		if (idade==6 || idade==7 || idade==8){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � a Dente de Leite.");
			
		}else if(idade==9 || idade==10 || idade==11){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � o Pr�-Mirim.");
			
		}else if(idade==12 || idade==13){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � o Mirim.");
			
		}else if(idade==14 ||  idade==15){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � o Infantil.");
			
		}else if(idade==16 ||  idade==17){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � o Juvenil.");
			
		}else if(idade==18 || idade==19 || idade==20){
			
			System.out.println("A categoria em que o aluno "+alu+" vai jogar � o Juniores.");
			
		} 
		
	}

}
