public class A3_Color extends World {

    //variables
    public int randomRed;
    public int randomDraw;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        randomDraw = plane.random(0, 2);
        if(randomDraw == 0){
            plane.hasTrail = true;
        }

        if(randomDraw == 1){
            plane.hasTrail = false;
        }

        plane.trailWidth = 100;
        randomRed = plane.random(0, 255);
        //r= red, g= green, b= blue
        //the number have to be between 0-255
        plane.setTrailColor(randomRed, 0, 170);
        plane.move(100);
        square();
        plane.teleport(551,528);

    } // end of go

    public void square(){

        randomRed = plane.random(0, 255);

        plane.setTrailColor(randomRed, 0, 170);

        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);


    } //end of square



} // end of file
