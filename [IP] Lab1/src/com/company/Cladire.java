package com.company;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class Cladire {
    protected ArrayList<Animal> animals=new ArrayList<>();
    public void adaugaAnimal(Animal a){
        this.animals.add(a);
    }
    public void eliminAnimal(Animal a){
        this.animals.remove(a);
    }

    public void curatare(int s) {
        System.out.println("Momentam curatam cladirea");
        for (int x = 0; x <= 100; x+=10) {
            System.out.println("Curatare in lucru: " + x + "%");
            try {
                wait(50000);
            }
            catch (Exception e){}
        }System.out.println("Cladirea s-a curatat cu succes!");
    }

    public void afisareAnimale(){
        for(Animal a:animals)
            a.info();
    }
}
