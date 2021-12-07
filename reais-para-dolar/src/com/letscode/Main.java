package com.letscode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale brasil = new Locale ("pt","BR");
        Locale usa = new Locale("en", "US");

        System.out.print("Insira a cotação do dólar: ");
        float cotacao = scan.nextFloat();
        System.out.print("Insira um valor em reais: ");
        float valorEmReais = scan.nextFloat();
        NumberFormat formatReais = NumberFormat.getCurrencyInstance(brasil);
        NumberFormat formatDolares = NumberFormat.getCurrencyInstance(usa);
        String reaisFormatados = formatReais.format(valorEmReais);
        float valorEmDolares = (valorEmReais / cotacao);
        String dolaresFormatados = formatDolares.format(valorEmDolares);


        System.out.printf("%s equivalem a %s na cotação atual", reaisFormatados, dolaresFormatados);

    }
}
