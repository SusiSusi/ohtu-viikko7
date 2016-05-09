package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author susisusi
 */
public class ConsoleIO implements IO {

    private Scanner scanner;

    public ConsoleIO(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String nextLine() {
        return this.scanner.nextLine();
    }

    @Override
    public void print(String m) {
        System.out.println(m);
    }

}
