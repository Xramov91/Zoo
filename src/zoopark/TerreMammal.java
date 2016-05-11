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
public class TerreMammal extends Mammal{
    private String termam;
    public TerreMammal(String tmammal1) {
        super(tmammal1);
        termam = tmammal1;
    }
     public void moves(){
        System.out.println("Сухопутные Животные бегают");   
    }
    public void sound(){
        System.out.println("Сухопутные Животные говорят на разных языках");
    }
    public void output(){
        System.out.println(termam);
    }
}
