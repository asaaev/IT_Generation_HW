import java.util.Scanner;

public class SubTask2 {
    public static String stringWriter(){
        System.out.println("Введіть данні: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println(stringWriter());
    }
}
