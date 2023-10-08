package employeeApp.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    private void checkGiro(int giro) {
        if (giro<0)
        {
            this.giro = 0;
            System.out.println("Ciro değeri 0'ın altında olamaz ciro 0'a eşitlendi!");
        }else {
            this.giro = giro;
        }


    }

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {

        if (index < 0) {

            System.out.println("Index value must be greater then zero!");

        } else {

            try {
                boolean isExists = false;
                for (String devName : developerNames) {
                    if (devName!= null && devName.equals(name)) {
                        System.out.println(name+ " isimli çalışan mevcut!");
                        isExists = true;
                        break;

                    }
                }
                if (!isExists) {
                    if (developerNames[index] == null) {
                        developerNames[index] = name;
                        System.out.println(name + " isimli yeni çalışan " + index+ " numaralı indexe eklendi!");
                    } else {
                        System.out.println(index+" numaralı index mevcut!");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(index + " numaralı index aralık dışında, lütfen geçerli index değeri girin!");
            }
        }
    }

    @Override
    public String toString() {
        return "Firma Detayları{" +
                "Firma ID=" + id +
                ", Firma İsmi='" + name + '\'' +
                ", Ciro=" + giro +
                ", Çalışan İsimleri=" + Arrays.toString(developerNames) +
                '}';
    }
}
