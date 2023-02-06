package SystemDesign.SnakeAndLadder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


public class Jumper {
    int startPoint;
    int endPoint;

    public Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
}
