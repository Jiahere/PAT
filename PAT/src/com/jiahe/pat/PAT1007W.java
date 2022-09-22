package com.jiahe.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PAT1007W {
    /*
    *现给定任意正整数N(<10^5)，请计算不超过N的满足猜想的素数对的个数。
    * */

    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        //将2-num中的素数全部找出来
        List primeNumber=calculate(num);
        //判断素数对
        int result=result(primeNumber);
        System.out.println(result);

    }

    private static int result(List<Integer> primeNumber) {
        int count=0;
        for (int i = 0; i < primeNumber.size()-1; i++) {
            if (Math.abs(primeNumber.get(i)-primeNumber.get(i+1))==2){
                count++;
            }
        }
        return count;
    }

    private static List<Integer> calculate(int num) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
          if (isPrime(i)){
             list.add(i);
          }
        }
        return list;
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

/*
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static int n;
    static int ans = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 把素数存入list
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        // 判断素数对
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 2) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    // 判断素数
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
*/
