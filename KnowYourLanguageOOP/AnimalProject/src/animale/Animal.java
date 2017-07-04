package animale;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public abstract class Animal {

    public abstract void mananca (Object o);
    public abstract void seJoaca ();
    public abstract void faceBaie ();
    public void doarme (){
        System.out.println("Animalul doarme.");
    }

    public Animal(){
        System.out.println("animale.Animal nou");
    }

}
