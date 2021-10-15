package com.pb.hryhorenko.hw2;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char sing = getOperation();
        int result = calc(operand1,operand2,sing);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите значение:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе. Попробуйте еще раз");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char sing;
        if(scanner.hasNext()){
            sing = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе. Попробуйте еще раз");
            scanner.next();
            sing = getOperation();
        }
        return sing;
    }

    public static int calc(int operand1, int operand2, char sing){
        int result;
        switch (sing){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("Ошибка при вводе. Попробуйте еще раз");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}
