
public class App {

    public static void filter() {

    }

    public static void main(String args[]) {
        String erreur = "Erreur. Veuillez recommencer";
        AnimalsofQuebec animal = new AnimalsofQuebec();
        
        try {
            AnimalType[] animalClass = AnimalType.values();
            for (int i = 0; i<animalClass.length; i++) {
                System.out.println(i + " " + animalClass [i]);            
            }
            animal.animals();
            
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
public class Animal {
    private String animalName;
    private String latinName;
    private String animalClass;
    private String order;
    private String family;
    private boolean threatened;

   public Animal () {
    
   }

    public Animal(String animalName, String latinName, String animalClass, String order, String family, boolean threatened) {
        this.animalName = animalName;
        this.latinName = latinName;
        this.animalClass = animalClass;
        this.order = order;
        this.family = family;
        this.threatened = threatened;
    }

    void display() {
        System.out.println(animalName);
    }
    void filterMollusc() {
       if (animalClass.equals("Bivalve")) {
        display();
       }
    }
    void filterInsect() {
        if (animalClass.equals("Insecte")) {
            display();
        }
    }
    void filterFish() {
        if (animalClass.equals("")) {
            display();
        }
    }
    void filterAmphibi() {
        if (animalClass.equals("Mammifère")) {
            display();
        }
    }
    void filterBird() {
        if (animalClass.equals("Aves")) {
            display();
        }
    }

    void filterMammal() {
        if (animalClass.equals("Mammifère")) {
            display();
        }
    }

}

import java.util.Scanner;

class AnimalsofQuebec {

    public AnimalsofQuebec() {
    }
    public static void animals() {
        Animal [] animals = {
            new Animal("Anodonte du gaspareau", "Utterbackiana implicata", "Bivalve", null, null, true),
            new Animal("Obovarie olivatre", "Obovaria olivaria", "Bivalve", null, null, true),

            new Animal("Coccinelle à deux points", "Adalia bipunctata", "Insecte","Colleoptère", "Coccinellidae", false ),
            new Animal("Bourdon à tache rousse", "Bombus affinis", "Insecte", "Hymenoptère", "Apidae", true),      
            new Animal("Coccinelle à neuf points", "Coccinella novemnotata", "Insecte", "Coleoptère", "Coccinellidae", true),
            new Animal("Cuivré des marais salés", "Lycaena dospassosi", "Insecte", "Lepidoptère", "Lycaenidae", true),
            new Animal("Satyre fauve des Maritimes", "Coenonympha nipisiquit", "Insecte", "Lepidoptère", "Nymphalidae", true),

            new Animal("Alose savoureuse", "Alosa sapidissima", "Actinopterygii", "Clupeiforme", "Clupeidae", false),
            new Animal("Brochet vermiculé", "Esox americanus vermiculatus", "Actinopterygii", "Esociforme", "Esocidae", false),
            new Animal("Chat-fou des rapides", "Noturus flavus", "Actinopterygii", "Siluriforme", "Ictaluridae", false),
            new Animal("Chevalier de rivière", "Moxostoma carinatum", "Actinopterygii", "Cypriniforme", "Catostomidae", false),
            new Animal("Éperlan arc-en-ciel", "Osmerus mordax", "Actinopterygii", "Osmeroidei", "Osmeridae", false),
            new Animal("Fouille-roche gris", "Percina copelandi", "Teleostei", "Perciforme", "Percidae", false),
            new Animal("Mené d'herbe", "Notropis bifrenatus", "Actinopterygii", "Cypriniforme", "Cyprinidae", false),
            new Animal("Omble chevalier oquassa", "Salvelinus alpinus oquassa", "Actinopterygii", "Salmoniforme", "Salmonidae", false),
            new Animal("Chabot de profondeur", "Myoxocephalus thompsonii", "Actinopterygii", "Perciforme", "Cottidae", true),
            new Animal("Chevalier cuivré", "Moxostoma hubbsi", "Actinopterygii", "Cypriniforme", "Catostomidae", true),
            new Animal("Cisco de printemps", "Coregonus artedi", "Teleostei", "Salmoniforme", "Salmonidae", true),
            new Animal("Dard de sable", "Ammocrypta pellucida", "Actinopterygii", "Perciforme", "Percidae", true),
            new Animal("Lamproie du Nord", "Ichthyomyzon fossor", "Cephalaspidomorphi", "Petromyzontiforme", "Petromyzontidae", true),
            new Animal("Raie tachetée", "Leucoraja ocellata", "Elasmobranchii", "Rajiforme", "Rajidae", true),

            new Animal("Salamandre pourpre","Gyrinophilus porphyriticus","Amphibien","Caudata","Plethodontidae", false),
            new Animal("Rainette faux-grillon de l'Ouest","Pseudacris triseriata","Amphibien","Anura","Hylidae", true),
            new Animal("Salamandre sombre des montagnes","Desmognathus ochrophaeus","Amphibien","Caudata","Plethodontidae", true),

            new Animal("Tortue des bois","Glyptemys insculpta","Reptile","Testudine","Emydidae", false),
            new Animal("Tortue géographique","Graptemys geographica","Reptile","Testudine","Emydidae", false),
            new Animal("Couleuvre d'eau du Nord","Nerodia sipedon sipedon","Reptile","Squamata","Natrcidae", false),
            new Animal("Couleuvre tachetéé","Lampropeltis triangulum","Reptile","Squamata","Colubrinae", false),
            new Animal("Tortue luth","Dermochelys coriacea","Reptile","Testudine","Dermochelydae", true),
            new Animal("Tortue mouchetée","Emydoidea blandingii","Reptile","Testudine","Emydidae", true),
            new Animal("Tortue musquée","Sternotherus odoratus","Reptile","Testudine","Kinosternidae", true),
            new Animal("Tortue molle à épines","Apalone spinifera","Reptile","Testudine","Trionychidae", true),
            new Animal("Couleuvre brune","Storeria dekayi","Reptile","Squamata","Natricidae", true),

            new Animal("Aigle royal","Aquila chrysaetos","Aves","Accipitriforme","Accipitridae", false),
            new Animal("Arlequin plongeur","Histrionicus histrionicus","Aves","Anseriforme","Anatidae", false),
            new Animal("Engoulevent bois-pourris","Antrostomus vociferus","Aves","Caprimulgiform","Caprimulgidae", false),
            new Animal("Faucon pèlerin anatum","Falco peregrinus anatum","Aves","Falconiforme","Falconidae", false),
            new Animal("Garrot d'Islande","Bucephala islandica","Aves","Anseriforme","Anatidae", false),
            new Animal("Goglu des prés","Dolichonyx oryzivorus","Aves","Passeriforme","Icteridae", false),
            new Animal("Grive de Bicknell","Catharus bicknelli","Aves","Passeriforme","Turdidae", false),
            new Animal("Moucherolle à cotés olive","Contopus cooperi","Aves","Passeriforme","Tyrannidae", false),
            new Animal("Petit blongios","Ixobrychus exilis","Aves","Pelecaniforme","Ardeidae", false),
            new Animal("Pygargue à tete blanche","Haliaeetus leucocephalus","Aves","Accipitriforme","Accipitridae", false),
            new Animal("Bécasseau maubèche rufa","Calidris canutus rufa","Aves","Charadriiforme","Scolopacidae", true),
            new Animal("Bruant sauterelle pratensis","Ammodramus savannarum pratensis","Aves","Passeriforme","Passerellidae", true),
            new Animal("Grèbe esclavon","Podiceps auritus","Aves","Podicipediforme","Podicipedidae", true),
            new Animal("Martinet ramoneur","Chaetura pelagica","Aves","Apodiforme","Apodidae", true),
            new Animal("Paruline à ailes dorées","Vermivora chrysoptera","Aves","Passeriforme","Parulidae", true),
            new Animal("Paruline azurée","Septophaga cerulea","Aves","Passeriforme","Parulidae", true),
            new Animal("Pic à tete rouge","Melanerpes erythrocephalus","Aves","Piciforme","Picidae", true),
            new Animal("Pie-grièche migratrice","Lanius ludovicianus","Aves","Passeriforme","Laniidae", true),
            new Animal("Pluvier siffleur melodus","Charadrius melodus melodus","Aves","Charadriiforme","Charadriidae", true),
            new Animal("Rale jaune","Coturnicops noveboracensis","Aves","Gruiforme","Rallidae", true),
            new Animal("Sterne caspienne","Hydroprogne caspia","Aves","Charadriiform","Laridae", true),
            new Animal("Sterne de Dougall","Sterna dougallii","Aves","Charadriiform","Laridae", true),

            new Animal("Caribou des bois, écotype forestier","Rangifer tarandus caribou","Mammifère","Artiodactyla","Cervidae", false),
            new Animal("Chauve-souris rousse de l'Est","Lasiurus borealis","Mammifère","Chiropetera","Vespertilionidae", false),
            new Animal("Ours blanc","Ursus maritimus","Mammifère","Carnivora","Ursidae", false),
            new Animal("Rorqual commun","Balaenoptera physalus","Mammifère","Cetacea","Balaenopteridae", false),
            new Animal("Béluga","Delphinapterus leucas","Mammifère","Cetacea","Monodontidae", true),
            new Animal("Carcajou","Gulo Gulo","Mammifère","Carnivora","Mustelidae", true),
            new Animal("Caribou des bois, écotype montagnard","Rangifer tarandus caribou","Mammifère","Artiodactyla","Cervidae", true),
            new Animal("Chauve-souris nordique","Myotis septentrionalis","Mammifère","Chiroptera","Vespertilionidae", true),
            new Animal("Petite chauve-souris brune","Myotis lucifugus","Mammifère","Chiroptera","Vespertilionidae", true),
            new Animal("Pipistrelle de l'Est","Perimyotis subflavus","Mammifère","Chiroptera","Vespertilionidae", true),            
        };  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Veuiller entrer le numéro associer au type d'animal que vous voulez rechercher");
        int userInput = keyboard.nextInt();
        AnimalType[] animalClass = AnimalType.values();
        int enumLenght = animalClass.length;
        int i = 0;
        if (userInput <= enumLenght && userInput >= 0) {
                switch (userInput) {
                    case 0: 
                        System.out.println("Voici les mollusques: ");
                        for (Animal a : animals) {
                            a.filterMollusc();
                        }
                        break;
                    case 1:
                        System.out.println("Voici les insectes: ");
                        for (Animal a : animals) {
                            a.filterInsect();
                        }
                        break;
                    case 2:
                    System.out.println("Voici les poissons: ");
                    for (Animal a : animals) {
                        a.filterFish();
                    }
                        break;
                    case 3:
                    System.out.println("Voici les amphibiens: ");
                    for (Animal a : animals) {
                        a.filterAmphibi();
                    }
                        break;
                    case 4:
                    System.out.println("Voici les oiseaux: ");
                    for (Animal a : animals) {
                        a.filterBird();
                    }
                        break;
                    case 5:
                    System.out.println("Voici les mammifères: ");
                    for (Animal a : animals) {
                        a.filterMammal();
                    }
                        break; 
                }
                
        } else {
                System.out.println("Erreur");
            }
            // System.out.println(animals.length);
                
