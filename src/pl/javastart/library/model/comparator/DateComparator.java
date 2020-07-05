package pl.javastart.library.model.comparator;

import pl.javastart.library.model.Publication;

import java.util.Comparator;

public class DateComparator implements Comparator<Publication> {
    @Override
    public int compare(final Publication publication1, final Publication publication2) {
        if (publication1==null && publication2==null)
            return 0;
        else if (publication1==null)
        return 1;
        else if (publication2 ==null)
            return -1;
       Integer i1=publication1.getYear();
       Integer i2=publication2.getYear();
       return -publication1.compareTo(publication2);
    }
}
