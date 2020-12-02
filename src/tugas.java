
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



abstract class tugas extends javax.swing.JFrame{

    protected String NamaTugas;
    protected String StatusTugas;
    protected String IDTugas;
    protected String TglHariIni;
    
    abstract void tampilData();
    abstract void setTugas(String nama, String status);
    abstract void editTugas(String id, String nama, String status);
    abstract void deleteTugas(String id);    
    
    public void setIDTugas(String id){
        this.IDTugas = id;
    };
    public void setNamaTugas(String nama){
        this.NamaTugas = nama;
    };
    public void setStatusTugas(String status){
        this.StatusTugas = status;
    };
    
    public String getIDTugas(){
        return this.IDTugas;
    };
    public String getNamaTugas(){
        return this.NamaTugas;
    };
    public String getStatusTugas(){
        return this.StatusTugas;
    };
    
    public void setTglHariIni(){
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        this.TglHariIni = tanggal.format(cal.getTime());
    }
    
    public String getTglHariIni(){
        setTglHariIni();
        return this.TglHariIni;
    }
    
    public String getHari(){
        String hari = "";
        Date tgll = new Date();
        SimpleDateFormat formatter = null;
        formatter = new SimpleDateFormat("EEEE");
        String day = formatter.format(tgll);
        switch(day){
            case "Sunday":
                hari = "Minggu";
            break;
            case "Monday":
                hari = "Senin";
            break;
            case "Tuesday":
                hari = "Selasa";
            break;
            case "Wednesday":
                hari = "Rabu";
            break;
            case "Thursday":
                hari = "Kamis";
            break;
            case "Friday":
                hari = "Jumat";
            break;
            case "Saturday":
                hari = "Sabtu";
            break;
        }
        return hari;
    }
    
    public void tUmum(){
        TugasUmum t = new TugasUmum();
        t.setVisible(true);
        this.setVisible(false);
    }
    
    public void tBerjangka(){
        TugasBerjangka t = new TugasBerjangka();
        t.setVisible(true);
        this.setVisible(false);
    }
    
    public void tRutin(){
        TugasRutin t = new TugasRutin();
        t.setVisible(true);
        this.setVisible(false);
    }
    
    public void tHari(){
        TugasHariIni t = new TugasHariIni();
        t.setVisible(true);
        this.setVisible(false);
    }
    
    
    
}
