public class Main {


    public static void main(String[] args) {
        Triangle triangleA = new Triangle(14,21,32,14,57);
        double TriangleAArea = triangleA.findArea();
        System.out.println(TriangleAArea);

        System.out.println(triangleA.sideLenThree);
        //we are accessing a parameter
        System.out.println(Triangle.numOfSides); //we are accessing a static variable



    }
};





//so we define a Traingle class, create isntance varibales, create cosnstructors,
// //use the varibales to assign them values.
// //Call hte Triangle method and assign number or value
//access a function throuhg those dummy method thigs.


//So basically: I am a chain owner, I create one shop that cna be an instance, the chairs, menu decor are instance variables,
/// I go to a different town and there I can build my new shop having in mind the last shop
//then I also get the customers thorugh some fuction using the dot operator










