package ma_projet_test;

import ma.projet.beans.Salle;
import ma_projet_deo.SalleService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //creer cinq salles
        SalleService salles = new SalleService();
        salles.create(new Salle(1,"S_A","Salle 1"));
        salles.create(new Salle(2,"S_B","Salle 2" ));
        salles.create(new Salle(3,"S_C","Salle 3" ));
        salles.create(new Salle(4,"S_D","Salle 4" ));
        salles.create(new Salle(5,"S_E","Salle 5" ));
        System.out.println("*************************** Liste des salles ***************************** ");
        //Afficher la liste des salles
        for (Salle s : salles.findAll())
            System.out.println("\t" + s);

        System.out.println("_________________________________________________________________________");

        //Supprimer une salle
        System.out.println("- La suppresion de la salle 3 :");
        salles.delete(salles.findById(3));

        System.out.println("_________________________________________________________________________");

        //Modifier les infos d'une salle
        System.out.println("- La modification de la salle 1 :");
        Salle nvSalle = salles.findById(1);
        Scanner scan = new Scanner(System.in);
        System.out.println("* Entrer le nouveau code:");
        nvSalle.setCode(scan.nextLine());
        System.out.println("* Entrer le nouveau libelle :");
        nvSalle.setLibelle(scan.nextLine());
        salles.update(nvSalle);

        //Afficher la liste des salles
        System.out.println("*************************** La nouvelle liste des salles ***************************** ");
        for(Salle salle : salles.findAll())
            System.out.println("\t" + salle);





    }
}
