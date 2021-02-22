package com.company;

public class Reptile extends Animal {
    @Override
    public void hrana() {
        System.out.println(this.hrana);

    }

    @Override
    public void viteza() {
        System.out.println(this.viteza);
    }

    @Override
    public void culoare() {
        System.out.println(this.culoare);
    }

    @Override
    public void sunet() {
        System.out.println(this.sunet);

    }

    @Override
    public void nume() {
        System.out.println(this.nume);

    }

    @Override
    public void sex() {
        System.out.println(this.sex);

    }

    @Override
    public void tip() {
        System.out.println(this.tip);


    }

    public void info() {
        System.out.println(" ");

        System.out.println("Tip: "+this.tip);
        //System.out.println(" ");
        System.out.println("Nume: " + this.nume);
        //System.out.println(" ");
        System.out.println("Sex: "+this.sex);
        //System.out.println(" ");
        System.out.println("Hrana: "+this.hrana);
        //System.out.println(" ");
        System.out.println("Viteza: "+this.viteza);
        //System.out.println(" ");
        System.out.println("Sunet: "+this.sunet);
        //System.out.println(" ");
        System.out.println("Culoare: "+this.culoare);
        System.out.println(" ");


    }


}
