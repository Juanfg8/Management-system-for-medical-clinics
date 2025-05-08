public class HistoricoAtendimentos {
    private Paciente topo;

    public void adicionar(Paciente paciente) {
        paciente.setProximo(topo);
        topo = paciente;
        System.out.println("Paciente adicionado ao histórico!");
    }

    public void mostrarHistorico() {
        Paciente atual = topo;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
}
