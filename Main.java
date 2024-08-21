/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author USUARIO 2022
 */
public class Main {
    public static void main(String[] args) {
        // Creación de objetos de las subclases
        MetodoPago miMetodoPago = new MetodoPago();
        MetodoPago miTarjetaCredito = new TarjetaCredito();
        MetodoPago miPayPal = new PayPal();
        MetodoPago miEfectivo = new Efectivo();
        
        // Llamada al método procesarPago() en cada objeto
        miMetodoPago.procesarPago(100);      // Salida: Procesando un pago genérico de 100
        miTarjetaCredito.procesarPago(100);  // Salida: Procesando un pago de 100 con tarjeta de crédito
        miPayPal.procesarPago(100);          // Salida: Procesando un pago de 100 con PayPal
        miEfectivo.procesarPago(100);        // Salida: Procesando un pago de 100 en efectivo
    }
}
