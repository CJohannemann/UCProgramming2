
package fortuneteller;

import java.util.ArrayList;

public class ArrayClass {
    private static ArrayList<String> quotes = new ArrayList();
    
    
    public static ArrayList<String> getQuotes(){
        quotes.add("The early bird gets the worm, but the second mouse gets the cheese.");
        quotes.add("Be on the alert to recognize your prime at whatever time of your life it may occur.");
        quotes.add("Your road to glory will be rocky, but fulfilling.");        
        quotes.add("Courage is not simply one of the virtues, but the form of every virtue at the testing point.");
        quotes.add("Patience is your alley at the moment. Don’t worry!");
        quotes.add("Nothing is impossible to a willing heart.");
        quotes.add("Don’t worry about money. The best things in life are free.");
        quotes.add("Don’t pursue happiness – create it.");
        quotes.add("Courage is not the absence of fear; it is the conquest of it.");
        quotes.add("Nothing is so much to be feared as fear.");
        quotes.add("All things are difficult before they are easy.");
        quotes.add("You don’t need strength to let go of something. What you really need is understanding.");
        return quotes;
    }
}
