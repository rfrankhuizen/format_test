/* (C)2022 */
package src.main.java.com.example;

/** Hello world! */
public class App {
    public static void main(String[] args) {
        run();
    }

    public static int run() {
        String stringetje = "Vreselijke formatering!";

        int mijn_lengte = 73;

        if (true) {
            mijn_lengte = stringetje.length();
            mijn_lengte += 1;
        }

        return mijn_lengte;
    }
}
