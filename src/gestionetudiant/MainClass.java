/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Administrateur
 */
public class MainClass {

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1,"Omar",21);
        Etudiant e3 = new Etudiant(2,"Fatma",19);

        Etudiant e2 = new Etudiant(3,"Mustapha",26);

        ArrayList<Etudiant> list = new ArrayList<Etudiant>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        ListEtudiant l = new ListEtudiant();
        Consumer<Etudiant>  consumer = (Etudiant e) -> System.out.println(e.toString());
           Predicate<Etudiant> predicate = (Etudiant e) -> e.getAge()<20;
        Function<Etudiant, String>  f =(Etudiant e) -> e.getNom();
        Supplier<Etudiant> supp=()-> new Etudiant(4,"Foulen",23);

        l.afficherEtudiants(list, consumer);
        l.afficherEtudiantSelonFiltre(list, predicate, consumer);
        l.afficherNomEtudiant(list, f);
        l.creeEtudiant(supp);
        l.convertListStream(list);
    }

}
