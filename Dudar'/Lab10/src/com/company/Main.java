package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] numbers = {
                {2, 45, 91},
                {90, 47, 82},
                {10, 5, 32},
                {8, 78, 30},
                {25, 1, 27},
                {38, 82, 83}
        };
        int i;
        int j;
        for (i = 0; i < numbers.length; i++){
            for (j = 0; j < numbers[i].length; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println("");
        }
        /*String[][] names = {
                {"Elena", "341"},
                {"Thomas", "273"},
                {"Hamilton", "294"},
                {"Suzie", "402"},
                {"Phil", "401"},
                {"Matt", "388"}
        };

        int min = Integer.parseInt(names[0][1]);
        int index = 0;
        for(int i = 0; i < names.length; i++){
            if (min < Integer.parseInt(names[i][1])){
                min = Integer.parseInt(names[i][1]);
                index = i;
            }
        }
        System.out.println("The most quick player: " + names[index][0]);
        System.out.println("The player's score is " + names[index][1]);*/
    }
}
