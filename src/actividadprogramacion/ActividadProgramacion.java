// sara victoria dominguez ulloa 
// robinson dominguez ulloa :D
// Hecho por sara (Hermanita pequeña)
package actividadprogramacion;

import static CONTROLADOR.Funciones.mostrarDetalle;
import static CONTROLADOR.Funciones.validacion;
import MODELO.Persona;

import java.util.Scanner;

public class ActividadProgramacion {

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
                               ********************************
                               """);
            int opc = validacion(1, 4, "¿Eliga una opcion. ");

            switch (opc) {
                case 1:
                    System.out.println("Bienvenido al registro de pacientes");
                    System.out.println("Porfavor Ingresa el nombre del paciente");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Porfavor Ingresa el numero de documento del paciente");
                    String numero_documento = new Scanner(System.in).nextLine();
                    System.out.println("Porfavor Ingresa la edad del paciente");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.println("Porfavor Ingresa el motivo de la cita");
                    String motivo = new Scanner(System.in).nextLine();
                    System.out.println("Porfavor Ingresa los telefonos separados por comas");
                    String telefono = new Scanner(System.in).nextLine();
                    String estado = "registrado";

                    System.out.println("""
                                       Seguro que quieres registrar este paciente?
                                       
                                       1. SI
                                       2. NO
                                       """);
                    int Opc_registrar = new Scanner(System.in).nextInt();

                    if (Opc_registrar == 1) {

                        if (p1 == null) {
                            p1 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                            System.out.println("Registro realizado con extido!!");
                        } else if (p2 == null) {
                            p2 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                            System.out.println("Registro realizado con extido!!");
                        } else if (p3 == null) {
                            p3 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                            System.out.println("Registro realizado con extido!!");
                        } else if (p4 == null) {
                            p4 = new Persona(nombre, numero_documento, edad, motivo, telefono, estado);
                            System.out.println("Registro realizado con extido!!");
                        } else {
                            System.out.println("Los cupos estan llenos.");
                        }
                    } else {
                        System.out.println("Registro terminado");
                    } continue;
                case 2:
                    System.out.println("*******************************");
                    System.out.println("PACIENTES REGISTRADOS");
                    System.out.println(p1 == null ? "1." : "1. " + p1.getNombre());
                    System.out.println(p2 == null ? "2." : "2. " + p2.getNombre());
                    System.out.println(p3 == null ? "3." : "3. " + p3.getNombre());
                    System.out.println(p4 == null ? "4." : "4. " + p4.getNombre());

                    int Opcion_persona = validacion(1, 4, "Eliga un paciete a ver sus detalles");

                    switch (Opcion_persona) {
                        case 1 ->
                            mostrarDetalle(p1);
                        case 2 ->
                            mostrarDetalle(p2);
                        case 3 ->
                            mostrarDetalle(p3);
                        case 4 ->
                            mostrarDetalle(p4);
                    }continue;
                case 3:
                    System.out.println("*******************************");
                    System.out.println("PACIENTES REGISTRADOS");
                    System.out.println(p1 == null ? "1." : "1. " + p1.getNombre());
                    System.out.println(p2 == null ? "2." : "2. " + p2.getNombre());
                    System.out.println(p3 == null ? "3." : "3. " + p3.getNombre());
                    System.out.println(p4 == null ? "4." : "4. " + p4.getNombre());

                    int Opcion_atender = validacion(1, 5, "Eliga un paciente o 5 para salir");
                    if (Opcion_atender == 1) {
                        if (p1 == null) {
                            System.out.println("Paciente no registrado.");
                        } else {
                            p1 = p2;
                            p2 = p3;
                            p3 = p4;
                            p4 = null;
                            System.out.println("La persona ya fue atendida");
                        }
                        continue;
                    } else if (Opcion_atender == 2) {
                        if (p2 == null) {
                            System.out.println("Paciente no registrado.");
                        } else {
                            p2 = p3;
                            p3 = p4;
                            p4 = null;
                            System.out.println("La persona ya fue atendida");
                        }
                        continue;
                    } else if (Opcion_atender == 3) {
                        if (p3 == null) {
                            System.out.println("Paciente no registrado.");
                        } else {
                            p3 = p4;
                            p4 = null;
                            System.out.println("La persona ya fue atendida");
                        }
                        continue;
                    } else if (Opcion_atender == 4) {
                        if (p4 == null) {
                            System.out.println("Paciente no registrado.");
                        } else {
                            p4 = null;
                            System.out.println("La persona ya fue atendida");
                        }
                        continue;
                    } else if (Opcion_atender == 5) {
                        continue;
                    }
                case 4:
                    boleanito = false;
            }
        }
    }
}            
