public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАДАНИЕ 1");
        for (int I = 0; I <= 10; I++)
        {
            System.out.println("Итерация цикла " + I + "!");
        }

        System.out.println("ЗАДАНИЕ 2");
        for (int I1 = 10; I1 >= 0; I1--)
        {
            System.out.println("Итерация цикла " + I1 + "!");
        }

        System.out.println("ЗАДАНИЕ 3");
        for (int i = 0; i <= 17 ; i = i + 2)
        {
            System.out.println("Итерация цикла (чётные числа) " + i + "!");
        }

        System.out.println("ЗАДАНИЕ 4");
        for (int I2 = 10; I2 >= -10; I2--)
        {
            System.out.println("Итерация цикла " + I2 + "!");
        }

        System.out.println("ЗАДАНИЕ 5");
        for (int i2 = 1904; i2 < 2094; i2 = i2+4) {
            System.out.println(i2 + " год является високосным!");
        }

        System.out.println("ЗАДАНИЕ 6");
        for ( int i3 = 7; i3 < 99; i3 = i3 + 7){
            System.out.println("Выполнена итерация " +i3);
        }

        System.out.println("ЗАДАНИЕ 7");
        for ( int i4 = 1; i4 < 512; i4 = i4 * 2){
            System.out.println("Выполнена итерация " +i4);
        }

        System.out.println("ЗАДАНИЕ 8");
        int salary = 29000;
        int total = 0;
        for (int i5 = 1; i5 <= 12; i5++) {
            total = total + salary;
            System.out.println("Месяц " + i5 + " , сумма накоплений равна " + total + " рублей!");
        }

        System.out.println("ЗАДАНИЕ 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i6 = 1; i6 <= 12; i6++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i6 + " , сумма накоплений равна " + total1 + " рублей!");
        }


    }
}