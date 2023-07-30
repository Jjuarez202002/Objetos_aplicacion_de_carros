package com.mycompany.objetos_aplicacion_de_carros;

import java.util.Scanner;

public class Objetos_aplicacion_de_carros {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido ingresar los datos que se solicitan porfavor");

        System.out.print("Ingrese la cantidad de vehiculos: ");
        int numVehiculos = scanner.nextInt();

        Vehiculo[] vehiculos = new Vehiculo[numVehiculos];

        for (int i = 0; i < numVehiculos; i++) {
            System.out.print("Ingrese el nombre del vehículo " + (i + 1) + ": ");
            String nombreVehiculo = scanner.next();
            vehiculos[i] = new Vehiculo(nombreVehiculo);
            ingresarTiemposVuelta(scanner, vehiculos[i]);
        }

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nVelocidad promedio de " + vehiculo.getNombre() + ": " + vehiculo.calcularVelocidadPromedio() + " m/s");
        }

        scanner.close();
        System.out.println("\nGracias!");
    }

    private static void ingresarTiemposVuelta(Scanner scanner, Vehiculo vehiculo) {
        System.out.print("Ingrese la cantidad de vueltas recorridas por " + vehiculo.getNombre() + ": ");
        int numVueltas = scanner.nextInt();

        for (int i = 1; i <= numVueltas; i++) {
            System.out.print("Ingrese el tiempo en segundos de la vuelta #" + i + ": ");
            double tiempoVuelta = scanner.nextDouble();
            vehiculo.agregarTiempoVuelta(tiempoVuelta);
        }
    }
}       