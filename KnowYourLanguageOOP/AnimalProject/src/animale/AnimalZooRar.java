package animale;

import exceptii.AnimalManancaOmException;
import interfete.AngajatZoo;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class AnimalZooRar extends Animal {

    private String nume;
    private String numeleTariiDeOrigine;

    public AnimalZooRar() {
    }

    public AnimalZooRar(String nume, String numeleTariiDeOrigine) {
        this.nume = nume;
        this.numeleTariiDeOrigine = numeleTariiDeOrigine;
    }

    public AnimalZooRar(String nume) {
        this.nume = nume;
        this.numeleTariiDeOrigine = null;
    }


    @Override
    public void mananca(Object o) {
        if(o instanceof AngajatZoo){
            throw new AnimalManancaOmException("Atentie!! Mananca oameni!!");
        }
        else System.out.println("AnimalZooRar mananca");
    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalulZooRar se joaca.");
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalulZooRar face baie.");
    }

    @Override
    public void doarme() {
        super.doarme();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumeleTariiDeOrigine() {
        return numeleTariiDeOrigine;
    }

    public void setNumeleTariiDeOrigine(String numeleTariiDeOrigine) {
        this.numeleTariiDeOrigine = numeleTariiDeOrigine;
    }
}
