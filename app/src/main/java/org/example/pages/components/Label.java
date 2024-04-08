package org.example.pages.components;

public class Label {
    private int width;
    private String text;

    public Label(String text, int width){
        this.text = text;
        this.width = width;
    }

    public void draw(){
        System.out.print("|  ");
        System.out.print(text);
        for (int i = 0; i < width - text.length()-2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
