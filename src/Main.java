import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quanlihogiadinh quanlihogiadinh = new Quanlihogiadinh();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Street street = new Street();
                    street.inputMemberFamily();
                    quanlihogiadinh.addFamily(street);
                    break;
                }
                case 2: {
                    quanlihogiadinh.showFamily();
                    break;
                }
                case 3:{
                    quanlihogiadinh.nguoicaotuoi();
                    break;
                }

            }

        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin hộ dân");
        System.out.println("2. Hiển thị thông tin hộ dân");
        System.out.println("3 .Hiển thị những hộ dân có thành viên trên 80 tuổi");
        System.out.println("0. Exit");
    }
}
