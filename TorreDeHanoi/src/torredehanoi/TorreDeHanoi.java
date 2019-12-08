/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torredehanoi;

/**
 *
 * @author Keven
 */
public class TorreDeHanoi {

    /**
     * @param n
     * @param ori
     * @param aux
     * @param dst
     */
    public static void hanoi(int n, char ori, char aux, char dst){
        if(n>0){
            hanoi(n-1, ori, aux, dst);
            mover(ori, dst);
            hanoi(n-1, aux, dst, ori);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }

    private static void mover(char ori, char dst) {
        System.out.println(ori + " -> " + dst);
    }
    
}
