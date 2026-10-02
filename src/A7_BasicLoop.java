public class A7_BasicLoop extends World {

    public void go() {
        plane.hasTrail = true;
        plane.trailWidth = 30;

        for(int x=0;x<5;x=x+1) {
//            // make a row of squares using teleport
//            plane.teleport(100*x, 100);
//
//            //todo: make squares not on top of eachother
//            System.out.println("x: " + x);
//            plane.square(100);
//            //todo: squares are boring, copy another method into the class and use it!
            plane.teleport(x*100, 100);
            plane.setTrailColor(x*100, 0, 0);
            square();
        } //end of for loop
    } //end of go

    //todo: make a mehtod called square
    public void square(){
        //todo: make a loop that loops 4 times
        for(int y = 0; y < 4; y++){

            //todo: draw a square only using 2 lines of code
            plane.move(50);
            plane.turnLeft(90);

        } //end of for

    }//end of square

} //end of file
