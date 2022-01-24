public class ContaCorrente extends Conta {


    @Override
    public void extrato() {
        System.out.println("Extrato CC");
        super.imprimirInfos();
    }
    //atualiza lista banco
}
