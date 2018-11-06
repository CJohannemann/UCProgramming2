/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetests;

import java.util.ArrayList;

/**
 *
 * @author cjohannemann
 */
public class QuestionList {
    private ArrayList<Question> questionList = new ArrayList<>();
    
    public void add(Question q){
        questionList.add(q);
    }
}
