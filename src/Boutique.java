import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;



public class Boutique {

    private List<Produit> produits = new ArrayList<>();
    public void addProduit(Produit produit){
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }


    public void afficherStock(){
        for(Produit produit : produits){
            produit.afficher();
        }
    }
}
