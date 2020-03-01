import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        int nodePos = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                list.add(ch);
            }
        }
        if (N != 0) {
            for (int i = 0; i < N; i++) {
                for (int j = nodePos - 1; j < list.size(); j++) {
                    System.out.print(list.get(j) + " ");
                }
                for (int k = 0; k < nodePos - 1; k++) {
                    System.out.print(list.get(k) + " ");
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
