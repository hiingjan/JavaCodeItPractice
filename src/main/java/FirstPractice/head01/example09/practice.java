package FirstPractice.head01.example09;

public class practice {
    public static void main(String[] args){
        for (int i = 1; i <= 14; i++) {
            if (i % 3 == 0) continue;
            if (i == 12) break;
            System.out.println(i);
        }

    }
}
