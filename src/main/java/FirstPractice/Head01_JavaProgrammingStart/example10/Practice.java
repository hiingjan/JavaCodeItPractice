package FirstPractice.Head01_JavaProgrammingStart.example10;

public class Practice {
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50 ,4 ,23 ,53, 543, 512};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        String[] animals = {"Cat", "Dog", "Bird", "Elephant", "오리", "호랑이", "노나노"};
        for (String animal : animals) {
            System.out.println(animal);
        }




    }
}
