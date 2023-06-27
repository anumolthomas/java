class MultiplicationTableThread extends Thread {

    public void run() {
System.out.println("-----------OUTPUT---------");
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        new PrimeNumbersThread(10).start();
    }
}
class PrimeNumbersThread extends Thread {
    private int count;
 public PrimeNumbersThread(int count) {
        this.count = count;
    }
    public void run() {
        System.out.println("First " + count + " Prime Numbers:");
        int num = 2;
        int primeCount = 0;
        while (primeCount < count) {
            if (isPrime(num)) {
                System.out.println(num);
                primeCount++;
            }
            num++;
        }
    }
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class Q5{
    public static void main(String[] args) {
    System.out.println(" Course name : Object Oriented Programming Lab \n Course code : 20MCA132 \n Name : Anumol Thomas \n Register no : SJC22MCA-2011 \n Date : 21/06/2023\n");
        new MultiplicationTableThread().start();
    }
}

