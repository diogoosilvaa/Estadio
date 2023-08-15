package br.sp.senai.sistemaentrada;

import java.util.Scanner;

public class SistemaEntrada {
    public static void main(String[] args) {

        /** Decarar variavel */

        String nome;
        int idade, corCamisa;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        nome = teclado.next();
        System.out.println("qual sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Qual a cor da sua camisa[ 1- azul 2-branca 3-vermelha 4-preta 5- amarela 6-verde");
        corCamisa = teclado.nextInt();

        switch(corCamisa){
            case 1:
                System.out.println("Arquibancada A");
                break;

            case 2:
                System.out.println("Arquibancada B");
                break;

            case 3:
                System.out.println("Arquibancada C");
                break;
            case 4:
                System.out.println("Arquibancada D");
                break;
            case 5:
                System.out.println("Arquibancada E");
                break;
            case 6:
                System.out.println("Arquibancada F");
                break;

            default:
                System.out.println("Nao Entra");
        }

    }
}
