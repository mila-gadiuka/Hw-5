import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Первая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите операционную систему вашего мобильного устроства 0 — iOS, 1 — Android: ");
        int clientOS = in.nextInt();
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке: ...");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке: ...");
        } else {
            System.out.println("На ваше устройсто невозможно установить данное приложение");
        }
    }
    public static void task2() {
        System.out.println("Вторая задача"); //как-то случайно вышло, что код начал подсвечиваться зеленым цветом, не подскажите, что делать?
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите операционную систему вашего мобильного устроства 0 — iOS, 1 — Android: ");
        int clientOS = in.nextInt();
        System.out.print("Выберите год выпуска вашей операционной системы 0 - до 2015 года, 1 - после 2015 года: ");
        int clientDeviceYear = in.nextInt();
        if (clientOS==0) {
            if (clientDeviceYear==1) {
                System.out.println("Установите новую версию приложения для iOS по ссылке: ...");
            } else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: ...");
        } else if (clientOS==1) {
            if (clientDeviceYear==1) {
                System.out.println("Установите новую версию приложения для Android по ссылке: ...");
            } else
                System.out.println("Установите облегченную версию приложения для Android по ссылке: ...");
        } else {
            System.out.println("На ваше устройсто невозможно установить данное приложение");
        }
    }
    public static void task3() {
        System.out.println("Третья задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите интересующий вас год чтобы определить он високосный или нет: ");
        int year = in.nextInt();
        int yearCheck4 = year % 4;
        int yearCheck100 = year % 100;
        int yearCheck400 = year % 400;
        if ((yearCheck100==0 || yearCheck4!=0) && yearCheck400!=0) {
            System.out.println(year + " год, НЕ является високосным.");
        } else
            System.out.println(year + " год, является високосным.");
    }
    public static void task4() {
        System.out.println("Четвертая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Дистанция клиента от офиса в километрах: ");
        int deliveryDistance = in.nextInt();
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        } else if (deliveryDistance > 60) {
            deliveryDays ++;
        } else if (deliveryDistance > 100) {
            deliveryDays ++;
        }
        System.out.println("Потребуется дней для доставки: " + deliveryDays);
    }
    public static void task5() {
        System.out.println("Пятая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер текущего месяца в году: ");
        int monthNumber = in.nextInt();
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}