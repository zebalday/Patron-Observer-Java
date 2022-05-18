package observeralday;

// Importamos librería Observer y Observable. 
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html

import java.util.Observable;
import java.util.ArrayList;
import java.util.Observer;


public abstract class AbstractObservable extends Observable {

    // OBSERVERS LIST -> ONLY ATRIBUTE
    protected ArrayList<Observer> Observers = new ArrayList<>();
    private boolean changed;
    
    // OBSERVABLE METHODS
    @Override
    public void addObserver(Observer Observer){Observers.add(Observer);}

    @Override
    public void deleteObserver(Observer Observer){Observers.remove(Observer);}
    
    @Override
    public void deleteObservers(){Observers.clear();}
    
    @Override
    public int countObservers(){return Observers.size();}
    
    @Override
    protected void setChanged(){changed = true;}
    
    @Override
    protected void clearChanged(){changed = false;}

    @Override
    public boolean hasChanged(){return this.changed;}
    
    @Override
    public void notifyObservers(){}
    
}
