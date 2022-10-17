class Solution {
    fun runningSum(nums: IntArray): IntArray {
         val result = arrayListOf<Int>()
    var temp = 0
    for (num in nums) {
        temp += num
        result.add(temp)
    }
    return result.toIntArray();
    }
}
