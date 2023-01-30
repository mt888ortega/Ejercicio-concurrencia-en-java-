public class Main {

	public static void main(String args[]) {

        //creamos un obj para ring y uno para cada boxeador
		Ring ring = new Ring();
		Boxeador boxeador1 = new Boxeador("LEWIS", ring);
		Boxeador boxeador2 = new Boxeador("TYSON", ring);
		
        //metodo para iniciar el conteo
		boxeador1.start();
		boxeador2.start();
		
		try {
			boxeador1.join();
			boxeador2.join();
		} 
        catch (InterruptedException ie) {}
		
		System.out.println("Fin del combate");

        //condicionales para definir al ganador
		if (boxeador1.getGolpes() > boxeador2.getGolpes())
			System.out.println("Ha ganado " + boxeador1.getNombre());
		else if (boxeador1.getGolpes() < boxeador2.getGolpes())
			System.out.println("Ha ganado " + boxeador2.getNombre());
		else
			System.out.println("Empate");
	}
}
