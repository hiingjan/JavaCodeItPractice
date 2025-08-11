package FirstPractice.Head01.example07;

public class Practice {
    public static void main(String[] args){
        int num = 20;

        if(num % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

        String result = switch(num){
            case 1 -> "one";
            case 2 -> "two";
            default -> "Other";
        };

        System.out.println(result);

    }
}
