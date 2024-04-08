package org.example.pages;

import org.example.models.PasswordStore;
import org.example.pages.components.*;

public class PasswordListPage {
    private String title;
    private int width;

    private final HLine hline;
    private final Space space;
    private final Label label;

    public PasswordListPage(String title, int width){
        this.title = title;
        this.width = width;
        this.hline = new HLine(width);
        this.space = new Space(width);
        this.label = new Label(title.toUpperCase(), width);
    }

    public void draw(){
        this.drawHeader();
        this.space.draw();
        this.drawContent();
    }

    public void drawHeader(){
        this.hline.draw();
        this.space.draw();
        this.label.draw();
        this.space.draw();
        this.hline.draw();
    }
    
    private void drawContent(){
        int size = DataPassword.passData.size();
        
        new Label("Terdapat " + size + " tersimpan.", width).draw();
        this.space.draw();
        for (PasswordStore passData : DataPassword.passData) {
            System.out.print("|  |  " + passData.name);
            for (int i = 0; i < 20 - passData.name.length(); i++) {
                System.out.print(" ");
            }
            System.out.print("|  " + passData.username);
            for (int i = 0; i < 20 - passData.username.length(); i++) {
                System.out.print(" ");
            }
            System.out.print("|  " + passData.getPassword());
            for (int i = 0; i < 20 - passData.getPassword().length(); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        this.space.draw();
        this.hline.draw();
        
        new MainPage("Aplikasi Store Password", width).draw();
    }
}
