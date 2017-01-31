package com.School;

import java.time.LocalDate;

/**
 * Created by Agnieszka on 19/01/17.
 */
public class Graduate extends Student {

                                                                            /* Un diplômé est un élève.
                                                                            Il dispose d'un diplôme qui a comme caractéristique un niveau de diplôme (5:bac+5, 4:bac+4, 3:bac+3, 2:bac+2, 1:bac)
                                                                            En reprenant l'exercice, créer la classe Graduate qui dérive de Student.
                                                                            Développer les accesseurs et ajouter aussi la méthode equals
                                                                            */

    private String level;



    public              Graduate            (String name, String family, LocalDate born, float age, String level)
                                                                            {
                                                                                super(name, family, born, age);
                                                                                this.level = level;
                                                                            }

    public String       getLevel            ()                              {   return level; }
    public void         setLevel            (String level)                  {   this.level = level; }


    public String       toString            ()
                                                                            {
                                                                                return  super.toString() + " Graduated at level : " + level ;
                                                                            }


    public boolean      equals             (Object o)                       {
                                                                                if (this == o) return true;
                                                                                if (o == null || getClass() != o.getClass()) return false;
                                                                                Graduate graduate = (Graduate) o;
                                                                                return level.equals(graduate.level);
                                                                            }




} //
