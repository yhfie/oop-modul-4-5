package org.example.pages.components;

public class SelectInput {
    private String label, selection[];
    public Input input;
    private int width, value;

    public SelectInput(String label, String selection[], int width){
        this.label = label;
        this.width = width;
        this.selection = selection;
    }
    
    public void draw(){
        // System.out.print("|  " + label + ": ");
        new Label(label, width).draw();
        for (int i = 0; i < selection.length; i++) {
            new Label("[" + (i+1) + "] " + selection[i], width).draw();
        }
        input = new Input("Pilihan");
        input.draw();
        this.value = input.getValueInt();
    }

    public int getValue(){
        return this.value;
    }
}
