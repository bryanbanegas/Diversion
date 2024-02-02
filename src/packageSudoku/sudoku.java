/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageSudoku;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author adalb
 */
public class sudoku extends JFrame {

    private JPanel[][] grid;

    public sudoku() {
        super("Sudoku Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        grid = new JPanel[9][9];

        // Crear los JPanels para cada celda del Sudoku
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = createCell();
                add(grid[i][j]);
            }
        }

        // Configurar valores iniciales (puedes personalizar esto según tu necesidad)
        setInitialValues();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createCell() {
        JPanel cell = new JPanel();
        cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JTextField textField = new JTextField(2);
        cell.add(textField);

        return cell;
    }

    private void setInitialValues() {
        // Puedes configurar los valores iniciales aquí, por ejemplo:
        setValueAt(0, 0, 5);
        setValueAt(1, 1, 3);
        setValueAt(2, 2, 8);
        // ... Agregar más valores según sea necesario
    }

    private void setValueAt(int row, int col, int value) {
        JTextField textField = (JTextField) grid[row][col].getComponent(0);
        textField.setText(Integer.toString(value));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new sudoku());
    }
}
