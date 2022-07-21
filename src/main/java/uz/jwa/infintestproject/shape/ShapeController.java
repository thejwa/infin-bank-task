package uz.jwa.infintestproject.shape;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
public class ShapeController {
    private final ShapeService service;
    
    @GetMapping("/circle")
    public ResponseEntity<Shape> circle(@PathParam("radius") double radius) {
        return ResponseEntity.ok(service.circle(radius));
    }
    
    @GetMapping("/triangle")
    public ResponseEntity<Shape> triangle(@PathParam("side_one") double sideOne,
                                          @PathParam("side_two") double sideTwo,
                                          @PathParam("side_three") double sideThree) {
        return ResponseEntity.ok(service.triangle(sideOne, sideTwo, sideThree));
    }
    
    @GetMapping("/rectangular")
    public ResponseEntity<Shape> triangle(@PathParam("side_one") double sideOne,
                                          @PathParam("side_two") double sideTwo) {
        return ResponseEntity.ok(service.rectangular(sideOne, sideTwo));
    }
    
    @GetMapping("/square")
    public ResponseEntity<Shape> triangle(@PathParam("side") double side) {
        return ResponseEntity.ok(service.square(side));
    }
}

