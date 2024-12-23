import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        AnimalsofQuebec animals = new AnimalsofQuebec();
        ArrayList<HashMap<String, String>> vulnerable = new animals.vulnerableAnimals();
        String erreur = "Erreur. Veuillez recommencer";

        try {
            for (int i = 0; i<vulnerable.size(); i++ ) {
                
            }
            AnimalType[] animalClass = AnimalType.values();
            for (int i = 0; i<animalClass.length; i++) {
                System.out.println(i + " " + animalClass [i]);            
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Veuiller entrer le numéro associer à la classe que vous voulez rechercher");
            int userInput = keyboard.nextInt();
                
            double enumLenght = animalClass.length;
            if (userInput <= enumLenght && userInput >= 0) {
        
            } else {
                System.out.println("Erreur");
                
        } 
       
        
        } catch (Exception e) {
            System.out.println(erreur);
        }
    
}
}
