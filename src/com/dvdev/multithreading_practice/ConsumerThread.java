package com.dvdev.multithreading_practice;

import java.util.Queue;

/**
 * Consumer бесконечно удаляет элементы из списка
 */

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("cosumer got value: " + removedValue + ". Size: " + list.size());
                } else {
                    System.out.println("consumer is waiting for, list is empty");
                }
                try {
//                    int random = RandomUtil.getRandom(80);
                    int random = 80;
                    System.out.println("consumer waits: " + random);
//                    list.notifyAll(); //потребитель ждет элемент - оповещает поставщика добавить элемент
                    list.wait(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
