import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileWriter; 

public class GenerateInfoFiles { 
    public static void main(String[] args) {
        try {
            String ruta = "vendedores_generados.txt"; 
            String columnas = "TipoDocumentoVendedor;NúmeroDocumentoVendedor;IDProducto;CantidadProductoVendido\n"; 
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
                System.out.println("archivo de vendedores generado");
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
