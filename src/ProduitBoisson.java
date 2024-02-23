public class ProduitBoisson extends Produit{

    private int quantite;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public ProduitBoisson(){
        //Constructeur par defaut
    }
    public ProduitBoisson(int prix, String nom, String description, int quantite) {
        super(prix ,nom, description);
        this.quantite = quantite;
    }

    public void afficher(){
        System.out.println("ProduitBoisson : ");
        super.afficher();
        System.out.println("quantite=" + quantite + " centilitres");
    }
}
