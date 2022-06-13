package listaF;

import java.util.Scanner;

/*Desenvolva um programa para ler quatro valores referentes a quatro notas escolares de um aluno
 e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7.
 Se o valor da média for menor que 7, solicitar a nota de exame, somar com o
valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma
mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma
mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
aluno, para qualquer condição.*/


public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner meuScanner = new Scanner(System.in);
	
		
		int not1,not2,not3,not4, med1, med2, notEx;
		
		System.out.println("Insira sua primeira nota: ");
		not1= meuScanner.nextInt();
		
		System.out.println("Insira sua segunda nota: ");
		not2= meuScanner.nextInt();
		
		System.out.println("Insira sua terceira nota: ");
		not3= meuScanner.nextInt();
		
		System.out.println("Insira sua quarta nota: ");
		not4= meuScanner.nextInt();
		
		med1 = (not1+not2+not3+not4)/4;
		
		if(med1>=7){
				
		System.out.println("Aluno aprovado, pois sua média foi "+med1);
		
		
		}
		else if (med1<7) {
			
			System.out.println("Insira nota de exame ");
			notEx = meuScanner.nextInt();
			
			med2 = (med1 + notEx)/2;
			
			if(med2>=5){
				
				System.out.println("Aluno aprovado, pois sua média foi "+med2);
				
			}else {
				
				System.out.println("Aluno reprovado, pois sua média foi "+med2);
			}
		}
	
		}

}
