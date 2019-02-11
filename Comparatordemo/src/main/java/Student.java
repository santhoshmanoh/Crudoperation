import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int marks;
    public Student(String n,int m)
    {
        this.name=n;
        this.marks=m;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj1){

        Student st = (Student) obj1;
        boolean value = false;
        if(this.name.equalsIgnoreCase(st.name)&& this.marks == st.marks){
            value = true;
        }
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static List<Student> getStudents(){
        List<Student> s = new ArrayList<Student>();
        s.add(new Student("Alex",88));
        s.add(new Student("bob",90));
        s.add(new Student("joe",78));
        return s;
    }

    @Override
    public String toString() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("Name :"+name+"\n");
        buffer.append("Marks :"+marks+"\n");
        return buffer.toString();
    }
}


