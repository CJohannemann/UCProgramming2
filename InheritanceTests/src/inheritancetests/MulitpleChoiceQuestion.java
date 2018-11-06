
package inheritancetests;

import java.util.HashMap;
import java.util.Map;

public class MulitpleChoiceQuestion extends Question{
    private Map<String, Boolean> answers;
    
    public MulitpleChoiceQuestion(){
    answers = new HashMap<>();
    }
    public void addChoice(String choice, boolean correct){
        answers.put(choice, correct);
    }
    
    @Override
    public void display(){
        System.out.println(getText());
        for (String s : answers.keySet()){
            System.out.println(s);
        }
    }
    @Override
    public boolean checkAnswer(String answer){
        if(answers.containsKey(answer)){
            return answers.get(answer);
        }
        return false;
    }
}
