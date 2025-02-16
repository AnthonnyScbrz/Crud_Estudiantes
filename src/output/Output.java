package output;

public class Output {

    public static void showMenu(){
        System.out.print("""
                
                ***********************************************************
                ******** << Bienvenido al Gestor del Estudiante >> ********
                ***********************************************************
                
                1) Dar de alta a un estudiante
                2) Dar de baja a un estudiante
                3) Modificar nota del estudiante
                4) Mostrar relación de estudiantes
                
                """);
    }
    public static void valueRequest(){
        System.out.println("Ingrese el número de operación a realizar: ");
    }
    public static void fullNameRequest(){
        System.out.println("Ingrese el nombre completo del estudiante: ");
    }
    public static void AgeRequest(){
        System.out.println("Ingrese la edad del estudiante: ");
    }
    public static void birthdayRequest(){
        System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
    }
    public static void curseRequest(){
        System.out.println("Ingrese la asignatura del estudiante: ");
    }
    public static void ScoreRecuest(){
        System.out.println("Ingrese la nota de la asignatura del estudiante: ");
    }
    public static void  confirmationMessage(){
        System.out.println("La información ha sido correctamente guardada!! >,< ");
    }
}
