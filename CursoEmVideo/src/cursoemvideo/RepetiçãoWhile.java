/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

/**
 *
 * @author Keven
 */
public class RepetiçãoWhile {
    public static void main(String[] args){
        int cc = 0;
        while(cc<10){
            cc++;
            if(cc == 2 || cc==3 || cc==4){
                continue;//Volta para o while
            }
            if(cc==7){
                break;//Interrompe o laço
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
