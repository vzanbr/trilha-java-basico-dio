import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args)  {

            Scanner usuario = new Scanner(System.in);

            int numero;
            String agencencia = GerarAgencia.gerarAgencia();
            String nomeCliente;
            BigDecimal saldo;

            System.out.println("=========================");
            System.out.println("Bem Vindo ao Banco Dio");
            System.out.println("=========================");

            System.out.println("\n Digite seu nome: ");
            usuario.next();

        }

    }




