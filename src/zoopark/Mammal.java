/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoopark;

/**
 *
 * @author Alex
 */
public class Mammal extends Animal {
    private String mammal;
    public Mammal(String mammal1){
        super(mammal1);
        mammal = mammal1;
    }
    public void moves(){
        System.out.println("Животные бегают");   
    }
    public void sound(){
        System.out.println("Животные говорят");
    }
    public void output(){
        System.out.println(mammal);
    }
}
