package listaF;

import java.util.Scanner;

/*Desenvolva  um  programa  para  ler  quatro  valores  referentes  a  quatro  notas  escolares  de  um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
 * se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
 * Apresentar junto com a mensagem o valor da média do aluno para qualquer condição.
 */

public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int not1,not2,not3,not4, med;
		
		System.out.println("Insira a primeira nota: ");
		not1= meuScanner.nextInt();
		
		System.out.println("Insira a segunda nota: ");
		not2= meuScanner.nextInt();
		
		System.out.println("Insira a terceira nota: ");
		not3= meuScanner.nextInt();
		
		System.out.println("Insira a quarta nota: ");
		not4= meuScanner.nextInt();
		
		med = (not1+not2+not3+not4)/4;
		
		if(med>=5){
				
		System.out.println("Aluno aprovado, pois sua média foi "+med);
		
		}else {
			
			System.out.println("Aluno reprovado, pois sua média foi"+med);
			
			
		}
		
	}

}
