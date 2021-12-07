package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int primeiroValor = scan.nextInt();
        System.out.print("Insira o segundo valor: ");
        int segundoValor = scan.nextInt();
        System.out.println("A soma dos valores é: " + (primeiroValor + segundoValor));
        System.out.println("A subtração dos valores é: " + (primeiroValor - segundoValor));
        System.out.println("A multiplicação dos valores é: " + (primeiroValor * segundoValor));
        System.out.println("A divisão inteira dos valores é: " + (primeiroValor / segundoValor));
    }
}
