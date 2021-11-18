import java.util.ArrayList;
import java.util.Scanner;

import controller.EventListener;
import controller.HandleEvent;
import dao.Database;
import dao.Model;

public class App {

    private static String cas;

    public static void main(String[] args) throws Exception {
        EventListener listener = new HandleEvent();

        listener.setData(Database.getData());
        Scanner input = new Scanner(System.in);
        showCase(input);
        switch (cas) {
        case "1": {
            System.out.println("Loai hang hoa:");
            String loaHangHoa = input.nextLine();
            System.out.println("Ma so:");
            String maHangHoa = input.nextLine();
            System.out.println("ten:");
            String tenHangHoa = input.nextLine();
            System.out.println("so luong:");
            int soHangHoaTonKho = input.nextInt();
            System.out.println("gia:");
            Float giaNhapHangHoa = input.nextFloat();
            System.out.println("ngay:");
            String ngayHangHoaNhapKho = input.nextLine();
            listener.them(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        }
            main(args);
            break;
        case "2": {
            System.out.println("Ma so:");
            String maSo = input.nextLine();
            listener.xoa(maSo);
        }
            break;
        case "3": {
            System.out.println("Ma so can sua:");
            String maHangHoa = input.nextLine();
            listener.showEachData(maHangHoa);

            System.out.println("Ten hang hoa moi:");
            String tenHangHoa = input.nextLine();
            System.out.println("So luong:");
            int soHangHoaTonKho = input.nextInt();
            System.out.println("Gia:");
            Float giaNhapHangHoa = input.nextFloat();
            System.out.println("Ngay:");
            String ngayHangHoaNhapKho = input.nextLine();

            listener.sua(tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        }
            break;
        case "4": {
            System.out.println("Ma so can tim:");
            String maHangHoa = input.nextLine();
            listener.timKiem(maHangHoa);
        }
        }
    }

    private static void showCase(Scanner input) {

        System.out.print("Menu:\n1: Them; 2: Xoa; 3: Sua; 4: Tim kiem; 5: Sap xep; 6: Thong Ke: \nMoi ban nhap: ");
        cas = input.nextLine();
    }

    private static void show(ArrayList<Model> sanPham) {

    }
}
