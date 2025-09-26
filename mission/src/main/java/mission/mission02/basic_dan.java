package mission.mission02;

import java.util.Scanner;

public class basic_dan
{
    public static void main(String[] args) {
        System.out.println("2와 9사이의 정수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int dan =  sc.nextInt();
        sc.close();

        if(dan >= 2 && dan <= 9)
            {
                printGugudan(dan);
            }
        else{
            System.out.println("2와 9사이의 정수를 다시 입력해주세요");
        }
    }
    public static void printGugudan(int dan)
    {

        for(int i = 1;  i <= 9 ; i++)
        {
        System.out.println(dan + " x " + i + " = " + dan*i);
        }
    }
}