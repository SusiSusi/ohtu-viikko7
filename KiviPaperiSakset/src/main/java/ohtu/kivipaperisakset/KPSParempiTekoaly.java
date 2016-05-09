package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KaksiparametrinenPelaaja {

//    private IO io;
    private TekoalyParannettu tekoaly;

    public KPSParempiTekoaly(IO io) {
        super(io);
        this.tekoaly = new TekoalyParannettu(20);
    }

    @Override
    protected String siirto() {
        return tekoaly.annaSiirto();
    }

    @Override
    protected String pelaajanNimi() {
        return "Tietokoneen";
    }

    @Override
    protected void aseta(String ekanSiirto) {
        tekoaly.asetaSiirto(ekanSiirto);
    }
}
