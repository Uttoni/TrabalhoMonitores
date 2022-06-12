public class ExemploDiscussao {
    public static void main(String[] args) {
        String[] ideiaNomesFilhoMae = {"João", "Pedro", "Henrique", "Carlos", "Felipe"};
        String[] ideiaNomesFilhoPai = {"Fidelis", "Francisco", "Aluísio", "Nicodemos", "Baltazar"};

        String[] ideiaNomesFilhaMae = {"Isaura", "Marcelina", "Flávia", "Alessandra", "Esmeralda"};
        String[] ideiaNomesFilhaPai = {"Tereza", "Eva", "Suelen", "Marta", "Bárbara"};

        Boolean comMonitor = true;

        if(comMonitor){
            ThreadEscolhaNome ten3 = new ThreadEscolhaNome(ideiaNomesFilhaMae, comMonitor);
            Thread t3 = new Thread(ten3, "Mãe");
            t3.start();
            ThreadEscolhaNome ten4 = new ThreadEscolhaNome(ideiaNomesFilhaPai, comMonitor);
            Thread t4 = new Thread(ten4, "Pai");
            t4.start();
        }else{
            ThreadEscolhaNome ten1 = new ThreadEscolhaNome(ideiaNomesFilhoMae, comMonitor);
            Thread t1 = new Thread(ten1, "Mãe");
            t1.start();
            ThreadEscolhaNome ten2 = new ThreadEscolhaNome(ideiaNomesFilhoPai, comMonitor);
            Thread t2 = new Thread(ten2, "Pai");
            t2.start();
        }



    }
}
