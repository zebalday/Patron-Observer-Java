package observeralday;

import java.util.Observable;

public class Admin implements ObserverInterface{
    
    // ATRIBUTES
    private String name;
    
    // CONSTRUCTORS
    public Admin(String name) {this.name = name;}
    public Admin() {}
    

    // METHODS
    @Override
    public void update(Observable persona, Object value){
        System.out.println(persona+" ha cambiado su edad a: "+value+".");
    }
    
    @Override
    public void Update(int age) {
        System.out.println("El objeto ha cambiado su edad a: "+age+".");
    }
}
