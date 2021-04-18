package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
    List<LibraryCard> libraryCards = new ArrayList<>();

    public LibraryManagement() {
    }

    public LibraryManagement(List<LibraryCard> libraryCards) {
        this.libraryCards = libraryCards;
    }

    public List<LibraryCard> getLibraryCards() {
        return libraryCards;
    }

    public void setLibraryCards(List<LibraryCard> libraryCards) {
        this.libraryCards = libraryCards;
    }

    public void inputLibraryData() {
        libraryCards.add(new LibraryCard().inputLibraryData());
    }

    public void displayLibraryData() {
        for (LibraryCard libraryCard : libraryCards) {
            libraryCard.displayLibraryCard(libraryCard);
        }
    }

    public int findBookByReturnDay(String returnDate) {
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày cần kiểm tra: ");
        returnDate = sc.next();
        for (int i = 0; i < libraryCards.size(); i++) {
            if (returnDate.equals(libraryCards.get(i).getReturnDate())) {
                index = i;
            }
        }
        return index;
    }

    public void showBookIdByReturnDay(String returnDate) {
        int index = findBookByReturnDay(returnDate);
        if (index != -1) {
            for (int i = 0; i < libraryCards.size(); i++) {
                System.out.println("Sách có mã số là: " + libraryCards.get(i).getBookId());
            }
        } else {
            System.out.println("Không có sách nào cần trả vào ngày đó");
        }
    }
}
