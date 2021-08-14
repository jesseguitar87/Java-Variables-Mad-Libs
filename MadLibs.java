public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Jesse
Date: 8/13/2021
  */
  	public static void main(String[] args){
    String name1 = "Lena";

    String adjective1 = "silly";  
    String adjective2 = "fun";
    String adjective3 = "fast";
   
    String verb1 = "jumped";

    String noun1 = "baker";
    String noun2 = "Miami";
    String noun3 = "bike";
    String noun4 = "driver";
    String noun5 = "Tampa";
    String noun6 = "skateboard";
    String name2 = "Niles";

    int number = 44;
    String place1 = "USA";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}

