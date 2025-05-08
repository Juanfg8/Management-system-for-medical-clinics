public class Paciente {
    private String nome;
    private String id;
    private String motivoConsulta;
    private Paciente proximo;

    public Paciente(String nome, String id, String motivoConsulta) {
        this.nome = nome;
        this.id = id;
        this.motivoConsulta = motivoConsulta;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Nome='" + nome + '\'' +
                ", ID='" + id + '\'' +
                ", Motivo='" + motivoConsulta + '\'' +
                '}';
    }
}
