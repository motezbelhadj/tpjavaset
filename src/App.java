public class App {
    public static void main(String[] args) throws Exception {
        Departement info=new Departement(26);

        Employe e1 =new Employe(5369871, "rzz", 1200, 0);
        Employe e2 =new Employe(5000077, "mhm", 1800, 0);
        info.ajoutEmploye(e1);
        info.ajoutEmploye(e2);
        info.afficheDep();
        Employe e3 =info.getEmpSalMax();
        System.out.println(e3.toString());
    }
}
