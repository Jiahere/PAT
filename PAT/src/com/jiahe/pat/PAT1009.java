package com.jiahe.pat;

//import java.util.Scanner;
//
//public class PAT1009 {
///*
//    给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
//    Hello World Here I Come
//    ->Come I Here World Hello
//*/
//
//    public static void main(String[] args) {
//        long start=System.currentTimeMillis();
//        Scanner scanner=new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        System.out.println(deal(sentence));
//        long end=System.currentTimeMillis();
//        System.out.println("当前程序运行多少毫秒:" + "=" + (end-start));
//    }
//
//    private static String deal(String sentence) {
//        StringBuffer stringBuffer=new StringBuffer();
//        String[] split = sentence.split(" ");
//        for (int i = split.length-1; i >=0; i--) {
//            stringBuffer.append(split[i]+" ");
//        }
//        return stringBuffer.toString().trim();
//    }
//}
import java.util.Scanner;

public class PAT1009 {
    public static String[] Flip(String[] strings){
        String[] sgnirts=new String[strings.length];
        for (int i = 0; i <strings.length; i++) {
            sgnirts[strings.length-i-1]=strings[i];
        }

        return sgnirts;
    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        //接收输入的字符串
        Scanner scanner=new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");

        String[] flip = Flip(s);

        for (int i = 0; i <flip.length ; i++) {
            if (i==flip.length-1){
                System.out.println(flip[i]);
            }else {
                System.out.print(flip[i]+'\040');
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("当前程序运行多少毫秒:" + "=" + (end-start));
    }
}
