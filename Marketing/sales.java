package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public double totalEarning() {
        return earnings() + tallowance();
    }
}

