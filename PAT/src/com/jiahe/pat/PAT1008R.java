package com.jiahe.pat;

public class PAT1008R {
    /*
     * 元素推移
     * */
    public static void main(String[] args) {
        /*
         * */
    }
}
/*
* 错误答案
* */
//        //处理接受的数据
//        Scanner scanner = new Scanner(System.in);
//        int data1 = scanner.nextInt();
//        int data2 = scanner.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < data1; i++) {
//            list.add(scanner.nextInt());
//        }
//        //处理数据
//        list = calculate(list, data2);
//        Iterator<Integer> iterator = list.iterator();
//        StringBuilder stringBuilder = new StringBuilder();
//        while (iterator.hasNext()) {
//            stringBuilder.append(iterator.next() + " ");
//        }
//        System.out.println(stringBuilder.toString().trim());
//
//    }
//
//    private static List<Integer> calculate(List<Integer> list, int data2) {
//        //给list扩容，将移位的元素在list尾部进行复制
//        int size = list.size();
//        for (int i = data2; i > 0; i--) {
//            list.add(list.get(size - i));
//        }
//        //移动元素
//        for (int i = size - data2 - 1; i >= 0; i--) {
//            list.set(i + 2, list.get(i));
//        }
//        //将移动后的元素进行补位
//        for (int i = data2; i > 0; i--) {
//            list.set(i - 1, list.get(i - 1 + size));
//        }
//        //删除复制的元素
//        for (int i = 1; i <= data2; i++) {
//            list.remove(list.size() - 1);
//        }
//        return list;
//    }


//    import java.util.ArrayList;
//import java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Scanner s=new Scanner(System.in);
//            int n=s.nextInt();
//            int m=s.nextInt();
//            ArrayList<Integer> list=new ArrayList();
//            for(int i=0;i<n;i++) {
//                list.add(s.nextInt());
//            }
//            int y=m%n;
//            ArrayList<Integer> list1=new ArrayList();
//            int len=list.size();
//            for(int i=len-y;i<len;i++) {
//                list1.add(list.get(i));
//            }
//            for(int i=0;i<len-y;i++) {
//                list1.add(list.get(i));
//            }
//            for(int i=0;i<len-1;i++) {
//                System.out.print(list1.get(i)+" ");
//            }
//            System.out.print(list1.get(len-1));
//        }
//
//    }


