package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro {
	// instanciando o scanner fora da classe Main, deixando ele disponivel pro codigo inteiro
	static Scanner leia = new Scanner(System.in);

	//Ao usar a palavra chave "throws", conseguimos trazer externamente uma classe com herança do Exception
	public static void main(String[] args) throws ErroSimples {
		// TODO Auto-generated method stub
		
		//criação das variaveis para fazer nossa continha
		int dividendo = 0;
		int divisor = 0;
		boolean funcionando = true;
		
		// iremos usar o DoWhile, para que o nosso programa execute pelo menos uma vez
		do {
			
			// o Try irá sempre tentar executar o código que tem dentro dele, e caso dê alguma falha
			//vai cair para os Catch, e tratar o erro
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();
				
				if(dividendo < divisor) {
					throw new ErroSimples("O primeiro numero tem que ser maior que o segundo");
				}
				
				dividir(dividendo, divisor);
				funcionando = false;
				
			} catch(ArithmeticException e) { //nessa linha, caso aconteça a Exceção aritmetica, irá executar o conteudo deste catch
				System.err.println("\n"
						+ "Deu ruim, deu isso aqui: " + e + "\n");
			} catch(InputMismatchException e) { //nessa linha, caso seja passado uma String, irá executar o conteudo deste catch
				System.err.println("Digita um numero né meu bom - " + e);
				leia.nextLine();
			} 	
				finally { // o comando Finally é opcional, e ele sempre irá executar o seu conteudo, independente
					//de ter dado sucesso no try, ou de ir para algum dos catch
			
				System.out.println("Isso aqui vai rodar sempre");
			}
		} while(funcionando);
		
		
			
		

	}
	
	public static void dividir(int dividendo, int divisor) {
		System.out.println("O resultado da divisão é: " + (dividendo/divisor));
	}
	
	

}
