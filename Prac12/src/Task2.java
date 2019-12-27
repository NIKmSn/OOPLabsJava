import java.util.StringTokenizer;

class Address
{
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String flat;

    public Address(String fullAddress)
    {
        String[] temp = new String[6];
        temp = fullAddress.split(",");
        country = temp[0];
        region = temp[1];
        city = temp[2];
        street = temp[3];
        house = temp[4];
        flat = temp[5];
    }
    public Address(String fullAddress, String token)
    {
        StringTokenizer tokenizer = new StringTokenizer(fullAddress, token);
        country = tokenizer.nextToken();
        region = tokenizer.nextToken();
        city = tokenizer.nextToken();
        street = tokenizer.nextToken();
        house = tokenizer.nextToken();
        flat = tokenizer.nextToken();
    }
    public String getCity(){
        return city;
    }
    public String getCountry() {return country;}

}

public class Task2 {
    public static void main(String[] args)
    {
        Address address1 = new Address("Russia,Novosibirskaya,Novosibirsk,Lenina,12,1");
        Address address2 = new Address("Russia,Sverdlovskaya.Ekaterinburg-Stalina.13-2", ",.;-");
        System.out.println(address1.getCity());
        System.out.println(address2.getCountry());
    }
}
