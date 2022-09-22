package com.jiahe.pat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PAT1012 {
    /*
    *
    * 给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
    * A1= 能被 5 整除的数字中所有偶数的和；
    * A2= 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4⋯；
    * A3= 被 5 除后余 2 的数字的个数；
    * A4= 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
    * A5= 被 5 除后余 4 的数字中最大数字。*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String deal = scanner.nextLine();
        String[] split = deal.split(" ");
        int[] datas=new int[split.length];
        for (int i = 1; i < split.length; i++) {
            datas[i-1]=Integer.parseInt(split[i]);
        }
        int num=Integer.parseInt(split[0]);
        //数据处理完毕，准备求出A1-A5
        String resual=calculate(num,datas);
        System.out.println(resual);
    }

    private static String calculate(int num, int[] datas) {
        int A1=0,A2=0,A3=0,A4=0,A5=0;
        //A1= 能被 5 整除的数字中所有偶数的和；
        for (int i = 0; i < num; i++) {
            if (datas[i]%10==0){
                A1=A1+datas[i];
            }
        }
        //A2= 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4⋯；
        List<Integer> list1=new ArrayList();
        for (int i = 0; i < num; i++) {
            if (datas[i]%5==1) {
               list1.add(datas[i]);
            }
        }
        boolean isNotExist=true;
        if (list1.size()!=0){
            isNotExist=false;
            int k=1;
            for (int i = 0; i < list1.size(); i++) {
              A2=A2+k*list1.get(i);
              k*=-1;
            }
        }

        //A3 = 被 5 除后余 2 的数字的个数；
        for (int i = 0; i < num; i++) {
            if(datas[i]%5==2){
                A3++;
            }
        }
        //A4= 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
        int count=0;
        for (int i = 0; i < num; i++) {
            if (datas[i]%5==3){
                A4=A4+datas[i];
                count++;
            }
        }

        //A5= 被 5 除后余 4 的数字中最大数字。
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if(datas[i]%5==4){
                list2.add(datas[i]);
            }
        }
        if (list2.size()!=0) {
            A5 = list2.get(0);
            for (int i = 1; i < list2.size(); i++) {
                if (A5 < list2.get(i)) {
                    A5 = list2.get(i);
                }
            }
        }else {
            A5=0;
        }

        String resual=((A1==0)?"N":A1)+" ";
        resual+=((isNotExist)?"N":A2)+" ";
        resual+=((A3==0)?"N":A3)+" ";
        resual+=((A4==0)?"N":new DecimalFormat("0.0").format((double) A4/count))+" ";
        resual+=((A5==0)?"N":A5);
        return resual;
    }
}