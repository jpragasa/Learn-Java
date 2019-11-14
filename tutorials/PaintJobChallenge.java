package learning.tutorials;

public class PaintJobChallenge
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
    {
        return -1;
    }
    double areaOfWall = width * height;
    int count = 0;
    while (areaOfWall >= 0)
    {
        areaOfWall -= areaPerBucket;
        count++;
    }
    count -= extraBuckets;
    return count;
}

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double areaOfWall = width * height;
        int count = 0;
        while (areaOfWall >= 0)
        {
            areaOfWall -= areaPerBucket;
            count++;
        }
        return count;
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        int count = 0;

        while(area >= 0)
        {
            area -= areaPerBucket;
            count++;
        }

        return count;
    }
}
