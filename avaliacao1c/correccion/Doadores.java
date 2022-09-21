
package avaliacao1c.correccion;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Doadores {

	public static void metodo() {
		// TODO Auto-generated method stub
		System.out.println("Informe a quantidade de doadores");
		int quantidade=new Scanner(System.in).nextInt();
		String[] nomes = new String[quantidade];
		String[] sexos = new String[quantidade];
		String[] tipos = new String[quantidade];
		String[] fatores = new String[quantidade];
		String[] telefones = new String[quantidade];
		int[] idades =new int[quantidade];
		double[] pesos=new double[quantidade];
		boolean avancar ;
		
		for(int i=0; i<quantidade; i++) {
			System.out.println("Doador:"+i);
			System.out.println("Nome:");
			nomes[i]= new Scanner(System.in).nextLine();
			System.out.println("Sexo m ou f");
			sexos[i]= new Scanner(System.in).nextLine();
			System.out.println("Tipó:(A,B,AB,O)");
			tipos[i]= new Scanner(System.in).nextLine();
			System.out.println("Fator:(+ ou -)");
			fatores[i]= new Scanner(System.in).nextLine();
			System.out.println("Telefono:");
			telefones[i]= new Scanner(System.in).nextLine();
			
		
	
    avancar= false;
    while(!avancar) {
    	try {
    		System.out.println("Idade:");
    		idades[i]=new Scanner(System.in).nextInt();
    		avancar=true;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Informe um valor inteiro");
    	}
    }
    avancar =false;
    while(!avancar) {
    	try {
    		System.out.println("Peso:");
    		pesos[i] =new Scanner(System.in).nextDouble();
    		avancar =true;
    	    }
    	    catch(InputMismatchException e) {
    	    	System.out.println("Informe um valor com virgula");
          }
		}
    }
    int opcao = 0 ;
    String tipo,fator,nome;
    boolean doador;
    while(opcao!=3) {
    	System.out.println("1-buscar por tipo");
    	System.out.println("2-Buscar por nome do dador");
    	System.out.println("3-Encerrar");
    	opcao =new Scanner(System.in).nextInt();
    	switch(opcao) {
    	case 1:
    		doador=false;
    		System.out.println("Informe o tipo: (A,B, AB ou O");
    		tipo= new Scanner (System.in).nextLine();
    		System.out.println("Informe o fator:( +ou -)");
    		fator= new Scanner (System.in).nextLine();
    		for (int i=0; i<quantidade; i++) {
    			if(tipos[i].equalsIgnoreCase(tipo)) {
    				if(fatores[i].equalsIgnoreCase(fator)) {
    					doador=true;
    				System.out.println("Doador:"+i);
    				System.out.println("Nome:"+nomes[i]);
    				System.out.println("Peso:"+pesos[i]);
    				System.out.println("Idade:"+idades[i]);
    				System.out.println("Sexo:"+sexos[i]);
    				System.out.println("Telefone:"+telefones[i]);
    				System.out.println("Tipo:"+tipos[i]);
    				System.out.println("Fator:"+fatores[i]);
    				
    			}
    		}
    	}
    		
    		if(!doador) {
    			System.out.println("Nenhum doador encontrado.");
    		}
    		break;
    	case 2:
    			doador=false;
    			System.out.println("Informe o nome:");
    			nome= new Scanner(System.in).nextLine();
    			for(int i=0; i<quantidade; i++) {
    				if(nomes[i].equalsIgnoreCase(nome)) {
    					doador=true;
    					System.out.println("Doador:"+i);
        				System.out.println("Nome:"+nomes[i]);
        				System.out.println("Peso:"+pesos[i]);
        				System.out.println("Idade:"+idades[i]);
        				System.out.println("Sexo:"+sexos[i]);
        				System.out.println("Telefone:"+telefones[i]);
        				System.out.println("Tipo:"+tipos[i]);
        				System.out.println("Fator:"+fatores[i]);
    				}
    			}
    				
    			if(!doador) {
    				System.out.println("Doador não encontrado");
    			}
    		    break;
    	}
	}
	}
}
    
