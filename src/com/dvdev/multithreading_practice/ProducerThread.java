package com.dvdev.multithreading_practice;

import java.util.Queue;

/**
 * Producer бесконечно добавляет элементы в список
 */

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom(10);
                    list.add(random);
                    System.out.println("producer adds value: " + random + ". Size: " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
//                list.notifyAll(); //добавил элемент - оповестил потребителя
                try {
//                    int randomWaitValue = RandomUtil.getRandom(20);
                    int randomWaitValue = 20;
                    System.out.println("producer waits: " + randomWaitValue);
                    list.wait(randomWaitValue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
