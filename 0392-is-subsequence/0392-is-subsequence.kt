class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val sCharArray = s.toCharArray()
    val tCharArray = t.toCharArray()

    var i = 0
    var j = 0

    while (i < sCharArray.size  && j< tCharArray.size){
        if(sCharArray[i] == tCharArray[j]){
            i++ // 같은 값이 있을때만 증가
        }
        j++
    }



    return i == s.length 
    }
}