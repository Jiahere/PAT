package com.jiahe.sort;

import java.util.Arrays;

public class Sort {
    //排序为升序排序
    public static void main(String[] args) {
        int[] datas={1,95,68,44,59,35,781,5,24};
        int[] resual=bubbleSort(datas);
        System.out.println(Arrays.toString(resual));
    }

    //选择排序
    private static int[] selectSort(int[] datas) {
        for (int i = 0; i < datas.length-1; i++) {
            for (int j = i+1; j < datas.length; j++) {
                int max=datas[i];
                if (datas[i]>datas[j]){
                    datas[i]=datas[j];
                    datas[j]=max;
                }
            }
        }
        return datas;
    }

    //插入排序
    private static int[] insertionSort(int[] datas){
        for (int i = 1; i < datas.length; i++) {
            for (int j = i; j > 0; j--) {
                if (datas[j]<datas[j-1]){
                    int max=datas[j-1];
                    datas[j-1]=datas[j];
                    datas[j]=max;
                }
            }
        }
        return datas;
    }

    //冒泡排序
    private static int[] bubbleSort(int[] datas){
        for (int i = datas.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (datas[j]>datas[j+1]){
                    int min=datas[j+1];
                    datas[j+1]=datas[j];
                    datas[j]=min;
                }
            }
        }
        return datas;
    }
}
