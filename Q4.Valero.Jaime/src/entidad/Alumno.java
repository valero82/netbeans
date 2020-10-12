

package entidad;

public class Alumno {
    private int id = 0;
    private String nombre=null;
    private String iva=null;
    private String imagen=null;

    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getIva() {
        return iva;
    }

    public String getImagen() {
        return imagen;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}
