import Interfaces.Instrument;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Printable ===========================");

        Interfaces.Printable[] items = new Interfaces.Printable[]{
                new Library.Book("War and Peace"),
                new Library.Magazine("National Geographic"),
                new Library.Book("Moby Dick")
        };

        for (Interfaces.Printable item : items) {
            item.print();
        }

        Library.Book.printBooks(items);
        Library.Magazine.printMagazines(items);


        System.out.println("2. Instrument ===========================");

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Instruments().new Guitar();
        ((Instruments.Guitar) instruments[0]).numberOfStrings = 10;
        instruments[1] = new Instruments().new Drum();
        ((Instruments.Drum) instruments[1]).size = 20;
        instruments[2] = new Instruments().new Trumpet();
        ((Instruments.Trumpet) instruments[2]).diameter = 30;

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}