import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        int[] array = new int[10];
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the aray elements one by one..");
        for (int i = 0; i < 10; i++) {
            array[i] = sd.nextInt();
        }
        System.out.println("Duplicate Elements..");
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    continue;
                }
            }
        }
    }
}
