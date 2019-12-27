class PhoneNumber {
    private String phoneNumber;
    public PhoneNumber(String number) {
        StringBuffer stringBuffer = new StringBuffer(number);
        if (stringBuffer.charAt(0) == '8')
        {
            phoneNumber = "+" + 7 + stringBuffer.substring(1, 4) + "-" + stringBuffer.substring(4, 7) + "-" + stringBuffer.substring(7, 11);
        }
        else phoneNumber = "+" + stringBuffer.substring(1, 5) + "-" + stringBuffer.substring(5, 8) + "-" + stringBuffer.substring(8, 12);
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}

public class Task4 {
    public static void main(String[] args) {
        PhoneNumber number1 = new PhoneNumber("+11324575987");
        PhoneNumber number2 = new PhoneNumber("81235648648");
        System.out.println(number1);
        System.out.println(number2);
    }
}
