package entities;

public class Presente {
    private String nome;
    private boolean comprado;

    public Presente(String nome) {
        this.nome = nome;
        this.comprado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void marcarComoComprado() {
        this.comprado = true;
    }

    @Override
    public String toString() {
        return nome + (comprado ? "(Comprado)" : "(Disponivel)");
    }
}
