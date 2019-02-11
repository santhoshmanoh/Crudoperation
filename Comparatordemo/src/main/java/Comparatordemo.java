import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public  class Comparatordemo {
    public static void main(String[] args){
        Student s1=new Student("alex",88);
        Student s2=new Student("bob",90);
        Student s3=new Student("joe",78);
        ArrayList<Student> ob=new ArrayList<Student>();
        ob.add(s1);
        ob.add(s2);
        ob.add(s3);
        System.out.println("student details are");
        ListIterator li=ob.listIterator();
        while(li.hasNext())
            System.out.println(li.next());
        Collections.sort(ob,new Markcompare());
        System.out.println("Markwise sort");
        ListIterator li1=ob.listIterator();
        while (li1.hasNext())
            System.out.println(li1.next());
        Collections.sort(ob,new Namecompare());
        System.out.println("Namewise sort");
        ListIterator li2=ob.listIterator();
        while (li2.hasNext())
            System.out.println(li2.next());
    }
}