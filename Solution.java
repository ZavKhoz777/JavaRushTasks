import java.util.Scanner;
import java.io.IOException;


/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int val;
        boolean out = false;
        while(!out) {
            if (sc.hasNextInt()) {
                val = sc.nextInt();
                if ((0 < val)&&(val < 128)) print((short) val);
                else{
                    print(val);
                }
            }
            else if (sc.hasNextDouble()) print(sc.nextDouble());
            else if (sc.hasNextLine()&&(!sc.nextLine().toLowerCase().equals("exit"))) {
                print(sc.nextLine());
            }
            else {
                out = true;
            }

        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
