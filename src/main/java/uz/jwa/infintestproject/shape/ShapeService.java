package uz.jwa.infintestproject.shape;

import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    
    public Shape circle(double radius) {
        double length = 2 * Math.PI * radius;
        double surface = Math.PI * Math.pow(radius, 2);
        return Shape.builder()
                .name("CIRCLE")
                .length(length)
                .surface(surface)
                .build();
    }
    
    public Shape triangle(double sideOne, double sideTwo, double sideThree) {
        double length = sideOne + sideTwo + sideThree;
        
        double semiPerimeter = length / 2;
        //area is calculated using Heron's Formula
        double surface = Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
        
        return Shape.builder()
                .name("TRIANGLE")
                .length(length)
                .surface(surface)
                .build();
    }
    
    public Shape rectangular(double sideOne, double sideTwo) {
        double length = 2 * (sideOne + sideTwo);
        double surface = sideOne * sideTwo;
        
        return Shape.builder()
                .name("RECTANGULAR")
                .length(length)
                .surface(surface)
                .build();
    }
    
    public Shape square(double side) {
        return rectangular(side, side);
    }
}
