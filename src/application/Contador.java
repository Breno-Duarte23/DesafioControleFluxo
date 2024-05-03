package application;
import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Recebendo os parâmetros do usuário
		System.out.println("Digite o primeiro parametro: ");
		int parametro1 = sc.nextInt();
		System.out.println("Digite o segundo parametero: ");
		int parametro2 = sc.nextInt();
		
		try {
			contar(parametro1, parametro2);
		} catch(Exception ParametrosInvalidosException) {
			System.out.println("O parametro 1 deve ser menor que o parametro 2");
		}
		
		sc.close();
	}
	//criando o método que lança a exceção
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois)//Verificação ara validar a exceção
			throw new ParametrosInvalidosException();	
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo numero " + i);
		}
	}
}
