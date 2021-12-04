//Q10. Create an int array of size 5, initialize it with values(10,20,30,40,50).
//        Create a public boolean search(int arr[], int search_element) this method will return true
//        if the search element is present in the array else it will  print a message "element not found"
public class Array3 {
            public boolean search(int array[], int search_element){
                for(int n:array){
                    if(n== search_element){
                        return true;
                    }
                }
                return false;
            }

    public static void main(String[] args) {
                int []array1={10,20,30,40,50};
        Array3 obj= new Array3();
        System.out.println(obj.search(array1,30));
    }

}
