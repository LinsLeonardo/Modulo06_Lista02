package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double FATOR_MULTIPLICACAO_POLEGADAS = 2.54;
        System.out.print("Insira um valor em polegadas: ");
        float valorPolegadas = scan.nextFloat();
        System.out.printf("%.2f polegadas em cm é: %.2f", valorPolegadas,
                (valorPolegadas * FATOR_MULTIPLICACAO_POLEGADAS));
    }
}
