class Solution {
   public static int numberOfSteps(int num) {
        int answer = 0;
        int temp = num;
        for (int i = 1; i <= num; i++) {

            if(temp == 0){
                return answer;
            }

            boolean isEven = temp % 2 == 0;
            if (isEven) {
                temp /= 2;
            } else {
                temp -= 1;
            }
            answer++;

        }
        return answer;

    }
}