import java.util.Scanner;

class Main {
    public static void exceptionDemo1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            exceptionDemo1();
        }
    }


    public void getKey() {
        boolean isScanned = false;
        while (!isScanned) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
                isScanned = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void printMessage(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    /*public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }*/

    private static String getDetails(String key) throws Exception {
        /*String s = null;
        try {
            s = "data for " + key;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            return s;
        }*/

        if (key == "") {
            throw new Exception("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String args[]) throws Exception {
        /*System.out.println("Demo 1:");
        exceptionDemo1();
        System.out.println("Demo 2:");
        exceptionDemo2();*/

        printMessage("key");
    }
}


