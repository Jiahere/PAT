package com.jiahe.pat;

import java.math.BigInteger;
import java.util.Scanner;

public class PAT1011 {
    /*
    * 给定区间 [−2^31 ,2^31] 内的3个整数 A、B 和 C，请判断 A+B 是否大于 C。
    * */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int nums = scanner.nextInt();
        String[] resual=new String[nums];
        for (int i = 1; i <=nums; i++) {
            BigInteger data1 = scanner.nextBigInteger();
            BigInteger data2 = scanner.nextBigInteger();
            BigInteger data3 = scanner.nextBigInteger();
            if (data1.add(data2).compareTo(data3)==1){
                resual[i-1]="Case #"+i+":true";
            }else {
                resual[i-1]="Case #"+i+":false";
            }
        }
        for (String s:resual
             ) {
            System.out.println(s);
        }
    }
}
