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

public enum AnimalType {
    
    MOLLUSQUE,
    INSECTE,
    POISSON,
    AMPHIBIEN,
    OISEAU,
    MAMMIFÈRE,

}
class AnimalsofQuebec {
public static ArrayList vulnerableAnimals() {
        // HashMap des animaux vunérables
        ArrayList<HashMap<String, String>> vulnerable = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> mollusc = new HashMap<String, String>();
		HashMap<String, String> insect = new HashMap<String, String>();
		insect.put("Coccinelle à deux points", "Adalia bipunctata");
		HashMap<String, String> fish = new HashMap<String, String>();
        fish.put("Alose savoureuse", "Alosa sapidissima");
        fish.put("Brochet vermiculé", "Esox americanus vermiculatus");
        fish.put("Chat-fou des rapides", "Noturus flavus");
        fish.put("Chevalier de rivière", "Moxostoma carinatum");
        fish.put("Éperlan arc-en-ciel", "Osmerus mordax");
        fish.put("Fouille-roche gris", "Percina copelandi");
        fish.put("Mené d'herbe", "Notropis bifrenatus");
        fish.put("Omble chevalier oquassa", "Salvelinus alpinus oquassa");
        HashMap<String, String> amphibian = new HashMap<String, String>();
        amphibian.put("Salamandre pourpre", "Gyrinophilus porphyriticus");
        HashMap<String, String> reptile = new HashMap<String, String>();
        reptile.put("Tortue des bois", "Glyptemys insculpta");
        reptile.put("Tortue géographique", "Graptemys geographica");
        reptile.put("Couleuvre d'eau du Nord", "Nerodia sipedon sipedon");
        reptile.put("Couleuvre tachetéé", "Lampropeltis triangulum");
        HashMap<String, String> bird = new HashMap<String, String>();
        bird.put("Aigle royal", "Aquila chrysaetos");
        bird.put("Arlequin plongeur", " Histrionicus histrionicus");
        bird.put("Engoulevent bois-pourris", "Antrostomus vociferus");
        bird.put("Faucon pèlerin anatum", "Falco peregrinus anatum");
        bird.put("Garrot d'Islande", "Bucephala islandica");
        bird.put("Goglu des prés", "Dolichonyx oryzivorus");
        bird.put("Grive de Bicknell", "Catharus bicknelli");
        bird.put("Moucherolle à cotés olive", "Contopus cooperi");
        bird.put("Petit blongios", "Ixobrychus exilis");
        bird.put("Pygargue à tete blanche", "Haliaeetus leucocephalus");
        HashMap<String, String> mammal = new HashMap<String, String>();
        mammal.put("Caribou des bois, écotype forestier", "Rangifer tarandus caribou");
        mammal.put("Chauve-souris rousse de l'Est", "Lasiurus borealis");
        mammal.put("Ours blanc", "Ursus maritimus");
        mammal.put("Rorqual commun", "Balaenoptera physalus");
        vulnerable.add(mollusc);
        vulnerable.add(insect);
        vulnerable.add(fish);
        vulnerable.add(amphibian);
        vulnerable.add(reptile);
        vulnerable.add(bird);
        vulnerable.add(mammal);
        return vulnerable;
	}
	public static ArrayList threatenedAnimals() { 
        // HashMap des animaux menacés
        ArrayList<HashMap<String, String>> threatened = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> mollusc = new HashMap<String, String>();
        mollusc.put("Anodonte du gaspareau", "Utterbackiana implicata");
        mollusc.put("Obovarie olivatre", "Obovaria olivaria");
        HashMap<String, String> insect = new HashMap<String, String>();
        insect.put("Bourdon à tache rousse", "Bombus affinis");
        insect.put("Coccinelle à neuf points", "Coccinella novemnotata");
        insect.put("Cuivré des marais salés", "Lycaena dospassosi");
        insect.put("Satyre fauve des Maritimes", "Coenonympha nipisiquit");
        HashMap<String, String> fish = new HashMap<String, String>();
        fish.put("Chabot de profondeur", "Myoxocephalus thompsonii");
        fish.put("Chevalier cuivré", "Moxostoma hubbsi");
        fish.put("Cisco de printemps", "Coregonus artedi");
        fish.put("Dard de sable", "Ammocrypta pellucida");
        fish.put("Lamproie du Nord", "Ichthyomyzon fossor");
        fish.put("Raie tachetée", "Leucoraja ocellata");
        HashMap<String, String> amphibian = new HashMap<String, String>();
        amphibian.put("Rainette faux-grillon de l'Ouest", "Pseudacris triseriata");
        amphibian.put("Salamandre sombre des montagnes", "Desmognathus ochrophaeus");
        HashMap<String, String> reptile = new HashMap<String, String>();
        reptile.put("Tortue luth", "Dermochelys coriacea");
        reptile.put("Tortue mouchetée", "Emydoidea blandingii");
        reptile.put("Tortue musquéé", "Sternotherus odoratus");
        reptile.put("Tortue-molle à épines", "Apalone spinifera");
        reptile.put("Couleuvre brune", "Storeria dekayi");
        HashMap<String, String> bird = new HashMap<String, String>();
        bird.put("Bécasseau maubèche rufa", "Calidris canutus rufa");
        bird.put("Bruant sauterelle pratensis", "Ammodramus savannarum pratensis");
        bird.put("Grèbe esclavon", "Podiceps auritus");
        bird.put("Martinet ramoneur", "Chaetura pelagica");
        bird.put("Paruline à ailes dorées", "Vermivora chrysoptera");
        bird.put("Paruline azurée", "Septophaga cerulea");
        bird.put("Pic à tete rouge", "Melanerpes erythrocephalus");
        bird.put("Pie-grièche migratrice", "Lanius ludovicianus");
        bird.put("Pluvier siffleur melodus", "Charadrius melodus melodus");
        bird.put("Rale jaune", "Coturnicops noveboracensis");
        bird.put("Sterne caspienne", "Hydroprogne caspia");
        bird.put("Sterne de Dougall", "Sterna dougallii");
        HashMap<String, String> mammal = new HashMap<String, String>();
        mammal.put("Béluga", "Delphinapterus leucas");
        mammal.put("Carcajou", "Gulo Gulo");
        mammal.put("Caribou des bois, écotype montagnard", "Rangifer tarandus caribou");
        mammal.put("Chauve-souris nordique", "Myotis septentrionalis");
        mammal.put("Petite chauve-souris brune", "Myotis lucifugus");
        mammal.put("Pipistrelle de l'Est", "Perimyotis subflavus");

        threatened.add(mollusc);
        threatened.add(insect);
        threatened.add(fish);
        threatened.add(amphibian);
        threatened.add(reptile);
        threatened.add(bird);
        threatened.add(mammal);
        return threatened;
    }

	
}
}

