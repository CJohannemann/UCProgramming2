
package inheritancetests;

public class Question {
    private String text;
    private String answer;

    
    public Question(){
        text = "";
        answer = "";
    }
    
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    
    public void display(){
        System.out.println(getText());
    }
    
}
