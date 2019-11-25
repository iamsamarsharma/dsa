package arrayandarrayList;

public class App {

    public static void main(String[] args) {
        int[] nums = new int[6];

        for (int i=1; i<nums.length; ++i){
            nums[i] = 3*i;
        }

        //O(1) is location/index is known
        int num = nums[4];
        System.out.println(num);
        System.out.println("");

        //O(N) := linear search
        for (int x=0; x<nums.length; x++){
            if (nums[x] == 6){
                System.out.println("Value is found at index" + x);
            }
        }
    }
}
