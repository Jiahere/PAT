package com.jiahe.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PAT1004 {
    /*
     * 入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
     * 输入格式：每个测试输入包含 1 个测试用例，
     * 格式为第 1 行：正整数 n
     * 第 2 行：第 1 个学生的姓名 学号 成绩
     * 第 3 行：第 2 个学生的姓名 学号 成绩
     * ... ... ...
     * 第 n+1 行：第 n 个学生的姓名 学号 成绩
     * 其中姓名和学号均为不超过 10 个字符的字符串，成绩为 0 到 100 之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。*/

    /*
     * 1、将所有的信息装入一个容器（二维数组或者内部类）
     * 2、对数据进行比较
     * */

    static class Student {
        public String name;
        public String stuNum;
        public Integer result;

        public Student(String name, String stuNum, Integer result) {
            this.name = name;
            this.stuNum = stuNum;
            this.result = result;
        }

        @Override
        public String toString() {
            return this.name + " " + this.stuNum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//接受要处理的人数
        scanner.nextLine();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String stu = scanner.nextLine();
            String[] regular = stu.split("\\s");
            Integer resualt = Integer.parseInt(regular[2]);
            list.add(new Student(regular[0], regular[1], resualt));
        }
        maxStudent(list);
        minStudent(list);
    }

    private static void maxStudent(List<Student> list) {
        Student maxStu = list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i).result > maxStu.result) {
                maxStu = list.get(i);
            }
        }
        System.out.println(maxStu);
    }

    private static void minStudent(List<Student> list) {
        Student minStu = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (minStu.result > list.get(i).result) {
                minStu = list.get(i);
            }
        }
        System.out.println(minStu);
    }
}
    /*

    9
12 32 98
kk kk 56
jj jj 36
ii ii 87
tt tt 78
rr rr 56
    * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int n = in.nextInt();
            String[][] a = new String[n][];
            in.nextLine();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLine().split(" ");
            }
            int max = Integer.parseInt(a[0][2]);
            int min = Integer.parseInt(a[0][2]);
            int maxIdx = 0;
            int minIdx = 0;
            for (int i = 1; i < n; i++) {
                int score = Integer.parseInt(a[i][2]);
                if (score > max) {
                    max = score;
                    maxIdx = i;
                }
                if (score < min) {
                    min = score;
                    minIdx = i;
                }
            }
            System.out.println(a[maxIdx][0] + " " + a[maxIdx][1]);
            System.out.println(a[minIdx][0] + " " + a[minIdx][1]);
        }
    }
}
*/


