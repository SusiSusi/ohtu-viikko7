
package ohtu.kivipaperisakset;

/**
 *
 * @author susisusi
 */
public class Lopeta implements Komento {
    
    private IO io;
    
    public Lopeta(IO io) {
        this.io = io;
    }

    @Override
    public void pelaa() {
       io.print("Kiitos ja näkemiin");
       System.exit(0);
    }
    
}
