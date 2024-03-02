class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean b1 = i % 3 == 0; // 나눠진다는게 나머지가 0이라는 뜻
            boolean b2 = i % 5 == 0;
            if (b1 && b2) {
                list.add("FizzBuzz");
            } else if (b1) {
                list.add("Fizz");
            } else if (b2) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}