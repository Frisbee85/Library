package pl.javastart.library.IO;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

public class ConsolePrinter {

    public void printBooks(Publication[] publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book)
                System.out.println(publication);
            countBooks++;
        }
        if (countBooks == 0) {
            printLine("Brak książek w bibiotece.");
        }
    }

    public void printMagazines(Publication[] publications) {
        int countMagazines = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine){
                System.out.println(publication);
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
           printLine("Brak magazynów w bibiotece.");
        }
    }

    public void printLine(String text){
        System.out.println(text.toUpperCase());
    }
}
