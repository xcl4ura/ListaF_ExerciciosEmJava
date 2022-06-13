package listaF;

import java.util.Scanner;

/*F1-)  Desenvolva  um  programa  para  auxiliar  uma  empresa  na  classificação  dos  funcionários  nos departamentos   da   empresa. 
 *  O   programa   devera   solicitar   a   cada   funcionário   o   código   do departamento em que ele deverá trabalhar e apresentar ao 
 *  funcionário a descrição do departamento correspondente ao código indicado.
 */
public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int cod;
		String nome;
		
		System.out.println("Insira seu nome: ");
		nome= meuScanner.nextLine();
		
		System.out.println("Insira o código do departamento: ");
		cod= meuScanner.nextInt();
		
		
		if(cod==10){
			
			System.out.println(nome+", o departamento em que você irá trabalhar será o de Contabilidade. ");
			
			
		
		}
		else if(cod==12){
			
			System.out.println(nome+", o departamento em que você irá trabalhar será o de Almoxarifado. ");
			
			
		}else if(cod==14){
			
			System.out.println(nome+", o departamento em que você irá trabalhar será o de Informática. ");				
			
		}else if (cod!=10 && cod!=12 && cod!=14 ){
					
			System.out.println("Código inválido!!");
		}
		
	}

}

