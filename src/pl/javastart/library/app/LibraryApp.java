package pl.javastart.library.app;

import pl.javastart.library.model.Library;

public class LibraryApp {

    private static final String APP_NAME = "Biblioteka v 1.9";
    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl= new LibraryControl();
        libraryControl.controlLoop();
    }
}
