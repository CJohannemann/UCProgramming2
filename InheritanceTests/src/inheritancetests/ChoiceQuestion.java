
package inheritancetests;

import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;
    
    
    public ChoiceQuestion(){
        choices = new ArrayList<>();
    }
    
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if (correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    
    @Override
    public void display(){
        System.out.println(getText());
    
        int i=1;
        for(String choice : choices){
            System.out.println(i + ") " + choice);
            i++;
        }
    }
    
}
