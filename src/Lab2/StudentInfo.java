package Lab2;
import java.util.Scanner;
public class StudentInfo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student do you want to record?: ");
        int cases = sc. nextInt();
        int count = 0;
//        while (count < cases){
//            System.out.println("FOR STUDENT: "+ (count+1));
//            System.out.print("Enter Name: ");
//            String name = sc.next();
//            System.out.print("Enter Surname: ");
//            String surname = sc.next();
//            System.out.print("Enter Age: ");
//            int age = sc.nextInt();
//            System.out.print("Enter Study Program: ");
//            String program = sc.next();
//            
//            System.out.println("=================================");
//            System.out.println("My Name is "+name +" "+ surname);
//            System.out.println("I'm "+ age+" years old.");
//            System.out.println("I'm studying "+ program);
//            System.out.println("=================================");
//            count++;
//        }
        
        System.out.println("Enter ONE Sentence");
        String sentence = sc.nextLine();
        System.out.println("Transforming to LOWER case: "+sentence.toLowerCase());
        System.out.println("Transforming to UPPER case: "+sentence.toUpperCase());
        System.out.println("Length of Sentence: "+sentence.length());
        System.out.println("Letter at the Index of 2: "+sentence.charAt(2));
        System.out.println("Sub string from the letter at the index of 2: "+sentence.substring(2,4));

        System.out.print("Enter String 1: ");
        String s1 = sc.next();
        System.out.print("Enter String 2: ");
        String s2 = sc.next();
        System.out.println("Comparing ......");
        
        if (s1.equalsIgnoreCase(s2))
            System.out.println("EQUAL");
        else
            System.out.println("NOT EQUAL");     
    }
}
