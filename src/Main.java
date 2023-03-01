import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double[] fractional = {1.57, 7.654, 9.986};

        int[] free = {515335, 254545, 543654646, 4565465, 54787, 7777, 126899};
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int c = 0; c < integer.length; c++){
            System.out.print(integer[c]);
            if (c != integer.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        double[] fractional = {1.57, 7.654, 9.986};
        for (int a = 0; a < fractional.length; a++) {
            System.out.print(fractional[a]);
            if (a != fractional.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

            int[] free = {515335, 254545, 543654646, 4565465, 54787, 7777, 126899};
            for (int i = 0; i < free.length; i++) {
                if (i == free.length - 1) {
                    System.out.println(free[i]);
                    break;
                }
                System.out.print(free[i] + ", ");

            }
        }
      public static void task3() {
          System.out.println("Задание 3");
          int[] integer = new int[3];
          integer[0] = 1;
          integer[1] = 2;
          integer[2] = 3;
          for (int c = integer.length - 1; c >= 0; c--) {
              if (c == 0){
                  System.out.println(integer[c]);
                  break;
              }
              System.out.print(integer[c] + ", ");
          }

          double[] fractional = {1.57, 7.654, 9.986};
          for (int a = fractional.length - 1; a >= 0; a--) {
              if (a == 0) {
                  System.out.println(fractional[a]);
                  break;
              }
              System.out.print(fractional[a] + ", ");
          }
          int[] free = {515335, 254545, 543654646, 4565465, 54787, 7777, 126899};
          for (int i = free.length - 1; i >= 0; i--) {
              if (i == 0) {
                  System.out.println(free[i]);
                  break;
              }
              System.out.print(free[i] + ", ");

          }
      }
      public static void task4(){
          System.out.println("Задание 4");
          int[] integer = new int[3];
          integer[0] = 1;
          integer[1] = 2;
          integer[2] = 3;
          for (int c = 0; c < integer.length; c++) {
              if (integer[c] % 2 != 0) {
                  integer[c] += 1;
              }
          }
          System.out.println(Arrays.toString(integer));
      }
    }
