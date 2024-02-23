public class ProduitElectronique extends Produit{


    private int dureeGarantie;

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public ProduitElectronique(int prix, String nom, String description, int dureeGarantie) {
        super(prix,nom, description);
        this.dureeGarantie = dureeGarantie;
    }

    public void afficher(){
//        System.out.println("ProduitElectronique{" +
//                "nom='" + getNom() + '\'' +
//                ", description='" + getDescription() + '\'' +
//                ", dureeGarantie=" + dureeGarantie +
//                '}');
           System.out.println("ProduitElectronique{" +
                    "nom='" + getNom() + '\'' +
                    ", description='" + getDescription() + '\'' +
                    ", dureeGarantie=" + dureeGarantie +
                    ", prix=" + getPrix() +
                    '}');

    }
}
