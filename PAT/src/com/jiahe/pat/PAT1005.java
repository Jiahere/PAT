package com.jiahe.pat;

import java.util.*;

public class PAT1005 {
    /*
     * 卡拉兹(Callatz)猜想已经在1001中给出了描述。在这个题目里，情况稍微有些复杂。
     * 当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。
     * 例如对 n=3 进行验证的时候，我们需要计算 3、5、8、4、2、1，则当我们对 n=5、8、4、2 进行验证的时候，就可以直接判定卡拉兹猜想的真伪，
     * 而不需要重复计算，因为这 4 个数已经在验证3的时候遇到过了，我们称 5、8、4、2 是被 3“覆盖”的数。
     * 我们称一个数列中的某个数 n 为“关键数”，如果 n 不能被数列中的其他数字所覆盖。
     * 现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。
     * 你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。
     * */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //存放结果
        Set resualt = new TreeSet<>();
        Set callatz = new HashSet();
        in.nextLine();
        String strNums = in.nextLine();
        String[] split = strNums.split("\\s");
        int[] nums = new int[num];
        //得到题目所需的两类数据
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        //将所有的nums求出其卡拉兹集合
        for (int i = 0; i < nums.length; i++) {
            callatz.addAll(callatz(nums[i]));
        }
        //将结果输出
        resualt=isKeyword(callatz,nums);

        Iterator iterator = resualt.iterator();
        StringBuffer sb=new StringBuffer();
        while (iterator.hasNext()){
            sb.append(iterator.next()+" ");
        }
        System.out.println(sb.toString().trim());
    }

    /**
     * 判断是否是关键字
     *
     * @param setCallatz
     * @return
     */
    private static Set isKeyword(Set<Integer> setCallatz, int[] nums)
    {
        Set<Integer> result = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        });
        //用于判断结果是否存在false
        for (int i = 0; i < nums.length; i++)
        {
            if (!setCallatz.contains(nums[i]))
            {
                result.add(nums[i]);

            }
        }

        return result;
    }


    /**
     * 得到一个卡拉兹数的集合
     *
     * @param num
     * @return
     */
    private static Set callatz(int num) {
        Set set = new HashSet<Integer>();
        while (num!=1) {
            if (num % 2 == 0)
            {
                num = num / 2;
                set.add(num);
            } else
            {
                num = (3 * num + 1) / 2;
                set.add(num);
            }
        }
        return set;
    }
}


/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] gjs = new int[n]; // 关键数，给个长度就假设关键数有n个
		int gjsIndex = 0; // 关键数下标
		int[] list = new int[999]; // 集合列表，假设最长有999个。这里就不用ArrayList了，毕竟自动装箱拆箱啥的浪费时间内存
		int listIndex = 0;
		s.nextLine();
		String line = s.nextLine();
		// 如果只输入了一个值,这里不用判断也行，测试点中输入的n好像都大于1
		if (n == 1) {
			System.out.println(line);
			return;
		}A
		String[] strNumbers = line.split(" ");
		for (int i = 0; i < strNumbers.length; i++) {
			Integer num = Integer.valueOf(strNumbers[i]);
			// 遍历集合判断当前这个数是否存在集合list中
			boolean exist = isExist(num, list);
			// 如果该数存在在集合中，那么跳过此数
			if (exist) continue;A
			// 如果该数不存在在集合中，那么将该数加入关键数数组gjs中，同时将计算的数放入集合中
			gjs[gjsIndex++] = num;
			while (num != 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = (3 * num + 1) / 2;
				}
				// 遍历集合，判断当前这个数是否存在集合list中
				boolean exist02 = isExist(num, list);
				// 如果集合中包含当前计算出的数，那么退出。
				if (exist02) break;
				// 如果集合中不包含，则将计算出的数放入集合
				list[listIndex++] = num;
			}
		}
		// 遍历所有关键数
		for (int i = 0; i < gjs.length; i++) {
			// 如果关键数数组中的关键数包含在集合中，那么删除。
			boolean exist = isExist(gjs[i], list);
			if (exist) {
				gjs[i] = 0;
			}
			// 如果当前关键数和该数组中其他数相等，那么该数删除
			for (int j = i+1; j < gjs.length; j++) {
				if (gjs[i] == gjs[j]) {
					gjs[i] = 0;
				}
			}
		}
		// 数组排序
		Arrays.sort(gjs);
		StringBuffer print = new StringBuffer();
		for (int i = gjs.length-1; i >= 0; i--) {
			if (gjs[i] == 0) continue;
			print.append(gjs[i] + " ");
		}
		System.out.println(print.toString().trim());
	}

	// 判断一个数是否存在与某个数组中,该数组中所有数字都大于0
public static boolean isExist(int num, int[] list) {
    for (int j = 0; j < list.length; j++) {
        if (list[j] == 0) break;
        if (num == list[j]) {
            return true;
        }
    }
    return false;
}
}

*/
