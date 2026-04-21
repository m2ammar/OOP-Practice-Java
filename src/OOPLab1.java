import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OOPLab1 {
    public static void main(String[] args) {

       

        File myFile = new File("filename.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
            e.printStackTrace();
        }


        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        //task 2
        int[][] arr={{1,2,3},{3,3},{2,4,5,5}};


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

//        Write a java method which takes a string as parameter and print the number of consonant, vowel, and number of spaces
//        and return total number of characters in the whole string

//        public static int stringValues(String alpha) {
//
//            int vowel = 0;
//            int consonant = 0;
//            int space = 0;
//
//            for (int i = 0; i < alpha.length(); i++) {
//
//                char ch = alpha.charAt(i);
//
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//
//                    vowel++;
//
//                } else if (ch == ' ') {
//                    space++;
//
//                } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//
//                    consonant++;
//                }
//            }
//
//            System.out.println("Vowels: " + vowel);
//            System.out.println("Consonants: " + consonant);
//            System.out.println("Spaces: " + space);
//
//            return alpha.length();
//        }

    }
}
