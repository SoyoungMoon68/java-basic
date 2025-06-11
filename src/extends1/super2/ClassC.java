package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10,20); //생성자를 하나라도 정의하면 자바에서 기본 생성자 만들지 않으므로 직접 호출해야함
        System.out.println("ClassC constructor");
    }
}
