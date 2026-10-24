class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        StringBuilder current = new StringBuilder();
        HashMap<String,Boolean> hm=new HashMap<>();
        return check(s, wordDict, current,hm);
    }

    boolean check(String s, List<String> dict, StringBuilder curr, HashMap<String,Boolean> hm) {
        if (curr.length() > s.length()) {
            return false;
        }

        if (s.equals(curr.toString())) {
            return true;
        }

        if (!s.startsWith(curr.toString())) {
            return false;
        }

        if(hm.containsKey(curr.toString())) return hm.get(curr.toString());

        for (String word : dict) {
            curr.append(word);

            boolean found = check(s, dict, curr, hm);
            hm.put(curr.toString(),found);
            curr.setLength(curr.length() - word.length());

            if (found) {
                return true;
            }
        }

        return false;
    }
}
