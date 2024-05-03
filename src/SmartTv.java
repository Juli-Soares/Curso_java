public class SmartTv {
    boolean ligada=false;
    int canal1=1;
    int volume=25;

    public void mudarCanal (int novoCanal){
        canal1=novoCanal;

    }
    public void aumentarCanal(){
        canal1++;
    }
    public void diminuirCanal(){
        canal1--;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " +volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Dominuindo o volume para: " +volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
