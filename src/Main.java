public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        System.out.println(point1);
        point1.setXY(3,4);
        System.out.println(point1);

        MoveablePoint moveablePoint1 = new MoveablePoint(5, 5, 2, 3);
        System.out.println(moveablePoint1);
        moveablePoint1.setSpeed(5,4);
        System.out.println(moveablePoint1);
        moveablePoint1.move();
        System.out.println(moveablePoint1);
    }
}
