public class KisteApp {
    public static void main(String[] args) {
        Kiste box = new Kiste();
        System.out.println("Box open?" + box.isOpen());
        box.openBox("Test");
        box.openBox("Hello");
        box.openBox("Wrong");
        box.openBox("Abrakadabra");
        System.out.println("Box open? " + box.isOpen());

    }
}
