public class Quadrilatere {
    private double largeur;
    private double longueur;

    public Quadrilatere(double largeur, double longueur){
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Quadrilatere(){
        this.largeur = 6;
        this.longueur = 3;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double perimetre(){
        return 2*(longueur + largeur);
    }

    public double surface(){
        return longueur*largeur;
    }

}
