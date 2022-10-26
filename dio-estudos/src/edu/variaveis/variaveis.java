<<<<<<< HEAD
package edu.variaveis;


public class variaveis {
    public static void main(String[] args) throws Exception {

        // observações importantes
        double salarioMinimo = 2500.33;
        float pi = 3.14f;
        long cpf = 44646359978l;
        // se começar com zero pode gerar um erro de compilação.

        // casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 2;
        numero = 5;
        System.out.println(numero);

        String nome = "Leticia Santos";
        char sexo = 'M';

        // valor que não pode ser alterado além de ser maiuscula devera conter "final"
        // para que não mude o valor.

        final double VALOR_DE_PI = 3.14;

        System.out.println("=========== OPERADORES ==============");
        int number = 5;
        System.out.println(number);
        number = -5;
        System.out.println(number);
        number = number * -1;
        System.out.println(number);

        // encremento
        number = 5;
        System.out.println(number);

        System.out.println(++number);

        System.out.println(--number);

        System.out.println("======== Boolean =========");
        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("========== Ternário ============");
        int a, b;
        a = 5;
        b = 5;
        String resultado = a == b ? "true" : "false";
        System.out.println("letra A é igual a B ? " + resultado);

        System.out.println("====== Outros operadores =======");
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2 ? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente que numero2 ? " + simNao);
        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior a numero2 ? " + simNao);
        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor a numero2 ? " + simNao);

        if (numero1 == numero2){
            System.out.println("numeroUm é igual");
        } else {
            System.out.println("numerosUm Não é igual");
        }


        // objetos são diferentes de variaveis, para ver de o conteudo é igual ultiliza equals
        String nomeUm = "Leticia";
        String nomeDois = new String("Leticia");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        System.out.println("======= operadores lógicos ============");
        boolean condicao1 = true;
        boolean condicao2 = true;
        if (condicao1 && (7 < 3)) {
            System.out.println("Condição Valida");
        } else {
            System.out.println("Condição Invalida");
        }
        if (condicao1 || (7 < 3)) {
            System.out.println("Condição Valida");
        } else {
            System.out.println("Condição Invalida");
        }
    }
}
=======
package edu.variaveis;


public class variaveis {
    public static void main(String[] args) throws Exception {

        // observações importantes
        double salarioMinimo = 2500.33;
        float pi = 3.14f;
        long cpf = 44646359978l;
        // se começar com zero pode gerar um erro de compilação.

        // casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 2;
        numero = 5;
        System.out.println(numero);

        String nome = "Leticia Santos";
        char sexo = 'M';

        // valor que não pode ser alterado além de ser maiuscula devera conter "final"
        // para que não mude o valor.

        final double VALOR_DE_PI = 3.14;

        System.out.println("=========== OPERADORES ==============");
        int number = 5;
        System.out.println(number);
        number = -5;
        System.out.println(number);
        number = number * -1;
        System.out.println(number);

        // encremento
        number = 5;
        System.out.println(number);

        System.out.println(++number);

        System.out.println(--number);

        System.out.println("======== Boolean =========");
        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("========== Ternário ============");
        int a, b;
        a = 5;
        b = 5;
        String resultado = a == b ? "true" : "false";
        System.out.println("letra A é igual a B ? " + resultado);

        System.out.println("====== Outros operadores =======");
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2 ? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente que numero2 ? " + simNao);
        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior a numero2 ? " + simNao);
        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor a numero2 ? " + simNao);

        if (numero1 == numero2){
            System.out.println("numeroUm é igual");
        } else {
            System.out.println("numerosUm Não é igual");
        }


        // objetos são diferentes de variaveis, para ver de o conteudo é igual ultiliza equals
        String nomeUm = "Leticia";
        String nomeDois = new String("Leticia");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        System.out.println("======= operadores lógicos ============");
        boolean condicao1 = true;
        boolean condicao2 = true;
        if (condicao1 && (7 < 3)) {
            System.out.println("Condição Valida");
        } else {
            System.out.println("Condição Invalida");
        }
        if (condicao1 || (7 < 3)) {
            System.out.println("Condição Valida");
        } else {
            System.out.println("Condição Invalida");
        }
    }
}
>>>>>>> 76a6ffb213bba201b4e1a7fba1ec10dcb4f41ce5
