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
            System.out.print(theFirstArray[i] + ", ");
        }
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


        System.out.print(theFirstArray[2] + ", " + theFirstArray[1] + ", " + theFirstArray[0]);
        System.out.println();
        System.out.print(theSecondArray[2] + ", " + theSecondArray[1] + ", " + theSecondArray[0]);
        System.out.println();
        System.out.print(arbitraryArray[2] + ", " + arbitraryArray[1] + ", " + arbitraryArray[0]);
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
