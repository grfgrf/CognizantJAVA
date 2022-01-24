public class Main {
	public static void main(String[] args) {
        DesenhaDesafio2 desenho = new DesenhaDesafio2();
        desenho.desenhaCompleto();        
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
                if(i==0 || i==38){
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