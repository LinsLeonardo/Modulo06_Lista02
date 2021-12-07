package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double FATOR_MULTIPLICACAO = 1.8;
        final int FATOR_SOMA = 32;
        System.out.print("Insira um valor de temperatura em celsius: ");
        float temperaturaCelsius = scan.nextFloat();
        System.out.printf("%.2f °C em Fahrenheit é: %.2f", temperaturaCelsius, ((temperaturaCelsius * FATOR_MULTIPLICACAO) + FATOR_SOMA));
    }
}
