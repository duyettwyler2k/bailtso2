import java.util.ArrayList;
import java.util.List;

public class Quanlihogiadinh {
List<Street> streets=new ArrayList<Street>();
//them ho dan
    public void addFamily(Street street){
     streets.add(street);
    }
    //hien thi ho gia dinh
    public void showFamily(){
        for (Street street:streets){
            street.showInputMemberFamily();
        }
    }
    //hien thi ho gia dinh co nguoi tren 80
    public void nguoicaotuoi(){
        for (Street street:streets){
            if(street.getPeople().getDateofbirth()>=80){
               street.showInputMemberFamily();
            }
        }
    }
}
