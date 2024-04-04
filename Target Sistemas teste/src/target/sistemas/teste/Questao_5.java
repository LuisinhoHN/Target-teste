/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package target.sistemas.teste;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author henri
 */
public class Questao_5 {
    public void inverterString(){        
        String palavra = new String();        
        String reversa = new String();        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a palavra a ser invertida");
        palavra = scan.next(reversa);
        
        char [] letras = palavra.toCharArray();
        char [] auxiliar = palavra.toCharArray();
        int maxInd = palavra.length()-1;
        
        for(int i = 0; i<palavra.length();i++){
            auxiliar[maxInd] = letras[i];
            maxInd--;
        }
        reversa=Arrays.toString(auxiliar);
        System.out.println("Palavra atual: "+palavra);
        System.out.println("Palavra invertida: "+reversa);
        
        
        
        
    }
}
