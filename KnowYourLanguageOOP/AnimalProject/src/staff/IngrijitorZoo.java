package staff;

import animale.Animal;
import animale.AnimalZooRar;
import exceptii.AnimalManancaOmException;
import exceptii.AnimalPeCaleDeDisparitieException;
import interfete.AngajatZoo;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class IngrijitorZoo implements AngajatZoo {

    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Ingrijitorul intra in cusca animalului.");
    }

    private int bonus=0;


    @Override
    public void calculeazaBonusSalarial() {
        bonus = bonus + (valoareBonusPerAnimal*3);
    }

    public int getBonus() {
        return bonus;
    }

    public void lucreaza(Animal animal, Object mancare) throws AnimalPeCaleDeDisparitieException, AnimalManancaOmException {
        this.lucreaza(animal);
        animal.doarme();
        animal.faceBaie();
        animal.seJoaca();
        animal.mananca(mancare);
        if((animal instanceof AnimalZooRar) && (mancare == null)){
            throw new AnimalPeCaleDeDisparitieException("Atentie!! Animal pe cale de disparitie");
        }
        calculeazaBonusSalarial();
    }


}
