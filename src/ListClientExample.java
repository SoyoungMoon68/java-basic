import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;//필드 선언
    public ListClientExample() {
        this.list = new LinkedList();
    }//생성자
    public List getList() {
        System.out.println("getList 메서드 호출!");
        return this.list;
    }//get 메소드

}
