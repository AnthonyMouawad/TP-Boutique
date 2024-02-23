import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Boutique boutique = new Boutique();
        System.out.println("Bienvenue dans la boutique");
//        Produit produit = new Produit("mais" , "boite");
//        Produit produit1 = new Produit("ketchup" , "sauce");
//        Produit produit2 = new Produit("courgette" , "legume");
//        boutique.addProduit(produit);
//        boutique.addProduit(produit1);
//        boutique.addProduit(produit2);
//
//        for (Produit p : boutique.getProduits()){
//            System.out.println(p.getNom());
//        }

//        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("mais" , "boite" , LocalDate.of(2022, 12, 12));
//        ProduitElectronique produitElectronique = new ProduitElectronique("telephone" , "iphone" , 2);
//        ProduitBoisson produitBoisson = new ProduitBoisson("miranda" , "boisson gazeuse" , 10);
//        boutique.addProduit(produitAlimentaire);
//        boutique.addProduit(produitElectronique);
//        boutique.addProduit(produitBoisson);
//        boutique.afficherStock();

        Panier panier = new Panier();
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire(20,"mais" , "boite" , LocalDate.of(2022, 12, 12));
        ProduitElectronique produitElectronique = new ProduitElectronique(10,"telephone" , "iphone" , 2);
        ProduitBoisson produitBoisson = new ProduitBoisson(30,"miranda" , "boisson gazeuse" , 10);
        panier.ajouterProduit(produitAlimentaire);
        panier.ajouterProduit(produitElectronique);
        panier.ajouterProduit(produitBoisson);
        panier.afficherPanier();
        panier.prixTotalPanier();
        System.out.println("prix total panier : " + panier.prixTotalPanier() + " euros");








    }
}