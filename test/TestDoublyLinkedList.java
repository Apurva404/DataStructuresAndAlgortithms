import com.apurva.datastructures.doublyLinkedList.DoublyLinkList;
import org.junit.Test;

public class TestDoublyLinkedList {

    static DoublyLinkList testList = new DoublyLinkList();
    @Test
    public void test01Insert(){
        System.out.println("Inside testInsert()");
        testList.insert(1);
    }

    @Test(expected = NullPointerException.class)
    public void test02Delete(){
        System.out.println("Inside testDelete()");
        testList.delete(1);
    }
}
