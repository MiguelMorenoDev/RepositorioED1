/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anttarea6ed;

/**
 *
 * @author Con los cambios en el repositorio
 */
public class CalculoTotalCarrito {
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
   
    
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
               double descuento1= 0.8;
               Total = precioProducto * descuento1;
            
        }else {
               double descuento2 = 0.95;
               Total = precioProducto * descuento2;
        }   
  System.out.println("El total a pagar es:"+Total + "\n" + "Enviado");
  
    }
}

