public class QuickSort {
    public static void quick(int[] arr, int start, int end){
        if(start >= end) return;
        int pivot = start;
        int left = start + 1;
        int right = end;
        while(left <= right){
            // 피벗보다 큰 데이터를 찾을 때까지 반복(end index 보다 앞에있는)
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        quick(arr, start, right-1);
        quick(arr, right+1, end);
    }

    public static void quick2(int[] arr, int start, int end ){
        if (start >= end) return;//종료 조건 꼭 넣기
        int pivot = start;
        int left = start+1;
        int right = end;
//        int temp;
        while(left <= right){
            while(left <= end && arr[left] <= arr[pivot]) left++;//등호 필요, arr[p]
            while(right > start && arr[right] >= arr[pivot]) right--;//등호 조심, right--
            if(left > right){//등호 없음
                int temp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = temp;
            }else{
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        quick2(arr, start, right-1);
        quick2(arr, right+1, end);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quick2(arr, 0, n-1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +  " ");
        }
    }

}
