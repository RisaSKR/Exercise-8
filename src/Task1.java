import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1
{
    public static void main(String[] args) throws IOException {
        staff obj = new staff();
        obj.initialize1();
        obj.print1();
        obj.salaryToPay(8,9);
        obj.salaryForOvertime(5,8);
        Salary.bonusKornnawawat56482(8);
    }
}

class Person {
    String surnameKornnawawat56482, firstNameKornnawawat56482, streetKornnawawat56482, zipCodeKornnawawat56482, cityKornnawawat56482;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Surname");
        surnameKornnawawat56482 = br.readLine();
        System.out.println("Enter your Firstname");
        firstNameKornnawawat56482 = br.readLine();
        System.out.println("Enter your Street");
        streetKornnawawat56482 = br.readLine();
        System.out.println("Enter your zip code");
        zipCodeKornnawawat56482 = br.readLine();
        System.out.println("Enter your City");
        cityKornnawawat56482 = br.readLine();

    }

    public void print() {
        System.out.println(surnameKornnawawat56482);
        System.out.println(firstNameKornnawawat56482);
        System.out.println(streetKornnawawat56482);
        System.out.println(zipCodeKornnawawat56482);
        System.out.println(cityKornnawawat56482);
    }
}

class staff extends Person implements Salary {
    String educationKornnawawat56482, positionKornnawawat56482;

    public void initialize1() throws IOException {
        initialize();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter education");
        educationKornnawawat56482 = br.readLine();
        System.out.println("Enter position");
        positionKornnawawat56482 = br.readLine();
    }

    public void print1(){
        print();
        System.out.println(educationKornnawawat56482);
        System.out.println(positionKornnawawat56482);
    }


    @Override
    public double salaryToPay(double hoursKornnawawat56482, double rateKornnawawat56482) {
        System.out.println("The Payment is " + (hoursKornnawawat56482 * rateKornnawawat56482));
        return hoursKornnawawat56482;
    }
}

