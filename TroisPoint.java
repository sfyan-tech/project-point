package Exercice1;

public class TroisPoint {
    private point premier;
    private point deuxieme;
    private point troisieme;
    
    public TroisPoint(point premier, point deuxieme, point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }
    //Generez les getters/setters et le constructeur avec trois parametres de la classe TroisPoints.
    public point getPremier() {
        return premier;
    }
    public void setPremier(point premier) {
        this.premier = premier;
    }
    public point getDeuxieme() {
        return deuxieme;
    }
    public void setDeuxieme(point deuxieme) {
        this.deuxieme = deuxieme;
    }
    public point getTroisieme() {
        return troisieme;
    }
    public void setTroisieme(point troisieme) {
        this.troisieme = troisieme;
    }

    /*Ecrivez une methode sontAlignes() qui retourne true si les trois points premier,
     deuxieme et troisieme sont alignes, false sinon.
     Nous rappelons que trois points A, B et C sont alignes si AB=AC+BC,AC=AB+BC ou BC=AC+AB 
     (AB designe la distance separant le point A du point B, pareillement pour AC et BC). */
     public boolean sontAlignes() {
        double ab = premier.calculerDistance(deuxieme);
        double ac = premier.calculerDistance(troisieme);
        double bc = deuxieme.calculerDistance(troisieme);

        return ab == ac + bc || ac == ab + bc || bc == ab + ac;
    }

    /*Ecrivez une methode estIsocele() qui retourne true si les trois points premier,
      deuxieme et troisieme forment un triangle isocele, false sinon. 
    Nous rappelons qu’un triangle ABC est isocele si AB = AC ou AB = BC ou BC = AC. */
    public boolean estIsocele() {
        double ab = premier.calculerDistance(deuxieme);
        double ac = premier.calculerDistance(troisieme);
        double bc = deuxieme.calculerDistance(troisieme);

        return ab==ac || ab==bc || bc==ac ;
    } 
}
