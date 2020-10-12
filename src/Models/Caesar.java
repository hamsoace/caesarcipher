package Models;

import java.util.Scanner;

public class Caesar {

    public void encrypt(String messageText, int changeChar){
        String letterBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letterSmall = letterBig.toLowerCase();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter You Text:  ");
        String message = scan.next();
        int length = message.length();
        System.out.println("Enter the key: ");
        int key = scan.nextInt();

        for(int i = 0; i< length; i++){
            for (int j = 0; j< 26; j++){
                if (message.charAt(i) == letterSmall.charAt(j)){
                    System.out.println(letterSmall.charAt((j + key) % 26));
                }else if(message.charAt(i) == letterBig.charAt(j)){
                    System.out.println(letterBig.charAt((j + key) % 26));
                }

            }

        }
        System.out.println("The encrypted message is:  ");


  }
}
