package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class data {

    public static void main(String[] args) {
        String nome = "Suh";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        // Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao = "";
        LocalTime agora = LocalTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa Tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        }else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
