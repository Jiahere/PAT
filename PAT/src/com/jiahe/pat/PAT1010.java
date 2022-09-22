package com.jiahe.pat;

import java.util.Scanner;

public class PAT1010 {
    /*
    * 设计函数求一元多项式的导数。*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = "";
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b != 0) {
                ans += (a*b)+" "+(b-1) + " ";
            }
        }
        if ("".equals(ans)) ans += "0 0";
        System.out.println(ans.trim());
    }

}
