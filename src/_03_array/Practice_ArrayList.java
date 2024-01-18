package _03_array;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Practice_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> chat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("문자를 입력해 주세요. : ");
            String word = sc.next();
            chat.add(word);

            if (Objects.equals(word, "exit")) {
                for (String i : chat) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }
}
