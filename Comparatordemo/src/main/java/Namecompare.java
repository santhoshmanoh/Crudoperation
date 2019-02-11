import java.util.Comparator;

public class Namecompare implements Comparator {
    public int compare(Object a,Object b){
        Student x=(Student) a;
        Student y=(Student) b;
        return (x.getName()).compareTo(y.getName());

    }
}
