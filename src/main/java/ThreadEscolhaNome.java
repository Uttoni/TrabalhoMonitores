public class ThreadEscolhaNome implements Runnable{

    private String[] listaNomes;
    private Boolean temMonitor;
    private static Parent parent = new Parent();

    public ThreadEscolhaNome(String[] nomes, Boolean temMonitor){
        listaNomes = nomes;
        this.temMonitor = temMonitor;
    }

    @Override
    public void run() {
        System.out.println("Começa a discussão... ");

        if(temMonitor)
            parent.escolherNomeFilhaComMonitor(listaNomes);
        else
            parent.escolherNomeFilhoSemMonitor(listaNomes);

        System.out.println("E ninguém decidiu nada kkkkkk");
    }
}
