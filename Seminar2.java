import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\W", "");
        StringBuilder strbuild = new StringBuilder(str);
        strbuild.reverse();
        String invstr = strbuild.toString();
        if (str.equalsIgnoreCase(invstr))
            System.out.println(invstr);
        else {
            System.out.println("Строки не полиндромны");
        }
    }

}
