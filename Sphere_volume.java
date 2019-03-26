package javaallprogram;
public class Sphere_volume {
    public static void main(String[] args) {
         double Radius, Sphere_area, Sphere_volume;
         Radius=4;
         Sphere_area=4*Math.PI*Math.pow(Radius,2);
         Sphere_volume=4*Math.PI*Math.pow(Radius,3)/3;
         System.out.println("Sphere area is: "+Sphere_area+"\nSphere volume is: "+Sphere_volume);         
    }
}
