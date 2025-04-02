package STREAM2;

public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;  // Сначала объявляем
        Worker worker = new Worker(listener);              // Потом используем
        worker.start();
    }
}

