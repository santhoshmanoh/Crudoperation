import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Comparetest2 {

 Object[] ob1=new Object[3]; ;
 @Before
 public void setup()
 {

  ob1[0]=new Student("alex",88);
  ob1[1]=new Student("bob",90);
  ob1[2]=new Student("joe",78);

 }
 @Test
 public void comparemethodshouldreturn_Equals()
 {

  Object[] res = Student.getStudents().toArray();
  assertArrayEquals("Equal",ob1,res);
 }

}
