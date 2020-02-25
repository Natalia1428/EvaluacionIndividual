package Evaluacion;

public class Lavadora extends Electrodomesticos{

    // constante
    private final static int CARGA_DEF = 5;
  
    // atributo
    private int carga;
  
    //Constructor
    /**
     * constructor con parametros por defecto
     */
    public Lavadora(){
        super();
    	this.carga = CARGA_DEF;
    }
  
    /**
     * constructor con dos parametros
     * @param precio
     * @param peso
     */
    public Lavadora(double precio, double peso){
    	super(double precio, double peso, String COLOR_DEF, char CONSUMO_DEF, int CARGA_DEF)
    	this.carga = CARGA_DEF;
    }
  
    /**
     * constructor con 5 parametros
     * @param precio
     * @param peso
     * @param color
     * @param consumo
     * @param carga
     */
    public Lavadora(double precio, double peso, String color , char consumo, int carga){
        super();
        this.carga=carga;
    }
    
    /**
     * metodo para calcular el precio final de las lavadoras
     */
    public double precioFinal(){
        
        double extra=super.precioFinal();// llamamos el método precioFinal de la clase padre Electrodomesticos
  
        
        if (carga>30){
            extra = extra + 50;
        }
  
        return extra;
    }


	@Override
	public String toString() {
		
		return " Lavadora" + 
		       "\n " +super.toString() + 
		       "\ncarga: " + carga;

	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	public static int getCargaDef() {
		return CARGA_DEF;
	}
    
	
    
}	
	

