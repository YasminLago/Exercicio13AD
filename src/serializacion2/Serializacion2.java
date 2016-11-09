package serializacion2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author oracle
 */
public class Serializacion2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Product p1 = new Product("p1","parafusos",3.0);
        Product p2 = new Product("p2","cravos",4.0);
        Product p3 = new Product("p3","tachas",5.0);
        Product nulo = new Product();
        Product px = new Product();
        
        ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("serial.txt"));
        ObjectInputStream leer = new ObjectInputStream(new FileInputStream("serial.txt"));
        
        escribir.writeObject(p1);
        escribir.writeObject(p2);
        escribir.writeObject(p3);
        escribir.close();
        
        try{
        while (leer.available()==0){
            px = (Product) leer.readObject();    
            System.out.println(px);
        }
        }catch (IOException io){}
        
    }
}

