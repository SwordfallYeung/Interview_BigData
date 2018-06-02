package cn.itcast.algorithm;

import cn.itcast.common.In;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a){
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            //1、2、3、4、5  奇数组 mid = 1 + (5 - 1) / 2 = 1 + 2 = 3
            //1、2、3、4     偶数组 mid = 1 + (4 - 1) / 2 = 1 + 1 =2
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts();
        Arrays.sort(whitelist);
        String sKey = In.getKey();
        if (!StringUtils.isBlank(sKey)){
            //读取键值，如果不存在则将其打印出来
            int key = Integer.parseInt(sKey);
            if (rank(key, whitelist) < 0){
                System.out.println(key + "不存在");
            }else {
                System.out.println("存在");
            }
        }
    }
}