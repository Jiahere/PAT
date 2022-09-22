package com.jiahe.pat;

import java.util.Scanner;

public class PAT1002 {
    /*
    * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
    * */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(calculate(str));
    }

    private static String calculate(String str) {
        String resualt=null;
        int num=0;
//        char[] s = new char[101];
        for (int i = 0; i < str.length(); i++) {
             num=num+ (int)str.charAt(i)-'0';
        }
        resualt = readIn(num);
        return resualt;
    }

    private static String readIn(int num){
        StringBuffer stringBuffer=new StringBuffer();
        String numStr=Integer.toString(num);
        char[] chars = numStr.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            switch (chars[i]){
                case '0':
                    stringBuffer.append("ling ");break;
                case '1':
                    stringBuffer.append("yi ");break;
                case '2':
                    stringBuffer.append("er ");break;
                case '3':
                    stringBuffer.append("san ");break;
                case '4':
                    stringBuffer.append("si ");break;
                case '5':
                    stringBuffer.append("wu ");break;
                case '6':
                    stringBuffer.append("liu ");break;
                case '7':
                    stringBuffer.append("qi ");break;
                case '8':
                    stringBuffer.append("ba ");break;
                case '9':
                    stringBuffer.append("jiu ");break;
            }

        }
        return stringBuffer.toString().trim();
    }
}
