public class EsecuzioneThread {
        public static void main(String[] args) {
                Thread t1 = new ThreadExt("thread 1");
                 t1.start();

         Runnable r2 = new RunnableImpl("thread 2");
        Thread t2 = new Thread(r2);
         t2.start();

        new Thread(() -> System.out.println("esecuzione tramite lambda")).start();
        }       

static class ThreadExt extends Thread {
         public ThreadExt(String name) {
        super(name);
        }

        @Override
        public void run() {
         System.out.println("esecuzione tramite ereditarietà: " + getName());
        }
}
        static class RunnableImpl implements Runnable {
                private final String name;
                public RunnableImpl(String name) {
                this.name = name;
                }
        
                 @Override
                public void run() {
                System.out.println("esecuzione tramite runnable: " + name);
                }
        }
}
                                                                                                                                                                                                                    
