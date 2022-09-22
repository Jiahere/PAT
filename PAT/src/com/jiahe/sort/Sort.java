package com.jiahe.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] datas={1,95,68,44,59,35,781,5,24};
        int[] resual=selectSort(datas);
        System.out.println(Arrays.toString(resual));
    }

    //选择排序
    private static int[] selectSort(int[] datas) {
        for (int i = 0; i < datas.length-1; i++) {
            for (int j = i+1; j < datas.length; j++) {
                int min=datas[i];
                if (datas[i]>datas[j]){
                    datas[i]=datas[j];
                    datas[j]=min;
                }
            }
        }
        return datas;
    }

    //插入排序

}
