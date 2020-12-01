
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



abstract class tugas extends javax.swing.JFrame{
    
    protected String NamaTugas, nama;
    protected String StatusTugas, status;
    protected String IDTugas, id;
    protected String EditTugas, HapusTugas, TambahTugas;
    protected String hari, day;
    
    private Calendar cal = Calendar.getInstance();
    private String tgl;
    
    abstract void setIDTugas(String id);
    abstract void tampilData();
    abstract void setTugas(String nama);
    abstract void deleteTugas(String id);
    
    public void editTugas(){};
    
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
        this.tgl = tanggal.format(cal.getTime());
    }
    
    public String getTglHariIni(){
        setTglHariIni();
        return this.tgl;
    }
    
    public String getDay(){
        Date tgll = new Date();
        SimpleDateFormat formatter = null;
        formatter = new SimpleDateFormat("EEEE");
        day = formatter.format(tgll);
        return day;
    }
    
    public String getHari(){
        
        switch(getDay()){
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
