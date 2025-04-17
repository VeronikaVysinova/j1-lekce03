package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
spirala (90d,20,10, Color.MAGENTA);

    }
    public void spirala (double uhel,int prirustek,int pocetKroku,Color penColor){
        zofka.setPenColor(penColor);

        int aktualniDraha = prirustek;
        for (int i =0; i < pocetKroku; i++) {
            for(int j =0; j < 4; j++) {
                zofka.turnRight(uhel);
                zofka.move(aktualniDraha);
            }

            aktualniDraha += prirustek;
        }
    }



}
