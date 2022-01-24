import java.util.*;

public class Main {

    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco primeiro");
        Banco banco2 = new Banco("Banco segundo");
        Conta conta1CC = new ContaCorrente();
        //conta1CC.depositar(50);
        Conta conta1P = new ContaPoupanca();

        conta1P.extrato();
        conta1CC.extrato();

          banco1.setListaDeContas(conta1CC);
          banco1.setListaDeContas(conta1CC);
          banco1.setListaDeContas(conta1P);
          banco2.setListaDeContas(conta1P);
          banco1.imprimeContas();
          banco2.imprimeContas();

        banco1.teste(banco1.getListaDeContas());
    }
}
