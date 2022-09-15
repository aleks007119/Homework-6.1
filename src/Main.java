public class Main {
    public static void main(String[] args) {

        task1();
        task2();

    }

    public static void task1() {

        System.out.println("Задание 1");

        int[] theFirstArray = new int[]{1, 2, 3};
        double[] theSecondArray = {1.57, 7.654, 9.986};
        int[] arbitraryArray = {5, 10, 15};

        System.out.println("Задание 2");

        for (int i = 0; i < theFirstArray.length; i++) {
            theFirstArray[i] = i + 1;
            if (i > 0) {
                System.out.print(", ");
            }
                System.out.print(theFirstArray[i]);
        }
        System.out.print("");

        System.out.println();
        for (double j = 0; j < theSecondArray.length; j++) {
            System.out.print(theSecondArray[(int) j] + ", ");
        }
        System.out.println();

        for (int k = 0; k < arbitraryArray.length; k++) {
            System.out.print(arbitraryArray[k] + ", ");
        }

        System.out.println();
        System.out.println("Задание 3");

        int n = theFirstArray.length;
        int temp;

        for (int i = 0; i < n / 2; i ++) {
            temp = theFirstArray[n-i-1];
            theFirstArray[n-i-1] = theFirstArray[i];
            theFirstArray[i] = temp;
        }
        for (int i = 0; i < theFirstArray.length; i ++) {
            System.out.print(theFirstArray[i] + ", ");
        }

        System.out.println();

        double temp1;

        for (int i = 0; i < n / 2; i ++) {
            temp1 = theSecondArray[n-i-1];
            theSecondArray[n-i-1] = theSecondArray[i];
            theSecondArray[i] = temp1;
        }
        for (int i = 0; i < theSecondArray.length; i ++) {
            System.out.print(theSecondArray[i] + ", ");
        }

        System.out.println();

        int n1 = arbitraryArray.length;
        int temp2;

        for (int i = 0; i < n1 / 2; i ++) {
            temp1 = arbitraryArray[n-i-1];
            arbitraryArray[n1-i-1] = arbitraryArray[i];
            arbitraryArray[i] = (int) temp1;
        }
        for (int i = 0; i < arbitraryArray.length; i ++) {
            System.out.print(arbitraryArray[i] + ", ");
        }

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание 4");

        int[] theFirstArray = new int[]{1, 2, 3};
        for (int i = 0; i < theFirstArray.length; i++) {
            int x = theFirstArray[i];
            if (x % 2 == 1) {
                x += 1;
                System.out.print(x + ", ");
            }
        }


    }

    }
