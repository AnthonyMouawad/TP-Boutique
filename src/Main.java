import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Premier affichage boutique
        Boutique boutique = new Boutique();
        System.out.println("Bienvenue dans la boutique");

        //Initialisation des produits
        Produit produit = new Produit();
        Produit produit1 = new Produit();
        Produit produit2 = new Produit();


        produit.setNom("mais");
        produit.setDescription("boite");
        produit.setPrix(20);
        produit1.setNom("telephone");
        produit1.setDescription("iphone");
        produit1.setPrix(10);
        produit2.setNom("miranda");
        produit2.setDescription("boisson gazeuse");
        produit2.setPrix(30);

        //Ajout des produits à la boutique
        boutique.addProduit(produit);
        boutique.addProduit(produit1);
        boutique.addProduit(produit2);

        System.out.println("Voici les noms des produits disponibles : " + "\n");
        for (Produit p : boutique.getProduits()){
            System.out.println(p.getNom());
        }
        System.out.println("\n");

        // Deuxieme affichage boutique avec les produits alimentaires, electroniques et boissons
        ProduitAlimentaire alimentaire = new ProduitAlimentaire();
        ProduitElectronique electronique = new ProduitElectronique();
        ProduitBoisson boisson = new ProduitBoisson();

        //Initialisation des produits alimentaires, electroniques et boissons
        alimentaire.setNom("courgette");
        alimentaire.setDescription("fruit");
        alimentaire.setPrix(50);
        alimentaire.setDateExpiration(LocalDate.of(2023, 2, 12));

        electronique.setNom("tablette");
        electronique.setDescription("ipad");
        electronique.setPrix(100);
        electronique.setDureeGarantie(3);

        boisson.setNom("miranda");
        boisson.setDescription("boisson gazeuse");
        boisson.setPrix(50);
        boisson.setQuantite(10);

        //Ajout des produits alimentaires, electroniques et boissons
        boutique.addProduit(alimentaire);
        boutique.addProduit(electronique);
        boutique.addProduit(boisson);
        boutique.afficherStock();

        // Affichage panier avec les produits alimentaires, electroniques et boissons
        Panier panier = new Panier();
        System.out.println("Voici votre panier : " + "\n");
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire(20,"mais" , "boite" , LocalDate.of(2022, 12, 12));
        ProduitElectronique produitElectronique = new ProduitElectronique(30,"telephone" , "iphone" , 2);
        ProduitBoisson produitBoisson = new ProduitBoisson(50,"miranda" , "boisson gazeuse" , 30);

        //Ajout des produits au panier
        panier.ajouterProduit(produitAlimentaire);
        panier.ajouterProduit(produitElectronique);
        panier.ajouterProduit(produitBoisson);

        //Affichage du panier
        panier.afficherPanier();
        panier.prixTotalPanier();
        System.out.println("Prix total panier : " + panier.prixTotalPanier() + " €");


    }
}