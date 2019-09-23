package puntosConMetodosString;

public class Compilador  {
	private String miembro;
    private boolean start = false;
    
    public Compilador(String miembro) {
        
        this.miembro = miembro;
        
    }
    
    public String toString() {
        return this.getCadena();
    }

    //METODO GETTER
    public boolean getStart() {
        return start;
    }
    
    //METODO SETTER
    public void setStart(boolean start) {
        this.start = start;
    }
    
    //METODO GGETER
    public String getCadena() {
            return miembro;}
    
    //METODO SETTER
    public void setCadena(String cadena) {
        this.miembro = cadena;
        }
            
    //BOOLEAN METODO SI EMPIEZA CON C O CON F
    public void compilar(String cadena){    
        if(this.getCadena().startsWith("c")&&this.getCadena().endsWith("f")) {
                this.start=true;    
            }
        }
    
        
    //METODO MOVER PUNTO
    public Punto moverPunto(String cadena, Punto a) {
            if(start == true) {
                double x1 = a.getX();
                double y1 = a.getY();
                double x2 = a.getX();
                double y2 = a.getY();
                for(int i=0;i<cadena.length();i++){
                    char c = cadena.charAt(i);
                    switch(c) {
                    case 'n':
                        a.setY(y1+1);
                        break;
                    case 's':
                        a.setY(y1-1);
                        break;
                    case 'e':
                        a.setX(x1+1);
                        break;
                    case 'o':
                        a.setX(x1+1);
                        break;
                    default:
                        i = cadena.length();
                        a.setX(x2);
                        a.setY(y2);
                        cadena = null;
                        break;
                    }
                }
                
            }
            else {
                System.out.println("La cadena ingresada no es valida.");
            }
            return a;
        }}