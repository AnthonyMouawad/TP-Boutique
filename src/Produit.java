public class Produit {

    private int prix;
    private String nom;

    private String description;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Produit(){

    }
    public Produit(int prix,String nom , String description){
        this.prix = prix;
        this.nom = nom;
        this.description = description;
    }



    public void afficher(){
        System.out.println("Produit{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}');
    }

}
