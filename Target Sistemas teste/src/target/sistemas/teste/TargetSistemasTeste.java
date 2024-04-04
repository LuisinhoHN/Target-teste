/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package target.sistemas.teste;

/**
 *
 * @author henri
 */
public class TargetSistemasTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Questao_1 questão1 = new Questao_1();
        System.out.println("Questão 1: ");
        questão1.calcularValor();
        questão1.imprimirSoma();
        System.out.println();
        
        System.out.println("Questão 2: ");
        Questao_2 questao2 = new Questao_2();
        questao2.verificaFibonacci();
        
        System.out.println("Questão 3: ");
        System.out.println("a) soma 2 ao numero anterior 1,3,5,7,9,...");
        System.out.println("b) multiplica por 2 o numero anterior 2,4,8,16,32,64,128...");
        System.out.println("c) é a sequencia dos quadrados dos numeros 0,1,4,9,16,25,36,49...");
        System.out.println("d) é a sequancia dos quadrados dos numeros pares 4,16,36,64,100... ");
        System.out.println("e) é a sequencia de fibonacci 1,1,2,3,5,8,13...");
        System.out.println("f) ");
        
        System.out.println("Questão 4: ");
        System.out.println("Ir a primeira vez na sala ligar 2 primeiros interruptores, esperar uns minutos e depois desligar o primeiro interruptor");
        System.out.println("Depois entrar em uma sala e verificar o estado da lampada, se esta acesa, quente ou fria");
        System.out.println("Se acesa o 2 interruptor a ligou, se apagada e fria ela é o do 3 interruptor, se apagada e quente o 1 interruptor a acendeu");
        
        Questao_5 questao5 = new Questao_5();
        System.out.println("Questão 5: ");
        questao5.inverterString();
    }
    
}
