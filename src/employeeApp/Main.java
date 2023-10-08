package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan plan1 = new Healthplan(1, "A Planı", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "B Planı", Plan.STANDARD);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] plans = new String[3];
        plans[0] = plan1.getName();
        plans[1] = plan2.getName();

        Employee emp1 = new Employee(1, "Gökhan ŞİŞMAN", "gokhansisman@outlook.com", "12365415aA", plans);
        Employee emp2 = new Employee(2, "Mehmet DURKAN", "mehmet@mehmet.com", "4321bB", plans);

        emp1.addHealthPlan(0, "A Planı");
        emp1.addHealthPlan(1, "B Planı");
        emp1.addHealthPlan(1, "C Planı");
        emp1.addHealthPlan(0, "D Planı");
        emp1.addHealthPlan(4, "C Planı");
        emp1.addHealthPlan(2, "C Planı");

        System.out.println(Arrays.toString(emp1.getHealthPlans()));
        System.out.println("******************************************************");
        System.out.println(emp1);
        System.out.println(emp2);

        String[] devOps = new String[5];
        devOps[0] = emp1.getFullName();
        devOps[1] = emp2.getFullName();

        System.out.println("******************************************************");

        Company firm1 = new Company(0, "Angel Software", 10000000, devOps);
        Company firm2 = new Company(1, "Devil Software", -205555, devOps);

        firm1.addEmployee(2,"Gökhan ŞİŞMAN");
        firm1.addEmployee(1,"Ceren GÜLMEZ");
        firm1.addEmployee(6,"Sıla KAYGISIZ");
        firm1.addEmployee(3,"Buket ÇETİN");
        firm1.addEmployee(4,"Alper AHISKA");
        firm1.addEmployee(5,"Erdem ERGAND");
        firm1.addEmployee(2,"Tuğçe GÜLEÇ");
        System.out.println("******************************************************");
        System.out.println(firm1);
        System.out.println(firm2);


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur. Bir Java programınd ilgili
     * işlemlerin çoğunluğu başka metodlarda yapılır. Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun
     * içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan bir uygulamamız olsaydı
     *             kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
