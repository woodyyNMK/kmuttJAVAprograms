package DnD2021.Q9UML1stchance;

public class Driver {

    public static void main(String[] args) {
        Library kmuttLib = new Library("KMUTT Library");
        Book b1 = new Book(
                "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling",
                439708184
        );
        Book b2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 544003415);
        Book b3 = new Book(
                "Introduction to Java",
                "Y. Liang and Y. Daniel Liang",
                244073613
        );
        Journal j11 = new Journal("nature", "Magdalena Skipper", 14764687, 575);
        Journal j12 = new Journal("nature", "Magdalena Skipper", 14764687, 576);
        Journal j13 = new Journal("nature", "Magdalena Skipper", 14764687, 577);
        Journal j21 = new Journal(
                "Business Process Management Journal",
                "Majed Al-Mashari",
                14637154,
                25
        );
        Journal j22 = new Journal(
                "Business Process Management Journal",
                "Majed Al-Mashari",
                14637154,
                26
        );
        Journal j23 = new Journal(
                "Business Process Management Journal",
                "Majed Al-Mashari",
                14637154,
                27
        );
        kmuttLib.add(b1);
        kmuttLib.add(b2);
        kmuttLib.add(j11);
        kmuttLib.add(j12);
        kmuttLib.add(j13);
        kmuttLib.add(j21);
        kmuttLib.add(j22);
        kmuttLib.add(j23);
        kmuttLib.add(j23);
        kmuttLib.remove(j12);
        kmuttLib.remove(j22);
        kmuttLib.remove(b3);
        System.out.println("The KMUTT Library has " + kmuttLib.getSize() + ".");
        kmuttLib.listItem();
    }
}
