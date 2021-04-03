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

***********************************************************************

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for (int i:nums1) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int j:nums2) {
            if (map.containsKey((Integer)j)&& map.get((Integer)j)>0) {
                map.put((Integer)j,map.getOrDefault((Integer)j,0)-1);
                lst.add(j);
            }
        }
        int[] ans=new int[lst.size()];
        for (int m=0;m<ans.length;m++) {
            ans[m]=lst.get(m).intValue();
        }
        return ans;
    }
}
