class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        String result = s;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(s);
        visited.add(s);

        while (!queue.isEmpty()) {
            String cur = queue.poll();

            if (cur.compareTo(result) < 0) {
                result = cur;
            }

            char[] arr = cur.toCharArray();

            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = (char) ('0' + (arr[i] - '0' + a) % 10);
            }

            String add = new String(arr);

            if (visited.add(add)) {
                queue.offer(add);
            }

            String rotate = cur.substring(cur.length() - b) + cur.substring(0, cur.length() - b);

            if (visited.add(rotate)) {
                queue.offer(rotate);
            }
        }

        return result;
    }
}