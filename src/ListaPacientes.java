public class ListaPacientes {
    private Paciente inicio;

    public void adicionar(Paciente paciente) {
        paciente.setProximo(inicio);
        inicio = paciente;
        System.out.println("Paciente adicionado à lista!");
    }

    public Paciente buscar(String id) {
        Paciente atual = inicio;
        while (atual != null) {
            if (atual.getId().equals(id)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void remover(String id) {
        Paciente atual = inicio, anterior = null;

        while (atual != null && !atual.getId().equals(id)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        if (anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }
        System.out.println("Paciente removido com sucesso!");
    }

    public void mostrar() {
        Paciente atual = inicio;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
}
