public class App {
    public static void main(String[] args) throws Exception {
        Instrumentos[] instrumentos = new Instrumentos[5];
        
        instrumentos[0] = new Sopro();
        instrumentos[1] = new Percussao();
        instrumentos[2] = new Corda();
        instrumentos[3] = new SoproMetal();
        instrumentos[4] = new SoproMadeira();
        
        sinfonia(instrumentos); 
    }
    public static void sinfonia(Instrumentos[] instrumentos){
        for(Instrumentos i : instrumentos){
            i.tocar();
            i.nome();
            i.afinar();
        }
    }
}