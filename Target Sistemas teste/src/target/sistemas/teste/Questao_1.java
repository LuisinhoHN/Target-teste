/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package target.sistemas.teste;


/**
 *
 * @author henri
 */
public class Questao_1 {
    int INDICE = 13;
    int SOMA = 0;
    int K = 0;
    
    //enquanto K < INDICE faça
    public int calcularValor(){
        while(K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }
        return SOMA;
    }
    
    public void imprimirSoma(){
        System.out.println("Resultado da soma é ="+SOMA);
    }
    
}
