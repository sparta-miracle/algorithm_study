package programmers;

class Solution {
    private static int[] arr;
    private static int[] temp;

    public long solution(long n) {
        String answer = "";
        String s = String.valueOf(n);
        int length = s.length();
        arr = new int[length];
        temp = new int[length];
        char[] chars = s.toCharArray();
        int index = 0;
        for (char aChar : chars) {
            arr[index++] = aChar - '0';
        }
        mergeSort(0, length - 1);
        for (int a : arr) {
            answer += a;
        }
        return Long.valueOf(answer);
    }

    public static void mergeSort(int start, int end) {
        if (start + 1 > end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        int index = start;
        int left = start;
        int right = mid + 1;

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        while (left < mid + 1 && right <= end) {
            if (temp[left] < temp[right]) {
                arr[index++] = temp[right++];
            } else {
                arr[index++] = temp[left++];
            }
        }

        while (left < mid + 1) {
            arr[index++] = temp[left++];
        }

        while (right < end) {
            arr[index++] = temp[right++];
        }

    }
}