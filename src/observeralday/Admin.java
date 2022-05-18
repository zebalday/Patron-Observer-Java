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
        String nombre = getNombre((Persona)persona);
        System.out.println(name+"! "+nombre+" ha cambiado su edad a: "+value+".");
    }
    
    public String getNombre(Persona p){
        String nombre = p.getName();
        return nombre;
    }
}
