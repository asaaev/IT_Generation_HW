public class SubTask4 {
    public static String integerRank(int inputValue){

        int[] separateValue = Integer.toString(inputValue).chars().map(c -> c - '0').toArray();
        String sumOfRank = "";
        for (int x:separateValue) {

            sumOfRank += x/x;
        }
        return sumOfRank;
    }

    public static void main(String[] args) {
        System.out.println(integerRank(4523));
    }
}
