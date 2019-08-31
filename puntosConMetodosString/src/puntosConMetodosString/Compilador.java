package puntosConMetodosString;

public class Compilador extends Punto {
//DECLARACION DE ATRIBUTOS
	private String cadena;
	int i;
//DECLARACION DE CONSTRUCTOR
	public Compilador(String cadena){
		super();
			this.setCadena(cadena);}
	//decalracion contructor vacio
	public Compilador() {
		
	}
//METODO GGETER
	public String getCadena() {
		return cadena;}
//METODO SETTER
	public void setCadena(String cadena) {this.cadena = cadena;}
		
//BOOLEAN METODO SI EMPIEZA CON C O CON F
	public boolean Compi(String cadena){
		
		boolean start=false;
		if(this.getCadena().startsWith("c")&&this.getCadena().endsWith("f")) {
			start=true;
			
			}return start;
	}
	//metodo mover punto
public Punto moverPunto (String cadena,Punto r) {
	
	
	if (cadena.startsWith("c")&&cadena.endsWith("f")) {	
		double x=r.getX();
		double y=r.getY();
		
	
	for(i=0;i<=this.getCadena().length();i++){
			if(this.getCadena().contains("n")){
			y=y+1;
			}
			if(this.getCadena().contains("s")){
			y=y-1;
			}
			if(this.getCadena().contains("e")){
			x=x+1;
			}
			if(this.getCadena().contains("o")){
			x=x-1;	
			}}
	 r.setX(x);
	 r.setY(y);
			}
	
	
	
	return  r;
	}
		
		

}
