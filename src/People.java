import java.util.Scanner;

public class People {
    private String name;
    private double dateofbirth;
    private String job;

    public People() {
    }

    public People(String name, double dateofbirth, String job) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(double dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void inputInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập họ và têm :");
        this.name=scanner.nextLine();
        System.out.println("Nhập số tuổi :");
        this.dateofbirth=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập nghề nghiệp :");
        this.job=scanner.nextLine();
    }
    public void showInfo(){
        System.out.printf("Họ và tên la: %s, Số tuổi : %s, Nghề nghiệp là : %s \n",name,dateofbirth,job);
    }
}
