import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();
        int opcao;
        do {
            System.out.println("******************************************");
            System.out.println("      1 - Adicionar Cliente na Fila");
            System.out.println("      2 - Listar todos os Clientes");
            System.out.println("      3 - Retirar Cliente da Fila");
            System.out.println("      0 - Sair");
            System.out.println("******************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    filaClientes.add(nome);
                    System.out.println("Fila:");
                    for (String fila : filaClientes) {
                        System.out.println(fila);
                    }
                    System.out.println("Cliente " + nome + " adicionado na fila.");
                    break;

                case 2:
                    System.out.println("Clientes na fila:");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    break;

                case 3:
                    String clienteRemovido = filaClientes.poll();
                    if (clienteRemovido != null) {
                        System.out.println("Fila:");
                        for (String fila : filaClientes) {
                            System.out.println(fila);
                        }
                        System.out.println("Cliente " + clienteRemovido + " foi retirado da fila.");

                    } else {
                        System.out.println("A fila está vazia.");
                    }
                    break;

                case 0:
                    System.out.println("Saiu!");
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
