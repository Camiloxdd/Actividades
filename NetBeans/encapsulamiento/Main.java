/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author juang
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789", "Juan Lopez", 1000);

        // Imprimir los detalles de la cuenta
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Titular: " + cuenta.getNombreTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());

        // Depositar dinero
        cuenta.depositar(800);
        System.out.println("Saldo despues del deposito: " + cuenta.getSaldo());

        // Retirar dinero
        cuenta.retirar(400);
        System.out.println("Saldo despues del retiro: " + cuenta.getSaldo());

        // Cambiar el nombre del titular
        cuenta.setNombreTitular("Juan D. Lopez");
        System.out.println("Nuevo titular: " + cuenta.getNombreTitular());
    }
}

