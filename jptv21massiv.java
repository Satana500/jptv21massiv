package jptv21massiv;

import java.util.Random;

public class jptv21massiv {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("---Олномерные массивы---");
        int n = 5;
        int [] nums = new int [n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(n);}
        int sum = 0;
        int min = n;
        int max = 0;
        for(int i = 0;i<nums.length;i++) {
            System.out.printf("%2d,",nums[i]);
            sum+= nums [i];
            if(min > nums[i])min = nums [i];
            if(max < nums [i])max = nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            System.out.printf("%3d",nums[i]);
        }
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        
        System.out.println("---Двухмерные массивы---");
        int [][] nums2 = new int[n][n];
        for(int i = 0; i < nums2.length;i++){
            for(int j = 0; j < nums2 [i].length; j++){
                nums2 [i][j] = random.nextInt(n);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2 [i].length; j++){
                System.out.printf("%3d", nums2[i][j]);
            }
            System.out.println();
        }
    }
}    