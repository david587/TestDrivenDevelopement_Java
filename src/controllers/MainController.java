package controllers;

import javax.swing.JOptionPane;

import models.FileHandler;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;
    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.aboutButton.addActionListener(e -> showMessage());
        new FileHandler().readFile();
    }
    public void showMessage() {
        String content = "Valami\nVerzió: 0.1\nBaráth Dávid\nSzoft II N\n2022-12-12";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), content);        
    }
    
}
