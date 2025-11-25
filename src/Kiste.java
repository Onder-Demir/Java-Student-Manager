public class Kiste {

    // --- Eigenschaften / Attributes
    private boolean open = false;            // offen / open
    private boolean burning = false;         // brennt / burning
    private String secretCode = "Abrakadabra";  // Geheimcode / secret code

    private int wrongTries = 0;              // falsche Versuche / wrong tries
    private final int MAX_WRONG_TRIES = 3;   // maximale Versuche / max tries


    // --- Getter: Zustand prüfen (isOpen) ---
    public boolean isOpen() {
        return open;
    }


    // --- Methode: Kiste öffnen ---
    // openBox = Kiste öffnen (DE) / open box (EN)
    public void openBox(String codeInput) {

        if (burning) {
            System.out.println("Box is burning! Cannot open anymore.");
            return;
        }

        if (!secretCode.equals(codeInput)) {
            wrongTries++;
            System.out.println("Wrong code! Try: " + wrongTries);

            if (wrongTries >= MAX_WRONG_TRIES) {
                explode();
            }
            return;
        }

        System.out.println("Correct code – box opens.");
        open = true;
    }


    // --- Methode: Explosion ---
    private void explode() {
        System.out.println("BOOOOOOM! The box explodes and starts burning.");
        burning = true;
    }
}
