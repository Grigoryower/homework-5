

public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
            }

            public static void task1() {
                System.out.println("Задача 1");
                int clientOS =0;

                if (clientOS == 0) {
                    System.out.printf("Установите версию приложения для iOS по ссылке|-\n");
                }
                if (clientOS == 1) {
                    System.out.printf("Установите версию приложения для Android по ссылке\n");
                }

            }

            public static void task2() {
                System.out.println("Задача 2");
                int clientDeviceYear = 2012;
                int clientOS =1;
                if (clientDeviceYear < 2015) {
                    if (clientOS == 0) {
                        System.out.printf("Установите облегченную версию приложения для iOS\n");
                    }else {
                        System.out.printf("Установите версию приложения для iOS\n");
                    }
                }
                else if (clientDeviceYear >= 2015) {
                    if (clientOS == 1) {
                        System.out.printf("Установите облегченную версию приложения для Android\n");
                    }else {
                        System.out.printf("Установите версию приложения для Android\n");
                    }
                }

            }
            public static void task3() {
                System.out.println("Задача 3");
                int year =1232;
                if (year %100==0 && year %400 ==0 )
                    System.out.println("год является високосным");

                else if (year % 4 == 0 && year % 100 > 0)
                    System.out.println("год является високосным");

                else if (year % 100 == 0)
                    System.out.println("год не является високосным");

                else
                    System.out.println("год не является високосным");
            }
            public static void task4() {
                System.out.println("Задача 4");
                int deliveryDistance = 66;
                if (deliveryDistance <= 20){
                    System.out.printf("Доставка займет "+ '1' +" день\n");}
                else if (deliveryDistance > 20 && deliveryDistance <= 60){
                    System.out.printf("Доставка займет " + '2' + " дня\n");
                }
                else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.printf("Доставка займет " +'3'+ " Дня\n");
                }
                else {
                    System.out.printf("Свыше 100 км доставки нет");
                }

            }

            public static void task5() {
                System.out.println("Задача 5");
                int monthOfTheYear = 11;

                switch (monthOfTheYear) {
                    case 1:
                        System.out.println("Январь ");
                        break;
                    case 2:
                        System.out.println("Ферваль ");
                        break;
                    case 3:
                        System.out.println("Март ");
                        break;
                    case 4:
                        System.out.println("Апрель ");
                        break;
                    case 5:
                        System.out.println("Май ");
                        break;
                    case 6:
                        System.out.println("Июнь ");
                        break;
                    case 7:
                        System.out.println("Июль ");
                        break;
                    case 8:
                        System.out.println("Август ");
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        break;
                    case 10:
                        System.out.println("Октябрь ");
                        break;
                    case 11:
                        System.out.println("Ноябрь ");
                        break;
                    case 12:
                        System.out.println("Декабрь ");
                        break;
                    default:
                        System.out.println("Такого месяца не существует");
                }


                switch (monthOfTheYear) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("ЛЕто");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;


                    default:
                        System.out.println("Такого сезон не существует");


                }
            }
        }