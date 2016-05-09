package ohtu.kivipaperisakset;

/**
 *
 * @author susisusi
 */
public abstract class KaksiparametrinenPelaaja implements Komento {

    protected IO io;
//    protected Tekoaly tekoaly;
//    protected TekoalyParannettu tekoalyParannettu;
    protected Tuomari tuomari;

    private String ekanSiirto;
    private String tokanSiirto;

    public KaksiparametrinenPelaaja(IO io) {
        this.io = io;
        this.tuomari = new Tuomari();
    }

    @Override
    public void pelaa() {
        kysySiirrot();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            kirjaaSiirrot(ekanSiirto, tokanSiirto);

            if (pelaajanNimi().contains("Tietokoneen")) {
                aseta(ekanSiirto);
            }
        }
        lopeta();
    }

    private void kirjaaSiirrot(String ekanSiirto, String tokanSiirto) {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        io.print(tuomari.toString());
        io.print("");

        kysySiirrot();
    }

    private void kysySiirrot() {
        io.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = io.nextLine();

        tokanSiirto = siirto();
        io.print(pelaajanNimi() + " siirto: " + tokanSiirto);
    }

    private void lopeta() {
        io.print("");
        io.print("Kiitos!");
        io.print(tuomari.toString());
    }

    private boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract String siirto();

    protected abstract String pelaajanNimi();

    protected abstract void aseta(String ekanSiirto);
}
