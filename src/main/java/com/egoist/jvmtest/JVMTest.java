package com.egoist.jvmtest;

public class JVMTest {
//    public static void main(String[] args) {
//        long maxMemory = Runtime.getRuntime().maxMemory();//返回Java虚拟机试图使用的最大内存量。
//        Long totalMemory = Runtime.getRuntime().totalMemory();//返回Java虚拟机中的内存总量。
//        System.out.println("MAX_MEMORY =" + maxMemory + "(字节)、" + (maxMemory / (double) 1024 / 1024) + "MB");
//        System.out.println("TOTAL_ MEMORY = " + totalMemory + "(字节)" + (totalMemory / (double) 1024 / 1024) + "MB");
//        String str = "www.baidu.com";
//        while (true) {
//            str += str + new Random().nextInt(88888888) + new Random().nextInt(99999999);
//        }
//    }

    public static void main(String[] args) {
        byte[] b = null;
        for (int i = 0; i < 10; i++)
            b = new byte[1 * 1024 * 1024];
    }

}
