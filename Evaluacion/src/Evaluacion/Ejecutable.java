package Evaluacion;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        // array de electrodomesticos
        Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
   
        //creacion de objetos
        listaElectrodomesticos[0]=new Electrodomesticos();
        listaElectrodomesticos[1]=new Electrodomesticos();
        listaElectrodomesticos[2]=new Electrodomesticos();
        listaElectrodomesticos[3]=new Electrodomesticos();
        listaElectrodomesticos[4]=new Television();
        listaElectrodomesticos[5]=new Television(1000, 30);
        listaElectrodomesticos[6]=new Television(2000, 10, "azul", 'F', 20, false);
        listaElectrodomesticos[7]=new Lavadora();
        listaElectrodomesticos[8]=new Lavadora(1000, 10);
        listaElectrodomesticos[9]=new Lavadora(1000, 20, "negro", 'a', 15);
   
        // variables para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        // ciclo para recorrer el array e invocar el metodo precio final
        for(int i=0;i<listaElectrodomesticos.length;i++){
          
            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //se muestran los resultados de la suma de precio
        System.out.println("La suma de los precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma de los precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma de los precio de los televisiones es de "+sumaTelevisiones);
        
        System.out.println(listaElectrodomesticos[9].precioFinal());
        System.out.println(listaElectrodomesticos[9].toString());
    }

	
   
	
	}


