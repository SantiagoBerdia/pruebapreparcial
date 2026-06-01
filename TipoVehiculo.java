package Berdia.Santiago;

import java.util.Objects;


public class Auto extends Vehiculo {
    private int cantidadPuertas;
    private TipoAuto tipoAuto;
    public Auto(Persona propietario, String marca, String modelo, double precio, int cantidadPuertas, TipoAuto tipoAuto) {
        super(propietario, marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
       this.tipoAuto = tipoAuto; }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(getClass() == obj.getClass())) {
            return false;
        }
        Auto a = (Auto) obj;
        return cantidadPuertas == a.cantidadPuertas;
}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidadPuertas);
    }

    @Override
    public String toString() {
        return super.toString() + "tiene " + cantidadPuertas;
    }
    
}
