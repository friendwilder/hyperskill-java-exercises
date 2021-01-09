class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();
        int xPosition = robot.getX();
        int yPosition = robot.getY();

        if (toX - xPosition > 0) {
            while (currentDirection != Direction.RIGHT) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
            while (xPosition < toX) {
                robot.stepForward();
                xPosition = robot.getX();
            }
        } else if (toX - xPosition < 0) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            while (xPosition > toX) {
                robot.stepForward();
                xPosition = robot.getX();
            }
        }
        if (toY - yPosition > 0) {
            while (currentDirection != Direction.UP) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            while (yPosition < toY) {
                robot.stepForward();
                yPosition = robot.getY();
            }
        } else if (toY - yPosition < 0) {
            while (currentDirection != Direction.DOWN) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
            while (yPosition > toY) {
                robot.stepForward();
                yPosition = robot.getY();
            }
        }

    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}