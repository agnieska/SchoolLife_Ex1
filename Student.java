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


  private  String name;
  private  String family;
  private  LocalDate born;
  private float age;



        public      Student     (String nom, String familyName, LocalDate birth, float ag)
                                                                    {
                                                                      name = nom;
                                                                      family= familyName;
                                                                      born = birth;
                                                                      age = ag;
                                                                    }

                                        // GETTERS & SETTERS
        public String       getName()                               { return name; }
        public String       getFamilyName()                         { return family;}
        public LocalDate    getbirthDate()                          { return born;}
        public float        getAge()                                { return age; }
                                                // il est possible de modifier seulement age
        public void         setAge(float age)                       { this.age = age; }



        public String       toString()                              {
                                                                      return "\n Student ["+
                                                                              " prenom : "+name+ ", nom : "
                                                                              + family +", dateNaissance : "
                                                                              + born +", age : "+age+" ]";
                                                                    }




}
