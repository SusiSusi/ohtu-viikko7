package ohtu.kivipaperisakset;

import java.util.HashMap;

/**
 *
 * @author susisusi
 */
public class Komentotehdas {

    private HashMap<String, Komento> komennot;
    private IO io;

    public Komentotehdas(IO io) {
        this.io = io;
        komennot = new HashMap<String, Komento>();
        komennot.put("a", new KPSPelaajaVsPelaaja(io));
        komennot.put("b", new KPSTekoaly(io));
        komennot.put("c", new KPSParempiTekoaly(io));
    }

    public Komento hae(String operaatio) {
        Komento komento = komennot.get(operaatio);
        if (komento == null) {
           komento = new Lopeta(io);
        }
        return komento;
    }
}
