import java.util.ArrayList;
import java.util.List;

public class MediumMoveElementToEnd {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        int toMove = 2;
        List<Integer> output = MediumMoveElementToEnd.moveElementToEnd(array, toMove);
        System.out.println(output);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size()-1;

        while(i<j){
            if(array.get(i) == toMove){
                if(array.get(j) != toMove){
                    array.set(i, array.get(j));
                    array.set(j, toMove);
                } else {
                    j--;
                }
            }else {
                i++;
            }
        }
        return array;
    }
}