import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for(int i = 0;i < list.size();i++){
            int x = list.get(i);
            if (x % 2 != 0){
                c++;
            }
        }
        return c;
    }
    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for(int i = 0;i < list1.size();i++){
            int x = list1.get(i);
            for(int a = 0;a<list2.size();a++){
                int y = list2.get(a);
                if (x==y) {
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(countOdd(list));

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(checkDuplicates(list, list2));

        int [] arr = {0,1,2,3,4,5};
        System.out.println(convertToArrayList(arr));

    }
}
