package san;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Test2 {

@Spy
    List<String> mylist=new ArrayList<>();

@BeforeAll
    public void init(){
    MockitoAnnotations.initMocks(this);
}
@Test
    public void test(){
    mylist.add("santhosh");
    mylist.add("naveen");
    Mockito.doReturn(3).when(mylist).size();
    Assertions.assertSame(3,mylist.size());

}

}
