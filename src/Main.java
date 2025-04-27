import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 1");

        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        System.out.println(apple[0]);
        System.out.println(apple[1]);
        System.out.println(apple[2]);

        double[] sugar = new double[] {1.57, 7.654, 9.986};
        System.out.println(sugar[0]);
        System.out.println(sugar[1]);
        System.out.println(sugar[2]);

        int[] i = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(Arrays.toString(i));

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 2");

        for (int indexApple = 0; indexApple < apple.length; indexApple++) {
            if (indexApple == apple.length - 1) {
                System.out.println(apple[indexApple]);
                break;
            }
            System.out.print(apple[indexApple] + ", ");
        }

        for (int indexSugar = 0; indexSugar < sugar.length; indexSugar++) {
            if (indexSugar == sugar.length - 1) {
                System.out.println(sugar[indexSugar]);
                break;
            }
            System.out.print(sugar[indexSugar] + ", ");
        }

        for (int indexI = 0; indexI < i.length; indexI++) {
            if (indexI == i.length - 1) {
                System.out.println(i[0]);
                break;
            }
            System.out.print(i[indexI] + ", ");
        }

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 3");

        for (int indexApple = apple.length - 1; indexApple >= 0; indexApple--) {
            if (indexApple == 0) {
                System.out.println(apple[indexApple]);
                break;
            }
            System.out.print(apple[indexApple] + ", ");
        }

        for (int indexSugar = sugar.length - 1; indexSugar >= 0; indexSugar--) {
            if (indexSugar == 0) {
                System.out.println(sugar[indexSugar]);
                break;
            }
            System.out.print(sugar[indexSugar] + ", ");
        }

        for (int indexI = i.length - 1; indexI >= 0; indexI--) {
            if (indexI == 0) {
                System.out.println(i[0]);
                break;
            }
            System.out.print(i[indexI] + ", ");
        }

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 4");

        for (int indexApple = 0; indexApple < apple.length; indexApple++) {
            if (apple[indexApple] % 2 != 0) {
                apple[indexApple] ++;
            }
            if (indexApple == apple.length - 1) {
                System.out.println(apple[indexApple]);
                break;
            }
            System.out.print(apple[indexApple] + ", ");
        }


    }
}