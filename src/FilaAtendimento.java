public class FilaAtendimento {
    private Paciente inicio, fim;

    public void enfileirar(Paciente paciente) {
        if (fim != null) {
            fim.setProximo(paciente);
        }
        fim = paciente;
        if (inicio == null) {
            inicio = fim;
        }
        System.out.println("Paciente enfileirado!");
    }

    public Paciente desenfileirar() {
        if (inicio == null) {
            System.out.println("A fila está vazia!");
            return null;
        }
        Paciente paciente = inicio;
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return paciente;
    }

    public void mostrarFila() {
        if (inicio == null) { // Verifica se a fila está vazia
            System.out.println("Não há pacientes na espera.");
            return;
        }
        Paciente atual = inicio;
        System.out.println("=== Pacientes em Espera ===");
        while (atual != null) {
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
    
}
