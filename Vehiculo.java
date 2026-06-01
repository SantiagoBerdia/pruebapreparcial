package Berdia.Santiago;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Garaje {
    private int capacidadDeGaraje;
    private List<Vehiculo> VehiculosEngaraje;

    public Garaje(int capacidadDeGaraje) {
        VehiculosEngaraje = new ArrayList<>();
        this.capacidadDeGaraje = capacidadDeGaraje;
    }
    public Garaje() {
        this(3);
    }
    public void añadirVehiculo(Vehiculo v1){
        verificarSiEntraVehiculo();
        Objects.requireNonNull(v1);
        //verificarSiElAutoEstaEngaraje(v1);
        if(!(sonIguales(v1))){
        VehiculosEngaraje.add(v1);}
        else{
            System.out.println("El auto ya se encuentra en el garaje");
        }
    }
    
    private void verificarSiEntraVehiculo(){
        if (VehiculosEngaraje.size() == capacidadDeGaraje){
            throw new ArrayIndexOutOfBoundsException("No se puede superar la capacidad del garaje");
        }
    }
    /*private void verificarSiElAutoEstaEngaraje(Vehiculo v1){
    if(!(sonIguales(v1))){
    throw new IllegalArgumentException("no pueden haber autos repetidos");
    }}*/
    public boolean sonIguales(Vehiculo v1){
        return VehiculosEngaraje.contains(v1);
    }
    
public double getPrecioDeAutos(){
    double precioAutos = 0;
    for (Vehiculo v1 : VehiculosEngaraje){
        if (v1 instanceof Auto a){
            precioAutos += a.getPrecio();
        }
    }
    return precioAutos;
} 
public double getPrecioDeMotos(){
    double precioMotos = 0;
    for (Vehiculo v1 : VehiculosEngaraje){
        if (v1 instanceof Moto m){
            precioMotos += m.getPrecio();
        }
    }
    return precioMotos;
}
public double getPrecioTotal(){
    double precioTotal = 0;
    for (Vehiculo v1 : VehiculosEngaraje){
        precioTotal += v1.getPrecio();
    }
    return precioTotal;
}
//+ mostrar(Garaje) : String

    public static String mostrar (Garaje g){
     StringBuilder sb = new StringBuilder();
     for (Vehiculo v : g.VehiculosEngaraje){
     sb.append(v.toString());
     sb.append(System.lineSeparator());
     }
        return sb.toString();
     }
    public int cantidadAutos(){
        return VehiculosEngaraje.size();
    }
    
    }
    

