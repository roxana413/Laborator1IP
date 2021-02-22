package com.company;

import java.util.Iterator;

public class CladireReptile extends Cladire{
    public void info(){
        System.out.println("In cladirea rece, reptiliana, avem "+animals.size()+ " animale");
        Iterator var6 = animals.iterator();

        while(var6.hasNext()) {
            Animal a = (Animal)var6.next();
            a.info();
        }
    }

    public void curatareCladire(){
        System.out.println("Sunteti in cladirea reptilelor, curatarea dureaza 3 minute");
        curatare(3);
    }
}
