package puntosConMetodosString;

public class MainPuntos {

	public static void main(String[] args) {
		Punto p1= new Punto(5,8);
		Punto p2= new Punto(10,11);
		Compilador compi=new Compilador("cnrtpeosnf");
		
		System.out.println("metodo distancia de instancia");
		System.out.println(p1.distancia(p2));
		System.out.println("metodo distancia estatico");
		System.out.println(Punto.distancia(p1, p2));
System.out.println(compi.moverPunto("cnrtpef", p1));
	}

}
