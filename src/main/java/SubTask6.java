public class SubTask6 {
    private static void printString(int columnNumber)
    {
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            int rem = columnNumber % 26;

            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
        System.out.println(columnName.reverse());
    }

    public static boolean main(String[] args)
   {
        printString(1);
//        printString(2)
//        printString(31);
        printString(80);
        printString(706);
        return true;
    }
}

