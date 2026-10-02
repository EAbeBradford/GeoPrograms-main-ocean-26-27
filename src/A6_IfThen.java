public class A6_IfThen extends World {

    public int randNum;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(350, 400);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        //todo: make an if statement that checks if randNum is 3, then draw your pasted method
        if(randNum == 3) {
            plane.circle(100);
        }

    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }// end of rectable

    //todo: take a method that you made in anther file and past into this one.

}//end of file



