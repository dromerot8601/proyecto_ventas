import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileWriter; 

public class GenerateInfoFiles { 
    public static void main(String[] args) {
    	// Generar archivo ventas
    	try {
	    	String ruta = "ventas_generadas.txt";
	    	String columnas = "TipoDocumentoVendedor;NúmeroDocumentoVendedor;IDProducto1;CantidadProducto1Vendido\n";
	    	String vendedor1 = "CC;18397655;6;4\n";
	    	String vendedor2 = "CC;52345243;2;5\n";
	    	String vendedor3 = "CC;24354267;3;1\n";
	    	String vendedor4 = "CC;126776666;1;6\n";
	    	String vendedor5 = "CC;53155393;5;3\n";
	    	File file = new File(ruta);
	    	if (!file.exists()) {
		    	file.createNewFile();
		    	FileWriter fw = new FileWriter(file);
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(columnas);
		    	bw.write(vendedor1);
		    	bw.write(vendedor2);
		    	bw.write(vendedor3);
		    	bw.write(vendedor4);
		    	bw.write(vendedor5);
		    	bw.close();
		    	System.out.println("Archivo de ventas generado");
	    	}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	// Generar archivo vendedores
    	try {
	    	String ruta = "vendedores_generados.txt";
	    	String columnas = "TipoDocumento;NumeroDocumento;NombresVendedor;ApellidosVendedor\n";
	    	String vendedor1 = "CC;18397655;Alejandro;Velez\n";
	    	String vendedor2 = "CC;52345243;Myra;Moreno\n";
	    	String vendedor3 = "CC;24354267;Pedro;Castillo\n";
	    	String vendedor4 = "CC;126776666;Mario;Millan\n";
	    	String vendedor5 = "CC;53155393;Diana;Romero\n";
	    	File file = new File(ruta);
	    	if (!file.exists()) {
		    	file.createNewFile();
		    	FileWriter fw = new FileWriter(file);
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(columnas);
		    	bw.write(vendedor1);
		    	bw.write(vendedor2);
		    	bw.write(vendedor3);
		    	bw.write(vendedor4);
		    	bw.write(vendedor5);
		    	bw.close();
		    	System.out.println("Archivo de vendedores generado");
	    	}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	// Generar archivo productos
        try {
            String ruta = "productos_generados.txt"; 
            String columnas = "IDProducto1;NombreProducto;PrecioPorUnidadProducto\n"; 
            String producto1 = "1;arroz diana 425gr;900\n";
            String producto2 = "2;café sello rojo 30gr;450\n";
            String producto3 = "3;azucar manuelita 1000gr;1200\n";
            String producto4 = "4;sal refisal 500gr;500\n";
            String producto5 = "5;atun van camps 250gr;3500\n";
            String producto6 = "6;salsa de tomate fruko 500gr;3000\n";
            String producto7 = "7;leche klim 800gr;6000\n";
            String producto8 = "8;aceite girasol 1000ml;9800\n";
            String producto9 = "9;crema dental colgate 200gr;10000\n";
            String producto10 = "10;jabon en polbo fab 1000gr;5000\n";

            
            File file = new File(ruta);
            if (!file.exists()) { 
                file.createNewFile();
                FileWriter fw = new FileWriter(file); 
                BufferedWriter bw = new BufferedWriter(fw); 
                bw.write(columnas);
                bw.write(producto1);
                bw.write(producto2);
                bw.write(producto3);
                bw.write(producto4);
                bw.write(producto5);
                bw.write(producto6);
                bw.write(producto7);
                bw.write(producto8);
                bw.write(producto9);
                bw.write(producto10);
                bw.close();
                System.out.println("Archivo de productos generado");
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    } 
  
} 
        
 
/*class Main { 
  
    createSalesMenFile( int randomSalesCount, String name, long id) {  
    
    } 
    
    createProductsFile( int productsCount ) { 
    
    } 
    
    createSalesManInfoFile( int salesmanCount ) { 
    
    } 
}*/
