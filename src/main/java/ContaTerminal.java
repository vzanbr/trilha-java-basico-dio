import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args)  {

            Scanner usuario = new Scanner(System.in);

            int numero;
            String agencia = GerarAgencia.gerarAgencia();
            String nomeCliente;
            BigDecimal saldo;

            System.out.println("=========================");
            System.out.println("Bem Vindo ao Banco Dio");
            System.out.println("=========================");

            System.out.println("\n Digite seu nome: ");
            nomeCliente = usuario.next();

            System.out.println("Digite numero da sua Conta: ");
            numero = usuario.nextInt();

            System.out.println("Digite o saldo");
            saldo = usuario.nextBigDecimal();

            System.out.println("\n" +"===============================");
            System.out.println(nomeCliente);
            System.out.println(agencia);
            System.out.println(numero);
            System.out.println(saldo);
            System.out.println("===============================");
            System.out.println("Olá " + nomeCliente  + " obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        }

    }




