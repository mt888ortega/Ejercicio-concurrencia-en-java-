import java.util.Random;

public class Boxeador extends Thread { //Clase Boxeador hereda de Thread


	private String nombre;
	private Ring ring;
	private int golpes;

	//constructor para boxeador
	public Boxeador(String nombre, Ring ring) {
		
		this.nombre = nombre;
		this.ring = ring;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getGolpes() {
		return golpes;
	}
	
	public void pegar() {
		golpes++; 
	}
	
	/*sobreescribimos el método "run()", en él se va a codificar
	 la funcionalidad que se ha de ejecutar en un hilo;
	 es decir, que lo que se programe en el método "run()"
	 se va a ejecutar de forma secuencial en un hilo. */
	@Override
	public void run() {
		
		/*ciclo para acabar la pelea cuando el numero de golpes llege a 100,
		los dos boxeadores lanzan golpes al mismo tiempo, el boxeador que genere 
		mas golpes en ese tiempo, gana */
		while (ring.getGolpes() < 100) { 
			
			ring.pegar(this);
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException ie) {}
		}
	}
}