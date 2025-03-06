import java.util.HashMap;

public class Entreprise {
    private String nomEntreprise;
    HashMap<Integer, Departement> Liste_Deps;
    //constructeurs, getters et setters
    public Entreprise(String nomEntreprise) {
    this.nomEntreprise=nomEntreprise;
    this.Liste_Deps = new HashMap<>();
    }
    //ajouter un département donné à l'entreprise
    public void ajoutDep(Departement d)
    {
       Liste_Deps.put(d.getIdDep(), d);
    }
    //retirer un département de l'entreprise
    public void retirerDep(Departement d)
    {
        Liste_Deps.remove(d.getIdDep());
    }
    //afficher les détails de l'entreprise
    public void afficheE()
    {
        System.out.println("Nom de l'entreprise : " + nomEntreprise);
        System.out.println("Liste des départements : ");
        for (Departement d : Liste_Deps.values()) {
            System.out.println(" (ID: " + d.getIdDep() + ")");
        }
    
    }
    // transfert d'un employé d'un département à l'autre
    public void UpdateDep(Employe E, int idDep)
    {
        for (Departement d : Liste_Deps.values()) {
            if (d.getLEmployes().contains(E)) {
                d.retirerEmploye(E);
                break;
            }
        }
        if (Liste_Deps.containsKey(idDep)) {
            Liste_Deps.get(idDep).ajoutEmploye(E);
        } else {
            System.out.println("Le département avec l'ID " + idDep + " n'existe pas.");
        }
    
    }
    //vérifier si un département donné en paramètre appartient à la sociétéou pas
    public boolean existeD(Departement d)
    {
        return Liste_Deps.containsKey(d.getIdDep());
    }
    //afficher le département ayant le plus petit nombre d’étudiants
    public void DepMinCapacity()
    {
        Departement minDep = null;
        int minEmployes = Integer.MAX_VALUE;
        for (Departement d : Liste_Deps.values()) {
            if (d.getLEmployes().size() < minEmployes) {
                minEmployes = d.getLEmployes().size();
                minDep = d;
            }
        }
        System.out.println("Le département avec le moins d'employés est : " + minDep.getIdDep() +
                    " avec " + minEmployes + " employé(s).");

    }
}