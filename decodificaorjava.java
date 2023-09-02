import java.util.Scanner;

public class decodificaorjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mensaje cifrado: ");
        String MSG = scanner.nextLine();
        System.out.println("Ingrese la cantidad de espacios que se ha movido: ");
        int SP = scanner.nextInt();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < MSG.length(); i++) {
            char letra = MSG.charAt(i);
            boolean minuscula = (letra >= 'a' && letra <= 'z');
            boolean mayuscula = (letra >= 'A' && letra <= 'Z');
            if (!(minuscula || mayuscula)) {
                resultado.append(letra);
            } else {
                int ascii = (int) letra;
                int baseAscii = (int) 'a';
                if (mayuscula) {
                    baseAscii = (int) 'A';
                }
                int nuevoAscii = (ascii - baseAscii - SP + 26) % 26 + baseAscii;
                char nuevaLetra = (char) nuevoAscii;
                resultado.append(nuevaLetra);
            }
        }
        System.out.println("El mensaje descifrado es: " + resultado.toString());
    }
}
