package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      String型のMapです。
        Map<String, String> userMap = new HashMap<>();

        userMap.put("kimura", "Shiga");
        userMap.put("tanaka", "osaka");
        userMap.put("takahashi", "hyougo");
        userMap.put("yokogi", "kyouto");

        for (String key:userMap.keySet()){
            System.out.println(key + " is lives in " + userMap.get(key) );
        }

//      try-catch文を用いた例外処理です。Scannerで name を取り込んでいます。
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.nextLine();

        try {
            if (userMap.containsKey(name)) {
                System.out.println(name + " lives in " + userMap.get(name));
            } else {
                throw new UserNotFoundException("User not found");

            }
        } catch (UserNotFoundException e) {
            System.out.println("This user is not found. please enter your name again!");
        }
    }
}