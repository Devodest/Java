// Найти длину наибольшой общей подпоследовательности

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arrayFirst = new int[]{1, 2, 3, 4, 5};
//        int[] arraySecond = new int[]{5, 4, 3, 2, 1};
//        List<Integer> resultArray = new ArrayList<>();
//        for (int i : arrayFirst) {
//            for (int j : arraySecond) {
//                if (i == j) {
//                    resultArray.add(i);
//                    break;
//                }
//            }
//
//        }
//        System.out.println(resultArray.size());
//    }
//}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private final int[] arr1 = new int[] {1,2,2,3,4,5,6,7,8,9,3,2,1};
    private final int[] arr2 = new int[] {7,8,9,1,2,3,4,5,6};

    private List<Integer> subsequence = new ArrayList<>();

    private static Main _instance = null;

    private Main() {
        super();
    }

    public static Main getInstance(){
        if(_instance == null)
            _instance =  new Main();
        return _instance;
    }

    public static void main(String[] args) {
        Main.getInstance().run();
    }

    private void run() {
        for (int i1 = 0; i1 < arr1.length; i1++) {
            for (int i2 = 0; i2 < arr2.length; i2++) {
                if(arr1[i1] == arr2[i2]){
                    List<Integer> found = search(i1, i2, new ArrayList<>());
                    if(found.size() > subsequence.size())
                        subsequence = found;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(subsequence.toArray()));
        System.out.println(subsequence.size());
    }

    private List<Integer> search(int idx1, int idx2, List<Integer> tmp) {
        if(
                idx1 < arr1.length
                        && idx2 < arr2.length
                        && arr1[idx1] == arr2[idx2]
        ){
            tmp.add(arr1[idx1]);
            idx1++;
            idx2++;
            return search(idx1, idx2, tmp);
        }else{
            return tmp;
        }
    }

}
