package Models;

/**
 * Created by Pavilion on 29/5/2017.
 */
public class Property {
    private String name;
    private int calification;
    private String description;
    private Double amout;
    private String direccion;

    public Property(String name, int calification, String description, Double amout, String direccion) {
        this.name = name;
        this.calification = calification;
        this.description = description;
        this.amout = amout;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
}
