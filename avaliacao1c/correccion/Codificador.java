
package avaliacao1c.correccion;


import java.util.Scanner;
public class Codificador {

	public static void metodo() {
		
		System.out.println("Informe a frase:");
		String frase= new Scanner (System.in).nextLine();
		String[] palavras = frase.split(" ");
		
		for(int i=0; i< palavras.length; i++) {
			if(palavras[i].charAt(0)=='a'|| palavras[i].charAt(0)=='e'||
					palavras[i].charAt(0)=='i'||palavras[i].charAt(0)=='o'||
					palavras[i].charAt(0)=='u') {
				System.out.print("bon");
				for(int x=palavras[i].length()-1; x>=0; x--) {
					switch(palavras[i].charAt(x)) {
					case 'a':
						System.out.print("e");
						break;
					case 'e':
						System.out.print("i");
						break;
					case 'i':
						System.out.print("o");
						break;
					case 'o':
						System.out.print("u");
						break;
					case 'u':
						System.out.print("a");
						break;
						default:
							System.out.print(palavras[i].charAt(x));
							break;
					}
						
				}
					
		     }else {
		    	 System.out.print("ban");
					for(int x=palavras[i].length()-1; x>=0; x--) {
						switch(palavras[i].charAt(x)) {
						case 'a':
							System.out.print("u");
							break;
						case 'e':
							System.out.print("a");
							break;
						case 'i':
							System.out.print("e");
							break;
						case 'o':
							System.out.print("i");
							break;
						case 'u':
							System.out.print("o");
							break;
							default:
								System.out.print(palavras[i].charAt(x));
								break;
		                }
	               }

	          }
			System.out.print(" ");
			
          }
	}
}
	
	