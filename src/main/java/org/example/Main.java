package org.example;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> arr = getRandArr();
        Integer target = getRandNum();

        System.out.println(Arrays.toString(getTwoSum(arr, target)));

    }


    public static int[] getTwoSum(List<Integer> arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size(); i++) {
            int comp = target - arr.get(i);
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i};
            }
            map.put(arr.get(i), i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }



    public static List<Integer> getRandArr(){
        int arrMin = 2;
        int arrMax = 30000;
        int arrSize = (int)(Math.random() * ((arrMax - arrMin) + 1)) + arrMin;


        List<Integer> randArr = new ArrayList<>();
for(int i = 0; i < arrSize; i++){
    Integer randNum = getRandNum();
    randArr.add(randNum);

}
    return randArr;
    }

    public static Integer getRandNum(){
        int valMin = -1000;
        int valMax = 1000;
        Integer num = (int)(Math.random() * ((valMax - valMin) + 1)) + valMin;

        return num;
    }



    }