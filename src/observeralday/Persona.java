
package observeralday;

import java.util.Observer;

public class Persona extends AbstractObservable {
    
    //ATRIBUTES
    private String name;
    private String country;
    private int age;
    
    //CONSTRUCTORS
    public Persona(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public Persona() {}
    
    //MUTATORS
    public void setName(String name) {this.name = name;}
    public void setCountry(String country) {this.country = country;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public String getCountry() {return country;}
    public int getAge() {return age;}
    
    //METHODS
    public void changeAge(int ages){
        this.age = this.age + (ages);
        
        super.setChanged();
        if(super.hasChanged()){
            notifyObservers();
            notifyObservers(this);
        }
    }
    
    @Override
    public void notifyObservers(){
        if (super.hasChanged()){
            for (Observer Observer : Observers) {
                Observer.update(this, Observer);}        }
        super.clearChanged();
    }
}