import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            // Método de lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
        int contagem = parametroDois  - parametroUm;
        System.out.println("Numerando os itens " + contagem);
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
