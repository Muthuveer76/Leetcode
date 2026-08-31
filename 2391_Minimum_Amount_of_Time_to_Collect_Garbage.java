class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        int[] last = new int[3];

        for (int i = 0; i < garbage.length; i++) {
            time += garbage[i].length();

            for (char c : garbage[i].toCharArray()) {
                if (c == 'M') last[0] = i;
                if (c == 'P') last[1] = i;
                if (c == 'G') last[2] = i;
            }
        }

        for (int type = 0; type < 3; type++) {
            for (int i = 0; i < last[type]; i++) {
                time += travel[i];
            }
        }

        return time;
    }
}