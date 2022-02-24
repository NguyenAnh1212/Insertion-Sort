public class InsertSort {
    static int[] list = {1,2,8,4,5,3,7,0,9};
    public static void insertionSort(int[] array){
        int pos;// vị trí xét
        int x; // là phần tử đang xét
        // Lặp mảng
        for(int i = 1; i < array.length; i++){

            x = array[i];
            pos = i;
            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong, đẩy về bên trái nhiều nhất có thể.
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
