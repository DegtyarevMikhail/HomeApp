package GeekBrains;

public class Main {

    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor();
    }
    public static void checkSumSign(){
        int a = 5;
        int b = 7;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма чисел положительная");

        } else {
            System.out.println("Сумма чисел отрицательная");
        }
    }
    public static void printColor(){

        int value =51;
        if(value <= 0){
            System.out.println("Красный");}
        else if(value > 0 && value < 50){
            System.out.println("Желтый");}
        else if (value >= 50 && value <=100){
            System.out.println("Зелёный");
            }
        }
    }

