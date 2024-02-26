class Village {
        private Roturier[] habitants;
        private int nombreHabitants;
    
        public Village(int capM) {
            this.habitants = new Roturier[capM];
            this.nombreHabitants = 0;
        }
    
        public void ajoutHabitant(Roturier r) {
            if (nombreHabitants < habitants.length) {
                habitants[nombreHabitants] = r;
                nombreHabitants++;
            } else {
                System.out.println("Le village est plein, impossible d'ajouter plus d'habitants.");
            }
        }
       



        
}
       
    