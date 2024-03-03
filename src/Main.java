import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        String mensagemInicial = """
                Bem vindo(a) ao Jogo da Advinhação!
                
                Seu objetivo no jogo é advinhar qual número entre 1-100 eu estou pensando.
                Para isso, você terá 5 tentativas.
                Vamos lá?
                / Pressione s(sim)/n(não) /
                """;

        System.out.println(mensagemInicial);
        String resposta = scanner.nextLine();

        String opt = resposta.toLowerCase();

        switch (opt) {
            case "s":
                int numeroUsuario = 0;
                int numeroGerado = gerador.nextInt(100) + 1;
                int contador = 1;

                while(numeroUsuario != numeroGerado && contador <= 5) {
                    System.out.println("-- TENTATIVA " + contador + " --");
                    System.out.println("Digite um número entre 1-100:");
                    numeroUsuario = scanner.nextInt();
                    if (numeroUsuario > numeroGerado) {
                        System.out.println("O número " + numeroUsuario + " é maior do qual eu penso...");
                    } else if (numeroUsuario < numeroGerado) {
                        System.out.println("O número " + numeroUsuario + " é menor do qual eu penso...");
                    }
                    contador++;
                }

                if (numeroUsuario == numeroGerado) {
                System.out.println("UAU! Você acertou, devo reconhecer que você é bom mesmo.\nParabéns!");
                } else{
                    System.out.println("---------------------\n\nHAHA EU GANHEEI!\nUma pena você ter perdido, mas você pode voltar aqui novamente\n(só pra constar, pensei o número " + numeroGerado + ").");
                }
                break;
            case "n":
                System.out.println("Que pena! Até a próxima!");
               break;
            default:
                System.out.println("Por favor, selecione uma opção válida.");
        }
    }
}