public class SubTask3 {
    public static int greatestCommonDivisor(int firstInt, int secondInt){

        if (firstInt == 0) {
            return secondInt;
        }
        return greatestCommonDivisor(secondInt % firstInt, firstInt);

    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(20, 36));
    }
}
