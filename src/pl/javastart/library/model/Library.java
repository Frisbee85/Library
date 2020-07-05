package pl.javastart.library.model;

import java.io.Serializable;
import java.util.Arrays;

public class Library implements Serializable {

    private static final int INITIAL_CAPACITY = 1;
    private int publicationsNumbers = 0;
    private Publication[] publications = new Publication[INITIAL_CAPACITY];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumbers];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }


    public void addPublication(Publication publication) {
        if (publicationsNumbers >= publications.length) {
            publications = Arrays.copyOf(publications, publications.length * 2);
        }
        publications[publicationsNumbers] = publication;
        publicationsNumbers++;

    }

    public boolean removePublication(Publication pub) {
        final int notFound = -1;
        int found = notFound;
        int i = 0;
        while (i < publicationsNumbers && found == notFound) {
            if (pub.equals(publications[i])) {
                found = i;
            } else {
                i++;
            }
        }
        if (found != notFound) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found - 1);
            publicationsNumbers--;
            publications[publicationsNumbers]=null;
        }
        return found != notFound;
    }

}
