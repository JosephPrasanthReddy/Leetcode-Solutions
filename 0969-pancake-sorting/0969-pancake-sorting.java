class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int x[] = arr.clone();
        Arrays.sort(x);

        List<Integer> a = new ArrayList<>();

        int lw = arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (Arrays.equals(arr, x)) {
                return a;
            }

            int max = Integer.MIN_VALUE;
            int index = 0;

            for (int j = 0; j < lw; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }

            a.add(index + 1);
            reverse(arr, 0, index);

            a.add(lw);
            reverse(arr, 0, lw - 1);

            lw--;
        }

        return a;
    }

    public void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
}