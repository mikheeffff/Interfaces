import Interfaces.Instrument;

public class Instruments {
    class Guitar implements Instrument {
        int numberOfStrings;

        @Override
        public void play() {
            System.out.println("Playing Guitar with " + numberOfStrings + " strings");
        }
    }

    class Drum implements Instrument {
        int size;

        @Override
        public void play() {
            System.out.println("Playing Drum with size " + size);
        }
    }

    class Trumpet implements Instrument {
        int diameter;

        @Override
        public void play() {
            System.out.println("Playing Trumpet with diameter " + diameter);
        }
    }
}

