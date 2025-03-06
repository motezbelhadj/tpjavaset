public class Employe implements Comparable<Employe>{
    private int cin;
    private String nom;
    private double salaire;
    private int idd;

    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public int getIdd() {
        return idd;
    }
    public void setIdd(int idd) {
        this.idd = idd;
    }

    

    @Override
    public String toString() {
        return "Employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", idd=" + idd + "]";
    }
    public Employe(int cin, String nom, double salaire, int idd) {
        this.cin = cin;
        this.nom = nom;
        this.salaire = salaire;
        this.idd = idd;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cin;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employe other = (Employe) obj;
        return cin == other.cin;
    }
    @Override
    public int compareTo(Employe o) {
        if(salaire>o.salaire){
            return 1;
        }
        if(salaire<o.salaire){
            return -1;
        }
        return 0;
    }

    
    
}
