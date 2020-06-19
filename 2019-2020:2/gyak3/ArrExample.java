public class ArrExample {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0,1,2,3,4}; //these are named array literals

        int[] arr2 = new int[5]; //this way all elements are initiated to 0
        
        int[] arr3; //only declaring
        arr3 = new short[6]; //assigning newly created array's memory address from heap to reference (on stack)
        
        for(int i=0;i<5;i++) {
            arr2[i] = 42;
        
        }
        
        Object arr4[] = new Object[2]; //array of objects
        
        int[] arr5 = {0,1,2,3,4}; //the same as arr1
    }
}