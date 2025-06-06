package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);//()가 객체를 생성해라 동시에 생성자를 불러라
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);//()가 객체를 생성해라 동시에 생성자를 불러라

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
