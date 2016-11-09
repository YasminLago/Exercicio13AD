package serializacion2;

import java.io.Serializable;

/**
 *
 * @author Yasmin
 */
public class Product implements Serializable{
    
    private String codigo;
    private String descripcion;
    private Double prezo;

    public Product() {
        codigo=null;
        descripcion=null;
        prezo=0.0;
    }
    
    public Product(String codigo, String descripcion, Double prezo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrezo() {
        return prezo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrezo(Double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return  "Codigo: " + codigo + 
                "\nDescripcion: " + descripcion + 
                "\nPrezo: " + prezo + " €" ;
    }
    
    
}
