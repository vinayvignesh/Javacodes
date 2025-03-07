public class Largestelement {
    public static void main(String[] args) {
        int[] array = {18,54,4745765,545};
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
               
            }


    }
    System.out.println(max);
}
}