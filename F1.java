package listaF;

import java.util.Scanner;

/*F1-)  Desenvolva  um  programa  para  auxiliar  uma  empresa  na  classifica��o  dos  funcion�rios  nos departamentos   da   empresa. 
 *  O   programa   devera   solicitar   a   cada   funcion�rio   o   c�digo   do departamento em que ele dever� trabalhar e apresentar ao 
 *  funcion�rio a descri��o do departamento correspondente ao c�digo indicado.
 */
public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int cod;
		String nome;
		
		System.out.println("Insira seu nome: ");
		nome= meuScanner.nextLine();
		
		System.out.println("Insira o c�digo do departamento: ");
		cod= meuScanner.nextInt();
		
		
		if(cod==10){
			
			System.out.println(nome+", o departamento em que voc� ir� trabalhar ser� o de Contabilidade. ");
			
			
		
		}
		else if(cod==12){
			
			System.out.println(nome+", o departamento em que voc� ir� trabalhar ser� o de Almoxarifado. ");
			
			
		}else if(cod==14){
			
			System.out.println(nome+", o departamento em que voc� ir� trabalhar ser� o de Inform�tica. ");				
			
		}else if (cod!=10 && cod!=12 && cod!=14 ){
					
			System.out.println("C�digo inv�lido!!");
		}
		
	}

}

