package com.School;

import java.time.LocalDate;
import java.time.Month;


/**
 * Created by Agnieszka on 19/01/17.
 */
public class LifeSchool {


    public static void main(String[] args) {
                                                /*
                                                1/Ecrivez un programme principal dans la classe LifeSchool,
                                                dans lequel vous créerez une école nommée InfoJava avec les étudiants suivants:
                                                                Prénom; Nom; Date de naissance; âge
                                                                Stéphanie; Durand; 12/11/1980; 37
                                                                Mamadou; Fort; 13/09/1992;25
                                                                Florence; Lune; 05/04/2001;16
                                                                Loic; Martin; 07/07/1998;19
                                                2/ Afficher toutes les informations concernant l'école Simplon et ses étudiants.
                                                3/Ajouter une méthode permettant de connaître l'âge moyenne des étudiants.
                                                4/ Testez méthode Age Moyen dans le programme principal.
                                                pour les dates, vous pouvez utilisez localDate
                                                exemple LocalDate date = LocalDate.of(2014, Month.DECEMBER, 12);
                                                 */
        // je cree une ecole - 1 instance de la classe School
        School SimplonJava = new School("SimplonJava");

        // je cree 4 etudiants - 4 instances de la classe Student
        Student Durand = new Student("Stéphanie", "Durand ", LocalDate.of(1980, Month.NOVEMBER, 12), 37);
        Student Fort =   new Student("Mamadou  ", "Fort   ", LocalDate.of(1992, Month.SEPTEMBER,13), 25);
        Student Lune =   new Student("Florence ", "Lune   ", LocalDate.of(2001, Month.APRIL,     5), 16);
        Student Martin = new Student("Loic     ", "Martin ", LocalDate.of(1998, Month.JULY,      7), 19);


        // j'ajoute les etudiants a la liste d'etudiants qui est dans l'ecole
        SimplonJava.getStudentList().addElement(Durand);
        SimplonJava.getStudentList().addElement(Fort);
        SimplonJava.getStudentList().addElement(Lune);
        SimplonJava.getStudentList().addElement(Martin);


        // J'affiche  toutes les informations concernant l'école Simplon et ses étudiants.
        printSchoolInfo (SimplonJava);

        // j'affiche l'age moyen
        printSchoolMeanAge (SimplonJava);


                                             /*
                                             Dans l'application LifeSchool:
                                                1/Ajouter les diplômés suivants dans l'école:
                                                        Drake; Foudre; 11/11/1990; 27; 2
                                                        Solange; Feu; 12/12/1990; 27; 5
                                                        Johnny; Lumière; 01/10/1990; 27; 3
                                                2/Afficher les étudiants avec son prénom, nom, date de naissance,
                                                son âge et les diplômés avec son prénom, son nom et le niveau de son diplôme.
                                                3/Afficher la comparaison entre l'objet Johnny et Solange.
                                            */


        // je cree 3 graduates - 3 instances de la classe Graduate
        Graduate Drake = new Graduate ("Drake   ", "Foudre   ", LocalDate.of(1990, Month.NOVEMBER, 11), 27, "bac+2");
        Graduate Solange = new Graduate ("Solange ", "Feu   ", LocalDate.of(1990, Month.DECEMBER, 12), 27, "bac+5");
        Graduate Johny = new Graduate ("Johny ", "Lumiere ", LocalDate.of(1990, Month.OCTOBER,01), 27, "bac+3");

        SimplonJava.getStudentList().addElement(Drake);
        SimplonJava.getStudentList().addElement(Solange);
        SimplonJava.getStudentList().addElement(Johny);


        // J'affiche  toutes les informations concernant l'école Simplon et ses étudiants.
        printSchoolInfo (SimplonJava);

        // j'affiche l'age moyen
        printSchoolMeanAge (SimplonJava);

        // je compare les objets

        compareLevel (Johny, Solange);

    }  // fin du main




    // Je defini une methode pour afficher les informations concernant ecole.

    public static void printSchoolInfo (School a) { System.out.println (a.toString() ); }



    // Je defini une méthode permettant de connaître l'âge moyenne des étudiants.

    public static void printSchoolMeanAge (School a) {
        String st= " La moyenne d'age dans l'ecole "+a.getNomEcole()+" est : "+ a.returnMeanAge();
        System.out.println ("\n"+st+"\n");
    }


    public static void compareLevel (Graduate a, Graduate b) {
        boolean equals = a.equals(b);
        if (true) System.out.println("\n Les Graduates "+ a.getPrenom()+" et "+b.getPrenom()+" ont le meme niveau d'etudes");
        else System.out.println("\n Les Graduates "+ a.getPrenom()+" et "+b.getPrenom()+" ont le niveau d'etudes different");
    }



}
