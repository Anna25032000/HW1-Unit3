package by.itacademy.сredits;//Имеется прямоугольное отверстие размером a на b. Определить можно ли полностью закрыть отверстие круглой
// картонкой радиусом r.

public class EX1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int r = 6;

        if (r * r >= (a * a + b * b) / 4)
            System.out.println("можно");
        else
            System.out.println("нельзя");
    }
}
