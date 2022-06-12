public class Parent {

    public void escolherNomeFilhoSemMonitor(String[] nomes){
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " disse o nome " + nomes[i]);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void escolherNomeFilhaComMonitor(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " disse o nome " + nomes[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
