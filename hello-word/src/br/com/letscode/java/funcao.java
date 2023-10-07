package br.com.letscode.java;

public class funcao {

    public static void main(String[] args) {
        String nomeOriginal = "Let's Code";
        saudacao(nomeOriginal);
        int result = soma(2,3);
        System.out.println(result);
    }
    public static void saudacao(String nomeParametro){
        System.out.println("Hello, " + nomeParametro);
    }
    public static int soma(int a, int b){
        return a + b;
    }
}
