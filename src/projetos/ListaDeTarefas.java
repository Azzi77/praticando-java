package projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Lista de Tarefas:");
            listarTarefas(listaDeTarefas);

            System.out.println("\nOpções:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = scanner.nextLine();
                    adicionarTarefa(listaDeTarefas, tarefa);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpa a quebra de linha
                    removerTarefa(listaDeTarefas, indice);
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void listarTarefas(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }
    }

    public static void adicionarTarefa(ArrayList<String> lista, String tarefa) {
        lista.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public static void removerTarefa(ArrayList<String> lista, int indice) {
        if (indice >= 1 && indice <= lista.size()) {
            String tarefaRemovida = lista.remove(indice - 1);
            System.out.println("Tarefa removida: " + tarefaRemovida);
        } else {
            System.out.println("Índice inválido. Nenhuma tarefa removida.");
        }
    }
}

