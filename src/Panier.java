import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits;

    // Constructeur
    public Panier() {
        this.produits = new ArrayList<>();
    }

    // Méthode pour ajouter un produit au panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherPanier(){
        for(Produit produit : produits){
            if(produit != null){
                produit.afficher();
                System.out.println("\n");
            }
        }
    }
    public int prixTotalPanier() {
        int prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }



}
