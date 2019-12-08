/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

/**
 *
 * @author Keven
 */
public class BubbleSort {
    public static void main(String[]args){
        int vetor[]={3,6,2,1,8,4};
        int aux;
        boolean controle;
        
        for(int i=0;i<vetor.length;i++){
            controle=true;
            for(int j=0;j<(vetor.length-1);j++){
                
                if(vetor[j]>vetor[j+1]){
                    aux=vetor[j];
                    vetor[j]=vetor[j+1];
                    vetor[j+1]=aux;
                    controle=false;//enquanto não terminar a ordeção, será false
                }
            }
            if(controle){//se o cara finalizar true
                break;
            }
        }
        
        for(int g=0;g<vetor.length;g++){
            System.out.println(vetor[g] + " ");
        }
    }
}
