public class Main {
    public static void main(String[] args) {

        // Задание 1
        int year = 2024; // год для проверки
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}