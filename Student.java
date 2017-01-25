package com.School; /**
 * Created by Agnieszka on 19/01/17.
 */

import java.time.LocalDate;

public class Student {

                                /* Un élève est caractérisé par son prénom, son nom, sa date de naissance, son âge.
                                Mis à part l'âge, toutes les autres propriétés ne sont pas modifiables une fois qu'un objet
                                de type Student a été créé.
                                La classe doit disposer d’une méthode toString().
                                pour les dates, vous pouvez utilisez localDate
                                exemple LocalDate date = LocalDate.of(2014, Month.DECEMBER, 12);
                                */


  private  String prenom;
  private  String nom;
  private  LocalDate dateNaissance;
  private float age;



        public Student(String p, String n, LocalDate d, float a) {
                                                                  prenom = p;
                                                                  nom= n;
                                                                  dateNaissance = d;
                                                                  age= a;
                                                                }

                    // il est possible de connaitre nom prenom, age, date de naissance
        public String getPrenom() { return prenom; }
        public String getNom() { return nom;}
        public LocalDate getDateNaissance() { return dateNaissance;}
        public float getAge() { return age; }


                    // il est possible de modifier seulement age
        public void setAge(float age) { this.age = age; }



        public String toString() {
                                return "\n Student ["+" prenom : "+prenom+ ", nom : " + nom+", dateNaissance : "+dateNaissance +", age : "+age+" ]";
                                }




}
