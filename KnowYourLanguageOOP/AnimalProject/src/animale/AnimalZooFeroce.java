package animale;

import exceptii.AnimalManancaOmException;
import interfete.AngajatZoo;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class AnimalZooFeroce extends Animal {

    @Override
    public void doarme() {
        super.doarme();
        System.out.println("Animalul feroce vaneaza!!");
    }

    @Override
    public void mananca(Object o) throws AnimalManancaOmException {
        if(o instanceof AngajatZoo){
            throw new AnimalManancaOmException("Atentie!! Mananca oameni!!");
        }
        else System.out.println("AnimalZooFeroce mananca");
    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalulZooFeroce se joaca.");
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalulZooFeroce face baie.");
    }
}
