package Ex7;

public class Paciente {
    
    String nome;
    int gravidade;
    int tempo;

    public Paciente(String nome, int gravidade, int tempo) {
        this.nome = nome;
        this.gravidade = gravidade;
        this.tempo = tempo;
    }

    public void imprimir() {
        System.out.println(nome + ", gravidade=" + gravidade + ", tempo=" + tempo);
    }

    public String getNome() {
        return nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public int getTempo() {
        return tempo;
    }
}
