package org.example.pages;

import org.example.models.PasswordStore;
import org.example.pages.components.*;

public class PasswordListPage extends BasePage{
    public PasswordListPage(int width){
        super("List Password Tersimpan", width);
    }
    
    @Override
    public void drawContent(){
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
            System.out.print("|  " + passData.getCategory());
            for (int i = 0; i < 20 - passData.getCategory().length(); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        this.space.draw();
        this.hline.draw();
        
        new MainPage(this.width).draw();
    }
}
