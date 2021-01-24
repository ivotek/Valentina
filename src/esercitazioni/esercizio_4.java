/*Date due dimensioni X,Y devi creare una clessidra di X con le dimensioni passate.
Esempo: 3(x),3(y)
XXX
X
XXX

*/

package esercitazioni;

import java.util.Scanner;

public class esercizio_4 {

	public static void main(String[] args) {
		
		Scanner scanner_Input= new Scanner(System.in); 
		System.out.println(" inserisci un numero: ");
		int x=scanner_Input.nextInt();
		
		System.out.println(" inserisci un numero: ");
		int y=scanner_Input.nextInt();
		
		//per il valore di x stampo tot X in orizzontale
		for(int i=0;i<x;i++) {
			System.out.print("X");
		}
		System.out.println();
		
		//per il valore di y stampo X in colonna togliendo 2 X altrimenti le andrebbe a sommare.
		for(int j=0; j < y-2; j++) {
			System.out.println("X");
			
		}
		
		
		for(int i=0;i<x;i++) {
			System.out.print("X");
		}
		
		
	}

}
