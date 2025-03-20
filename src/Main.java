import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        leapYear(2000);
        download(0, 2024);
        delivery(50);
    }

    public static void leapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void download(int os, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        String osName;
        if (os == 1){
            osName = "Android";
        }
        else {
            osName = "IOS";
        }

        if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для " + osName);
        }
        else {
            System.out.println("Установите обычную версию приложения для " + osName);
        }
    }

    public static void delivery(int distance) {
        int days;
        if (distance <= 20) {
            days = 1;
        }
        else if (distance <= 60) {
            days = 2;
        }
        else if (distance <= 100) {
            days = 3;
        }
        else {
            days = -1;
        }
        if (days < 0) {
            System.out.println("Доставки нет");
        }
        else { System.out.println("Потребуется дней: " + days);
        }
    }

}