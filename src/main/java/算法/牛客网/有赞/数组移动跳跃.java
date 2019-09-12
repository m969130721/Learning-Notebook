package 算法.牛客网.有赞;


import java.util.*;

public class 数组移动跳跃 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String arrayStr = cin.next();
        String numberStr = arrayStr.substring(1, arrayStr.length() - 1);
        String[] numberArray = numberStr.split(",");
        boolean isTrue = false;
        Set<Integer> step = new HashSet<>();
        List<Integer> stepList = new ArrayList<>();

        for (int i = 0; i < numberArray.length; ) {
            step.add(i);
            stepList.add(i);
            int temp = i;
            int num = Integer.parseInt(numberArray[i]);
            i += num;
            if (i > numberArray.length || i < 0) {
                isTrue = true;
                break;
            }
            if (0 == (Integer.parseInt(numberArray[i]) + Integer.parseInt(numberArray[temp]))) {
                break;
            }
            int sum = 0;
            for (int j = stepList.size() - 1; j >= 0; j--) {
                sum += stepList.get(j);
                if (sum == Integer.parseInt(numberArray[i])) {
                    break;
                }
            }
            if (step.size() == numberArray.length) {
                break;
            }
            System.out.println(i);
        }
        System.out.println(isTrue);
    }
}
