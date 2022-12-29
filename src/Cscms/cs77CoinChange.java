package Cscms;
import java.util.Scanner;
public class cs77CoinChange {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int toGive = sc.nextInt();
       int paid = sc.nextInt();
       
       if(toGive<paid){
        int change = paid-toGive;
        System.out.println("Change: "+ change);
        if(change>=1000){
            int a = change/1000;
            change = change%1000;
            System.out.println("1000THB: " + a);
        }else   
            System.out.println("1000THB: " + 0);
        if(change>=500){
            int a = change/500;
            change = change%500;
            System.out.println("500THB: " + a);
        }else   
            System.out.println("500THB: " + 0);
        if(change>=100){
            int a = change/100;
            change = change%100;
            System.out.println("100THB: " + a);
        }else
            System.out.println("100THB: " + 0);
        if(change>=50){
            int a = change/50;
            change = change%50;
            System.out.println("50THB: " + a);
        }else
            System.out.println("50THB: " + 0);
        if(change>=20){
            int a = change/20;
            change = change%20;
            System.out.println("20THB: " + a);
        }else
            System.out.println("20THB: " + 0);
        if(change>=10){
            int a = change/10;
            change = change%10;
            System.out.println("10THB: " + a);
        }else
            System.out.println("10THB: " + 0);
        if(change>=5){
            int a = change/5;
            change = change%5;
            System.out.println("5THB: " + a);
        }else
            System.out.println("5THB: " + 0);
            if(change>=2){
                int a = change/2;
                change = change%2;
                System.out.println("2THB: " + a);
            }else
                System.out.println("2THB: " + 0);
            if(change<2){
              System.out.println("1THB: " + change);
            }else
              System.out.println("1THB: " + 0);
           }else if(toGive == paid){
            System.out.println("No change for you.");
           }else{
            System.out.println("Not enough money.");
           }
        }
    }    