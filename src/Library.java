import Interfaces.Printable;

public class Library {
    static class Book implements Printable {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void print() {
            System.out.println("Book: " + title);
        }

        public static void printBooks(Printable[] printable) {
            for (Printable item : printable) {
                if (item instanceof Book) {
                    item.print();
                }
            }
        }
    }

    static class Magazine implements Printable {
        private String title;

        public Magazine(String title) {
            this.title = title;
        }

        public void print() {
            System.out.println("Shop: " + title);
        }

        public static void printMagazines(Printable[] printable) {
            for (Printable item : printable) {
                if (item instanceof Magazine) {
                    item.print();
                }
            }
        }
    }
}
