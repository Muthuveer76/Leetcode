class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr = startTime.split(":");
        String[] res = endTime.split(":");
        int i = Integer.parseInt(arr[0]) * 3600
              + Integer.parseInt(arr[1]) * 60
              + Integer.parseInt(arr[2]);

        int j = Integer.parseInt(res[0]) * 3600
              + Integer.parseInt(res[1]) * 60
              + Integer.parseInt(res[2]);

        return j - i;
    }
}