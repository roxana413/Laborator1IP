package com.company;

public class CladirePesti extends Cladire{
    public void info(){
        System.out.println("Cladirea pestilor e un acvariu tare fain cu " +animals.size()+ " pesti");
    }

    public void curatareCladire(){
        System.out.println("Sunteti in acvariu( nu la propriu), curatarea dureaza 2 minute");
        curatare(2);
    }
}
