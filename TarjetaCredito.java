/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author USUARIO 2022
 */
    // Subclase que representa el pago con tarjeta de crédito
 class TarjetaCredito extends MetodoPago {
    @Override
    void procesarPago(double cantidad) {
        System.out.println("Procesando un pago de " + cantidad + " con tarjeta de credito");
    }
}
