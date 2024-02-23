import java.util.List;
import java.util.ArrayList;

public class Boutique {

    private List<Produit> produits = new ArrayList<>();
    public void addProduit(Produit produit){
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }


    public void afficherStock(){
        System.out.println("Voici les produits disponibles : " + "\n");
        for(Produit produit : produits){
            produit.afficher();
            System.out.println("\n");
        }
    }
}
