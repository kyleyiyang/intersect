class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> lst=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for (int i:nums1) {
            lst.add(i);
        }
        for (int j:nums2) {
            if (lst.contains(j)) {
                lst.remove((Integer)(j));
                ans.add((Integer)(j));
             }
        }
        int[] arr = new int[ans.size()];
        int m=0;
        for (int k:ans) {
            arr[m++]=k;
        }
        return arr;
    }
}
