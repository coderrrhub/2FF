package Lecture5;

public class ContainerWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans1 = solution1(height);
        int ans2 = solution2(height);
    }

    // T.C.:- O(N^2)
    // S.C.:- O(1)
    public static int solution1(int[] height) {
        int n = height.length;
        int maxArea = 0; 

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i],height[j]);
                int b = j - i;
                int area = h*b;
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }

    // T.C.:- O(N)
    // S.C.:- O(1)
    public static int solution2(int[] height) {
        int left = 0, right = height.length-1;
        int max = 0;
        while(left < right) {
            int minHeight = Math.min(height[left], height[right]); // for length
            int width = right-left;
            int area = minHeight * width;
            max = Math.max(max, area);
            if(height[left] == minHeight) {
                left++;
            } else{
                right--;
            }
        }

        return max;
    }
}