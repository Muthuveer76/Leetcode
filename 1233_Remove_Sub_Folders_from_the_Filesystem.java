class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            String last = ans.get(ans.size() - 1);
            String current = folder[i];

            if (current.length() <= last.length() ||
                !current.startsWith(last + "/")) {
                ans.add(current);
            }
        }

        return ans;
    }
}