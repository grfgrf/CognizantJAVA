package me.dio;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        float f = 9.999_999F;
        double d = 9.0D;
        final int OI_OI = 0;
        //AreasQuadrilateros oi = new AreasQuadrilateros();
        List<String> listaString = List.of("oi", "tchau");
        ArrayList<Integer> listaVetorInt = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> listaIntExercicios = List.of(5,5,3,3,1,999,998);
        List<String> listaStrStream = Stream.of("oiS", "tchauS").collect(Collectors.toList());
        int a[] = {1, 2, 3, 4, 5, 6}; //anotacao
//        Arrays.stream(a).forEach(System.out::println);
//        IntStream.of(a).forEach(System.out::println);
//        Collections.reverse(listaVetorInt);
//        System.out.println(Arrays.toString(listaVetorInt.toArray()));

//        System.out.println(oi.area(d));
//        System.out.println(oi.area(d,d+1,d+5));
//        System.out.println(oi.area(d,d+1));

//        DesenhaDesafio2 desenho = new DesenhaDesafio2();
//        desenho.desenhaCompleto();
          //desafio3();
        System.out.println("Lista Original");
        System.out.println(Arrays.toString(listaIntExercicios.toArray()));
          ExerciciosStream.ex1();
          ExerciciosStream.ex2();
          ExerciciosStream.ex3();
          ExerciciosStream.ex4();
          ExerciciosStream.ex5();
          ExerciciosStream.ex6();
          ExerciciosStream.ex7();




    }

    public class ExerciciosStream{
        static List<String> listaString = List.of("oi", "tchau","ciao");
        static List<Integer> listaInt = List.of(5,5,3,3,1,999,998);


        public static void ex1(){
            System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
            System.out.println(listaInt.stream().skip(2).collect(Collectors.toList()));
        }
        public static void ex2(){
            System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");

            System.out.println(listaInt.stream()
                                       .filter(x -> Collections.frequency(listaInt, x) < 2)
                                       .count());
        }

        public static void ex3(){
        System.out.println("Mostre o menor valor da lista: ");
        System.out.println(listaInt.stream().reduce(Math::min).get());
        }

        public static void ex4(){
            System.out.println("Mostre o maior valor da lista: ");
            System.out.println(listaInt.stream().reduce(Math::max).get());
        }


        public static void ex5(){
            System.out.println("Pegue apenas os números ímpares e some: ");
            System.out.println(listaInt.stream().filter(x -> x % 2 != 0).reduce(Math::addExact).get());
        }


        public static void ex6(){
            System.out.println("Mostre a lista na ordem númerica: ");
            System.out.println(listaInt.stream().sorted().collect(Collectors.toList()));
        }

        public static void ex7(){
            System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
            Map<Object, List<Integer>> oi = listaInt.stream().collect(Collectors.groupingBy(x -> (x % 3 == 0 || x % 5 == 0)));
            System.out.println(oi.get(true));

        }
    }





    public static void desafio3(){
        Map<String, Integer> mapResultado =  new HashMap<>();
        mapResultado.put("par",0);
        mapResultado.put("impar",0);
        mapResultado.put("positivo",0);
        mapResultado.put("negativo",0);


        for (int i = 0; i < 5; i++) {
            Scanner leitor = new Scanner(System.in);
            int valorDigitado = Integer.parseInt(leitor.nextLine());

            if(valorDigitado > 0){ //descarta zeros
                mapResultado.replace("positivo",mapResultado.get("positivo")+1);
            }
            else if (valorDigitado < 0){
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



    public static class DesenhaDesafio2{
        public  void desenhaHorizontal(){
            for (int i = 0; i < 39 ; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        public  void desenhaVertical(){
            for (int i = 0; i < 39 ; i++) {
                if( i == 0 || i == 38 ){
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        public  void desenhaCompleto(){
            desenhaHorizontal();
            for (int i = 0; i <5; i++) {
                desenhaVertical();
            }
            desenhaHorizontal();
        }

    }

}

