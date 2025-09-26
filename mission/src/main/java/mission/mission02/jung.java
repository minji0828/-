package mission.mission02;

import java.util.Scanner;

public class jung
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("1부터 100까지의 수를 입력해주세요");
        int n=sc.nextInt();

        if(1 <= n && n <= 100) {

            boolean prime = n % 2 != 0;
            boolean prime2 = n % 3 != 0;
            boolean prime3 = n % 5 != 0;
            boolean prime4 = n % 7 != 0;
            System.out.println(n + "는 소수 입니다");
        }
        else if (8 <= n && n <= 100) {
            boolean prime = n % 2 == 0;
            boolean prime2 = n % 3 == 0;
            boolean prime3 = n % 5 == 0;
            boolean prime4 = n % 7 == 0;
            System.out.println(n + "은 소수가 아닙니다.");
    } else
            System.out.println("1부터 100이하의 수만 입력해주세요.");

    }

    }
