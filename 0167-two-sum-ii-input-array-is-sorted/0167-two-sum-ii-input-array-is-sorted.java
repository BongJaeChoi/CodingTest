class Solution {
   public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int p1 = 0;
        int p2 = numbers.length - 1;
        while (p1 < p2) {
            if (target == numbers[p1] + numbers[p2]) {
                result[0] = p1;
                result[1] = p2;
                return solution(result);
            } else if (target < numbers[p1] + numbers[p2]) {
                // target 보다 큰값이 나오면 1번째 포인터를 이동시켜서 값을 줄인다.
                p2--;
            } else {
                // target 보다 작은값이 나오면 2번째 포인터를 이동시켜서 값을 늘린다.
                p1++;
            }
        }
        return result;
    }

    public int[] solution(int[] arr) {
        //result index 에 +1 씩 해줘야함
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

}