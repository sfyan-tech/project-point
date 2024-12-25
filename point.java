package Exercice1;

class point{
    private double abs;
    private double ord;
    
   
    //Generez les getters et setters pour les deux attributs. 
    public double getAbs() {
        return abs;
    }
    public double getOrd(){
        return ord;
    }
    public void setAbs(double abs) {
        this.abs = abs;
    }
    public void setOrd(double ord) {
        this.ord = ord;
    }
    
    //Definissez la methode toString() qui retourne la representation mathematique d’un point :(abs, ord).
    public String toString(){
        return "("+abs+","+ord+")";
    }
    
    //Definissez un constructeur avec deux parametres Point(double abs, double ord)
    public point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    /*Definissez une methode calculerDistance(Point p) qui calcule et retourne la distance entre 
      le point de l’objet courant (this) et l’objet p passe en param`etre.
      Nous rappelons que la distance entre deux points A(x1,y1) et B(x2,y2), en mathematiques,est´egale a :
      (x1 − x2)2+ (y1 − y2)2)
    Utiliser la m´ethode statique sqrt(double a) de la classe Math*/
    public double calculerDistance(point p){
        return (Math.sqrt(((this.abs-p.abs)*(this.abs-p.abs))+((this.ord-p.ord)*(this.ord-p.ord))));
    }

    //D´efinissez une m´ethode statique distance(double x1, double y1, double x2, double y2)qui calcule 
    //et retourne la distance entre les deux points A(x1,y1) et B(x2,y2). 
    public static double distance(double x1, double y1, double x2, double y2){
        return (Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))));
    }

    /*Definissez une methode calculerMilieu(Point p) qui calcule et retourne un objet de type Point 
     correspondant au milieu du segment defini par le point de l’objet courant (this) et l’objet p passe en parametre.
     Nous rappelons que les coordonnees d’un point M(xM ,yM ) milieu de A(x1,y1) et B(x2,y2), en mathematiques,sont :
    • xM=(x1+x2)/2
    • yM=(y1+y2)/2
    La m´ethode doit retourner un objet Point et pas les coordonnees. */
    public point calculerMilieu(point p){
        double xm = (this.abs + p.abs) / 2;
        double ym = (this.ord + p.ord) / 2;

        return new point(xm, ym);
    }

    
}