public class Roturier extends Personnes {
    protected int argent;

    public Roturier() {
        this.argent = 50;
    }

    public int production() {
        return argent / 10; 
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void impot(int montant) {
        argent -= montant;
    }

    private int age;

    public Roturier(int age) {
        this.age = age;
    }

    public void vieillir() {
        age++;
    }


    public int gagner() {
        // Implémentation du gain du roturier (par exemple, un certain nombre de pièces d'or)
        return 2; // Gain arbitraire pour l'exemple
    }

    public int getAge() {
        return age;
    }
}