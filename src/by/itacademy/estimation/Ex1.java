package by.itacademy.estimation;

import java.util.Scanner;

//Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды.
// Слова должны иметь правильное окончание.
//Для более высокого балла добавьте недели и сутки.
//Постарайтесь не выводить данные, значение которых равно 0

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во секунд: ");
        int time = scanner.nextInt();
        int weeks = time / 604_800;
        int days = (time - (weeks * 604_800)) / 86_400;
        int hours = (time - ((weeks * 604_800) + (days * 86_400))) / 3600;
        int minutes = (time - ((weeks * 604_800) + (days * 86_400) + (hours * 3600))) / 60;
        int seconds = (time - ((weeks * 604_800) + (days * 86_400) + (hours * 3600) + (minutes * 60)));
        //недели
        if (weeks == 1 || weeks == 21 || weeks == 31 || weeks == 41 || weeks == 51) {
            System.out.print(weeks + " неделя ");
        } else if (weeks == 2 || weeks == 3 || weeks == 4 || weeks == 22 || weeks == 23 || weeks == 24) {
            System.out.print(weeks + " недели ");
        } else if (weeks >= 5 && weeks <= 52) {
            System.out.print(weeks + " недель ");
        }
        //дни
        if (days == 1 || days == 21 || days == 31) {
            System.out.print(days + " день ");
        } else if (days == 2 || days == 3 || days == 4 || days == 22 || days == 23 || days == 24) {
            System.out.print(days + " дня ");
        } else if (days >= 5 && days <= 30) {
            System.out.print(days + " дней ");
        }
        //часы
        if (hours == 1 || hours == 21) {
            System.out.print(hours + " час ");
        } else if (hours == 2 || hours == 3 || hours == 4 || hours == 22 || hours == 23 || hours == 24) {
            System.out.print(hours + " часа ");
        } else if (hours >= 5 && hours <= 20) {
            System.out.print(hours + " часов ");
        }
        //минуты
        else if (minutes == 1 || minutes == 21 || minutes == 31 || minutes == 41 || minutes == 51) {
            System.out.print(minutes + " минута ");
        } else if (minutes > 1 && minutes < 5 || minutes == 22 || minutes == 23 || minutes == 24 || minutes == 32 ||
                minutes == 33 || minutes == 34 || minutes == 42 || minutes == 43 || minutes == 44 || minutes == 52 ||
                minutes == 53 || minutes == 54) {
            System.out.print(minutes + " минуты " + minutes);
        } else if (minutes >= 5 && minutes <= 60) {
            System.out.print(minutes + " минут " + minutes);
        }
        //секунды
        if (seconds == 1 || seconds == 21 || seconds == 31 || seconds == 41 || seconds == 51) {
            System.out.print(seconds + " секунда");
        } else if (seconds > 1 && seconds < 5 || seconds == 22 || seconds == 23 || seconds == 24 || seconds == 32 ||
                seconds == 33 || seconds == 34 || seconds == 42 || seconds == 43 || seconds == 44 || seconds == 52 ||
                seconds == 53 || seconds == 54) {
            System.out.print(seconds + " ceкунды ");
        } else if (seconds >= 5 && seconds <= 60) {
            System.out.print(seconds + " секунд");
        }
    }
}

