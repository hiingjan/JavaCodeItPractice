package FirstPractice.head01.example05;

public class practice {
    public static void main(String[] args){
        int day = 1;

        String result = switch (day) {
            case 1, 2 -> "월요일"; // case 1과 case 2가 모두 "월요일"로 처리
            case 3 -> "수요일";
            default -> "기타 요일";
        };

        System.out.println(result);

    }
}
