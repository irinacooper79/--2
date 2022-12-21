public class Main {
    public static void main(String[] args) {

        System.out.println("Kursovoy - 2!");
    }

    private static int sumOfAll(int num) {
        int sum = 0;

        if (num == 10) return 1;

        if (num > 10) {
            sum += num % 10;
            while ((num = num / 10) >= 1) {
                sum += (num > 10) ? num % 10 : num;
            }
        } else {
            sum += num;
        }
        return sum;
    }


    /// Задача 2

    private static int bur() {
        int[] nums = {1, 2, 3};
        int x;
        for (x = 0; x < nums.length; x += nums[x]) ;
        System.out.println(x);
        return x;
    }
}








