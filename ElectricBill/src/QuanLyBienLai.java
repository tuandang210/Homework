import java.util.Scanner;

public class QuanLyBienLai {
    private BienLai[] bienLais;

    public QuanLyBienLai(){
    }

    public QuanLyBienLai(BienLai[] bienLais){
        this.bienLais = bienLais;
    }

    public BienLai[] getBienLais() {
        return bienLais;
    }

    public void setBienLais(BienLai[] bienLais) {
        this.bienLais = bienLais;
    }

    public void inputBienLais(){
        for (int i=0;i<bienLais.length;i++){
            bienLais[i]= new BienLai();
            bienLais[i].inputBienLai();
        }
    }

    public void showBienlais(){
        for (BienLai bienLai : bienLais){
            bienLai.showBienlai();
        }
    }

    public void showMoneyById(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập id cần tính tiền: ");
        int id = sc.nextInt();
        for (int i=0; i<bienLais.length;i++){
            if(id == bienLais[i].getPerson().getId()){
                System.out.println(bienLais[i].getPayMoney());
            }
        }
    }
}
