package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=: " + bigData.count);
        System.out.println("bigData.data=: " + bigData.data);

        //null pointer exception
        System.out.println("bigData.value" + bigData.data.value);
    }
}
