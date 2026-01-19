package bombilla;

public class Main {

	public static void main(String[] args) {
		Bombilla bombillon = new Bombilla();
		bombillon.encender();
		bombillon.conmutar();
		bombillon.encender();
		System.out.println(bombillon.toString());
		bombillon.conmutar();
		bombillon.encender();
		bombillon.conmutar();
		System.out.println(bombillon.toString());
		bombillon.encender();
		bombillon.conmutar();
		bombillon.encender();
		System.out.println(bombillon.toString());
	}

}
