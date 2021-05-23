package Homework_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        method1();
        System.out.println();
        method2();


    }

    public static void method1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        }
        System.out.println("Время работы первого метода: " + (System.currentTimeMillis() - a));
    }

    public static void method2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        long b = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, (int) arr[HALF], a2, 0, HALF);
        System.out.println("Время разбивки на два массива: " + (System.currentTimeMillis() - b));
        long c = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + a1[i] / 5) * Math.cos(0.2f + a1[i] / 5) * Math.cos(0.4f + a1[i] / 2));
            }
            System.out.println("Время просчёта значений первого массива: " + (System.currentTimeMillis() - c));
        });
        long d = System.currentTimeMillis();
        ExecutorService executorService2 = Executors.newFixedThreadPool(1);
        executorService2.execute(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + a2[i] / 5) * Math.cos(0.2f + a2[i] / 5) * Math.cos(0.4f + a2[i] / 2));
            }
            System.out.println("Время просчёта значений второго массива: " + (System.currentTimeMillis() - d));
            long e = System.currentTimeMillis();
            System.arraycopy(a1, 0, arr, 0, HALF);
            System.arraycopy(a2, 0, arr, (int) arr[HALF], HALF);
            System.out.println("Время склейки двух массивов в один: " + (System.currentTimeMillis() - e));
            System.out.println("Общее время работы второго метода: " + (System.currentTimeMillis() - a));
        });
        executorService.shutdown();
        executorService2.shutdown();
    }
}
