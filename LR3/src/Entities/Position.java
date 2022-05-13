package Entities;


public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position {" + x + ", " + y + '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null || this.getClass() != other.getClass())
            return false;

        var position = (Position) other;

        return x == position.x && y == position.y;
    }
}
