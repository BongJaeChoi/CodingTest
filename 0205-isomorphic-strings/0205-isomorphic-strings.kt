class Solution {
   fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()
    val set = HashSet<Char>()
    for (i in s.indices) {
        val sc = s[i]
        val tc = t[i]
        if (map.containsKey(sc)) {
            if (map[sc] != tc) {
                return false
            }
        } else {
            // 값이 중복됨. 매핑되지 않으므로 false
            if (set.contains(tc)) {
                return false
            }
            map[sc] = tc
            set.add(tc)
        }
        if (i == 0) {
            map[s[i]] = t[i]
        }
    }

    return true
}
}