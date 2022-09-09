package ru.mirea.task3.human.humanParts;

public class Human {
    public Head head;

    public Hand rightHand;
    public Hand leftHand;

    public Body body;

    public Leg leftLeg;
    public Leg rightLeg;

    private Human(Head head, Hand rightHand, Hand leftHand, Body body, Leg leftLeg, Leg rightLeg) {
        this.head = head;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.body = body;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public static Human createDefaultHuman(){
        Head head = new Head(30);

        Leg leftLeg = new Leg(100);
        Leg rightLeg = new Leg(100);

        Hand leftHand = new Hand(80);
        Hand rightHand = new Hand(80);

        Body body = new Body(100, 30);

        return new Human(head, rightHand, leftHand, body, leftLeg, rightLeg);
    }

    public Head getHead() {
        return head;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Body getBody() {
        return body;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", rightHand=" + rightHand +
                ", leftHand=" + leftHand +
                ", body=" + body +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
