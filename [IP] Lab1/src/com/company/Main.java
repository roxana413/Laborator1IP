package com.company;

import com.company.AnimalePufoase;
import com.company.Reptile;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        Pasari p = new Pasari();
        Reptile r = new Reptile();
        AnimalePufoase ap = new AnimalePufoase();
        CladireReptile casaReptilelor = new CladireReptile();
        CladirePasari casaPasarilor = new CladirePasari();
        CladirePufoase casaPufoaselor =new CladirePufoase();
        zoo.add(p);
        zoo.add(r);
        zoo.add(ap);

        p.tip = "papagal";
        p.nume = "Rokko";
        p.hrana = "seminte";
        p.viteza = 20;
        p.culoare = "rosu";
        p.sex = "masculin";
        p.sunet = "ciripit";

        r.tip = "crocodil";
        r.nume = "Lino";
        r.hrana = "pesti";
        r.viteza = 50;
        r.culoare = "verde";
        r.sex = "masculin";
        r.sunet = "Huaaah :))) who knows?";

        ap.tip="Golden Retriever";
        ap.nume="Tucker";
        ap.hrana="Shoes";
        ap.viteza=-2;
        ap.culoare="Golden";
        ap.sex="masculin";
        ap.sunet="I needs chimcken";

        casaReptilelor.adaugaAnimal(r);
        casaPasarilor.adaugaAnimal(p);
        casaPufoaselor.adaugaAnimal(ap);
        casaReptilelor.curatareCladire();
        casaReptilelor.info();
        casaPasarilor.curatareCladire();
        casaPasarilor.info();
        casaPufoaselor.curatareCladire();
        casaPufoaselor.info();
        System.out.println(" ");
        System.out.println("In gradina zoo se afla "+zoo.size()+" Animale");

    }
}
