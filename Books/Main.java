package Books;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] book = new Book[10];

        book[0] = new ProgrammingBook(1, "Inside the Machine: An " +
                "Illustrated Introduction to Microprocessors and Computer Architecture", 90000,
                "Jon Stokes", "Java", "React Native");

        book[1] = new ProgrammingBook(2, "Structure and Interpretation of " +
                "Computer Programs", 75000, "Harold Abelson, Gerald Jay Sussman, Julie Sussman",
                "Python", "Flutter ");

        book[2] = new ProgrammingBook(3, "Design Patterns: Elements of " +
                "Reusable Object-Oriented Software", 150000, "Erich Gamma, Richard Helm, Ralph Johnson, " +
                "John Vlissides", "Java", "Xamarin ");

        book[3] = new ProgrammingBook(4, "Code: The Hidden Language of " +
                "Computer Hardware and Software", 30000, "Charles Petzold", "C++",
                "React Native");

        book[4] = new ProgrammingBook(5, "Code Complete: A Practical " +
                "Handbook of Software Construction", 200000, "Steve McConnell", "Java",
                "PhoneGap");

        book[5] = new FictionBook(11, "Godfater", 90000, "Mario Puzo",
                "Mafia");

        book[6] = new FictionBook(22, "The Fellowship of the Ring", 300000,
                "J. R. R. Tolkien", "High Fantasy");

        book[7] = new FictionBook(33, "The Two Towers", 330000,
                "J. R. R. Tolkien", "High Fantasy");

        book[8] = new FictionBook(44, "The Return of the King", 3000,
                "J. R. R. Tolkien", "High Fantasy");

        book[9] = new FictionBook(55, "The Strain", 85000, "Guillermo " +
                "del Toro & Chuck Hogan", "Horror");

        //Tính tổng số tiền
        double allPrice = 0;
        for (Book x : book) {
            allPrice += x.getPrice();
        }
        System.out.println("Tổng số tiền của 10 cuốn sách là: " + allPrice);

        //Đếm số sách có ngôn ngữ là Java
        int count = 0;
        for (Book x : book) {
            if ((x instanceof ProgrammingBook) && ((ProgrammingBook) x).getLanguage().equals("Java")) {
                count++;
            }
        }
        System.out.println("Số sách có ngôn ngữ Java là: " + count);

        //Sắp xếp sách theo giá tiền tăng dần
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (book[i].getPrice() > book[j].getPrice()) {
                    Book temp = book[i];
                    book[i] = book[j];
                    book[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(book));
    }
}
