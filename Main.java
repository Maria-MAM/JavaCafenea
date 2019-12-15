
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cafenea cafeneaua = Cafenea.getInstance();
        Scanner scanner = new Scanner(System.in); 
        
        while (true) {
            System.out.println("Ce comenzi doriti sa executati?");
            System.out.println("1. ADD<tip><nume><pret><inf>");
            System.out.println("2. AFIS");
            System.out.println("3. AFIS_CAFELE");
            System.out.println("4. STERGE<nume>");
            System.out.println("5. SORT_PRET");
            System.out.println("6. SORT_NUME");
            System.out.println("7. EXIT");
            String line = scanner.nextLine();
            String[] input = line.split("\\s+");
            
            switch(input[0].toUpperCase()) {
                case "ADD":
                    cafeneaua.adaugaBautura(input[1], input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]));
                    System.out.println("Adaugare reusita!");
                    break;
                case "AFIS":
                    cafeneaua.afiseazaBauturi();
                    System.out.println("Afisare reusita!");
                    break;
                case "AFIS_CAFELE":
                    cafeneaua.afiseazaCafele();
                    System.out.println("Afisare cafele reusita!");
                    break;
                case "STERGE":
                    cafeneaua.stergeBautura(input[1]);
                    System.out.println("Stergere bautura reusita!");
                    cafeneaua.afiseazaBauturi(); 
                    break;
                case "SORT_PRET":
                    cafeneaua.afiseazaSortatPret();  
                    cafeneaua.afiseazaBauturi(); 
                    break;
                case "SORT_NUME":
                    cafeneaua.afiseazaSortatNume();  
                    cafeneaua.afiseazaBauturi(); 
                    break;
                case "EXIT":
                    System.exit(0); 
                    break;
            }
        }
        
        
    }
    
}