package com.Catalin;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Catalin", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    /** Method overloading means using the same method, same name but with different parameters.
     */

//    public static void calculateScore(){
//        System.out.println("No player name, no player score.");
//    }
    /** Simply changing the return data (from int to void) type will not work whe using method overload. The method
     *  name remains the same, as well as the parameters resulting in a duplicate method.
     */
}
