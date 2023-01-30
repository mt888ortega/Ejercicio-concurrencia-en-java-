public class Ring {

	private int golpes;
	
	public Ring() { //metodo para llevar el conteo de los golpes
		golpes = 0;
	}
	
	public int getGolpes() {
		return golpes;
	}
	
    /*La palabra reservada synchronized se usa para indicar que el conteo
    de los golpes de los dos boxeadores estan sincronizados */
	public synchronized void pegar(Boxeador boxeador) {
		
		boxeador.pegar();
		golpes++;
	
        //imprimimos el nombre del boxeador y su numero de golpes
		System.out.println("Pegada de " + boxeador.getNombre() + " (" + boxeador.getGolpes() + ")");
	}
}
