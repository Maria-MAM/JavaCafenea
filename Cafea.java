public class Cafea extends Bautura {
    int cafeina; 
    
    public Cafea(String nume, int pret, int cafeina) {
        super(nume, pret);
        this.cafeina = cafeina;
    } 
}