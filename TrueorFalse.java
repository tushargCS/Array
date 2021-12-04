//Q5. Given an array of type int, print true if every element is 1 or 4.
//
//        only14([1, 4, 1, 4]) → true
//        only14([1, 4, 2, 4]) → false
//        only14([1, 1]) → true
public class TrueOrFalse {
    int i;
    public void main(){
        int arr[]={1,4,4,5};
        for(i=0;i<arr.length;i++){
            if(arr[i]==1||arr[i]==4){
            }
            else{
                break;
            }
        }
        if(i==arr.length){
            System.out.println("true");}
        else {
            System.out.println("false");
}}
    public static void main(String[] args) {
        TrueOrFalse obj= new TrueOrFalse();
        obj.main();
    }
}
