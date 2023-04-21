public class QuickSort extends Songs{
    public QuickSort(String name, int duration) {
        super(name, duration);
    }

    public static void main(String[] args){
        Songs song1= new Songs("Staying Alive",235);
        Songs song2 = new Songs("I`m Still Standing",111);
        Songs song3 = new Songs("Bloody Stream",351);
        Songs song4 = new Songs("Gansta`s Paradise",181);
        Songs song5 = new Songs("Dream On",271);
        Songs song6 = new Songs("Sweet Dreams",214);


        Songs[] arr = {song1,song2,song3,song4,song5,song6};
        countOnes(arr);
        Songs[] result = quickSort(arr,0,arr.length-1);
        outputResult(result);
    }

    static void countOnes(Songs[] arr){
        for (int i = 0; i<arr.length; i++){
            String str = String.valueOf(arr[i].getDuration());
            int temp = 0;
            for (char element : str.toCharArray()){
                if (element == '1') temp++;
            }
            arr[i].setCountOne(temp);
        }

    }


    static Songs[] quickSort(Songs[] arr, int start, int end){
        if(start<end){
            int pi = partition(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
        return arr;
    }

    static int partition(Songs[] arr, int start, int end) {
        int pivot = arr[end].getCountOne();
        int i =(start-1);

        for(int j = start; j < end; j++){
            if(arr[j].getCountOne() <= pivot){
                i++;
                Songs temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Songs temp = arr[i+1];
        arr[i+1]  = arr[end];
        arr[end] = temp;

        return (i+1);
    }


    static void outputResult(Songs[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


