import java.util.ArrayList;
import java.util.Collections;

public class EspritArrayList implements University{

    private ArrayList<Etudiant> listEtudiant = new ArrayList<Etudiant>();

    public ArrayList<Etudiant> getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(ArrayList<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.listEtudiant.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return listEtudiant.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e:
                listEtudiant) {
            if (e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        listEtudiant.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e:
                listEtudiant) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listEtudiant, new Etudiant());
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listEtudiant,new TriNom());
    }
}
