import java.time.LocalDate;

public class ProduitAlimentaire extends Produit{
    private LocalDate dateExpiration;

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public ProduitAlimentaire(){
        //Constructeur par defaut
    }

    public ProduitAlimentaire(int prix, String nom, String description, LocalDate dateExpiration) {
        super(prix , nom, description);
        this.dateExpiration = dateExpiration;
    }

    public void afficher(){
        System.out.println("ProduitAlimentaire : ");
        super.afficher();
        System.out.println("dateExpiration=" + dateExpiration );
    }
}
