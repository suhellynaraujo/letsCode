package br.com.letscode.java;

public class Strings {

    public static void main(String[] args) {
        String nome = "Suh";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String outroNome = "suh";
        System.out.println(nome.equals(outroNome));
        System.out.println(nome.equalsIgnoreCase(outroNome));
    }
}
