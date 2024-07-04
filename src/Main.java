//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    This program generates a mad libbed story.
    Author: Roan
    Date: 04/07/24
    */
    public static void main(String[] args){

        String name1 = "Eren";
        String name2 = "Eva";

        String adjective1 = "big";
        String adjective2 = "great";
        String adjective3 = "kind";

        String verb1 = "dance";

        String noun1 = "dog";
        String noun2 = "house";
        String noun3 = "computer";
        String noun4 = "Java";
        String noun5 = "coffee";
        String noun6 = "park";

        int number = 7;

        String place1 = "Paris";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}