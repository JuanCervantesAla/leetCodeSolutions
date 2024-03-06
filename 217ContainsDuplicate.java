
/*Author: Cervantes Alatorre Juan Jose Emiliano
*
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> conj = new HashSet<>();//Creating a HashSet for non-duplicated storing
        
        int counter = 0;
        while(counter < nums.length){//Full check the array

            boolean added = conj.add( nums[counter] );//If the function addesde is true it means the number its not duplicated

            if(!added){//If not added means there are duplicated numbers and returning a false
                return true;
            }

            counter++;//Inc the counter

        }

        return false;//Otherwise means there were no duplicateds

    }

}
