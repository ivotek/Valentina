//Data una stringa di testo, devi rigirarla.
//Esempio: Valentina --> anitnelav

package esercitazioni;

import java.util.Scanner;

public class esercizio_5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		System.out.println(" inserisci un nome ");
		String nome=scanner.nextLine();
		char[] array=nome.toCharArray();
		int lunghezzaArray=array.length;
		char temp;
		
		for( int i=0; i < lunghezzaArray/2; i++) {

			temp=array[lunghezzaArray-1-i];
			array[lunghezzaArray - 1-i]=array[i];
			array[i]=temp;
		}
		System.out.println(array);
	
	}
	

}
