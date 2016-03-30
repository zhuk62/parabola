package Login;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // ��� ���������� ������������� ������� Scanner
        Scanner scanner = new Scanner(System.in);
        // ��� ����, ����� ����� ����� ������������� �����
        // ���������� �� ������� ������, � �� �������,
        // ���������� ���������� ������� Locale
        scanner.useLocale(new Locale("Russian"));

        // ��� ������ - ������� PrintWriter
        PrintWriter printWriter = new PrintWriter(System.out);

        // ��������� ������ �������� �������
        int size;
        size = scanner.nextInt();

        // ����� ������� ������� � �������, ��������� ��
        // �������� ������������ �����
        double[][] matrix = new double[size][size + 1];

        // ������� ����� ����� ������ (size) x (size + 1),
        // c ������ ������� ��������� ������        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size + 1; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // ��������� ����������� �������� �������
        double eps=0.1;
        //eps = scanner.nextDouble();

        // ������ ������ �������� ����������� �� ���������� ��������,
        // ������ �������� ����� ����� ����� � �������, �.�. size,
        // ������ �������� ������ ���������� ��������� ��� ������
        double[] previousVariableValues = new double[size];
        for (int i = 0; i < size; i++) {
            previousVariableValues[i] = 0.0;
        }

        // ����� ��������� ������������ ������� �� ��� ���,
        // ���� �� ����� ���������� ����������� ��������
        while (true) {
            // ������ ������ �������� ����������� �� ������� ����
            double[] currentVariableValues = new double[size];

            // ��������� �������� ����������� �� ������� ��������
            // � ������������ � �������������� ���������
            for (int i = 0; i < size; i++) {
                // �������������� i-�� ����������� ���������
                // ���������� ����� i-�� ������ �������
                currentVariableValues[i] = matrix[i][size];

                // �������� ����� �� ���� �������� �� i-�� �����������
                for (int j = 0; j < size; j++) {
                    if (i != j) {
                        currentVariableValues[i] -= matrix[i][j] * previousVariableValues[j];
                    }
                }

                // ����� �� ����������� ��� i-�� �����������
                currentVariableValues[i] /= matrix[i][i];
            }

            // ��������� ������� ����������� ������������ ���������� ��������
            double error = 0.0;

            for (int i = 0; i < size; i++) {
                error += Math.abs(currentVariableValues[i] - previousVariableValues[i]);
            }

            // ���� ����������� �������� ����������, �� ��������� �������
            if (error < eps) {
                break;
            }

            // ��������� � ��������� ��������, ���
            // ��� ������� �������� �����������
            // ���������� ���������� �� ���������� ��������
            previousVariableValues = currentVariableValues;
        }

        // ������� ��������� �������� �����������
        for (int i = 0; i < size; i++) {
            printWriter.print(previousVariableValues[i] + " ");
        }

        // ����� ���������� ��������� ���������� �������
        // ������ ����� � ������
        scanner.close();
        printWriter.close();
    }
}