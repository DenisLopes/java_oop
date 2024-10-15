package application;

import entities.ListaDePresente;

import java.util.Scanner;

public class MainPresente {

    public static void main(String[] args) {
        ListaDePresente listaDePresente = new ListaDePresente();

        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            System.out.println("Escolha uma opção: (adicionar, remover, comprado, exibir, sair)");
            comando = scanner.nextLine();

            switch (comando.toLowerCase()){
                case "adicionar":
                    System.out.println("Digite o nome do presente: ");
                    String nome = scanner.nextLine();
                    listaDePresente.addPresente(nome);
                    break;
                case "remover":
                    System.out.println("digite o nome do presente para remover: ");
                    String removerPresente = scanner.nextLine();
                    listaDePresente.removePresente(removerPresente);
                    break;
                case "comprado":
                    System.out.println("Digite o nome dp presente comprado: ");
                    String presenteComprado = scanner.nextLine();
                    listaDePresente.marcarComoComprado(presenteComprado);
                    break;
                case "exibir":
                    listaDePresente.exibirpresentes();
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando Invalido");
            }
        }while (!comando.equalsIgnoreCase("sair"));

        scanner.close();
    }

}
