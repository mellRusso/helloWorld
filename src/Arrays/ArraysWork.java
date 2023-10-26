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

        //Задача 1
        /*
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int lengthIndex = array.length-1; //хранится последний эллементт массива
        int copyArray = 0; //храним нынешний эллемент массива
        for(int i = 0; i < array.length/2; i++) {
            copyArray = array[i];
            array[i] = array[lengthIndex]; //передаем эллементу с индексом n значение последнего эллемента
            array[lengthIndex--] = copyArray; //последнему же эллементу передаем эллемент с индексом n
        }
        System.out.println(Arrays.toString(array));
        */

        //Задача 2
        /*
        int[] array = {1, 3, 5, 2, 5, 1, 2, 3};

        int sumLeft = 0;
        int sumRight = 0;
        for(int i =0; i < array.length; i++) {
            sumLeft += array[i];
            for(int g = i + 1; g < array.length; g++) {
                sumRight += array[g];
            }
            if(sumLeft == sumRight) {
                System.out.println("Первое число: " + array[i]);
                System.out.println("Второе число: " + array[i+1]);
            }
            sumRight = 0;
        }
        */

        //Задача 3
        /*
        int[] array = {1, 4, 5, 1, 2, 3, 4, 8, 1, 2, 3, 4, 5, 6};
        int[] newArray = new int[6];
        int s = 0;
        for(int i =1; i < array.length; i++) {
            if(array[i-1] < array[i] && array[i-1] + 1 == array[i]) {
                newArray[s++] = array[i-1];

            }else {
                s = 0;
            }
        }
        newArray[newArray.length-1] = newArray.length-1+1;
        System.out.println(Arrays.toString(newArray));
        */

        //Задача 4
        /*
        int[] array = {0, 1, 9, 0, 3, 12, 0};

        int[] newArray = new int[array.length];
        int indexNewArray = 0;

        for(int arr : array) {
          if(arr != 0) {
              newArray[indexNewArray++] = arr;
          }
        }
        while (indexNewArray < array.length) {
            newArray[indexNewArray] = 0;
            indexNewArray++;
        }
        System.out.println(Arrays.toString(newArray));
        */

        //ЗАДАЧА  5
        /*
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

         //сохраняем сумму всех элементов массива
        int maxSum = 0; //максимальная сумма
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int g = i; g < array.length; g++) {
                sum += array[g];
                if(sum > maxSum) { //если больше меняем значение перменной maxSum
                    maxSum = sum;
                }
            }

        }
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            int indexNewArray = 0;
            for(int g = i; g < array.length; g++) {
                sum += array[g];
                newArray[indexNewArray++] = array[g];
                if(sum == maxSum) {
                    break;
                }
            }
            if(sum == maxSum) {
                break;
            }
            for(int a = 0; a < newArray.length; a++) {
                newArray[a] = 0;
            }
        }
        System.out.println(Arrays.toString(newArray)); //вывод элементов которые дают наибольшую сумму!
        */

        //Задача 6
        /*
        int[] array = {1, 2, 3, 4, 5};
        int number = 1;
        int num = 1;

        for(int i = 0; i < array.length; i++) {
            int result = (number + i) % array.length;
            array[result] = num++;
        }

        System.out.println(Arrays.toString(array));
        */

        //Задача 7
        /*
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 8, 9, 20, 20, 20, 20, 30};
        int[] copyArray = new int[11];
        int indexCopyArray = 0;
        int index = 0;
        copyArray[index] = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[index] != array[i]) { //сравниваем два эллемента! первый и эллемент после него! если не равные срабатывает условие
                index++; //ПРИБАВЛЯЕМ К ИНДЕКСУ 1
                array[index] = array[i]; //МАССИВ С ИНДЕКОМ И РАВНЯЕТСЯ СЛЕДУЮЩЕМУ ЗНАЧЕНИЮ С ИНДЕКСОМ И+1
                copyArray[index] = array[i]; //В НОВЫЙ МАССИВ С ИНДЕКСОМ ОДИН ТАКЖЕ ДОБАВЛЯЕТСЯ ЗНАЧЕНИЕ И +1
            }
        }
        System.out.println(Arrays.toString(copyArray));
        */
    }

    //Задача 1
    public int maxDifference(int[] arr) {
        int maxDifference = 0;
        for(int i = 0; i < arr.length; i++) {
            int mine = 0;
            for(int g = i+1; g < arr.length; g++) {
                if(arr[i] > arr[g]) {
                    mine = arr[i] - arr[g];
                    if(mine > maxDifference) {
                        maxDifference = mine;
                    }
                }
            }
        }
        return maxDifference;
    }

    //задача 2
    public int[] rotate(int[] arr, int n) {
        int index = 0;
        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            index = (i + n) % arr.length;
            int num = arr[i];
            newArray[index] = num;
        }
        return newArray;
    }

    //задача 3
    public int[] mostFrequent(int[] arr) {
        //создаем массив который хранит 2 значения! первое значение число! второе значение количество повторениц!
        int[] newArr = new int[2];

        int maxPereat = 0;
        for(int i = 0; i < arr.length; i++) {
            int repeat = 0;
            for(int g = i + 1; g < arr.length; g++) {
                if(arr[i] == arr[g]) {
                    repeat++;
                }
            }
            if(repeat > maxPereat) {
                maxPereat = repeat;
                newArr[0] = arr[i];
                newArr[1] = maxPereat;
            }
        }
        return newArr;
    }

    //задача 4
    public int[] twoSum(int[] arr, int target) {
        int[] newArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int indexNewArr = 0; //это если вдруг в массиве окажется два числа дающие нужную нам  сумму
            for(int g = i+1; g < arr.length; g++) {
                sum = arr[i] + arr[g];
                if(sum == target) {
                    newArr[indexNewArr++] = arr[i];
                    newArr[indexNewArr] = arr[g];
                }
            }
        }
        return newArr;
    }

    //задача 5
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int indexArr1 = 0;
        int indexArr2 = 0;
        int indexNewArr = 0;

        for(; indexArr1 < arr1.length && indexArr2 < arr2.length; indexNewArr++) {
            if(arr1[indexArr1] < arr2[indexArr2]) {
                newArr[indexNewArr] = arr1[indexArr1];
                indexArr1++;
            }else {
                newArr[indexNewArr] = arr2[indexArr2];
                indexArr2++;
            }
        }

        for(; indexArr1 < arr1.length; indexArr1++, indexNewArr++) { //оставшиеся эллементы
            newArr[indexNewArr] = arr1[indexArr1];
        }

        for(; indexArr2 < arr2.length; indexArr2++, indexNewArr++) { //оставшиеся эллементы
            newArr[indexNewArr] = arr2[indexArr2];
        }
        return newArr;
    }
}