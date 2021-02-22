package com.company;

import java.util.Iterator;

public class CladirePufoase extends Cladire{
    public void info(){
        System.out.println("In cladirea pufoasa, totul e pufos fiindca avem "+animals.size()+ " animale");
        Iterator var6 = animals.iterator();
        while(var6.hasNext()) {
            Animal a = (Animal)var6.next();
            a.info();
        }
    }

    public void curatareCladire(){
        System.out.println("Sunteti in cladirea animalelor pufoase, curatarea dureaza 5 minute ptc sunt pufoase");
        curatare(5);
    }
}
