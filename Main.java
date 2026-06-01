//1. import Scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    /*
    TO DO:
    1. import Scanner class
    2. get user input, assign to variables
    3. use string concatenation to create a Mad Lib from the user input
    4. print out the Mad Lib
    */

    //2. get user input
    Scanner scan = new Scanner(System.in);

    String prompt;
   

    final String COVER_ART = TextColor.CYAN_BOLD + """

      A Disasterous New Home


                     ~~~
                ~~~~     ~~~
            ~~~          ~~~
          ~~         ~~~     ~~
      ~~ ~~~
      ~~    ~~    ~~        ~~~    ~~
      ~~              ~~~   ~~
      ~~                    ~~     ~~~
      ~~        ~~~~        ~~
      ~~        ~  ~        ~~
      ~~        ~  ~        ~~
      ~~~~~~~~~~~~~~~~~~~~~~~~



      """ + TextColor.RESET;
    System.out.println(COVER_ART);

    Util.pauseConsole();
    Util.clearConsole();

    

    
    final String PROMPT_1 = "Name: ";
    System.out.print(PROMPT_1);
    String name = scan.nextLine();

    final String PROMPT_2 = "Enter age under 18: ";
    System.out.print(PROMPT_2);
    int age = scan.nextInt();
    scan.nextLine();

    final String PROMPT_3 = "Location for new home: ";
    System.out.print(PROMPT_3);
    String location = scan.nextLine();

    final String PROMPT_4 = "Name any mammal (plural): ";
    System.out.print(PROMPT_4);
    String mammal = scan.nextLine();

    final String PROMPT_5 = "Favorite Song: ";
    System.out.print(PROMPT_5);
    String song = scan.nextLine();

    final String PROMPT_6 = "Controversial food item (plural if singular item): ";
    System.out.print(PROMPT_6);
    String controversialFood = scan.nextLine();

    final String PROMPT_7 = "How many hours a day are you awake?: ";
    System.out.print(PROMPT_7);
    int hoursAwake = scan.nextInt();
    scan.nextLine();

    final String PROMPT_8 = "Enter an emotion for when you're annoyed: ";
    System.out.print(PROMPT_8);
    String annoyedEmotion = scan.nextLine();

    final String PROMPT_9 = "Enter the most random adjective you can think of: ";
    System.out.print(PROMPT_9);
    String adjective = scan.nextLine();

    final String PROMPT_10 = "Enter a 3-digit number: ";
    System.out.print(PROMPT_10);
    int threeDigitNumber = scan.nextInt();
    scan.nextLine();

    final String PROMPT_11 = "Enter a household tool that can be used as a weapon: ";
    System.out.print(PROMPT_11);
    String weapon = scan.nextLine();

    final String PROMPT_12 = "Enter a destructive verb: ";
    System.out.print(PROMPT_12);
    String verb = scan.nextLine();

    final String PROMPT_13 = "What is the best applicance to play music on?: ";
    System.out.print(PROMPT_13);
    String musicPlayer = scan.nextLine();

    Util.pauseConsole();
    Util.clearConsole();
 
   
    String madLib1 = "";
    madLib1+="\nThe New Home";
    madLib1+= "\n\n\tWhen I was " + age + ", I was sent to live with " + mammal + " in the " + location + ". ";
    madLib1+= "The " + mammal + " listened to \"" + song + "\" and ate " + controversialFood + " " + hoursAwake + " hours a day. ";
    madLib1+= "\n\tVery quickly, I became " + annoyedEmotion + " with this " + adjective + " behavior. ";
    madLib1+= "I decided to put a stop to this by using a " + weapon + " to " + verb + " their " + musicPlayer + " when they would least expect it.";

    System.out.println(madLib1);
    Util.pauseConsole();
    Util.clearConsole();


    final String PROMPT_14 = "Enter a synonym for quietly (adverb): ";
    System.out.print(PROMPT_14);
    String quietSynonym = scan.nextLine();

    final String PROMPT_15 = "Enter a type of shelter/house: ";
    System.out.print(PROMPT_15);
    String house = scan.nextLine();

    final String PROMPT_16 = "Enter a violent verb for how you use the " + weapon + ": ";
    System.out.print(PROMPT_16);
    String violentVerb = scan.nextLine();

    final String PROMPT_17 = "Enter the same verb but ending in -ing: ";
    System.out.print(PROMPT_17);
    String newVerbTense = scan.nextLine();

    final String PROMPT_18 = "Enter a number ranging from 5-20: ";
    System.out.print(PROMPT_18);
    int number = scan.nextInt();
    scan.nextLine();

    final String PROMPT_19 = "Enter an adverb having to do with speed (ex. immediately, slowly): ";
    System.out.print(PROMPT_19);
    String speedAdverb = scan.nextLine();

    final String PROMPT_20 = "Enter a sound effect: ";
    System.out.print(PROMPT_20);
    String soundEffect = scan.nextLine();

    final String PROMPT_21 = "Enter a emotion for when you're angry (in noun form): ";
    System.out.print(PROMPT_21);
    String angryEmotion = scan.nextLine();

    final String PROMPT_22 = "Enter a synonym for 'ran' (past tense): ";
    System.out.print(PROMPT_22);
    String runPastTense = scan.nextLine();

    final String PROMPT_23 = "Enter a number: ";
    System.out.print(PROMPT_23);
    int numSpeed = scan.nextInt();
    scan.nextLine();
    

    Util.pauseConsole();
    Util.clearConsole();
    
    String madLib2 = "";
    madLib2+= "\nThe Attack";
    madLib2+= "\n\n\tWhen the " + mammal + " finally fell asleep, I " + quietSynonym + " went up to their " + house + " to initiate my plan. ";
    madLib2+= "I " + violentVerb + "ed their " + musicPlayer + " " + number + " times. ";
    madLib2+= "However, the " + mammal + " " + speedAdverb + " awoke at the \"" + soundEffect + "\"s of my " + newVerbTense + ". ";
    madLib2+= "I could see the " + angryEmotion + " in their faces. ";
    madLib2+= "I knew I had to get out of there, RIGHT NOW! ";
    madLib2+= "I " + runPastTense + " in the other direction at " + numSpeed + "mph. ";
    madLib2+= "The " + mammal + " were right behind me though.";
    System.out.println(madLib2);

    Util.pauseConsole();
    Util.clearConsole();




    final String PROMPT_24 = "Enter a number between 15 and 75: ";
    System.out.print(PROMPT_24);
    int newNum = scan.nextInt();
    scan.nextLine();

    final String PROMPT_25 = "Enter a synoym for yelling: ";
    System.out.print(PROMPT_25);
    String yellSyn = scan.nextLine();

    final String PROMPT_26 = "Enter a number between 75 and 100: ";
    System.out.print(PROMPT_26);
    int batNum = scan.nextInt();
    scan.nextLine();

    final String PROMPT_27 = "Enter a body part (plural): ";
    System.out.print(PROMPT_27);
    String bodyParts = scan.nextLine();

    final String PROMPT_28 = "Enter an animal with exceptional eyesight: ";
    System.out.print(PROMPT_28);
    String goodEyeAnimal = scan.nextLine();

    final String PROMPT_29 = "Enter a type of water body (ex.Ocean): ";
    System.out.print(PROMPT_29);
    String waterBody = scan.nextLine();

    final String PROMPT_30 = "Enter any type of vehicle that drives on the water: ";
    System.out.print(PROMPT_30);
    String waterVehicle = scan.nextLine();

    final String PROMPT_31 = "Enter a new number, greater than all the number you have entered so far: ";
    System.out.print(PROMPT_31);
    int newSpeed = scan.nextInt();
    scan.nextLine();

    Util.pauseConsole();
    Util.clearConsole();



    



    String madLib3 = "";
    madLib3+= "\nThe Escape";
    madLib3+= "\n\n\tAfter " + newNum + " minutes of weaving through the " + location + ", my legs were " + yellSyn + " at me to stop. ";
    madLib3+= "But I couldn't. ";
    madLib3+= "Not with the " + mammal + " still chasing me. ";
    madLib3+= "They still had " + batNum + "% of their energy left. ";
    madLib3+= "Not me though. ";
    madLib3+= "I felt like my " + bodyParts + " were about to fall off. ";
    madLib3+= "I saw a cliff nearby, thanks to my " + goodEyeAnimal + " eyes. ";
    madLib3+= "I suddenly remembered that there the " + location + " was surounded by a " + waterBody + ". ";
    madLib3+= "I also knew that the " + mammal + " was scared of water. ";
    madLib3+= "My best bet was to jump of the cliff and hope I could find a " + waterVehicle + " nearby to resuce me. ";
    madLib3+= "I " + runPastTense + " faster towards the cliff, increasing my speed to " + newSpeed + "mph.";
    System.out.println(madLib3);

    Util.pauseConsole();
    Util.clearConsole();







  
    final String PROMPT_32 = "Enter a synonym for jumped: ";
    System.out.print(PROMPT_32);
    String jumpSyn = scan.nextLine();

    final String PROMPT_33 = "Enter a number ranging from 2-10: ";
    System.out.print(PROMPT_33);
    int distanceNum = scan.nextInt();
    scan.nextLine();

    final String PROMPT_34 = "Enter a feeling for when you're satisfied: ";
    System.out.print(PROMPT_34);
    String satisfiedFeeling = scan.nextLine();

    final String PROMPT_35 = "Enter a hard surface: ";
    System.out.print(PROMPT_35);
    String hardSurface = scan.nextLine();

    Util.pauseConsole();
    Util.clearConsole();
    



    
    String madLib4 = "";
    madLib4+= "\nThe Last Goodbye";
    madLib4+= "\n\n\tOnce I got to the edge of the cliff, I looked back once last time. ";
    madLib4+= "The " + mammal + " were only " + distanceNum + "ft behind. ";
    madLib4+= "Without looking down, I " + jumpSyn + ". ";
    madLib4+= "Only halfway down did I see that I wasn't going to land in the " + waterBody + ". ";
    madLib4+= "I could only close my eyes and accept my destiny. ";
    madLib4+= "The " + mammal + " watched in " + satisfiedFeeling + " as I fell, bound to hit the " + hardSurface + " that lied at the bottom.";
    madLib4+= "\nI think you can accurately infer as to what happened. ";
    madLib4+= "\n\nAnd if you're wondering how I'm writing this story if I " + jumpSyn + " off a cliff, I am his older brother telling the story from the perspective of our family's middle child. ";
    madLib4+= "It's safe to say, if it weren't for this story, we would never remembered " + name + ".";
    
      

    
    //4. print out your Mad Lib
    System.out.println(madLib4);

    Util.pauseConsole();

    System.out.println(madLib1 + madLib2 + madLib3 + madLib4);

    

    
  }
}