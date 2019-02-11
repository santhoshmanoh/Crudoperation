import java.util.Comparator;

class Markcompare implements Comparator {
    public int compare(Object a,Object b)
    {
        Student x=(Student) a;
        Student y=(Student) b;
        if(x.getMarks()>y.getMarks())
            return 1;
        else if (x.getMarks()<y.getMarks())
            return -1;
        else
            return 0;
    }
}
