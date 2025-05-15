package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Object>> missoes = new ArrayList<>();
        System.out.println("=================================");
        for (int i=1; i<4; i++) {
            System.out.println("============= Ninja "+ i +  " ====================");

            System.out.println("Digite o nome do Ninja");
            String nameNinja = scanner.nextLine();

            System.out.println("Digite a idade do Ninja");
            int idadeNinja = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Digite o nome da Missão");
            String nomeMissao = scanner.nextLine();

            System.out.println("Represente o nível de dificuldade da Missão (A, B, C ou D)");
            char nivelMissao = scanner.nextLine().trim().toUpperCase().charAt(0);

            System.out.println("Digite C para missão concluída ou deixe em branco para pendente");
            String entrada = scanner.nextLine().toUpperCase();
            boolean missaoConcluida;

            System.out.println("============================================================");
            if (entrada.equals("C")) {
                missaoConcluida = true;
            }else {
                missaoConcluida = false;
            }
            //CONDIÇÕES
            if (idadeNinja < 15) {
                if (nivelMissao != 'C' && nivelMissao != 'D') {
                    missaoConcluida = false;
                }
            }
            ArrayList<Object> dados = new ArrayList<>();
            dados.add(nameNinja);
            dados.add(idadeNinja);
            dados.add(nomeMissao);
            dados.add(nivelMissao);
            dados.add(missaoConcluida);

            missoes.add(dados);
        }
        // Relatório final
        System.out.println("\n==== RELATÓRIO DE MISSÕES ====");
        for (ArrayList<Object> dados : missoes) {
            String nome = (String) dados.get(0);
            int idade = (int) dados.get(1);
            String missao = (String) dados.get(2);
            char nivel = (char) dados.get(3);
            boolean concluida = (boolean) dados.get(4);

            System.out.printf("Ninja: %-15s | Idade: %2d | Missão: %-15s | Nível: %c | Concluída: %s%n",
                    nome,
                    idade,
                    missao,
                    nivel,
                    concluida ? "Sim" : "Não"
            );
        }
        scanner.close();
    }
}
