public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
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
        
        // valor que não pede ser alterado além de ser maiuscula devera conter "final"
        // para que não mude o valor.

        final double VALOR_DE_PI = 3.14;

    }
}
