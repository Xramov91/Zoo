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
public class Fish extends Animal{
    private String fish;
    public Fish (String fish1){
        super(fish1);
        fish = fish1;
    }
    public void moves(){
        System.out.println("Рыбы плавают");
    }
    public void sound(){
        System.out.println("Рыбы не разговаривают");
    }
    public void output(){
        System.out.println(fish);
        
    }
}
