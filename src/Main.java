import java.util.ArrayList;




public class Main {
public static void main(String[] args) {
ArrayList<Destinos> tramo1;
tramo1 = new ArrayList<Destinos>();	
Destinos palomar = new Destinos("Palomar",23);
Destinos caseros = new Destinos("Caseros",13);
Destinos ramos = new Destinos("Caseros",9);
Destinos morris = new Destinos("William Morris",2);
tramo1.add(palomar);
tramo1.add(caseros);
tramo1.add(ramos);
Entregables carga1 = new Entregables(caseros,"verduras");
Entregables carga2 = new Entregables(palomar,"verduras");
Entregables carga3 = new Entregables(ramos,"verduras");
Entregables carga4 = new Entregables(morris,"verduras");
Tren chapa01= new Tren(tramo1);
chapa01.cargar(carga1);
chapa01.cargar(carga2);
chapa01.cargar(carga3);
chapa01.cargar(carga4);
chapa01.listar();


}
}