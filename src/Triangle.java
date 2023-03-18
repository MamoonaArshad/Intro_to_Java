public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    // we have created some instance variables for the class Triangle.
    //In order to be initialised they need to be called by the constructor


    //constructor:

    public Triangle (
            double base,
            double height,
            double sideLenOne,
            double sideLenTwo,
            double sideLenThree

    ) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

        //now all the attributes have been assigned a value and they are accessible
    }

    //now let's create a function that uses the attributes

    public double findArea() {
        return (this.base * this.height)/2;
    }

}
