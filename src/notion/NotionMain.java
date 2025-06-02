package notion;

public class NotionMain {
    public static void main(String[] args) {
       NotionSearchRequest NSR = new NotionSearchRequest();
       String from = NSR.getFrom();
       String to = NSR.getTo();

        System.out.println("from = " + from);
        System.out.println("to = " + to);

        NSR.updateFromMyBirthday();
        System.out.println("from = " + NSR.getFrom());
    }
}
