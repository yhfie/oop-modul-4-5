package org.example.pages;

import org.example.models.PasswordStore;
import org.example.pages.components.*;

public class InputPage extends BasePage{
    private String account_name, username, pass;

    public InputPage(int width){
        super("Inputan Password", width);

        // this.components.add(new Input("Nama app"));
        // this.components.add(new Input("Username"));
        // this.components.add(new Input("Password"));

        // String [] categories = {"Belum terkategori", "Aplikasi web", "Aplikasi mobile", "Akun lainnya"};

        // SelectInput select = new SelectInput("Pilihan", categories, width);

        // this.components.add(select);
    }

    @Override
    public void drawContent(){
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
        int cat = select.getValue() - 1;

        DataPassword.passData.add(new PasswordStore(account_name, username, pass, cat));

        this.space.draw();
        new Label("Input password berhasil dibuat", width).draw();
        new MainPage(width).draw();
    }

}
