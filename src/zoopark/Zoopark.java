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
public class Zoopark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish f1 = new Fish("Fish");
        Bird b1 = new Bird("Bird");
        //Mammal m1 = new Mammal("Mammal");
        Seamammal s1 = new Seamammal("Seamammal");
        TerreMammal t1 = new TerreMammal("TerreMammal");
        
        f1.moves();
        b1.moves();;
        s1.moves();
        t1.moves();
        
        f1.sound();
        b1.sound();
        s1.sound();
        t1.sound();
        
        f1.output();
        b1.output();
        s1.output();
        t1.output();
    }
    
}
