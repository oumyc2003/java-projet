abstract class Action {
        protected String nom;
        protected int cout;
    
        public Action(String nom, int cout) {
            this.nom = nom;
            this.cout = cout;
        }
    
        public abstract void action(Royaume r);
    
        // Getters and setters
        public String getNom() {
            return nom;
        }
    
        public void setNom(String nom) {
            this.nom = nom;
        }
    
        public int getCout() {
            return cout;
        }
    
        public void setCout(int cout) {
            this.cout = cout;
        }
    }
