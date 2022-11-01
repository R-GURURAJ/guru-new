/*class Innerbox {
1.)Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function. 
    
} */

public class box {
    public static void main(String[] args) {
        name s=new name();
        double ans=s.findArea(10.7,2.78,8.9);
        System.out.println(ans);
    }
}
class name {
    double findArea(double w,double h,double d ){
        double ans=w*h*d;
        return ans;
    }
}