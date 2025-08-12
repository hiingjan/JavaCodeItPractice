package FirstPractice.head01.example11;

public class practice {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10 ,11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] ints : matrix){
            for (int anInt : ints){
                System.out.println(anInt);
            }
        }
// ---------------------------------------------------------------------ㅍㅍ
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        copy[0] = 100;
        System.out.println(original[0]); // 1 (영향 없음)

    }
}
