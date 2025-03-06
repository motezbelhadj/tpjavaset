
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
    private int idDep;
    Set<Employe> LEmployes;

    public Departement(int idDep) {
    this.idDep=idDep;
    LEmployes=new HashSet<>();
    }
    /*ajouter un employe au département courant
    * la fonction n'ajoute que les employés ayants un CIN valide >0
    * ne pas oublier de mettre à jour le num dep de l'employe
    *
    */
    public void ajoutEmploye(Employe EmployeE)
    {
    if(EmployeE.getCin()>0){
        EmployeE.setIdd(idDep);
        LEmployes.add(EmployeE);
    }
    else{
        System.out.println("cin invalide");
    }
    }

    //retirer un employe du département courant
    public void retirerEmploye(Employe EmployeE)
    {
        if (LEmployes.contains(EmployeE)) {
            LEmployes.remove(EmployeE);
            EmployeE.setIdd(0); 
            System.out.println("Employé retiré.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }
    //afficher détails du département
    public void afficheDep()
    {
        System.out.println("Département ID: " + idDep);
        System.out.println("Liste des employés:");
        for (Employe emp : LEmployes) {
            System.out.println(emp.toString());
        }
    }
    //vérifier si un employé dont le cin est donné en paramètre
    // appartient au département courant ou pas
    public boolean existeE(int cin)
    {
        for (Employe emp : LEmployes) {
            if (emp.getCin() == cin) {
                return true;
            }
        }
        return false;
    }
    //retourner l'employé qui a le plus grand salaire ds le département
    // pensez un utiliser un treeSet
    public Employe getEmpSalMax()
    {
    TreeSet<Employe>ts=new TreeSet<>(LEmployes);
    return ts.last();
    }

    public int getIdDep() {
        return idDep;
    }
    public Set<Employe> getLEmployes() {
        return LEmployes;
    }

    
    }
