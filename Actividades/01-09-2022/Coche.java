import java.util.Scanner;
public class Coche {
    private String color;

    public Coche(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String s = "El color de tu coche es: " + this.color;
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coche rojo = new Coche("Rojo");

        System.out.println(rojo);
        System.out.println("Cual es el nuevo color de tu coche");
        String color2 = scanner.nextLine();
        rojo.setColor(color2);
        System.out.println(rojo);
    }

}