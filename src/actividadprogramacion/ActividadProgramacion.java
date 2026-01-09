package actividadprogramacion;

import java.util.Scanner;

public class ActividadProgramacion {

    static int validacion(int valorminimo, int valormaximo, String mensaje) {
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

    static void mostrar_paciente(Persona p) {

    }

    public static void main(String[] args) {

        Persona p1 = null;
        Persona p2 = null;
        Persona p3 = null;
        Persona p4 = null;

        boolean boleanito = true;
        while (boleanito == true) {
            System.out.println("""
                               ********************************
                               MENU PRINCIPAL
                               1. Registrar Paciente
                               2. Mostrar pacientes registrados
                               3. Atender paciente
                               4. Salir
                               """);
            int opc = validacion(1, 4, "¿que desea hacer?");
            if (opc == 1) {
                System.out.println("ingrese el nombre del paciente");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("ingrese el numero de documento");
                double numero_documento = new Scanner(System.in).nextDouble();
                System.out.println("ingrese la edad del paciente");
                int edad = new Scanner(System.in).nextInt();
                System.out.println("ingrese el motivo");
                String motivo = new Scanner(System.in).nextLine();
                System.out.println("ingrese el telefono del paciente");
                String telefono = new Scanner(System.in).nextLine();
                System.out.println("ingrese el estado del paciente");
                String estado = new Scanner(System.in).nextLine();
                if (p1 == null) {
                    p1 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                } else if (p2 == null) {
                    p2 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                } else if (p3 == null) {
                    p3 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                } else if (p4 == null) {
                    p4 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                }
            } else if (opc == 2) {
                System.out.println("""
                               ********************************
                               PACIENTES
                               1. %s
                               2. %s
                               3. %s
                               4. %s
                               """.formatted(p1.getNombre(), p2.getNombre(), p3.getNombre(), p4.getNombre()));
                int opc2 = validacion(1, 4, "¿que desea hacer?");
                if (opc2 == 1) {
                    System.out.println("*******************************");
                    System.out.println("DETALLES PACIENTE");
                    System.out.println("Nombre: " + p1.getNombre());
                    System.out.println("ND: " + p1.getNumero_document());
                    System.out.println("edad: " + p1.getEdad());
                    System.out.println("Motivo: " + p1.getMotivo());
                    System.out.println("Telefono: " + p1.getTelefono());
                    System.out.println("Estado: " + p1.getEstado());
                } else if (opc2 == 2) {
                    System.out.println("*******************************");
                    System.out.println("DETALLES PACIENTE");
                    System.out.println("Nombre: " + p2.getNombre());
                    System.out.println("ND: " + p2.getNumero_document());
                    System.out.println("edad: " + p2.getEdad());
                    System.out.println("Motivo: " + p2.getMotivo());
                    System.out.println("Telefono: " + p2.getTelefono());
                    System.out.println("Estado: " + p2.getEstado());
                } else if (opc2 == 3) {
                    System.out.println("*******************************");
                    System.out.println("DETALLES PACIENTE");
                    System.out.println("Nombre: " + p3.getNombre());
                    System.out.println("ND: " + p3.getNumero_document());
                    System.out.println("edad: " + p3.getEdad());
                    System.out.println("Motivo: " + p3.getMotivo());
                    System.out.println("Telefono: " + p3.getTelefono());
                    System.out.println("Estado: " + p3.getEstado());
                } else if (opc2 == 4) {
                    System.out.println("*******************************");
                    System.out.println("DETALLES PACIENTE");
                    System.out.println("Nombre: " + p4.getNombre());
                    System.out.println("ND: " + p4.getNumero_document());
                    System.out.println("edad: " + p4.getEdad());
                    System.out.println("Motivo: " + p4.getMotivo());
                    System.out.println("Telefono: " + p4.getTelefono());
                    System.out.println("Estado: " + p4.getEstado());
                }
            } else if (opc == 3) {

            } else if (opc == 4) {

            }
            {

            }
        }
    }

}
