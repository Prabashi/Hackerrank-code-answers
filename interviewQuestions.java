// Hour Glass Sum function
static int hourglassSum(int[][] arr) {
    int val;
    int max = -63;
    
    for (int row=1; row<arr.length - 1; row++) {
        for (int col=1; col<arr[row].length - 1; col++) {
            val = arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1] + arr[row][col] + arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
            max = Math.max(max, val);
        }
    }

    return max;
}
