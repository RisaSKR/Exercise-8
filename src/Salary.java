
 public interface Salary {
    //normal interface method without body
    double salaryToPay(double hoursKornnawawat56482, double rateKornnawawat56482);

    //default method
    default double salaryForOvertime(double overtimeHoursKornnawawat56482, double rateKornnawawat56482) {
        double totalKornnawawat56482 = overtimeHoursKornnawawat56482 * rateKornnawawat56482;
        return totalKornnawawat56482;
    }

    static void bonusKornnawawat56482(double yearsOfExperienceKornnawawat56482) {
        if (yearsOfExperienceKornnawawat56482 >= 5) {
            System.out.println("Money");
        } else {
            System.out.println("No extra money");

        }

    }

}
