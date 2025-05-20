package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicação;
         *Objetivo = O usuario vai criar um ninja e vamos validar os dados;
         *
         * */

        Scanner caixaDeTexto = new Scanner(System.in);


        // Receber o nome do Ninja
        System.out.println("DIgite o nome do Ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("===============================");
        System.out.println("O nome do ninja é " + nomeDoNinja);

        //Receber a idade do Ninja
        System.out.println("Digite a idade do Ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("===============================");
        System.out.println("A idade do Ninja é " + idadeDoNinja + " anos.");

        // Tratamento de dados
        if(idadeDoNinja >= 18) {
            System.out.println("O ninja " + nomeDoNinja + " tem " + idadeDoNinja + " anos, é maior de idade e pode fazer missões fora da aldeia. ");
        } else {
            System.out.println("O ninja " + nomeDoNinja + " tem " + idadeDoNinja + " anos, e é menor de idade e não pode fazer missões fora da aldeia. ");
        }

        // Fechar sempre o scanner;
        caixaDeTexto.close();
    }




}
