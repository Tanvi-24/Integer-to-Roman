package main.java;

import java.util.Scanner;

public class IntegertoRoman {

    public static String intToRoman(int num) {

        int number[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder sb=new StringBuilder();
        for(int i=number.length-1;i>=0;i--){
            while(num>=number[i]){
                sb.append(roman[i]);
                num-=number[i];
            }
        }
        return sb.toString();
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int numbr = sc.nextInt();
        System.out.println("Roman number for "+ numbr +" is "+intToRoman(numbr));
    }
}
