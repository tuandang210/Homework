package QuanLyNhanVien;

public class NhanVienParttime extends NhanVien{
    private int numberOfWork;

    public NhanVienParttime(){
    }

    public NhanVienParttime(int numberOfWork) {
        this.numberOfWork = numberOfWork;
    }

    public NhanVienParttime(String id, String name, int yearOld, String phoneNumber, String email, int numberOfWork) {
        super(id, name, yearOld, phoneNumber, email);
        this.numberOfWork = numberOfWork;
    }

    public int getNumberOfWork() {
        return numberOfWork;
    }

    public void setNumberOfWork(int numberOfWork) {
        this.numberOfWork = numberOfWork;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "numberOfWork=" + numberOfWork +
                '}';
    }
}
