
package avaliacao1c.correccion;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int opcao =0;
		boolean avancar=false;
		while(opcao!=3) {
			avancar=false;
			while(!avancar) {
				try {
					System.out.println();
					System.out.println("1-Doadores de Sangue");
					System.out.println("2-Codificador");
					System.out.println("3-Encerrar");
					opcao= new Scanner(System.in).nextInt();
					avancar =true;
					
				}
				catch(InputMismatchException e) {
					System.out.println("Informe um inteiro com a opção desejada");
				}
			}
			switch(opcao) {
			case 1:
				Doadores.metodo();
				break;
			case 2:
				Codificador.metodo();
			    break;
			}
		}

	}

}



    		
    		
			
			
			
			
			
			
			
			
			
		

