package com.llmcu;

import java.util.concurrent.TimeUnit;

public class Exercise05Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        thread.start();
    }
}
