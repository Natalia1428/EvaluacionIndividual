
/**
 * @author Natalia Ponce Avila
 *
 * @see 
 * @version 
 */

package Evaluacion;

import java.util.Arrays;

public class Electrodomesticos {
    
	// constantes
	protected final static double PRECIO_DEF = 100;
	protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_DEF = 'F';
    protected final static double PESO_DEF = 5;
   
    // atributos
    protected double precio;
    protected double peso;
    protected String color;
    protected char consumo;
   
   
    // constructores
    /**
     * constructor por defecto
     */
	public void Electrodomestico(){
        this.precio = PRECIO_DEF;
    	this.peso = PESO_DEF;
        this.color = COLOR_DEF;
        this.consumo = CONSUMO_DEF;
        
    }
    /**
     * constructor con dos parametros
     * @param precio
     * @param peso
     */
    public void Electrodomestico(double precio, double peso){
		this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumo = CONSUMO_DEF;
        
    }
    /**
     * constructor con cuatro parametros
     * @param precio
     * @param peso
     * @param color
     * @param consumo
     */
    public void Electrodomestico(double precio, double peso, String color, char consumo){
        this.precio=precio;
        this.peso=peso;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
    
    }
    
    
    // metodos
    /**
     * metodo que comprueba que el color sea correcto
     * @param color
     * @return
     */
    public String comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};

        if ( Arrays.asList(colores).contains(color.toLowerCase()) ){
            this.color = color.toUpperCase(); // devuelve en mayuscula
        } else {
            this.color = "BLANCO";
        }
		return color;
    }
    /**
     * metodo que comprueba que la letra sea correcta, entre A-F
     * @param consumo
     * @return
     */
    public char comprobarConsumo(char consumo) {
        
        String letras = "ABCDEF"; // cadena con las posibles letras

        if ( letras.indexOf(Character.toUpperCase(consumo)) > 0 ){
            this.consumo = Character.toUpperCase(consumo); // convierte en mayuscula
        } else {
            this.consumo = 'F';
        }
		return consumo;
		
    }
    
    /**
     * metodo para calcular precio final
     * @return
     */
    public double precioFinal(){
    	
    	double extra=0;
        
        if(consumo == 'A'){
            extra = extra + 100;
        }else if(consumo == 'B'){
            extra = extra + 80;
        }else if(consumo == 'C'){
            extra = extra + 60;
        }else if(consumo == 'D'){
            extra = extra + 50;
        }else if(consumo == 'E'){
            extra = extra + 30;
        }else if(consumo == 'F'){
            extra = extra + 10;
        }
        
        
   
        if(peso>=0 && peso<19){
            extra = extra + 10;
        }else if(peso>=20 && peso<49){
            extra = extra + 50;
        }else if(peso>=50 && peso<=79){
            extra = extra + 80;
        }else if(peso>=80){
            extra = extra + 100;
        }
   
       
		return precio + extra;
    }

	@Override
	public String toString() {
		return "precio:" + precio + 
				"\ncolor:" + color + 
				"\nconsumo:" + consumo + 
				"\npeso:" + peso;		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static double getPrecioDef() {
		return PRECIO_DEF;
	}

	public static String getColorDef() {
		return COLOR_DEF;
	}

	public static char getConsumoDef() {
		return CONSUMO_DEF;
	}

	public static double getPesoDef() {
		return PESO_DEF;
	}
	
	
   
   
   
	
	
}
