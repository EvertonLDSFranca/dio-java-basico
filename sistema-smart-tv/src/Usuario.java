public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);


        smartTV.ligar ();
        smartTV.diminuirVolume();
        smartTV.mudarCanal(16);

        System.out.println("");
        System.out.println("Novo Status:");
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);


    }
}
