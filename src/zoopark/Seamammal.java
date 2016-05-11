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
public class Seamammal extends Mammal{
    private String seamam;
    public Seamammal(String smammal1) {
        super(smammal1);
        seamam = smammal1;
    }
     public void moves(){
        System.out.println("Морские животные плавают");   
    }
    public void sound(){
        System.out.println("Морские Животные не говорят");
    }
    public void output(){
        System.out.println(seamam);
    }
    
    
    
}
