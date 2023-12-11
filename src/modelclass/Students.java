package modelclass;

public class Students {
    String name;
    String mobileNo;
    int rollNo;
    String section;

    public Students(String name, String mobileNo, int rollNo, String section) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.rollNo = rollNo;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", rollNo=" + rollNo +
                ", section='" + section + '\'' +
                '}';
    }
}
