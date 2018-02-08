package DataStructures;

public class DynamicArray {

    public static void main(String[] args) {
        arrays x = new arrays(2);
        for (int i=0;i<20;i++){
            x.add(i+1);
            x.print();
        }
    }
    public static class arrays {
        int [] arr ;
        public arrays(int arrx) {
            arr = new int [arrx];
        }
        int index=0;
        public void add(int x) {
            if (index >= arr.length) {
                arr = set();
                arr[index]=x;
                index++;
            } else {
                arr[index] = x;
                index++;
            }
        }
        public int get() {
            return arr[index];
        }
        public int[] set() {
            int[] arr2 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            return arr2;
        }
        public void print (){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
    }


}
