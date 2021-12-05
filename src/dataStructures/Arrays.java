package dataStructures;

public class Arrays {

    public static void main(String[] args) {

        String[] alphabet = {"a","b","c","d"/*,"e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","v","w","v","x","y","z","q"*/};

        System.out.println("Old fashioned way:");
        for(int i = 0;i<4; i++){
            System.out.print(alphabet[i]+ "");
        }

        System.out.println("\n\nUsing length variable:");
        for(int n=0; n< alphabet.length; n++ ){
            System.out.print(alphabet[n] + "");
        }

        System.out.println("\n\nUsing the FOR-EACH method:");
        for(String letter : alphabet ){
            System.out.print(letter+ "");
        }

    }

}
