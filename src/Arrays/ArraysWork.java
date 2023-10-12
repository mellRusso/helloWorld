package Arrays;

import java.util.Arrays;

public class ArraysWork {
    public static void main(String[] args) {
        int[] arrays = {7, -3, 9, -11, 18, 99, 2, 11};

        /*
        int numbers = 3; //количество эллементов которое нужно вывести!
        for(int i = 0; i<numbers; i++) {
            System.out.print(arrays[i] + " ");
        } */

        /*
        for(int i=0; i<arrays.length/2; i++) {
            System.out.print(arrays[i] + " ");
        } */

        /*
        for(int i=arryas.length-1; i>=arrays.length/2; i--) {
            System.out.print(arrays[i] + " ");
        } */

        /*
        for(int i=1; i<arrays.length-1; i++) {
            System.out.print(arrays[i] + " ");
        } */

        /*
        for(int i=arrays.length-1; i>=arrays.length/2+1; i--) {
            System.out.println(arrays[i] + " ");
        } */

        /*
        for(int i=0; i<arrays.length; i++) {
            if(arrays[i] % 2 == 0) {
                System.out.print(arrays[i] + " ");
            }
        } */

        /*
        int positiveCount = 0;
        int negativeCount = 0;

        for(int i = 0; i<arrays.length; i++) {
            if(arrays[i] > 0) {
                positiveCount++;
            }else {
                negativeCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);

         */

        /*
        int min = arrays[0];
        int max = arrays[0];
        for(int i=1; i<arrays.length; i++) {
            if(arrays[i] < min) {
                min = arrays[i];
            } else if (arrays[i] > max) {
                max = arrays[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

         */

        /*

        for(int i = 1; i<arrays.length; i++) {
            if(arrays[i] > arrays[i-1]) {
                System.out.print(arrays[i] + " ");

            }
        } */

        /* ЗАДАЧА 1
        int[] ar = {2, 3, 5, 8, 9, 1, 5, 5, 6};

        int itteration = ar.length/3;

        int i = 0;
        if(ar.length % 3 == 0) {
            do {
                System.out.println(ar[i]);
                i++;
            }
            while (i < itteration);
        } */


        /* ЗАДАЧА 3
        for(int i = arrays.length-1; i >= 0; i--) {
            System.out.print(arrays[i] + " ");
        }
        */
        //ЗАДАЧА 4
        /*
        int sum = 0;
        int averageNumber = 0;
        for(int i = 0; i< arrays.length; i ++) {
            sum += arrays[i];
        }

        averageNumber = sum / arrays.length;

        for(int i = 0; i < arrays.length; i++) {
            if(arrays[i] > averageNumber) {
                System.out.print(arrays[i] + " ");
            }
        }
        */

        //ЗАДАЧА 2
        /*
        int sum = 0;
        for(int i = 0; i < arrays.length; i++) {
            if(arrays[i] % 2 != 0) {
                sum += arrays[i];
            }
        }
        System.out.println(sum / arrays.length);

         */

        //ЗАДАЧА 5
        /*
        int h = arrays[0];
        for(int i = 0; i<arrays.length; i++) {
            int t = 0;
            for(int g = 0; g<arrays.length; g++) {
                if(arrays[i] == arrays[g]) {
                    t++;
                }
            }
            if(t == 1) {
                if(arrays[i] < h) {
                    h = arrays[i];
                }
            }
        }
        int min = arrays[0];
        for(int i = 1; i< arrays.length; i++) {
            if(arrays[i] < min && arrays[i] != h) {
                min = arrays[i];
            }
        }

         */

        /* ЗАДАЧА 6
        System.out.println(Arrays.toString(arrays)); //предыдущий массив
        for(int i = 0; i < arrays.length; i++) {
            int randomNumber = (int) ( Math.random() * arrays.length);
            int copyIndex = arrays[i];
            arrays[i] = arrays[randomNumber];
            arrays[randomNumber] = copyIndex;
        }
        System.out.println(Arrays.toString(arrays)); //новый массив
        */

        //ЗАДАЧА 7
        /*
        int[] arr = {12, 6, 5, 5, 1, 1};
        int sum1 = 0;
        int sum2 = 0;
        int s = 0;
        for(int i = 1; i < arr.length; i++) {
            sum1 += arr[i-1];
            for(int g = i + 1; g < arr.length; g++) {
                sum2 += arr[g];
            }
            if(sum1 == sum2) {
                System.out.println("Число найдено:" + arr[i]);
                s++;
            }
            sum2 = 0;
        }
        if(s == 0) {
            System.out.println("Число не найдено");
        }
        */

        //ЗАДАЧА 8
        /*
        int[] arr = {2, 2, 1, 4, 1, 1, 1, 1, 2, 6};

        int num = 1;
        int copyNum = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) {
                num++;
            } else if (arr[i-1] != arr[i]) {
                if(num > copyNum) {
                    copyNum = num;
                }
                num = 1;
            }
        }
        System.out.println(copyNum);

         */
    }
}
