package org.example.modelos;

public class Local {
    private int id;
    private String nit;
    private String nombre;
    private int ubicacion;
    private String descripcion;

    public Local() {
    }

    public Local(int id, String nit, String nombre, int ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local " +
                "id: " + id +
                ", nit: '" + nit + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", ubicacion: " + ubicacion +
                ", descripcion: '" + descripcion + '\'' +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
