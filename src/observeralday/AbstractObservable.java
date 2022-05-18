package observeralday;

// Importamos librería Observer y Observable. 
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html

import java.util.Observable;
import java.util.ArrayList;


public abstract class AbstractObservable extends Observable {

    //OBSERVERS LIST -> ONLY ATRIBUTE
    protected ArrayList<ObserverInterface> Observers = new ArrayList<ObserverInterface>();
    private boolean changed;
    
    //OBSERVABLE METHODS
    protected void addObserver(ObserverInterface Observer){Observers.add(Observer);}

    protected void deleteObserver(ObserverInterface Observer){Observers.remove(Observer);}
    
    protected int countObserver(){return Observers.size();}
    
    @Override
    protected void setChanged(){changed = true;}
    
    @Override
    protected void clearChanged(){changed = false;}

    @Override
    public boolean hasChanged(){return this.changed;}
    
    @Override
    public void notifyObservers(){}
    
    public void notifyObserversData(){}
    
    
    
    
}
