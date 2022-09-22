package com.jiahe.pat;

import java.util.Scanner;

public class PAT1006 {
    /*
    * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。
    * 例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        String result = calculate(num);
        System.out.println(result);
    }

    private static String calculate(int num) {
        StringBuffer sb=new StringBuffer();
        //处理百位
        for (int i = 0; i <num/100; i++) {
            sb.append("B");
        }
        //处理十位
        for (int i = 0; i < num%100/10; i++) {
            sb.append("S");
        }
        for (int i = 1; i <= num%10; i++) {
            sb.append(i);
        }

        return sb.toString();
    }
}
//import java.util.Scanner;
//
//public class Main {
//    /*让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），
//    换个格式来输出任一个不超过 3 位的正整数。
//    例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。*/
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//        StringBuffer str=new StringBuffer();
//
//        if (num/100!=0){
//            for (int i=0;i<num/100;i++){
//                str.append('B');
//            }
//        }
//        if(num%100/10!=0){
//            for (int i=0;i<num%100/10;i++){
//                str.append('S');
//            }
//        }
//        if (num%100%10!=0) {
//            for (int i = 1; i <=num%100%10; i++) {
//                str.append(i);
//            }
//        }
//
//        System.out.println(str);
//    }
//}

