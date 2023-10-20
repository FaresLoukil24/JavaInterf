public class Main {
    public static void main(String [] args){
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(1,"ahm","Mohs");
        Etudiant e3 = new Etudiant(2,"Era","Ras");

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2.toString());;
        System.out.println(e3.toString());
    }
}
