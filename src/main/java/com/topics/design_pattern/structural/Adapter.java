package com.topics.design_pattern.structural;

/**
 * Link : https://www.youtube.com/watch?v=Y7DYhe6efQY&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=9
 */
public class Adapter implements Pen {

    private PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String message) {
        pilotPen.mark(message);
    }
}


class AssignmentWork {

    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    void setPen(Pen pen) {
        this.pen = pen;
    }

    void writeAssignment(String assignment) {
        pen.write(assignment);
    }
}

class School {

    public static void main(String[] args) {

        Pen pen = new Adapter();

        AssignmentWork aw1 = new AssignmentWork();
        aw1.setPen(pen);
        aw1.writeAssignment("My name is mukesh");

        AssignmentWork aw2 = new AssignmentWork();
        aw2.setPen(pen);

        aw2.writeAssignment("My name is joshi");
    }

}

interface Pen {
    void write(String message);
}

class PilotPen {

    void mark(String message) {
        System.out.println("Inside Pilot Pen : " + message);
    }

}

