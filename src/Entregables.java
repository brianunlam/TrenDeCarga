
public class  Entregables implements Comparable<Entregables> {
private Destinos lugar;
private String carga;

 public int compareTo(Entregables otro)
{
return this.lugar.getDistancia()- otro.lugar.getDistancia();
}

public Entregables(Destinos lugar, String carga) {
	super();
	this.lugar = lugar;
	this.carga = carga;
}

public Destinos getDestino()
{
return lugar;
}

public String getCarga()
{
return carga;
}

@Override
public String toString() {
	return "Entregables [lugar=" + lugar + ", carga=" + carga + "]";
}

public Destinos getLugar() {
	return lugar;
}

public void setLugar(Destinos lugar) {
	this.lugar = lugar;
}

public void setCarga(String carga) {
	this.carga = carga;
}


}
