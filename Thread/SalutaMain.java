class Saluto extends Thread {
    public Saluto(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        System.out.println("Thread che saluta. Creato come estensione della classe Thread");
    }
}

class mioSaluto implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread eseguito tramite runnable");
    }
}

public class SalutaMain {
    public static void main(String[] args) {
        Saluto salutoThread = new Saluto("ThreadSaluto");
        salutoThread.start();

        mioSaluto runnableTask = new mioSaluto();
        Thread threadRunnable = new Thread(runnableTask);
        threadRunnable.start();

        Thread lambdaThread = new Thread(() -> {
            System.out.println("Sto usando una lamda expression");
        });
        lambdaThread.start();
    }
}
