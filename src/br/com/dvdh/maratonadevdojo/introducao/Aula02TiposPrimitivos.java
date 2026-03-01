package br.com.dvdh.maratonadevdojo.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L; //Cast de variável
        long numeroGrande = (long) 100.25D;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String string = "aaaaa";
        System.out.println("A idade é: " + age + " anos");
        //Cast definitivamente não é uma boa prática.
        System.out.println(salarioFloat);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println("Valor da String: " + string);

    }
}
