package uz.jwa.infintestproject.shape;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shape {
    private String name;
    private double length;
    private double surface;
}
