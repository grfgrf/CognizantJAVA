import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapResultado =  new HashMap<>();
        mapResultado.put("par",0);
        mapResultado.put("impar",0);
        mapResultado.put("positivo",0);
        mapResultado.put("negativo",0);
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
          int valorDigitado = Integer.parseInt(leitor.nextLine());
            if(valorDigitado > 0){
                mapResultado.replace("positivo",mapResultado.get("positivo")+1);
            }
            else if (valorDigitado < 0){ //ignora zeros
                mapResultado.replace("negativo",mapResultado.get("negativo")+1);
            }

            if(valorDigitado % 2 == 0){
                mapResultado.replace("par",mapResultado.get("par")+1);
            }
            else {
                mapResultado.replace("impar",mapResultado.get("impar")+1);
            }
        }
        System.out.println(mapResultado.get("par") + " par(es)");
        System.out.println(mapResultado.get("impar") + " impar(es)");
        System.out.println(mapResultado.get("positivo") + " positivo(s)");
        System.out.println(mapResultado.get("negativo") + " negativo(s)");       
    }
} 