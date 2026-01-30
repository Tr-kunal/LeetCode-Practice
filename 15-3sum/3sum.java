class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                if (hs.contains(third)) {
                    List<Integer> ls = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(ls);
                    st.add(ls);
                }

                hs.add(nums[j]);

            }
        }

        return new ArrayList<>(st);

    }
}