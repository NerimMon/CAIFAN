import java.util.Scanner;

public class LoginApp {
    // Definimos un usuario y contraseña predefinidos
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Inicio de Sesión ===");

        // Solicitar nombre de usuario
        System.out.print("Ingresa tu nombre de usuario: ");
        String inputUsername = scanner.nextLine();

        // Solicitar contraseña
        System.out.print("Ingresa tu contraseña: ");
        String inputPassword = scanner.nextLine();

        // Verificar las credenciales
        if (USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
        }

        scanner.close();
    }
}



