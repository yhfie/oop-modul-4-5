package org.example.pages.components;
import java.util.Scanner;

public class Input implements Component{
    private String label;
    public Scanner input = new Scanner(System.in);;
    private String value;

    public Input(String text){
        this.label = text;
    }

    public void draw(){
        System.out.print("|  " + label + ": ");
        this.value = input.nextLine();
    }

    public String getValue(){
        return this.value;
    }

    public int getValueInt(){
        return Integer.parseInt(value);
    }

    public double getValueDouble(){
        return Double.parseDouble(value);
    }

}
