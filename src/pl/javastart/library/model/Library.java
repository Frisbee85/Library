package pl.javastart.library.model;

import java.io.Serializable;

public class Library implements Serializable {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumbers = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumbers];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicationsNumbers >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded : " + MAX_PUBLICATIONS);
        }
        publications[publicationsNumbers] = publication;
        publicationsNumbers++;

    }

}