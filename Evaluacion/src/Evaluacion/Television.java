package Evaluacion;

public class Television extends Electrodomesticos{

    // constantes
    private final static int RESOLUCION_DEF = 20;
  
    // atributos
    private int resolucion;
  

    private boolean sintonizador; // indica si tiene o no sintonizadorTDT
  
    
  
   
  
    //Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
    	super ();
        this.resolucion = RESOLUCION_DEF;
        this.sintonizador = false;
    }
  
    /**
     * constructor con dos parametros
     * @param precio
     * @param peso
     */
    public Television(double precio, double peso){
    	this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumo = CONSUMO_DEF;
        this.resolucion = RESOLUCION_DEF;
        this.sintonizador = false;
    }
  
    /**
     * constructor con 6 parametros
     * @param precio
     * @param peso
     * @param color
     * @param consumo
     * @param resolucion
     * @param sintonizador
     */
    public Television(double precio, double peso, String color, char consumo,  int resolucion, boolean sintonizador){
        super();
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }
    
    /**
     * metodo para calcular precio final de los televisores
     * @return
     */
    public double precioFinal(){
        
        double extra=super.precioFinal();
  
        if (resolucion>40){
            extra = precio*0.3;
        }
        if (sintonizador){
            extra= extra + 50;
        }
  
        return extra;
    }
    
	@Override
	public String toString() {
		
		return "Television" + 
		       "\n " +super.toString() + 
		       "\nresolucion: " + resolucion +
		       "\nsintonizador: " + sintonizador;

	}


	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}


	public static int getResolucionDef() {
		return RESOLUCION_DEF;
	}
    
	

}
