public class ContaPoupanca extends Conta {


    @Override
    public void extrato() {
        System.out.println("Extrato Poupanca");
        super.imprimirInfos();
    }

//atualiza lista banco
}
