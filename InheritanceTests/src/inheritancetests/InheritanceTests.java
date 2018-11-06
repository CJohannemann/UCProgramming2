
package inheritancetests;

import java.util.ArrayList;
import java.util.Scanner;


public class InheritanceTests {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    Question q = new Question();
    q.setText("Who was the inventor of Java?");
    q.setAnswer("James Gosling");
    
    q.display();
    
        System.out.println("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
        
        
//        
        MulitpleChoiceQuestion ql = new MulitpleChoiceQuestion();
        ql.setText("Where was java born?");
        ql.addChoice("Austria", false);
        ql.addChoice("France", false);
        ql.addChoice("USA", false);
        ql.addChoice("Canada", true);
        ql.display();
        System.out.println("your answer");
        String response2 = in.nextLine();
        System.out.println(ql.checkAnswer(response2));
//           question.setText("In which country was the inventor of java born?");
//           question.setAnswer("2");
//           question.addChoice("Australia", false);
//           question.addChoice("Canada", true);
//           question.addChoice("Denmark", false);
//           question.addChoice("usA", false);
//           
//           question.display();
//           
//           System.out.println("Your answer: ");
//        String response1 = in.nextLine();
//        System.out.println(question.checkAnswer(response1));
    }
}
