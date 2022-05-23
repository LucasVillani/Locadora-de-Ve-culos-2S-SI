package utils;
import java.util.Scanner;
public class ES {
 static Scanner scanner = new Scanner(System.in);
 public static void print(String msg) {
 System.out.println(msg);
 }
 public static String input(String msg) {
 System.out.print(msg);
 String s = scanner.nextLine();
 return s;
 }
 public static int toInt(String s) {
 int i = Integer.parseInt(s);
 return i;
 }
 public static double toDouble(String s) {
 double d;
 d = Double.parseDouble(s);
 return d;
 }
}