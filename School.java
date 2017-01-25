package com.School;

import java.util.*;
import java.lang.*;

/**
 * Created by Agnieszka on 19/01/17.
 */
public class School {

                                                        /*
                                                        L'école est représentée par une classe School.
                                                        Elle est caractérisée par son nom et une liste d'élèves.
                                                        Seul la liste est modifiable.
                                                        Les élèves de cette école seront référencés dans cette liste.
                                                        Une école peut accepter un élève. La classe doit disposer d’une méthode toString().
                                                        pour les dates, vous pouvez utilisez localDate
                                                        exemple LocalDate date = LocalDate.of(2014, Month.DECEMBER, 12);
                                                         */


    private String NomEcole;
    private Vector<Student> StudentList;
    //private TreeMap < Student, String>  StudentList;


    public School(String nom)           {
                                            NomEcole = nom;
                                            StudentList = new Vector<Student>() ;
                                        }


    public String getNomEcole()             { return NomEcole; }
    public Vector<Student> getStudentList() { return StudentList; }



    public String toString()   {
                                    String st = "\n" +
                                                "School : "+ this.NomEcole +
                                                "\n" +
                                                "Liste d'etudiants : " +
                                                "\n" ;
                                                    for (int i=0; i< this.StudentList.size(); i++)
                                                    { st = st + this.StudentList.get(i).toString();}
                                    return  st + "\n";

                                }
  /*  public String toString()   {
                                    String st = "\n School : "+ this.NomEcole + "\n\n"+
                                            "Liste d'etudiants : " + this.StudentList +\n";
                                    return  st;

                                }


   public String toString()   {
                                    String st = "\n School : "+ NomEcole + "\n"+
                                            "Liste d'etudiants : \n" + StudentListe + "\n";
                                    for (String name : StudentListe.values())
                                    { st = st + name.toString();}
                                    return  st+"\n";
                                }
*/


    public float  returnMeanAge () {
                                        int number = this.StudentList.size();
                                        float somme=0;
                                        for (int i=0; i< this.StudentList.size(); i++)
                                        { somme = somme + this.StudentList.get(i).getAge();}
                                        float mean = somme/number;
                                        return mean;
                                    }

}

