package CONTROLADOR;

import MODELO.Persona;
import java.util.Scanner;

public class Funciones {
    
    public static int validacion(int valorminimo, int valormaximo, String mensaje) {
        boolean validar = false;
        int opc = 0;
        do {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextInt();
                while (opc < valorminimo || opc > valormaximo) {
                    System.out.println("no valido, intente de nuevo.");
                    opc = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("error, elija una opcion valida");
            }
        } while (validar == false);
        return opc;
    }

    public static String calcularEdad(int edad) {
        if (edad < 0) {
            return "Edad inválida";
        }

        if (edad < 18) {
            return "Menor de edad";
        } else {
            return "Mayor de edad";
        }
    }

    public static void mostrarDetalle(Persona p) {
        if (p == null) {
            System.out.println("Paciente no registrado.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("Detalle del paciente ");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("ND: " + p.getNumero_document());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Motivo: " + p.getMotivo());
        String[] telefonos = p.getTelefono().split(",");
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println("Teléfono " + (i + 1) + ": " + telefonos[i]);
        }
        System.out.println("Tipo de paciente: " + calcularEdad(p.getEdad()));
        System.out.println("Estado: " + p.getEstado());
    }
    
}
