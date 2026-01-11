// sara victoria dominguez ulloa 
// robinson dominguez ulloa :D
// Hecho por sara (Hermanita pequeña)
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

    static String calcularEdad(int edad) {
        if (edad < 0) {
            return "Edad inválida";
        }

        if (edad < 18) {
            return "Menor de edad";
        } else {
            return "Mayor de edad";
        }
    }

    static void mostrarDetalle(Persona p) {
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
