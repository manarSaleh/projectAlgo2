/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Vertex {
boolean isVisit;
char label;//A
int position;//0

//we can make contain method that return true if vertex has the same lable or position

Vertex(int position){
    this.position = position;
}

Vertex(int position,char label){
    this.position=position;
    this.label=label;
}

   public boolean equals(Vertex t){
        if (t.position == this.position) return true;
        return false;
    }

    public boolean isIsVisit() {
        return isVisit;
    }

    public void setIsVisit(boolean isVisit) {
        this.isVisit = isVisit;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    

}
