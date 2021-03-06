public class Point
{
    private String label;
    private int x;
    private int y;

    public Point(String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }
        Point objPoint = (Point) obj;
        return (this.x == objPoint.x) && (this.y == objPoint.y);
    }
}
