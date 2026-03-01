package br.com.dvdh.maratonadevdojo.introducao;

public class Aula04Operadores {
    static void main() {
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        //O resultado de operação entre dois valores inteiros resultará em um valor inteiro.
        System.out.println(resultado);

        //%

        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualADez);
        System.out.println(isDezDiferenteDeVinte);
    }
}
