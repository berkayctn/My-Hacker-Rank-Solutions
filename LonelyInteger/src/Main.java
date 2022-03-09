import java.util.List;

public class Main {

    public static void main(String[] args) {

    }


    //Problem:  Given an array of integers, where all elements but one occur twice, find the unique element.


    //This function finds that unique element
    public static int lonelyinteger(List<Integer> a) {

        int element = 0, temp = 0;

        for (int i = 0; i < a.size(); i++) {
            if (temp == 1) {
                break;
            } else {
                element = a.get(i);
                temp = 0;
                for (int j = 0; j < a.size(); j++) {
                    if (element == a.get(j)) {
                        temp++;
                    }
                }
            }
        }
        return element;
    }
}
