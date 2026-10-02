public class A5_Square extends World {

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 3;
        plane.setTrailColor(100, 10, 200);

        plane.setAngle(90);
        square(111);
        plane.hasTrail = false;
      plane.move(200);
        square(20);
        bigSquare();

        //todo: make a square witha random size between 10 and 300 pixels
    }

    //parameter is special varible the is made in the paranthathis of a method
    // it only used in the method
    //integers, boolean
    public void square(int sideLength) {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(sideLength);
        plane.turnLeft(90);
        plane.move(sideLength);
        plane.turnLeft(90);
        plane.move(sideLength);
        plane.turnLeft(90);
        plane.move(sideLength);
        // notice the direction your plane is facing at this point
    } // end of square

    //todo: make anotehr method called bigSquare that draws a big square

    public void bigSquare() {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        // notice the direction your plane is facing at this point
    } // end of bigSquare

} // end of file


