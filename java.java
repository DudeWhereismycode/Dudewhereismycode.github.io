import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();
      String ageAsString = console.readLine("HOw old are you ? ");
      int age = Integer.parseInt(ageAsString);
      if (age < 13) {
        //insert exit code
        console.printf("Sorry you must be  at least 13 to use this program.\n");
        System.exit(0);
      }
        // Welcome to the Introductions program!  Your code goes below here
      String name = console.readLine("What is your name? ");
      String adjective = console.readLine("What's an adjective: ");
      String noun;
      boolean isInvalidWord;
      do {
        noun = console.readLine("Chose a noun:  ");
        isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                          noun.equalsIgnoreCase("jerk"));
      if (isInvalidWord) {
        console.printf("That language is not allowed. Terminating at will. \n\n");
      }
      } while (isInvalidWord);
       String adverb = console.readLine("Chose a adverb ");
       String verb = console.readLine("Chose a verb ending in ~ing: ");



        console.printf("Your TreeStory:\n----------------\n", name);
      console.printf("%s is very %s %s", name, adjective, noun);
      console.printf("They are always %s %s.\n", adverb, verb);
  }
}
