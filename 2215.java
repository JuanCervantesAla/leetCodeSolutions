/*2215. Find the Difference of Two Arrays*/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = getSet(nums1);
        Set<Integer> setNums2 = getSet(nums2);
        List<Integer> listNums1 = getList(setNums1, nums2);
        List<Integer> listNums2 = getList(setNums2, nums1);
        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(listNums2);
        finalList.add(listNums1);

        return finalList;

    }

    public static Set<Integer> getSet(int[] array){
        Set<Integer> littleSet = new HashSet<>();

        for(int i=0; i < array.length; i++ ){
            littleSet.add(array[i]);
        }

        return littleSet;

    }

    public static List<Integer> getList(Set<Integer> littleSet, int[]array){
        Set<Integer> returnSet = new HashSet<>();

        for(int i=0; i < array.length; i++){
            if(!littleSet.contains(array[i])){
                returnSet.add(array[i]);
            }
        }

        List<Integer> finalList = new ArrayList<>(returnSet);
        return finalList;
    }
}
