package j10_배열;

public class Array5 {
    public static void main(String[] args) {
        int [] nums1 = new int[] {1, 8, 9, 16, 17};
        int [] nums2 = new int[] {2, 7, 10, 15, 18};
        int [] nums3 = new int[] {3, 6, 11, 14, 19};
        int [] nums4 = new int[] {4, 5, 12, 13, 20};

        int min = 0;

        int [] result = new int[5];

        while (true){

            for (int i = 0; i < 5; i++){

                if (nums1[i] < nums2[i]){
                    min = nums1[i];
                }else min = nums2[i];

                if (nums3[i] < min){
                    min = nums3[i];
                }
                if (nums4[i] < min){
                    min = nums4[i];
                }
                result[i] = min;

            }
            break;
        }
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");

        }
        /*
        배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.
         */


    }
}
