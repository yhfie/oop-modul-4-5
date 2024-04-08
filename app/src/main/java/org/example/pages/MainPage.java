package org.example.pages;

import org.example.pages.components.*;

public class MainPage {
    private String title;
    private int width;

    private final HLine hline;
    private final Space space;
    private final Label label;

    public MainPage(String title, int width){
        this.width = width;
        this.title = title;
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
        String [] pages = {"Input Password", "Tampil Password", "Keluar Aplikasi"};
        SelectInput pageSelect = new SelectInput("Pilih halaman berikut", pages, this.width);

        int select;

        new Label("Selamat datang di aplikasi Password Vault", width).draw();
        new Label("Simpan password anda dengan aman di sini", width).draw();
        this.space.draw();

        pageSelect.draw();
        select = pageSelect.getValue() - 1;
        switch (select) {
            case 0 -> {
                drawFooter();
                new InputPage("Inputan Password", this.width).draw();
            }
            case 1 -> {
                drawFooter();
                new PasswordListPage("List Password Tersimpan", this.width).draw();
            }
            case 2 -> {
                this.space.draw();
                new Label("Terima kasih telah menggunakan aplikasi", this.width).draw();
                drawFooter();
            }
            default -> {
                new MainPage(this.title, this.width).draw();
            }
                
        }
    }

    public void drawFooter(){
        this.space.draw();
        this.hline.draw();
    }
}
