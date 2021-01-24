/* dati due valori devi memorizzarli in due variabili e poi invertirli*/


package esercitazioni;

public class esercizio_1 {

	public static void main(String[] args) {
		
		int A=1;
		int B=2;
		int temp;
		
	/* swap:var temp serve per registrare un valore in modo temporaneo  */
		
		temp=A;
		A=B;
		B=temp;
		
	System.out.println(A + ";" + B);
	
	}

}
