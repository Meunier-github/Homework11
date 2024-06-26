import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkLeapYear(2012);
        checkVersionOS(1,2023);
        int deliveryDay = countDeliveryDay(95);
        if (deliveryDay != 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }


    public static void checkLeapYear(int year) {
            if (year <= 1584) {
                System.out.println("Неверно введен год! Год должен быть больше 1584.");
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }else {
                System.out.println(year + " год не является високосным");
            }

        }
    public static void checkVersionOS(int clientOS,int clientDeviceYear) {

        //int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int countDeliveryDay(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance < 20 ){
            day = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            day = 2;
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100 ) {
            day = 3;
        }
        return day;
    }

}
