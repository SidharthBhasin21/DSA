package Arrays.OverlapRectangle;

public class OverlapRecrangle {

    public static void main(String[] args) {

    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] || // left
                rec1[1] >= rec2[3] || // top
                rec1[3] <= rec2[1] || // bottom
                rec1[0] >= rec2[2]); // right;
    }
}
