package com.example.schiebespiel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    @FXML
    private Button fieldOne;
    @FXML
    private Button fieldTwo;
    @FXML
    private Button fieldThree;
    @FXML
    private Button fieldFour;
    @FXML
    private Button fieldFive;
    @FXML
    private Button fieldSix;
    @FXML
    private Button fieldSeven;
    @FXML
    private Button fieldEight;
    @FXML
    private Button fieldNine;
    @FXML
    private Button fieldTen;
    @FXML
    private Button fieldEleven;
    @FXML
    private Button fieldTwelve;
    @FXML
    private Button field13;
    @FXML
    private Button field14;
    @FXML
    private Button field15;
    @FXML
    private Button fieldBlank;

    @FXML
    private Label winLabel;
    @FXML
    private Button restartButton;
    @FXML
    private Button solveButton;
    @FXML
    private Label plays;

    private final Double[][] states = {{14.0, 14.0}, {121.0, 14.0}, {228.0, 14.0}, {335.0, 14.0},
                                        {14.0, 121.0}, {121.0, 121.0}, {228.0, 121.0}, {335.0, 121.0},
                                        {14.0, 229.0}, {121.0, 229.0}, {228.0, 229.0}, {335.0, 229.0},
                                        {14.0, 336.0}, {121.0, 336.0}, {228.0, 336.0}, {335.0, 336.0}};

    private int stateOne = 1;
    private int stateTwo = 2;
    private int stateThree = 3;
    private int stateFour = 4;
    private int stateFive = 5;
    private int stateSix = 6;
    private int stateSeven = 7;
    private int stateEight = 8;
    private int stateNine = 9;
    private int stateTen = 10;
    private int stateEleven = 11;
    private int stateTwelve = 12;
    private int state13 = 13;
    private int state14 = 14;
    private int state15 = 15;
    private int stateBlank = 16;


    @FXML
    public void onePressed() {
        if (((stateOne + 1) == stateBlank && stateOne != 4 && stateOne != 8 && stateOne != 12) || ((stateOne - 1) == stateBlank && stateOne != 5 && stateOne != 9 && stateOne != 13) || (stateOne + 4) == stateBlank || (stateOne - 4) == stateBlank)
        {
            fieldOne.setLayoutX(states[stateBlank - 1][0]);
            fieldOne.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateOne - 1][0]);
            fieldBlank.setLayoutY(states[stateOne - 1][1]);

            int state = stateOne;
            stateOne = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void twoPressed() {
        if (((stateTwo + 1) == stateBlank && stateTwo != 4 && stateTwo != 8 && stateTwo != 12) || ((stateTwo - 1) == stateBlank && stateTwo != 5 && stateTwo != 9 && stateTwo != 13) || (stateTwo + 4) == stateBlank || (stateTwo - 4) == stateBlank)
        {
            fieldTwo.setLayoutX(states[stateBlank - 1][0]);
            fieldTwo.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateTwo - 1][0]);
            fieldBlank.setLayoutY(states[stateTwo - 1][1]);

            int state = stateTwo;
            stateTwo = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void threePressed() {
        if (((stateThree + 1) == stateBlank && stateThree != 4 && stateThree != 8 && stateThree != 12) || ((stateThree - 1) == stateBlank && stateThree != 5 && stateThree != 9 && stateThree != 13) || (stateThree + 4) == stateBlank || (stateThree - 4) == stateBlank)
        {
            fieldThree.setLayoutX(states[stateBlank - 1][0]);
            fieldThree.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateThree - 1][0]);
            fieldBlank.setLayoutY(states[stateThree - 1][1]);

            int state = stateThree;
            stateThree = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void fourPressed() {
        if (((stateFour + 1) == stateBlank && stateFour != 4 && stateFour != 8 && stateFour != 12) || ((stateFour - 1) == stateBlank && stateFour != 5 && stateFour != 9 && stateFour != 13) || (stateFour + 4) == stateBlank || (stateFour - 4) == stateBlank)
        {
            fieldFour.setLayoutX(states[stateBlank - 1][0]);
            fieldFour.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateFour - 1][0]);
            fieldBlank.setLayoutY(states[stateFour - 1][1]);

            int state = stateFour;
            stateFour = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void fivePressed() {
        if (((stateFive + 1) == stateBlank && stateFive != 4 && stateFive != 8 && stateFive != 12) || ((stateFive - 1) == stateBlank && stateFive != 5 && stateFive != 9 && stateFive != 13) || (stateFive + 4) == stateBlank || (stateFive - 4) == stateBlank)
        {
            fieldFive.setLayoutX(states[stateBlank - 1][0]);
            fieldFive.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateFive - 1][0]);
            fieldBlank.setLayoutY(states[stateFive - 1][1]);

            int state = stateFive;
            stateFive = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void sixPressed() {
        if (((stateSix + 1) == stateBlank && stateSix != 4 && stateSix != 8 && stateSix != 12) || ((stateSix - 1) == stateBlank && stateSix != 5 && stateSix != 9 && stateSix != 13) || (stateSix + 4) == stateBlank || (stateSix - 4) == stateBlank)
        {
            fieldSix.setLayoutX(states[stateBlank - 1][0]);
            fieldSix.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateSix - 1][0]);
            fieldBlank.setLayoutY(states[stateSix - 1][1]);

            int state = stateSix;
            stateSix = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void sevenPressed() {
        if (((stateSeven + 1) == stateBlank && stateSeven != 4 && stateSeven != 8 && stateSeven != 12) || ((stateSeven - 1) == stateBlank && stateSeven != 5 && stateSeven != 9 && stateSeven != 13) || (stateSeven + 4) == stateBlank || (stateSeven - 4) == stateBlank)
        {
            fieldSeven.setLayoutX(states[stateBlank - 1][0]);
            fieldSeven.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateSeven - 1][0]);
            fieldBlank.setLayoutY(states[stateSeven - 1][1]);

            int state = stateSeven;
            stateSeven = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void eightPressed() {
        if (((stateEight + 1) == stateBlank && stateEight != 4 && stateEight != 8 && stateEight != 12) || ((stateEight - 1) == stateBlank && stateEight != 5 && stateEight != 9 && stateEight != 13) || (stateEight + 4) == stateBlank || (stateEight - 4) == stateBlank)
        {
            fieldEight.setLayoutX(states[stateBlank - 1][0]);
            fieldEight.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateEight - 1][0]);
            fieldBlank.setLayoutY(states[stateEight - 1][1]);

            int state = stateEight;
            stateEight = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void ninePressed() {
        if (((stateNine + 1) == stateBlank && stateNine != 4 && stateNine != 8 && stateNine != 12) || ((stateNine - 1) == stateBlank && stateNine != 5 && stateNine != 9 && stateNine != 13) || (stateNine + 4) == stateBlank || (stateNine - 4) == stateBlank)
        {
            fieldNine.setLayoutX(states[stateBlank - 1][0]);
            fieldNine.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateNine - 1][0]);
            fieldBlank.setLayoutY(states[stateNine - 1][1]);

            int state = stateNine;
            stateNine = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void tenPressed() {
        if (((stateTen + 1) == stateBlank && stateTen != 4 && stateTen != 8 && stateTen != 12) || ((stateTen - 1) == stateBlank && stateTen != 5 && stateTen != 9 && stateTen != 13) || (stateTen + 4) == stateBlank || (stateTen - 4) == stateBlank)
        {
            fieldTen.setLayoutX(states[stateBlank - 1][0]);
            fieldTen.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateTen - 1][0]);
            fieldBlank.setLayoutY(states[stateTen - 1][1]);

            int state = stateTen;
            stateTen = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void elevenPressed() {
        if (((stateEleven + 1) == stateBlank && stateEleven != 4 && stateEleven != 8 && stateEleven != 12) || ((stateEleven - 1) == stateBlank && stateEleven != 5 && stateEleven != 9 && stateEleven != 13) || (stateEleven + 4) == stateBlank || (stateEleven - 4) == stateBlank)
        {
            fieldEleven.setLayoutX(states[stateBlank - 1][0]);
            fieldEleven.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateEleven - 1][0]);
            fieldBlank.setLayoutY(states[stateEleven - 1][1]);

            int state = stateEleven;
            stateEleven = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void twelvePressed() {
        if (((stateTwelve + 1) == stateBlank && stateTwelve != 4 && stateTwelve != 8 && stateTwelve != 12) || ((stateTwelve - 1) == stateBlank && stateTwelve != 5 && stateTwelve != 9 && stateTwelve != 13) || (stateTwelve + 4) == stateBlank || (stateTwelve - 4) == stateBlank)
        {
            fieldTwelve.setLayoutX(states[stateBlank - 1][0]);
            fieldTwelve.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[stateTwelve - 1][0]);
            fieldBlank.setLayoutY(states[stateTwelve - 1][1]);

            int state = stateTwelve;
            stateTwelve = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void oneThreePressed() {
        if (((state13 + 1) == stateBlank && state13 != 4 && state13 != 8 && state13 != 12) || ((state13 - 1) == stateBlank && state13 != 5 && state13 != 9 && state13 != 13) || (state13 + 4) == stateBlank || (state13 - 4) == stateBlank)
        {
            field13.setLayoutX(states[stateBlank - 1][0]);
            field13.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[state13 - 1][0]);
            fieldBlank.setLayoutY(states[state13 - 1][1]);

            int state = state13;
            state13 = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void oneFourPressed() {
        if (((state14 + 1) == stateBlank && state14 != 4 && state14 != 8 && state14 != 12) || ((state14 - 1) == stateBlank && state14 != 5 && state14 != 9 && state14 != 13) || (state14 + 4) == stateBlank || (state14 - 4) == stateBlank)
        {
            field14.setLayoutX(states[stateBlank - 1][0]);
            field14.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[state14 - 1][0]);
            fieldBlank.setLayoutY(states[state14 - 1][1]);

            int state = state14;
            state14 = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    @FXML
    public void oneFivePressed() {
        if (((state15 + 1) == stateBlank && state15 != 4 && state15 != 8 && state15 != 12) || ((state15 - 1) == stateBlank && state15 != 5 && state15 != 9 && state15 != 13) || (state15 + 4) == stateBlank || (state15 - 4) == stateBlank)
        {
            field15.setLayoutX(states[stateBlank - 1][0]);
            field15.setLayoutY(states[stateBlank - 1][1]);
            fieldBlank.setLayoutX(states[state15 - 1][0]);
            fieldBlank.setLayoutY(states[state15 - 1][1]);

            int state = state15;
            state15 = stateBlank;
            stateBlank = state;

            testColor();
            testwin();
        }
    }

    static void shuffleArray(int[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    @FXML
    public void restart() {
        int[] fields = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        shuffleArray(fields);

        stateOne = fields[0];
        stateTwo = fields[1];
        stateThree = fields[2];
        stateFour = fields[3];
        stateFive = fields[4];
        stateSix = fields[5];
        stateSeven = fields[6];
        stateEight = fields[7];
        stateNine = fields[8];
        stateTen = fields[9];
        stateEleven  = fields[10];
        stateTwelve  = fields[11];
        state13  = fields[12];
        state14  = fields[13];
        state15  = fields[14];
        stateBlank = fields[15];

        fieldOne.setLayoutX(states[stateOne - 1][0]);
        fieldOne.setLayoutY(states[stateOne - 1][1]);
        fieldTwo.setLayoutX(states[stateTwo - 1][0]);
        fieldTwo.setLayoutY(states[stateTwo - 1][1]);
        fieldThree.setLayoutX(states[stateThree - 1][0]);
        fieldThree.setLayoutY(states[stateThree - 1][1]);
        fieldFour.setLayoutX(states[stateFour - 1][0]);
        fieldFour.setLayoutY(states[stateFour - 1][1]);
        fieldFive.setLayoutX(states[stateFive - 1][0]);
        fieldFive.setLayoutY(states[stateFive - 1][1]);
        fieldSix.setLayoutX(states[stateSix - 1][0]);
        fieldSix.setLayoutY(states[stateSix - 1][1]);
        fieldSeven.setLayoutX(states[stateSeven - 1][0]);
        fieldSeven.setLayoutY(states[stateSeven - 1][1]);
        fieldEight.setLayoutX(states[stateEight - 1][0]);
        fieldEight.setLayoutY(states[stateEight - 1][1]);
        fieldNine.setLayoutX(states[stateNine - 1][0]);
        fieldNine.setLayoutY(states[stateNine - 1][1]);
        fieldTen.setLayoutX(states[stateTen - 1][0]);
        fieldTen.setLayoutY(states[stateTen - 1][1]);
        fieldEleven.setLayoutX(states[stateEleven - 1][0]);
        fieldEleven.setLayoutY(states[stateEleven - 1][1]);
        fieldTwelve.setLayoutX(states[stateTwelve - 1][0]);
        fieldTwelve.setLayoutY(states[stateTwelve - 1][1]);
        field13.setLayoutX(states[state13 - 1][0]);
        field13.setLayoutY(states[state13 - 1][1]);
        field14.setLayoutX(states[state14 - 1][0]);
        field14.setLayoutY(states[state14 - 1][1]);
        field15.setLayoutX(states[state15 - 1][0]);
        field15.setLayoutY(states[state15 - 1][1]);
        fieldBlank.setLayoutX(states[stateBlank - 1][0]);
        fieldBlank.setLayoutY(states[stateBlank - 1][1]);

        restartButton.setVisible(false);
        winLabel.setVisible(false);

        fieldOne.setDisable(false);
        fieldTwo.setDisable(false);
        fieldThree.setDisable(false);
        fieldFour.setDisable(false);
        fieldFive.setDisable(false);
        fieldSix.setDisable(false);
        fieldSeven.setDisable(false);
        fieldEight.setDisable(false);
        fieldNine.setDisable(false);
        fieldTen.setDisable(false);
        fieldEleven.setDisable(false);
        fieldTwelve.setDisable(false);
        field13.setDisable(false);
        field14.setDisable(false);
        field15.setDisable(false);

        solveButton.setDisable(false);

        testColor();
    }

    public void testwin() {
        if ((stateOne == 1)
            && (stateTwo == 2)
            && (stateThree == 3)
            && (stateFour == 4)
            && (stateFive == 5)
            && (stateSix == 6)
            && (stateSeven == 7)
            && (stateEight == 8)
            && (stateNine == 9)
            && (stateTen == 10)
            && (stateEleven == 11)
            && (stateTwelve == 12)
            && (state13 == 13)
            && (state14 == 14)
            && (state15 == 15))
        {
            restartButton.setVisible(true);
            winLabel.setVisible(true);

            fieldOne.setDisable(true);
            fieldTwo.setDisable(true);
            fieldThree.setDisable(true);
            fieldFour.setDisable(true);
            fieldFive.setDisable(true);
            fieldSix.setDisable(true);
            fieldSeven.setDisable(true);
            fieldEight.setDisable(true);
            fieldNine.setDisable(true);
            fieldTen.setDisable(true);
            fieldEleven.setDisable(true);
            fieldTwelve.setDisable(true);
            field13.setDisable(true);
            field14.setDisable(true);
            field15.setDisable(true);

            solveButton.setDisable(true);

            plays.setText(String.valueOf(Integer.parseInt(plays.getText()) + 1));
        }
    }

    public void testColor() {
        if (stateOne == 1) {
            fieldOne.setTextFill(Color.GREEN);
        } else {
            fieldOne.setTextFill(Color.BLACK);
        }
        if (stateTwo == 2) {
            fieldTwo.setTextFill(Color.GREEN);
        } else {
            fieldTwo.setTextFill(Color.BLACK);
        }
        if (stateThree == 3) {
            fieldThree.setTextFill(Color.GREEN);
        } else {
            fieldThree.setTextFill(Color.BLACK);
        }if (stateFour == 4) {
            fieldFour.setTextFill(Color.GREEN);
        } else {
            fieldFour.setTextFill(Color.BLACK);
        }
        if (stateFive == 5) {
            fieldFive.setTextFill(Color.GREEN);
        } else {
            fieldFive.setTextFill(Color.BLACK);
        }
        if (stateSix == 6) {
            fieldSix.setTextFill(Color.GREEN);
        } else {
            fieldSix.setTextFill(Color.BLACK);
        }
        if (stateSeven == 7) {
            fieldSeven.setTextFill(Color.GREEN);
        } else {
            fieldSeven.setTextFill(Color.BLACK);
        }
        if (stateEight == 8) {
            fieldEight.setTextFill(Color.GREEN);
        } else {
            fieldEight.setTextFill(Color.BLACK);
        }
        if (stateNine == 9) {
            fieldNine.setTextFill(Color.GREEN);
        } else {
            fieldNine.setTextFill(Color.BLACK);
        }
        if (stateTen == 10) {
            fieldTen.setTextFill(Color.GREEN);
        } else {
            fieldTen.setTextFill(Color.BLACK);
        }
        if (stateEleven == 11) {
            fieldEleven.setTextFill(Color.GREEN);
        } else {
            fieldEleven.setTextFill(Color.BLACK);
        }
        if (stateTwelve == 12) {
            fieldTwelve.setTextFill(Color.GREEN);
        } else {
            fieldTwelve.setTextFill(Color.BLACK);
        }
        if (state13 == 13) {
            field13.setTextFill(Color.GREEN);
        } else {
            field13.setTextFill(Color.BLACK);
        }
        if (state14 == 14) {
            field14.setTextFill(Color.GREEN);
        } else {
            field14.setTextFill(Color.BLACK);
        }
        if (state15 == 15) {
            field15.setTextFill(Color.GREEN);
        } else {
            field15.setTextFill(Color.BLACK);
        }
    }

    @FXML
    private void solve() {
        stateOne = 1;
        stateTwo = 2;
        stateThree = 3;
        stateFour = 4;
        stateFive = 5;
        stateSix = 6;
        stateSeven = 7;
        stateEight = 8;
        stateNine = 9;
        stateTen = 10;
        stateEleven = 11;
        stateTwelve = 12;
        state13 = 13;
        state14 = 14;
        state15 = 15;
        stateBlank = 16;

        fieldOne.setLayoutX(states[0][0]);
        fieldOne.setLayoutY(states[0][1]);
        fieldTwo.setLayoutX(states[1][0]);
        fieldTwo.setLayoutY(states[1][1]);
        fieldThree.setLayoutX(states[2][0]);
        fieldThree.setLayoutY(states[2][1]);
        fieldFour.setLayoutX(states[3][0]);
        fieldFour.setLayoutY(states[3][1]);
        fieldFive.setLayoutX(states[4][0]);
        fieldFive.setLayoutY(states[4][1]);
        fieldSix.setLayoutX(states[5][0]);
        fieldSix.setLayoutY(states[5][1]);
        fieldSeven.setLayoutX(states[6][0]);
        fieldSeven.setLayoutY(states[6][1]);
        fieldEight.setLayoutX(states[7][0]);
        fieldEight.setLayoutY(states[7][1]);
        fieldNine.setLayoutX(states[8][0]);
        fieldNine.setLayoutY(states[8][1]);
        fieldTen.setLayoutX(states[9][0]);
        fieldTen.setLayoutY(states[9][1]);
        fieldEleven.setLayoutX(states[10][0]);
        fieldEleven.setLayoutY(states[10][1]);
        fieldTwelve.setLayoutX(states[11][0]);
        fieldTwelve.setLayoutY(states[11][1]);
        field13.setLayoutX(states[12][0]);
        field13.setLayoutY(states[12][1]);
        field14.setLayoutX(states[13][0]);
        field14.setLayoutY(states[13][1]);
        field15.setLayoutX(states[14][0]);
        field15.setLayoutY(states[14][1]);
        fieldBlank.setLayoutX(states[15][0]);
        fieldBlank.setLayoutY(states[15][1]);

        testColor();
        testwin();
    }
}