import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();
        int opcao;
        do {
            System.out.println("******************************************");
            System.out.println("      1 - Adicionar Livro na pilha");
            System.out.println("      2 - Listar todos os livros");
            System.out.println("      3 - Retirar Livro da pilha");
            System.out.println("      0 - Sair");
            System.out.println("******************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nome = sc.nextLine();
                    pilhaLivros.add(nome);
                    System.out.println("Pilha:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    System.out.println("Livro " + nome + " adicionado na pilha.");
                    break;

                case 2:
                    System.out.println("Livros na pilha:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    break;

                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                        break;
                    } else {
                        pilhaLivros.pop();
                        System.out.println("Pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                        System.out.println("Um livro foi removido da pilha");
                        break;
                    }

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);


        sc.close();

    }
}