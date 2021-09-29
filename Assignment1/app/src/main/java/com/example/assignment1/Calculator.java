package com.example.assignment1;
import java.util.ArrayList;

public class Calculator {
    ArrayList<String> calcList = new ArrayList<String>();
    ArrayList<String> history = new ArrayList<String>();

    public void clear() {
        calcList.clear();
    }

    public void push(String value) {
        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
            calcList.add(value);
        }
        else if (Integer.parseInt(value) > 0 || Integer.parseInt(value) < 10) {
            calcList.add(value);
        }
    }

    public int calculate() {
        int result = 0;

        result = Integer.parseInt(calcList.get(0));
        for (int i = 1; i < calcList.size(); i++) {
            if (calcList.get(i).equals("+")) {
                result += Integer.parseInt(calcList.get(i + 1));
            }
            else if (calcList.get(i).equals("-")) {
                result -= Integer.parseInt(calcList.get(i + 1));
            }
            else if (calcList.get(i).equals("*")) {
                result *= Integer.parseInt(calcList.get(i + 1));
            }
            else if (calcList.get(i).equals("/")) {
                result /= Integer.parseInt(calcList.get(i + 1));
            }
        }
        return result;
    }

    public void addToHistory(String his) {
        history.add(his);
    }

    public String getHistory() {
        String historyList = "";
        for (String s : history) {
            historyList += s + "\n";
        }
        return historyList;
    }

}
