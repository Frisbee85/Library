package pl.javastart.library.model.comparator;

import pl.javastart.library.model.Publication;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Publication> {
    @Override
    public int compare(final Publication publication1, final Publication publication2) {
        if (publication1 == null && publication2 == null)
            return 0;
        else if (publication1 == null)
            return 1;
        else if (publication2 == null)
            return -1;
        return publication1.getTitle().compareToIgnoreCase(publication2.getTitle());
    }
}
