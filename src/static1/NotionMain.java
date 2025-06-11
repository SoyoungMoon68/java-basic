package static1;

public class NotionMain {
    public static void main(String[] args) {
        // 소영's 요청
        NotionRequest request = new NotionRequest("2001-06-08", "2025-06-09", 3);

        // 서연' 요청
        NotionRequest request2 = new NotionRequest("1999-03-16", "2025-05-31", 2);

        request.updatePriority();
        request.updateCount();
        System.out.println("소영's Priority: " + request.getPriority());
        System.out.println("소영's Count: " + request.getCount());

        request2.updatePriority();
        System.out.println("서연's Priority: " + request2.getPriority());
        request2.updateCount();
        System.out.println("서연's Count: " + request2.getCount());

        System.out.println(request.priority);
        System.out.println(NotionRequest.count);

    }
}
