class Solution {
    public int characterReplacement(String s, int k) {
         int i = 0;
        int max = 0;
        int ans = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        char maxChar = '#';

        for (int j = 0; j < s.length(); j++) {

            char curr = s.charAt(j);

            // Add current character first
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);

            // Update max frequency
            if (hm.get(curr) > max) {
                max = hm.get(curr);
                maxChar = curr;
            }

            // Shrink window if invalid
            while ((j - i + 1) - max > k) {

                char leftChar = s.charAt(i);
                hm.put(leftChar, hm.get(leftChar) - 1);

                // If we removed the max-frequency character,
                // recompute the max frequency.
                if (leftChar == maxChar) {
                    max = 0;
                    for (Map.Entry<Character, Integer> e : hm.entrySet()) {
                        if (e.getValue() > max) {
                            max = e.getValue();
                            maxChar = e.getKey();
                        }
                    }
                }

                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
