/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package target.sistemas.teste;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class Questao_2 {
    public boolean verificaFibonacci(){
        int fib = 2;
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        System.out.println("Informe o valor");
        valor = scan.nextInt();
        
        if( valor == 0 || valor == 1){
            System.out.println("Este valor pertence a sequencia de fibonacci");
            return true;
        }else{
            int fibAnterior =1;
            int fiAux;
            while(fib < valor){
                fiAux = fib;
                fib = fib + fibAnterior;
                fibAnterior = fiAux;
                
            }
            if (fib == valor){
                System.out.println("Este valor pertence a sequencia de fibonacci");
            }else{
                System.out.println("Este valor nãopertence a sequencia de fibonacci");
            }
        }
        return false;
    }
}
