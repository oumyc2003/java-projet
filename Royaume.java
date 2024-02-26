
import java.util.Random;


public class Royaume { private Village[] villages;
    private int nombreVillages;
    private int argent;

    public void setArgent(int argent) {
        this.argent = argent;
}

public int getArgent() {
        return argent;
}

public Royaume(int r) {
        this.villages = new Village[r];
        this.nombreVillages = 0;
        this.argent = 0;
    }

    public void ajouterVillage(Village village) {
        if (nombreVillages < villages.length) {
            villages[nombreVillages] = village;
            nombreVillages++;
        } 
    }

    public void ajoutHabitant(Roturier r) {
        Random random = new Random();
        int index = random.nextInt(nombreVillages);
        villages[index].ajoutHabitant(r);
    }

    //public String toString(){

     //   System.out.println("  ");

   // }
   
}
        
       
        

