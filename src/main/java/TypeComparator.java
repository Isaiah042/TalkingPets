import java.util.Comparator;

public class TypeComparator implements Comparator<Pets> {


    @Override
    public int compare(Pets p1, Pets p2) {
        if(p2.getName().compareTo(p2.getName()) > 0) {
            return 1;
        }
        return -1;
    }
}