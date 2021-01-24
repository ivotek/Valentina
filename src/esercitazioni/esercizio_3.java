//Dati due numeri base ed esponente ricavare il valore finale.
//Esempio: 5,2 --> 25

package esercitazioni;

import java.util.Scanner;

public class esercizio_3 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in); 
		int numero;
		System.out.println(" inserisci un numero: ");
		numero=scanner.nextInt();
		
		int esponente;
		System.out.println(" inserisci un esponente: ");
		esponente=scanner.nextInt();
		
		int risultato=1;
		
		for( int i=0; i < esponente; i++) {
			
			risultato=risultato*numero;
			
		}
		
		System.out.println(risultato);
	}
	

}
