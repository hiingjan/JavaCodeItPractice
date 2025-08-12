package FirstPractice.Head03.example05;

public class InheritanceTest {
    public static void main(String[] args) {
        User u1 = new PersonalUser("U001", "Alice", "alice@example.com");
        User u2 = new BusinessUser("B001", "Bob", "ACME Corp", "bob@acme.com");

        // 다형성 테스트: 참조 타입은 User지만 실제 인스턴스의 오버라이딩 메서드가 실행됨
        u1.printUserInfo();
        System.out.println("-----");
        u2.printUserInfo();
    }
}