package staff;

import animale.Animal;
import animale.AnimalZooFeroce;
import interfete.AngajatZoo;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class VeterinarZoo implements AngajatZoo {
    int bonus = 0;

    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Veterinarul are grija de animal!!");
        if(animal instanceof AnimalZooFeroce){
            animal.faceBaie();
        }
        calculeazaBonusSalarial();
    }

    @Override
    public void calculeazaBonusSalarial() {
        bonus = bonus + (valoareBonusPerAnimal*2);
    }

    public int getBonus() {
        return bonus;
    }
}
