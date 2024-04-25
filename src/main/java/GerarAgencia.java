import java.util.Random;

public class GerarAgencia {

    private static final String [] PREFIXO_AGENCIA =
            {"562-", "562-", "562-"};
    public static String gerarAgencia() {
        Random random = new Random();

        int indicePrefixo = random.nextInt(PREFIXO_AGENCIA.length);
        String prefixo = PREFIXO_AGENCIA[indicePrefixo];

        StringBuilder gerarAgencia = new StringBuilder(prefixo);
        for (int i = 0; i < 1; i++) {
            gerarAgencia.append(random.nextInt(7 ));
        }
        return gerarAgencia.toString();
    }
}
