package lt.bit.java.day4.hw;

import java.util.Arrays;

public class FamilyStats {
    FamilyMember[] family;
    private int familyCount, familyDriversCount, familyProfessionalDriversCount, familyOldestMemberID, familyOldestMemberAge, ageSum, familyMemberAverageAge;
    String[] familyNames;

    FamilyStats(FamilyMember[] family) {
        this.family = family;
        familyCounts();
    }

    private void familyCounts() {
        familyCount = family.length;
        familyNames = new String[familyCount];

        for (int i = 0; i < familyCount; i++) {
            FamilyMember m = family[i];
            ageSum += m.getAge();
            familyNames[i] = m.getName();

            if (m instanceof Driver) {
                Driver driver = (Driver) m;
                if (driver.canDriveACar() || driver.canDriveABike()) familyDriversCount++;
                if (driver.canDriveACar() && driver.canDriveABike()) familyProfessionalDriversCount++;
            }

            if (m.getAge() > familyOldestMemberAge) {
                familyOldestMemberAge = m.getAge();
                familyOldestMemberID = i;
            }
        }

        familyMemberAverageAge = ageSum / familyCount;
    }

    public void printFamilyStats() {
        System.out.println(Arrays.toString(familyNames));
        System.out.println(
            "Šeimoje yra "+ familyCount +" nariai. Ją sudaro "+ familyDriversCount +" vairuotojai - iš jų "+ familyProfessionalDriversCount +" gali vairuoti visas transporto priemones\n"+
            "Vyriausias šeimos narys yra "+ family[familyOldestMemberID].getName() +" ("+ family[familyOldestMemberID].getAge() +" m.), o šeimos amžiaus vidurkis yra "+ familyMemberAverageAge +" m.\n"
        );
    }
}
