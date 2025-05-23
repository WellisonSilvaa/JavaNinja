package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        *  SwitchCases: Que servem para gerar casos especificos
        *   Objetivo: Pedir para o usuario escolher entre os Ninjas
        * SwithCase
        * */

        //Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Opções para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher
        int escolhaDoUsuario = scanner.nextInt();

        // Reação ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno");
                break;
            default:
                System.out.println("Voce não digitou uma resposta válida! Tente denovo");
        }

        //Fechar a caixa
        scanner.close();

    }


}
