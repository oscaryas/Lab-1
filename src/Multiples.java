public class Multiples {

    public static void main(String[] args) {
        int count_three = 0;
        int count_five = 0;

        for(int i = 1; i < 1000; i++) {
            if (i%3 == 0){
                count_three++;
            }
            else if (i % 5 == 0){
                count_five++;
            }

        }
        System.out.println(count_three);
        System.out.println(count_five);
    }
}
