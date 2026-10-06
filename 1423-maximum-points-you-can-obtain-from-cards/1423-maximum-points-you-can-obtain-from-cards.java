class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for(int num : cardPoints){
            totalSum += num;
        }
        int windowSize = n - k;
        int windowSum = 0;
        for(int i =0; i < windowSize;i++){
            windowSum += cardPoints[i];
        }
        int minWindowSum = windowSum;
        int left = 0;
        for(int right = windowSize; right<n;right++){
            windowSum += cardPoints[right];
              windowSum -= cardPoints[left];
            left++;
            minWindowSum = Math.min(minWindowSum, windowSum);
        }
        return totalSum - minWindowSum;
    }
}
