package listaF;

import java.util.Scanner;

/*) Efetuar a leitura de cinco n�meros inteiros e identificar o maior e o menor valores.*/


public class F10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int n1,n2,n3,n4,n5;
	
	System.out.println("Insira o 1� n�mero: ");
	n1 = sc.nextInt();
	
	System.out.println("Insira o 2� n�mero: ");
	n2 = sc.nextInt();
	
	System.out.println("Insira o 3� n�mero: ");
	n3 = sc.nextInt();
	
	System.out.println("Insira o 4� n�mero: ");
	n4 = sc.nextInt();
	
	System.out.println("Insira o 5� n�mero: ");
	n5 = sc.nextInt();

	
	if(n1 > n2 && n1 > n3 && n1 > n4 && n1>n5) {
		
		if(n2 < n3 && n2 < n4 && n2 < n5) {
			
			System.out.println(n1 + " e " + n2);
			
		} 
		
		else if(n3 < n2 && n3 < n4 && n3 < n5) {
			
			System.out.println(n1 + " e " + n3);
			
		}else if(n4 < n2 && n4 < n3 && n4 < n5) {
			
			System.out.println(n1 + " e " + n4);
			
		}else if(n5 < n2 && n5 < n4 && n5 < n3) {
			
			System.out.println(n1 + " e " + n5);		
		}	
	}	
	
	else if(n2 > n1 && n2 > n3 && n2 > n4 && n2>n5) {
		 
		if(n1 < n3 && n1 < n4 && n1 < n5) {
			
			System.out.println(n2 + " e " + n1);
			
		}else if(n3 < n1 && n3 < n4 && n3 < n5) {
			
			System.out.println(n2 + " e " + n3);
			
		}else if(n4 < n1 && n4 < n3 && n4 < n5) {
			
			System.out.println(n2 + " e " + n4);
			
		}else if(n5 < n1 && n5 < n4 && n5 < n3) {
			
			System.out.println(n2 + " e " + n5);
			}	
}
	 
	
	
	else if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
		
		if(n1 < n2 && n1 < n4 && n1 < n5) {
			
			System.out.println(n3 + " e " + n1);
			
		}else if(n2 < n1 && n2 < n4 && n2 < n5) {
			
			System.out.println(n3 + " e " + n2);
			
		}else if(n4 < n1 && n4 < n2 && n4 < n5) {
			
			System.out.println(n3+ " e " + n4);
			
		}else if(n5 < n1 && n5 < n4 && n5 < n2) {
			
			System.out.println(n3 + " e " + n5);	
		}
}		
		
		else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
			
			if(n1 < n2 && n1 < n3 && n1 < n5) {
				
				System.out.println(n4 + " e " + n1);
				
			}else if(n2 < n1 && n2 < n3 && n2 < n5) {
				
				System.out.println(n4 + " e " + n2);
				
			}else if(n3 < n1 && n3 < n2 && n3 < n5) {
				
				System.out.println(n4+ " e " + n3);
				
			}else if(n5 < n1 && n5 < n2 && n5 < n3) {
				 
				System.out.println(n4 + " e " + n5);	
			}
}
	
	
		else if(n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
			
			if(n1 < n2 && n1 < n3 && n1 < n4) {
				
				System.out.println(n5 + " e " + n1);
				
			}else if(n2 < n1 && n2 < n3 && n2 < n4) {
				
				System.out.println(n5 + " e " + n2);
				
			}else if(n3 < n1 && n3 < n2 && n3 < n4) {
				
				System.out.println(n5+ " e " + n3);
				
			}else if(n4 < n1 && n4 < n2 && n4 < n3) {
				 
				System.out.println(n5 + " e " + n4);	
			}
}
	
	else {
		
		System.out.println("ERROR, TRY AGAIN");
		
	}
	
	} 
		
		
		
	}
	