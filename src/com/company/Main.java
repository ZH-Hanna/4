package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        p1.wypisz();

        Punkt2D p2 = new Punkt2D(10,20);
        p2.wypisz();

        Punkt3D p3 = new Punkt3D();
        p3.wypisz();

        Punkt3D p4 = new Punkt3D(10,20,30);
        p4.wypisz();
    }
}
class Punkt2D {
    int x,y;
    public Punkt2D() {
        x=0;y=0;

    }
    public Punkt2D(int a, int b) {
        this.x = a;
        this.y = b;
    }



    public void wypisz(){
        System.out.println("("+x+", "+y+")");
    }
    }

class Punkt3D extends Punkt2D {
    int z;
    public Punkt3D() {
        x=0;y=0;z=0;

    }
    public Punkt3D(int a, int b,int c) {
        super(a, b);
        this.x = a;
        this.y = b;
        this.z = c;

    }


    public void wypisz(){
        System.out.println("("+x+", "+y+", "+z+")");

    }
}


