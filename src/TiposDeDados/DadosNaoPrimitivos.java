package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        *  Tipo de dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele.
        * Diferença: Uma das difenças entre primitivos e não primitivos é a opição de poder usar métodos com as variaveis
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK;
        System.out.println(nomeUpperCase);

        String aldeia = "Aldeia da folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // Vai colocar tudo em caixa baixa;
        System.out.println(aldeiaLowerCase);


    }
}
