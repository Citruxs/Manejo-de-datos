public class Plumon{
	private String marca;
	private String color;
	private int nivel;

	public Plumon(String marca, String color, int nivel){
		marca = marca;
		color = color;
		nivel = nivel;
	}

	Plumon miPlumon = new Plumon("Magistral", "Negro", 100);
	miPlumon.pinta("Hola");
}