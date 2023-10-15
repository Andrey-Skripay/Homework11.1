import java.time.LocalDate;
public class Main {
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (deviceYear > currentYear) {
            System.out.println("Устройство из будущего. Проверьте год выпуска.");
            return;
        }

        if (deviceYear < 2015) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Некорректный тип операционной системы");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите обычную версию приложения для iOS");
            } else if (osType == 1) {
                System.out.println("Установите обычную версию приложения для Android");
            } else {
                System.out.println("Некорректный тип операционной системы");
            }
        }
    }

    public static void main(String[] args) {
        int osType = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015; // год выпуска устройства

        suggestAppVersion(osType, clientDeviceYear);
    }
}