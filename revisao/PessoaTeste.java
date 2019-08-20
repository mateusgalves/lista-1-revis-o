/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.exercico.revisao;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class PessoaTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Entre com a sua altura: ");
        float altura = sc.nextFloat();

        sc = new Scanner(System.in);

        System.out.println("Data de nascimento: ");
        String dataNasc = sc.next();

        Pessoa p1 = new Pessoa(nome, dataNasc, altura);

        System.out.println("informe o ano atual: ");
        int ano = sc.nextInt();

        System.out.print(p1.calcularData(ano));

    }
}


