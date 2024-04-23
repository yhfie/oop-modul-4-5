package org.example.pages;

import org.example.pages.components.*;
// import org.example.pages.components.Component;
import java.util.ArrayList;

public abstract class BasePage {
    public String title;
    public int width;
    protected final HLine hline;
    protected final Space space;
    protected final Label label;
    protected ArrayList<Component> components;
    
    public BasePage(String title, int width){
        this.title = title;
        this.width = width;
        this.components = new ArrayList<>();
        this.hline = new HLine(width);
        this.space = new Space(width);
        this.label = new Label(title.toUpperCase(), width);
    }
    
    public abstract void drawContent();
    
    public void draw(){
        this.drawHeader();
        this.space.draw();
        this.drawContent();
        this.drawFooter();
    }

    public void drawHeader(){
        this.hline.draw();
        this.space.draw();
        this.label.draw();
        this.space.draw();
        this.hline.draw();
    }

    public void drawFooter(){
        this.space.draw();
        this.hline.draw();
    }
}
