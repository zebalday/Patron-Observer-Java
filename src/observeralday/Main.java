package observeralday;

public class Main {
    
    public static void main(String[] args) {
        
        // CREAMOS LOS OBJETOS OBSERVADOS (Personas)
        Persona p1 = new Persona("Sebastian","Chile", 15);
        Persona p2 = new Persona("Daniel","Chile", 23);

        
        // CREAMOS LOS OBJETOS OBSERVADORES (Supervisores)
        Admin a1 = new Admin ("Seba");
        Admin a2 = new Admin ("Daniel");
        Admin a3 = new Admin ("Rodrigo");
        Admin a4 = new Admin ("Jan");
        Admin a5 = new Admin ("Alberto");

        
        // AGREGAMOS LOS OBSERVADORES A CADA OBJETO OBSERVADO
        p1.addObserver(a1);
        p1.addObserver(a2);
        p1.addObserver(a3);
        p1.addObserver(a4);
        p1.addObserver(a5);
        
        
        p2.addObserver(a1);
        p2.addObserver(a2);
        p2.addObserver(a3);
        p2.addObserver(a4);
        p2.addObserver(a5);

        
        // MODIFICAMOS LA EDAD DE LOS OBJETOS OBSERVADOS
        p1.changeAge(6);

        System.out.println("\n");

        p2.changeAge(40);



        
        
        
        
        
        
        
    }
    
}
