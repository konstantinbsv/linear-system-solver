package solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

class LinearEquation {
    private double[] equation;

    public LinearEquation(int numOfCoeffs) {
        equation = new double[numOfCoeffs+1];
    }

    public void fillEquationFromFile(File file) {

        try (Scanner scanner = new Scanner(file)) {
            int i = 0;
            while (scanner.hasNext()) {
                equation[i] = scanner.nextDouble();
                i++;
            }
        } catch (FileNotFoundException fileException) {
            System.out.print("File not found" + file);
        }
    }


}