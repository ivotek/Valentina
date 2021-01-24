//Dato un numero, devi stampare solo i numeri dispari.

package esercitazioni;

import java.util.Scanner;

public class esercizio_2 {
	
	public static void main(String[] args) {
		
		//prendo valore dato dall'utente in input e lo salvo dentro la variabile num.
		Scanner num_Input= new Scanner(System.in); 
		int num;
		System.out.println(" inserisci un numero: ");
		num=num_Input.nextInt();
	
		
		/*creo un ciclo infinito in caso l'utente dovesse inserire un numero negativo, finche lo inserisce suggerisco di inserire un nuovo numero,
		appena inserisce numero positivo entra nel secondo ciclo*/
		while(true) {
			
				if(num<0){
					System.out.println("i valori negativi non vanno bene");
					System.out.println("inserisci nuovo numero");
					num=num_Input.nextInt();
				}else
					break; 
			
		}
		/* controllo tutti i numeri minori del numero inserito in input dall'utente, e se il numero diviso 2 da resto diverso da 0 vuol
		   dire che non è divisibile e quindi mi stampa i nuemeri da 1 al numero inserito ovviamente non divisibili */
	
		for(int i=1; i < num ; i++){
			
			if(i%2 != 0) {
				
				System.out.println(i);
				
			}
		}
		
		
	}
}