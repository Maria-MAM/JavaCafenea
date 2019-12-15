import java.util.*;

public class Cafenea{
    private List<Bautura> cafenea = new ArrayList<>(); 
    private static Cafenea singleton;
    
    private Cafenea() {}
    
    public static Cafenea getInstance() {
        if (singleton == null) {
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adaugaBautura(String tip, String nume, int pret, int inf) {
        if (tip.equalsIgnoreCase("CAFEA")) {
            cafenea.add(new Cafea(nume, pret, inf));
        } else if (tip.equalsIgnoreCase("SUC")) {
            cafenea.add(new Suc(nume, pret, inf));
        }
    }
    
    public void afiseazaBauturi() {
        if (cafenea!=null){
            cafenea.forEach(System.out::println);
        } else 
            System.out.println("Nu exista bauturi de afisat!");
    }
    
    public void afiseazaCafele(){
        if (cafenea!=null){
            for (Bautura b: cafenea) {
                if (b instanceof Cafea) {
                    System.out.println(b);
                }
            }
        }
    }
    
    public void stergeBautura(String nume1) {
        cafenea.removeIf(Bautura -> Bautura.nume.equalsIgnoreCase(nume1));
    }
    
    public void afiseazaSortatPret() {
        Comparator<Bautura> comp = (b1, b2)-> b1.pret-b2.pret;
        Collections.sort(cafenea, comp);
    }
    
    public void afiseazaSortatNume() {
        Comparator<Bautura> comp = (b1, b2)-> b1.nume.compareTo(b2.nume);
        Collections.sort(cafenea, comp);
    }  
}



