
public class Destinos {

	private String lugar;
	private int distancia;
	
	public Destinos(String lugar, int distancia) {
		super();
		this.lugar = lugar;
		this.distancia = distancia;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Destinos [lugar=" + lugar + ", distancia=" + distancia + "]";
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

}
