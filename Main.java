
public class Main {
        public static void main(String[] args) {
                // Création d'un royaume avec une capacité maximale de 5 villages
                Royaume royaume = new Royaume(5);
        
                // Création de 3 villages
                Village village1 = new Village(10);
                Village village2 = new Village(15);
                Village village3 = new Village(8);
        
                // Ajout des villages au royaume
                royaume.ajouterVillage(village1);
                royaume.ajouterVillage(village2);
                royaume.ajouterVillage(village3);
        
                // Création de 10 roturiers
                Roturier[] roturiers = new Roturier[10];
                for (int i = 0; i < 10; i++) {
                    roturiers[i] = new Roturier(20); // Tous les roturiers ont 20 ans pour commencer
                }
        
                // Ajout des roturiers dans les villages du royaume
                for (Roturier roturier : roturiers) {
                    royaume.ajoutHabitant(roturier);
                     }    
                
        }
}
        
              