import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {

        //ParametrosInvalidosException ParametrosInvalidosException = new ParametrosInvalidosException();
		
		try  (Scanner terminal = new Scanner(System.in)){
            System.out.println("Digite o primeiro parametro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametroDois = terminal.nextInt();
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception);
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm>=parametroDois){
            throw new ParametrosInvalidosException("Os valores devem ser numericos, e o segundo valor deve ser maior que o primeiro.");   
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Segue os valores abaixo:");
        for(int i=0; i<contagem; i++){
            System.out.println("Imprimindo o numero " + (i+1));
                //realizar o for para imprimir os números com base na variável contagem
            }
	}

    private static class ParametrosInvalidosException extends Exception {
        //classe que trata a excessão
        public ParametrosInvalidosException(String errorMessage) {
            super(errorMessage);
        }
    }
}
