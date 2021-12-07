package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um valor para encontrar a tabuada: ");
        int calcularTabuada = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n %d * %d = %d", calcularTabuada, i, (calcularTabuada * i));
        }
    }
}
