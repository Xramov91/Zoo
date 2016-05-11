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
public class Animal {
private String anim;
    public Animal (String anim1){
       anim = anim1;
    }
    public void moves(){
        System.out.println("Я двигаюсь");   
    }
    public void sound(){
        System.out.println("Я говорю");
    }
    public void output(){
        System.out.println("Здесь должно быть имя класса");
    }
}
