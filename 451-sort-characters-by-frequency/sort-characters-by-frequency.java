class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> lst = new ArrayList<>(freq.keySet());
        lst.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder sb = new StringBuilder();
        for (char ch : lst) {
            int f = freq.get(ch);
            for (int i = 0; i < f; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}