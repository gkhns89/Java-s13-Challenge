package employeeApp.model;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {

        if (index < 0) {
            System.out.println("Index cannot be lower then zero");
        } else {
            try {
                boolean isExists = false;

                for (String hPlan : healthPlans) {
                    if (hPlan != null && hPlan.equals(name)) {
                        isExists = true;
                        System.out.println(name+" isimli sağlık planı mevcut!");
                        break;
                    }

                }
                if (!isExists) {
                    if (healthPlans[index] == null) {

                        healthPlans[index] = name;
                        System.out.println(name + " isimli yeni sağlık planı " + index+ " numaralı indexe eklendi!");
                    } else {
                        System.out.println(index+" numaralı index mevcut!");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(index+ " değerli index aralık dışında, lütfen geçerli index değeri girin!");
            }
        }
    }
    @Override
    public String toString() {
        return "Çalışan Detayı{" +
                "Çalışan ID=" + id +
                ", İsim Soyisim='" + fullName + '\'' +
                ", E-Posta='" + email + '\'' +
                ", Parola='" + password + '\'' +
                ", Sağlık Planları=" + Arrays.toString(healthPlans) +
                '}';
    }
}
