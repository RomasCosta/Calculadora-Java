/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_java;

import java.util.Scanner;

/**
 *
 * @author romar
 */
public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora_Java calc = new Calculadora_Java();
      
        System.out.println("Entre com a operação matemática desejada: ");
        System.out.println(" 1 - adição\n 2 - subtração\n 3 - multiplicação\n 4 - divisão");
        
        int opcao = scan.nextInt();
       
        System.out.println("------- Bem vindo à Calculadora Java -------");
        
        System.out.println("Insira o primeiro valor: ");
        int valor1 = scan.nextInt();
        
        System.out.println("Insira o segundo valor: ");
        int valor2 = scan.nextInt();
       
        
        
        switch (opcao) {
            case 1 -> System.out.println("O resultado da operação de soma é: "+ calc.soma(valor1, valor2));
            case 2 -> System.out.println("O resultado da operação de subtração é: "+ calc.subtracao(valor1, valor2));
            case 3 -> System.out.println("O resultado da operação de multiplicação é: "+ calc.multiplicacao(valor1, valor2));
            case 4 -> System.out.println("O resultado da operação de divisão é: "+ calc.divisao(valor1, valor2));
            default -> System.out.println("valor digitado não corresponde a lista.");
        }
       
    }
}
