package FractionPackage;
import java.util.regex.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Введите первую дробь(/ - знак деления числителя на знаменатель):");
        String firstFraction = o.nextLine();
        System.out.println("Введите вторую дробь(/ - знак деления числителя на знаменатель):");
        String secondFraction = o.nextLine();
        int a1, a2, b1, b2;// числители и знаменатели дробей
        int f[] = new int[100];// массив для хранения числителей и знаменателей
        String regex1 = "[0-9]+";
        Pattern pattern = Pattern.compile(regex1);
        // Блок нахождения числстеля и знаменателя первой дроби
        Matcher matcher = pattern.matcher(firstFraction);
        int i = 0;
        while (matcher.find()) {// цикл хода по строке при соответствии регулярному выражению
            i++;
            int start = matcher.start();// нахождение начала входа символов
            int end = matcher.end();// нахождение конца входа символов
            f[i] = Integer.parseInt(firstFraction.substring(start, end));// вставка в общую строку повторяющихся символов
        }
        a1 = f[1];
        a2 = f[2];
        // Блок нахождения числстеля и знаменателя первой дроби
        matcher = pattern.matcher(secondFraction);
        i = 0;
        while (matcher.find()) {//цикл хода по строке при соответствии регулярному выражению
            i++;
            int start = matcher.start();// нахождение начала входа символов
            int end = matcher.end();// нахождение конца входа символов
            f[i] = Integer.parseInt(secondFraction.substring(start, end));//вставка в общую строку повторяющихся символов
        }
        b1 =f[1]; b2 =f[2];

        Number a =new Number(a1,a2);
        Number b =new Number(b1,b2);

        System.out.println("Произведение"+firstFraction+"и"+secondFraction+"="+a.multiply(b));
        System.out.println("Частное"+firstFraction+"и"+secondFraction+"="+a.divide(b));
        System.out.println("Сумма"+firstFraction+"и"+secondFraction+"="+a.add(b));
        System.out.println("Разность"+firstFraction+"и"+secondFraction+"="+a.subtract(b));

        }
    }
