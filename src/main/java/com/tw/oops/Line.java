package com.tw.oops;

public class Line {

    public class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point distance(Point newPoint) {
            return new Point(newPoint.x - x, newPoint.y-y);
        }

        @Override
        public boolean equals(Object obj) {
            // TODO impl
            return super.equals(obj);
        }
    }

    Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) throws Exception {
        if (startPoint.equals(endPoint)) {
            throw new Exception("endpoint should not be equal to start point");
        }
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getLength() {
        return endPoint.distance(startPoint);
    }

}
