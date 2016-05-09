package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KaksiparametrinenPelaaja {

//    private IO io;

    public KPSPelaajaVsPelaaja(IO io) {
        super(io);
    }

//    @Override
//    public void pelaa() {
//        Tuomari tuomari = new Tuomari();
//
//        io.print("Ensimmäisen pelaajan siirto: ");
//        String ekanSiirto = io.nextLine();
//        io.print("Toisen pelaajan siirto: ");
//        String tokanSiirto = io.nextLine();
//
//        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
//            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
//            io.print(tuomari.toString());
//            io.print("");
//
//            io.print("Ensimmäisen pelaajan siirto: ");
//            ekanSiirto = io.nextLine();
//
//            io.print("Toisen pelaajan siirto: ");
//            tokanSiirto = io.nextLine();
//        }
//
//        io.print("");
//        io.print("Kiitos!");
//        io.print(tuomari.toString());
//    }

//    private static boolean onkoOkSiirto(String siirto) {
//        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
//    }

    @Override
    protected String siirto() {
        return io.nextLine();
    }

    @Override
    protected String pelaajanNimi() {
       return "Toisen pelaajan";
    }

    @Override
    protected void aseta(String ekanSiirto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
