 class LargestSecond {
    public static void main(String[] args) {
        int[] arr = {12,15,9,14,10,1,25,17};

        int largest = 1,secondLargest = 1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}