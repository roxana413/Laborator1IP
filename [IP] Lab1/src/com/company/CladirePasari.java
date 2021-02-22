package com.company;

import java.util.Iterator;

public class CladirePasari extends Cladire{
    public void info(){
        System.out.println("Cladirea pasarilor ne bucura cu un numar fain de "+ animals.size() + " pasari");
        Iterator var6 = animals.iterator();
        while(var6.hasNext()) {
            Animal a = (Animal)var6.next();
            a.info();
        }
    }

    public void curatareCladire(){
        System.out.println("Sunteti in cladirea pasarilor, curatarea dureaza 3 minute");
        curatare(3);
    }
}
