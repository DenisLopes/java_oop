package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaDePresente {

    private List<Presente> presentes;

    public ListaDePresente() {
        this.presentes = new ArrayList<>();
    }

    public void addPresente(String nome){
        Presente presente = new Presente(nome);
        presentes.add(presente);
    }

    public void removePresente(String nome){
        presentes.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public void marcarComoComprado(String nome){
        for (Presente presente : presentes){
            if (presente.getNome().equalsIgnoreCase(nome)){
                presente.marcarComoComprado();
                return;
            }
        }
    }

    public void exibirpresentes(){
        for (Presente presente : presentes){
            System.out.println(presente);
        }
    }

}
