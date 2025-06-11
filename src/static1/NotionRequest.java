package static1;

public class NotionRequest {

    private String start;
    private String end;
    public int priority;
    public static int count;

    public NotionRequest(String start, String end, int priority) {
        this.start = start;
        this.end = end;
        this.priority = priority;
    }

    public static int getCount() {
        return count;
    }

    public String getStart() {
        return start;
    }

    public int getPriority() {
        return priority;
    }

    public void updateCount() {
        count++;
    }

    public void updatePriority() {
        priority++;
    }
}
