package firlatim;

public class Firlatim {

    public void cokCalis() throws Exception {
        try {
            throw new Exception("bir istisna");
        } catch (Exception ex) {
            System.out.println("cokCalis() istisna yakalandı:" + ex);
                throw ex;
        }
    }

    public void calis() throws Exception {
        try {
            cokCalis();
        } catch (Exception ex) {
            System.out.println("calis() istisna yakalandı:" + ex);
            throw ex;
        }
    }

    public void basla() {
        try {
            calis();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Firlatim f = new Firlatim();
        f.basla();
    }
}
