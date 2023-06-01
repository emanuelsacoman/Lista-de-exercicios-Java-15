public class Robo implements Falante{
    public void falar(){
        System.out.println("Sou um robo.");
    }
    public String seuIdioma(){
        return "Português";
    }
    public void reboot(){
        System.out.println("Está sendo realizado um reboot.");
    }
}