import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;




public class Tren<E extends Entregables>  {
	
	private ArrayList<Destinos> estaciones;
	private ArrayList<E> paquetes;
	
	Tren(ArrayList<Destinos> listado)
	{
		estaciones = listado;
		paquetes= new ArrayList<E>();
	}

	public boolean cargar(E paquete){
		if(estaciones.contains(paquete.getLugar()))
		{
			paquetes.add(paquete);
			return true;
		}
		return false;
	}
	
	public void listar()
	{
		Collections.sort(paquetes);
		for (Entregables carga : paquetes)
		System.out.println(carga);
	}
	

}