import java.util.Scanner;

public class Street {
    private double members;
    private double adress;
    private People people=new People();

    public Street() {
    }

    public Street(double members, double adress, People people) {
        this.members = members;
        this.adress = adress;
        this.people = people;
    }

    public double getMembers() {
        return members;
    }

    public void setMembers(double members) {
        this.members = members;
    }

    public double getAdress() {
        return adress;
    }

    public void setAdress(double adress) {
        this.adress = adress;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    public void inputMemberFamily(){
        people.inputInfo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so thanh vien trong ho :");
        this.members=scanner.nextDouble();
        System.out.println("Nhap so nha :");
        this.adress=scanner.nextDouble();
    }
    public void showInputMemberFamily(){
        people.showInfo();
        System.out.printf("So thanh vien trong ho la %s ,so nha la %s ",this.members,this.adress);
    }
}
