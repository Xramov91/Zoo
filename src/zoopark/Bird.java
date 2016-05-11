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
public class Bird extends Animal{
    private String bird;
    public Bird (String bird1){
        super(bird1);
        bird = bird1;
    }
    public void moves(){
        System.out.println("Птицы летают");   
    }
    public void sound(){
        System.out.println("Птицы Чирикают");
    }
    public void output(){
        System.out.println(bird);
    }
}
