/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Keven
 */
public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
    
    public void reagir(String frase){
        if("Toma comida".equals(frase) || "Oi meu bb".equals(frase)){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
