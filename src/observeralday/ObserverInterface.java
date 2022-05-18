package observeralday;

// Importamos librería Observer y Observable. 
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html
// Link: https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html

import java.util.Observer;
import java.util.Observable;
        
public interface ObserverInterface extends Observer{
    
    @Override
    public void update(Observable target, Object value);
    
    public void Update(int age);
    
}
