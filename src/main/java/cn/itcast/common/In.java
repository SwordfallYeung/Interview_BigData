package cn.itcast.common;

import java.util.Scanner;

public class In {
    public static int[] readInts(){
        String[] sArray = getIn();
        int[] a = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++){
            a[i] = Integer.parseInt(sArray[i]);
        }
        return a;
    }

    public static double[] readDoubles(){
        String[] sArray = getIn();
        double[] a = new double[sArray.length];
        for (int i = 0; i< sArray.length; i++){
            a[i] = Double.parseDouble(sArray[i]);
        }
        return a;
    }

    public static String[] readStrings(){
        return getIn();
    }

    public static String getKey(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String[] getIn(){
        Scanner in = new Scanner(System.in);
        String readLine = in.nextLine(); //读取键盘输入的一行
        String[] s = readLine.split(" ");
        return s;
    }
}
