public class Bautura {
    String nume;
    int pret;
    
    public Bautura(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    public String toString() {
        return nume + " " + pret;
    }      
}