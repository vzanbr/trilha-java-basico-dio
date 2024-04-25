import java.util.Random;

public class GerarAgencia {
    public static String gerarAgencia() {
        Random random = new Random();

        StringBuilder gerarAgencia = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            gerarAgencia.append(random.nextInt(7));
        }
        return gerarAgencia.toString();
    }
}
