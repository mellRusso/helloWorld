package Arrays;

public class ArraysWork {
    public static void main(String[] args) {
        int[] arryas = {7, -3, 9, -11, 18, 99, 2, 11};

        /*
        int numbers = 3; //количество эллементов которое нужно вывести!
        for(int i = 0; i<numbers; i++) {
            System.out.print(arryas[i] + " ");
        } */

        /*
        for(int i=0; i<arryas.length/2; i++) {
            System.out.print(arryas[i] + " ");
        } */

        /*
        for(int i=arryas.length-1; i>=arryas.length/2; i--) {
            System.out.print(arryas[i] + " ");
        } */

        /*
        for(int i=1; i<arryas.length-1; i++) {
            System.out.print(arryas[i] + " ");
        } */

        /*
        for(int i=arryas.length-1; i>=arryas.length/2+1; i--) {
            System.out.println(arryas[i] + " ");
        } */

        /*
        for(int i=0; i<arryas.length; i++) {
            if(arryas[i] % 2 == 0) {
                System.out.print(arryas[i] + " ");
            }
        } */

        /*
        int positiveCount = 0;
        int negativeCount = 0;

        for(int i = 0; i<arryas.length; i++) {
            if(arryas[i] > 0) {
                positiveCount++;
            }else {
                negativeCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);

         */

        /*
        int min = arryas[0];
        int max = arryas[0];
        for(int i=1; i<arryas.length; i++) {
            if(arryas[i] < min) {
                min = arryas[i];
            } else if (arryas[i] > max) {
                max = arryas[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

         */

        /*
        int num = arryas[0];
        for(int i = 1; i<arryas.length; i++) {
            if(arryas[i] > arryas[i-1]) {
                System.out.print(arryas[i] + " ");

            }
        } */


    }
}
