package collections;

import java.util.Comparator;

public class SortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        int i=0;

        if(o1.id<o2.id)
        {
            i=-1;
        }
        else if(o1.id>o2.id)
        {
            i=1;
        }
        else {
            i=0;
        }

        return i;
    }
}
