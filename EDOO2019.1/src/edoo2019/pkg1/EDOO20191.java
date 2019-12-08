/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edoo2019.pkg1;

//import java.util.Iterator;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Iterator;
//import static sun.java2d.cmm.ColorTransform.In;

/**
 *
 * @author Keven
 */
public class EDOO20191 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        TSArvoreBinariaBusca<Integer, Integer> teste = new TSArvoreBinariaBusca<Integer, Integer>();
        teste.put(70, 70);
        teste.put(50, 50);
        teste.put(43, 43);
        teste.put(44, 44);
        
        teste.exibeDeitada();
        System.out.println(teste.altura());
    }

}
