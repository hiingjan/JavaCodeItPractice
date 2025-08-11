package FirstPractice.Head02;

public class OOPprogramming {
    public static void main(String[] args){
        String[] studentNames = {"a", "b","c"};
        int[] mathScores = {12, 23, 44};
        int[] engScores = {53, 64, 84};

        for(int i = 0; i < studentNames.length; i++){
            int total = mathScores[i] + engScores[i];
            double average = total / 2.0;
            System.out.println(studentNames[i] + " " + total);
        }

    }
}
