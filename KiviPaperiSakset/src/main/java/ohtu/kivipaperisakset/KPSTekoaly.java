package ohtu.kivipaperisakset;

public class KPSTekoaly extends KaksiparametrinenPelaaja{

//    private IO io;
    private Tekoaly tekoaly;
    
    public KPSTekoaly(IO io) {
        super(io);
        this.tekoaly = new Tekoaly();
    }
//
//    @Override
//    public void pelaa() {
//        Tuomari tuomari = new Tuomari();
//        Tekoaly tekoaly = new Tekoaly();
//
//        io.print("Ensimmäisen pelaajan siirto: ");
//        String ekanSiirto = io.nextLine();
//        String tokanSiirto;
//
//        tokanSiirto = tekoaly.annaSiirto();
//        io.print("Tietokone valitsi: " + tokanSiirto);
//
//        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
//            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
//            io.print(tuomari.toString());
//            io.print("");
//
//            io.print("Ensimmäisen pelaajan siirto: ");
//            ekanSiirto = io.nextLine();
//
//            tokanSiirto = tekoaly.annaSiirto();
//            io.print("Tietokone valitsi: " + tokanSiirto);
//            tekoaly.asetaSiirto(ekanSiirto);

//        }
//
//        io.print("");
//        io.print("Kiitos!");
//        io.print(tuomari.toString());
//    }
//
//    private static boolean onkoOkSiirto(String siirto) {
//        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
//    }

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
