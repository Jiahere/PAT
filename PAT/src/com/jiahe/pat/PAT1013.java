package com.jiahe.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PAT1013 {
    /*
    * 输出规定范围内的素数
    *
    * 输入样例：5 27
    * 输出样例：11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103
    * */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minScope = scanner.nextInt();
        int maxScope = scanner.nextInt();
        String resual=calculate(minScope,maxScope);
        System.out.println(resual);
    }

    private static String calculate(int minScope, int maxScope) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        while (true){
          int i=2;
          if (isPrime(i)){
              list.add(i);
              count++;
          }
          if (count==maxScope){
              break;
          }
          i++;
        }

        list=list.subList(0,minScope-1);


        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            if ((i+1)%10==0){
                stringBuffer.append(list.get(i)+"/n");
            }
            stringBuffer.append(list.get(i)+" ");
        }
        return stringBuffer.toString().trim();
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0||num==1) {
                return false;
            }
        }
        return true;
    }
}
