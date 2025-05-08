import java.util.Scanner;

public class SistemaClinica {

    public static void main(String[] args) {
        ListaPacientes cadastro = new ListaPacientes();
        FilaAtendimento fila = new FilaAtendimento();
        HistoricoAtendimentos historico = new HistoricoAtendimentos();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== Sistema da Clínica ===");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Organizar Atendimento (Enfileirar)");
            System.out.println("3. Realizar Atendimento");
            System.out.println("4. Mostrar Histórico de Atendimentos");
            System.out.println("5. Buscar Paciente no Cadastro");
            System.out.println("6. Remover Paciente do Cadastro");
            System.out.println("7. Mostrar Pacientes em Espera");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> cadastrarPaciente(scanner, cadastro);
                case 2 -> organizarAtendimento(scanner, cadastro, fila);
                case 3 -> realizarAtendimento(fila, historico);
                case 4 -> mostrarHistorico(historico);
                case 5 -> buscarPaciente(scanner, cadastro);
                case 6 -> removerPaciente(scanner, cadastro);
                case 7 -> fila.mostrarFila();
                case 8 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 8);

        scanner.close();
    }

    private static void cadastrarPaciente(Scanner scanner, ListaPacientes cadastro) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Motivo da Consulta: ");
        String motivo = scanner.nextLine();

        Paciente novoPaciente = new Paciente(nome, id, motivo);
        cadastro.adicionar(novoPaciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void organizarAtendimento(Scanner scanner, ListaPacientes cadastro, FilaAtendimento fila) {
        System.out.print("ID do Paciente para Atendimento: ");
        String id = scanner.nextLine();
        Paciente paciente = cadastro.buscar(id);
        if (paciente != null) {
            fila.enfileirar(paciente);
            System.out.println("Paciente adicionado à fila de atendimento.");
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    private static void realizarAtendimento(FilaAtendimento fila, HistoricoAtendimentos historico) {
        Paciente atendido = fila.desenfileirar();
        if (atendido != null) {
            historico.adicionar(atendido);
            System.out.println("Atendimento realizado: " + atendido);
        }
    }

    private static void mostrarHistorico(HistoricoAtendimentos historico) {
        System.out.println("=== Histórico de Atendimentos ===");
        historico.mostrarHistorico();
    }

    private static void buscarPaciente(Scanner scanner, ListaPacientes cadastro) {
        System.out.print("ID do Paciente: ");
        String id = scanner.nextLine();
        Paciente encontrado = cadastro.buscar(id);
        if (encontrado != null) System.out.println(encontrado);
        else System.out.println("Paciente não encontrado!");
    }

    private static void removerPaciente(Scanner scanner, ListaPacientes cadastro) {
        System.out.print("ID do Paciente a ser removido: ");
        String id = scanner.nextLine();
        cadastro.remover(id);
    }
}
