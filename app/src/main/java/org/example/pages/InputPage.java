package org.example.pages;


import org.example.models.PasswordStore;
import org.example.pages.components.*;

public class InputPage {
    private String title, account_name, username, pass;
    private int width;

    private final HLine hline;
    private final Space space;
    private final Label label;

    public InputPage(String title, int width){
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
        new Label("Inputan Password Baru", width);
        Input input1 = new Input("Judul Password");
        input1.draw();
        this.account_name = input1.getValue();

        Input input2 = new Input("Username");
        input2.draw();
        this.username = input2.getValue();

        Input input3 = new Input("Password");
        input3.draw();
        this.pass = input3.getValue();

        String [] categories = {"Belum terkategori", "Aplikasi web", "Aplikasi mobile", "Akun lainnya"};
        SelectInput select = new SelectInput("Pilihan", categories, width);
        select.draw();
        int cat = select.getValue();

        DataPassword.passData.add(new PasswordStore(account_name, username, pass, cat));

        this.space.draw();
        new Label("Input password berhasil dibuat", width).draw();
        new MainPage("Aplikasi Store Password", width).draw();
    }

    public void drawFooter(){
        this.space.draw();
        this.hline.draw();
    }

}
