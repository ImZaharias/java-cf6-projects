package gr.aueb.cf.ch2;

public class sum1000 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 1000) {

            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
