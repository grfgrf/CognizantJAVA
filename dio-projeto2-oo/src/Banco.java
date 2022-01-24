import java.util.HashSet;
import java.util.Set;
public class Banco {
//
//    private String nome = "Banco numero 1";
//
    private String nome;
    private Set<Conta> listaDeContas;


    public Banco(String nomebanco){
      this.nome = nomebanco;
      this.listaDeContas = new HashSet<>();
    }

    public void teste (Set<Conta> contass){
        for (Object elemento: contass) {
            System.out.println();
        }
    }
    public Set<Conta> getListaDeContas() {
        return listaDeContas;
    }

    public void setListaDeContas(Conta conta) {
        this.listaDeContas.add(conta);
    }



    public void imprimeContas(){
       System.out.println(this.nome + this.listaDeContas);
    }

//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getNome() {
        return this.nome;
    }

}
