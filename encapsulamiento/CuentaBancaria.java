/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author juang
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    // Métodos Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }
}
