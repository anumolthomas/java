import java.util.LinkedList;
class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;
    public Buffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }
    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(value);
            System.out.println("Produced: " + value);
            notifyAll();
        }
    }
    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            int value = buffer.removeFirst();
            System.out.println("Consumed: " + value);
            notifyAll();
        }
    }
}
class Producer implements Runnable {
    private Buffer buffer;
    private int numProductions;

    public Producer(Buffer buffer, int numProductions) {
        this.buffer = buffer;
        this.numProductions = numProductions;
    }
    public void run() {
        for (int i = 0; i < numProductions; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    private Buffer buffer;
    private int numConsumptions;

    public Consumer(Buffer buffer, int numConsumptions) {
        this.buffer = buffer;
        this.numConsumptions = numConsumptions;
    }
    @Override
    public void run() {
        for (int i = 0; i < numConsumptions; i++) {
            try {
                buffer.consume();
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 21/06/2023\n");
System.out.println("-----------OUTPUT---------");
        Buffer buffer = new Buffer(5);
        int numProductions = 10;
        int numConsumptions = 10;
        Producer producer = new Producer(buffer, numProductions);
        Consumer consumer = new Consumer(buffer, numConsumptions);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}

