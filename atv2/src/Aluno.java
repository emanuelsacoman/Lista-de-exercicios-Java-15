public class Aluno implements Falante{
    public void falar(){
        System.out.println("Olá, eu sou aluno de Ciência da Computação!");
    }
    public String seuIdioma(){
        return "Português";
    }
    public void identificarse(){
        System.out.println("Está sendo realizado um reboot.");
    }
}