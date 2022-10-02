
public class Adres {
    public String tc;

    public Adres(String tc, String sehir, String ilce, String mahalle, String sokak, String kapino, String postakodu) {
        this.tc = tc;
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.kapino = kapino;
        this.postakodu = postakodu;
    }

    public Adres(String sehir, String ilce, String mahalle, String sokak, String kapino, String postakodu) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.kapino = kapino;
        this.postakodu = postakodu;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getKapino() {
        return kapino;
    }

    public void setKapino(String kapino) {
        this.kapino = kapino;
    }

    public String getPostakodu() {
        return postakodu;
    }

    public void setPostakodu(String postakodu) {
        this.postakodu = postakodu;
    }
    public String sehir;
    public String ilce;
    public String mahalle;
    public String sokak;
    public String kapino;
    public String postakodu;
            
}
public class AnaMenu extends javax.swing.JFrame {
    
   public AnaMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        musteriGiris = new javax.swing.JButton();
        temsilciGiris = new javax.swing.JButton();
        yoneticiGiris = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        musteriGiris.setText("Müşteri Girişi");
        musteriGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriGirisActionPerformed(evt);
            }
        });

        temsilciGiris.setText("Temsilci Girişi");
        temsilciGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temsilciGirisActionPerformed(evt);
            }
        });

        yoneticiGiris.setText("Yönetici Girişi");
        yoneticiGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiGirisActionPerformed(evt);
            }
        });

        cikis.setText("Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musteriGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoneticiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temsilciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cikis)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(musteriGiris)
                .addGap(18, 18, 18)
                .addComponent(temsilciGiris)
                .addGap(18, 18, 18)
                .addComponent(yoneticiGiris)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(cikis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void musteriGirisActionPerformed(java.awt.event.ActionEvent evt) {                                             
         setVisible(false);
        Musteri musteri=new Musteri();
        musteri.setVisible(true);
    }                                            

    private void temsilciGirisActionPerformed(java.awt.event.ActionEvent evt) {                                              
          setVisible(false);
         Temsilci temsilci = new Temsilci();
         temsilci.setVisible(true);
    }                                             

    private void yoneticiGirisActionPerformed(java.awt.event.ActionEvent evt) {                                              
          setVisible(false);
         Yonetici yonetici=new Yonetici();
         yonetici.setVisible(true);
    }                                             

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {                                      
        setVisible(false);
        System.exit(0);
    }                                     

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cikis;
    private javax.swing.JButton musteriGiris;
    private javax.swing.JButton temsilciGiris;
    private javax.swing.JButton yoneticiGiris;
    // End of variables declaration                   
}

public class Database {

    public static final String kullaniciAdi = "root";
    public static final String parola = "";
    public static final String dbName = "banka";
    public static final String host = "localhost";
    public static final int port = 3306;
}
-
public class Hesap {
    public int hesapid;
    public String tc;
    public int bakiye;
    public String kur;

    public int getHesapid() {
        return hesapid;
    }

    public void setHesapid(int hesapid) {
        this.hesapid = hesapid;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKur() {
        return kur;
    }

    public void setTur(String Kur) {
        this.kur = kur;
    }

    public Hesap(int hesapid, String tc, int bakiye, String kur) {
        this.hesapid = hesapid;
        this.tc = tc;
        this.bakiye = bakiye;
        this.kur = kur;
    }
}

public class Islem {

    public Islem(int islemno, String kaynak, String hedef, String islem, Double tutar, Double hbakiye, Double kbakiye, String date) {
        this.islemno = islemno;
        this.kaynak = kaynak;
        this.hedef = hedef;
        this.islem = islem;
        this.tutar = tutar;
        this.hbakiye = hbakiye;
        this.kbakiye = kbakiye;
        this.date = date;
    }

    public int getIslemno() {
        return islemno;
    }

    public void setIslemno(int islemno) {
        this.islemno = islemno;
    }
    public int islemno;
    public String tc;
    public String kaynak;
    public String hedef;
    public String islem;
    public Double tutar;
    public Double hbakiye;
    public Double kbakiye;
    public String date;

    public Islem(String kaynak, String hedef, String islem, Double tutar, Double hbakiye, Double kbakiye, String date) {
        this.kaynak = kaynak;
        this.hedef = hedef;
        this.islem = islem;
        this.tutar = tutar;
        this.hbakiye = hbakiye;
        this.kbakiye = kbakiye;
        this.date = date;
    }

    public String getKaynak() {
        return kaynak;
    }

    public void setKaynak(String kaynak) {
        this.kaynak = kaynak;
    }

    public String getHedef() {
        return hedef;
    }

    public void setHedef(String hedef) {
        this.hedef = hedef;
    }

    public String getIslem() {
        return islem;
    }

    public void setIslem(String islem) {
        this.islem = islem;
    }

    public Double getTutar() {
        return tutar;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }

    public Double getHbakiye() {
        return hbakiye;
    }

    public void setHbakiye(Double hbakiye) {
        this.hbakiye = hbakiye;
    }

    public Double getKbakiye() {
        return kbakiye;
    }

    public void setKbakiye(Double kbakiye) {
        this.kbakiye = kbakiye;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
            
}

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

public class Islemler {

    public int temId;
    public String musTc;
    public Connection con = null;
    public Statement statement = null;
    public PreparedStatement preparedStatement = null;

    public Islemler() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }
        try {
            con = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            // System.out.println("Baglanti basarili");
        } catch (SQLException ex) {
            //System.out.println("Baglanti basarisiz");
            ex.printStackTrace();
        }
    }

    public Islemler(String tc) {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }
        try {
            con = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            //  System.out.println("Baglanti basarili");
        } catch (SQLException ex) {
            //System.out.println("Baglanti basarisiz");
            ex.printStackTrace();
        }
        musTc = tc;
    }

    public Islemler(int id) {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }
        try {
            con = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            // System.out.println("Baglanti basarili");
        } catch (SQLException ex) {
            //System.out.println("Baglanti basarisiz");
            ex.printStackTrace();
        }
        temId = id;
    }

    public boolean temsilcigirisYap(int id, String parola) {
        String sorgu = "Select * from temsilci where id=? and sifre=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, parola);
            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean musterigirisYap(String tc) {
        String sorgu = "Select * from musteri where tc=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void musteriSil(String id) {
        String sorgu = "Delete from musteri where tc=?";
        String sorgu1 = "Delete from hesaplar where tc=?";
         String sorgu2 = "Delete from adres where tc=?";

        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
             preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void musteriGuncelle(String yeniAd, String yeniSoyad, String yeniEmail, String yeniTel, Adres adres, String tc) {
        String sorgu = "Update musteri set ad=? , soyad=? ,email=?,tel=? where tc=?";
        String sorgu1 = "Update adres set sehir=? ,ilce=? ,mahalle=?,sokak=?,kapino=?,postakodu=? where tc=?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniSoyad);
            preparedStatement.setString(3, yeniEmail);
            preparedStatement.setString(4, yeniTel);
            preparedStatement.setString(5, tc);
            preparedStatement.executeUpdate();
            
            preparedStatement = con.prepareStatement(sorgu1);
            
            preparedStatement.setString(1, adres.getSehir());
            preparedStatement.setString(2, adres.getIlce());
            preparedStatement.setString(3, adres.getMahalle());
            preparedStatement.setString(4, adres.getSokak());
            preparedStatement.setString(5, adres.getKapino());
            preparedStatement.setString(6, adres.getPostakodu());
            preparedStatement.setString(7, tc);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void musteriEkle(String ad, String soyad, String tc, String email, String tel, Adres adres, int id) {

        String sorgu = "Insert into musteri (ad,soyad,tc,email,tel,temsilcino) values(?,?,?,?,?,?)";
        String sorgu2 = "Insert into adres (tc,sehir,ilce,mahalle,sokak,kapino,postakodu) values(?,?,?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, tel);
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();

            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setString(1, adres.getTc());
            preparedStatement.setString(2, adres.getSehir());
            preparedStatement.setString(3, adres.getIlce());
            preparedStatement.setString(4, adres.getMahalle());
            preparedStatement.setString(5, adres.getSokak());
            preparedStatement.setString(6, adres.getKapino());
            preparedStatement.setString(7, adres.getPostakodu());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void musteriSayisiArttir(int id) {
        int musteriSay = 0;
        String sorgu1 = "select musterisayisi from temsilci where id=?";
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                musteriSay = rs.getInt("musterisayisi");

                musteriSay++;

            }
            String sorgu2 = "update temsilci set musterisayisi=? where id=?";
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, musteriSay);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void musteriSayisiAzalt(int id) {
        int musteriSay = 0;
        String sorgu1 = "select musterisayisi from temsilci where id=?";
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                musteriSay = rs.getInt("musterisayisi");

                musteriSay--;

            }
            String sorgu2 = "update temsilci set musterisayisi=? where id=?";

            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, musteriSay);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void defaultMusteriEkle(String ad, String soyad, String tc, String email, String tel, Adres adres) {
        int id = 0;
        String sorgu1 = "Select id from temsilci order by musterisayisi";
        String sorgu = "Insert into musteri (ad,soyad,tc,email,tel,temsilcino) values(?,?,?,?,?,?)";
        String sorgu2 = "Insert into adres (tc,sehir,ilce,mahalle,sokak,kapino,postakodu) values(?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");

                break;
            }

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, tel);
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();

            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setString(1, adres.getTc());
            preparedStatement.setString(2, adres.getSehir());
            preparedStatement.setString(3, adres.getIlce());
            preparedStatement.setString(4, adres.getMahalle());
            preparedStatement.setString(5, adres.getSokak());
            preparedStatement.setString(6, adres.getKapino());
            preparedStatement.setString(7, adres.getPostakodu());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Yonetici.class.getName()).log(Level.SEVERE, null, ex);
        }
        musteriSayisiArttir(id);

    }

    public ArrayList<Musteriler> musterileriGetir(int tid) {

        ArrayList<Musteriler> cikti = new ArrayList<Musteriler>();

        String sorgu = "SELECT * FROM musteri where temsilcino=?";
        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, tid);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String tc = rs.getString("tc");
                String email = rs.getString("email");
                String tel = rs.getString("tel");

                int id = rs.getInt("temsilcino");
                cikti.add(new Musteriler(ad, soyad, tc, email, tel, id));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public Adres adresBilgiGetir(String tc) {
        String sorgu2 = "select * from adres where tc=?";
        String sehir = "";
        String ilce = "";
        String mahalle = "";
        String sokak = "";
        String kapino = "";
        String postakodu = "";
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setString(1, tc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sehir = rs.getString("sehir");
                ilce = rs.getString("ilce");
                mahalle = rs.getString("mahalle");
                sokak = rs.getString("sokak");
                kapino = rs.getString("kapino");
                postakodu = rs.getString("postakodu");

            }
            Adres adres = new Adres(sehir, ilce, mahalle, sokak, kapino, postakodu);
            return adres;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<String> musteriBilgiGetir(String mTc) {

        ArrayList<String> cikti = new ArrayList<String>();

        String sorgu = "SELECT * FROM musteri where tc=?";
        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, mTc);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                cikti.add(rs.getString("ad"));
                cikti.add(rs.getString("soyad"));
                cikti.add(rs.getString("tc"));
                cikti.add(rs.getString("email"));
                cikti.add(rs.getString("tel"));
                

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String birimleriGoruntule() {

        String birimler = "";
        String sorgu = "select birim from kurlar";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String birim = rs.getString("birim");
                birimler = birimler + " " + birim;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return birimler;
    }

    public void hesapOlustur(String tc, String kur) {
        MusteriEkrani mEkran = new MusteriEkrani();
        String sorgu2 = "Select birim from kurlar";
        String mesaj2 = "Lütfen Geçerli Bir Kur Giriniz.";
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            ResultSet rs = preparedStatement.executeQuery();

            ArrayList<String> birim = new ArrayList<>();

            while (rs.next()) {
                birim.add(rs.getString("birim"));

            }
            int sayac = 0;
            for (int j = 0; j < birim.size(); j++) {
                if (birim.get(j).equals(kur)) {

                    String sorgu = "insert into hesaplar(tc,bakiye,kur) values(?,0,?)";
                    String mesaj1 = "Hesap oluşturuldu.";
                    try {
                        preparedStatement = con.prepareStatement(sorgu);
                        preparedStatement.setString(1, tc);
                        preparedStatement.setString(2, kur);
                        preparedStatement.executeUpdate();
                        JOptionPane.showMessageDialog(mEkran, mesaj1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                } else if (sayac == birim.size()) {
                    JOptionPane.showMessageDialog(mEkran, mesaj2);
                    break;
                }
                sayac++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void paraGonder(int id1, int id2, Double tutar, String tc) {
        MusteriEkrani mEkran = new MusteriEkrani();
        double bakiye1 = 0, bakiye2 = 0;
        double temp1 = 0;
        double temp2 = 0;
        double carpim = 0;
        String kur1 = null, kur2 = null;
        String sorgu1 = "select bakiye,kur from hesaplar where hesapid=? and tc=?";
        String sorgu2 = "select bakiye,kur from hesaplar where hesapid=?";
        String sorgu5 = "select hesapid from hesaplar where tc=?";
        String mesaj2 = "Para Başarıyla Gönderildi.";
        String mesaj5 = "Bu id ye sahip hesabınız bulunmamaktadır.";
        ArrayList<Integer> hesapid = new ArrayList<Integer>();
        try {
            preparedStatement = con.prepareStatement(sorgu5);

            preparedStatement.setString(1, tc);
            ResultSet rs4 = preparedStatement.executeQuery();

            while (rs4.next()) {
                hesapid.add(rs4.getInt("hesapid"));

            }
            int kontrol = 0;
            for (int i = 0; i < hesapid.size(); i++) {
                if (id1 == hesapid.get(i)) {
                    break;
                }
                kontrol++;
            }
            if (kontrol == hesapid.size()) {
                JOptionPane.showMessageDialog(mEkran, mesaj5);

            } else {
                preparedStatement = con.prepareStatement(sorgu1);

                preparedStatement.setInt(1, id1);
                preparedStatement.setString(2, tc);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {

                    bakiye1 = rs.getInt("bakiye");
                    kur1 = rs.getString("kur");
                }
                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setInt(1, id2);
                ResultSet rs1 = preparedStatement.executeQuery();

                while (rs1.next()) {
                    bakiye2 = rs1.getInt("bakiye");
                    kur2 = rs1.getString("kur");
                }
                String mesaj1 = "Hesapta yeterli bakiye yok.Bakiyeniz :" + bakiye1;
                if (bakiye1 < tutar) {
                    JOptionPane.showMessageDialog(mEkran, mesaj1);
                } else {
                    bakiye1 = bakiye1 - tutar;
                    if (kur1.equals(kur2)) {
                        bakiye2 = bakiye2 + tutar;
                        String sorgu3 = "update hesaplar set bakiye=? where hesapid=?";
                        preparedStatement = con.prepareStatement(sorgu3);
                        preparedStatement.setDouble(1, bakiye1);
                        preparedStatement.setInt(2, id1);
                        preparedStatement.executeUpdate();
                        preparedStatement = con.prepareStatement(sorgu3);
                        preparedStatement.setDouble(1, bakiye2);
                        preparedStatement.setInt(2, id2);
                        preparedStatement.executeUpdate();
                        JOptionPane.showMessageDialog(mEkran, mesaj2);

                    } else {

                        ArrayList<String> birim = new ArrayList<String>();
                        ArrayList<Integer> deger = new ArrayList<Integer>();
                        String sorgu4 = "select * from kurlar";
                        preparedStatement = con.prepareStatement(sorgu4);
                        ResultSet rs2 = preparedStatement.executeQuery();
                        while (rs2.next()) {
                            birim.add(rs2.getString("birim"));
                            deger.add(rs2.getInt("deger"));

                        }

                        for (int i = 0; i < birim.size(); i++) {
                            if (birim.get(i).equals(kur1)) {
                                temp1 = deger.get(i);

                            }
                            if (birim.get(i).equals(kur2)) {
                                temp2 = deger.get(i);

                            }

                        }

                        tutar = tutar * (temp1 / temp2);
                        bakiye2 = bakiye2 + tutar;

                        String sorgu3 = "update hesaplar set bakiye=? where hesapid=?";
                        preparedStatement = con.prepareStatement(sorgu3);
                        preparedStatement.setDouble(1, bakiye1);
                        preparedStatement.setInt(2, id1);
                        preparedStatement.executeUpdate();
                        preparedStatement = con.prepareStatement(sorgu3);
                        preparedStatement.setDouble(1, bakiye2);
                        preparedStatement.setInt(2, id2);
                        preparedStatement.executeUpdate();
                        JOptionPane.showMessageDialog(mEkran, mesaj2);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            String tarih = tarih();
            String sorgu4 = "insert into islemler (tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih)"
                    + "values(?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sorgu4);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, String.valueOf(id1));
            preparedStatement.setString(3, String.valueOf(id2));
            preparedStatement.setString(4, "Para Gönderme");
            preparedStatement.setDouble(5, tutar);
            preparedStatement.setDouble(6, bakiye2);
            preparedStatement.setDouble(7, bakiye1);
            preparedStatement.setString(8, tarih);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hesapSil(String tc, int hesapid) {
        MusteriEkrani mEkran = new MusteriEkrani();
        String sorgu = "delete from hesaplar where tc=? and hesapid=?";
        String sorgu1 = "select * from hesaplar where tc=? and hesapid=?";

        String mesaj1 = "Hesap Başarıyla Silindi.";
        String mesaj2 = "Bakiye 0 olmayan hesap silinemez.";
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, tc);
            preparedStatement.setInt(2, hesapid);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int bakiye = rs.getInt("bakiye");
                if (bakiye == 0) {
                    preparedStatement = con.prepareStatement(sorgu);
                    preparedStatement.setString(1, tc);
                    preparedStatement.setInt(2, hesapid);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(mEkran, mesaj1);
                } else {
                    JOptionPane.showMessageDialog(mEkran, mesaj2);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Hesap> hesaplariGetir(String tc) {

        ArrayList<Hesap> cikti = new ArrayList<Hesap>();

        String sorgu = "SELECT * FROM hesaplar where tc=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int hesapId = rs.getInt("hesapid");

                int bakiye = rs.getInt("bakiye");
                String kur = rs.getString("kur");
                cikti.add(new Hesap(hesapId, tc, bakiye, kur));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void hesapParaCek(String tc, Double tutar, int hesapno, String hKur) {

        MusteriEkrani mEkran = new MusteriEkrani();
        int hesapId = 0;
        Double bakiye = 0.0;
        String mesaj1 = "Yeterli Bakiye Yok";
        String mesaj2 = "Para Çekme İşlemi Tamamlandı";

        String kur = null;
        String sorgu = "SELECT hesapid,bakiye,kur FROM hesaplar where hesapid=? and tc=?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, hesapno);
            preparedStatement.setString(2, tc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                hesapId = rs.getInt("hesapid");
                bakiye = rs.getDouble("bakiye");
                kur = rs.getString("kur");

            }
           

                if (tutar > bakiye) {
                    JOptionPane.showMessageDialog(mEkran, mesaj1);
                } else {
                    bakiye = bakiye - tutar;
                    JOptionPane.showMessageDialog(mEkran, mesaj2);
                    String tarih = tarih();
                    String sorgu3 = "update hesaplar set bakiye=? where hesapid=? and tc=?";
                    preparedStatement = con.prepareStatement(sorgu3);
                    preparedStatement.setDouble(1, bakiye);
                    preparedStatement.setInt(2, hesapno);
                    preparedStatement.setString(3, tc);
                    preparedStatement.executeUpdate();
                    String sorgu4 = "insert into islemler (tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih)"
                            + "values(?,?,?,?,?,?,?,?)";
                    preparedStatement = con.prepareStatement(sorgu4);
                    preparedStatement.setString(1, tc);
                    preparedStatement.setString(2, String.valueOf(hesapno));
                    preparedStatement.setString(3, "NULL");
                    preparedStatement.setString(4, "Para Çekme");
                    preparedStatement.setDouble(5, tutar);
                    preparedStatement.setDouble(6, 0.0);
                    preparedStatement.setDouble(7, bakiye);
                    preparedStatement.setString(8, tarih);
                    preparedStatement.executeUpdate();
                    
                }
          
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hesapParaYatir(String tc, Double tutar, int hesapno, String hKur) {

        MusteriEkrani mEkran = new MusteriEkrani();
        int hesapId = 0;
        Double bakiye = 0.0;
        String mesaj1 = "Yeterli Bakiye Yok";
        String mesaj2 = "Para Yatırma İşlemi Tamamlandı";

        String kur = null;
        String sorgu = "SELECT hesapid,bakiye,kur FROM hesaplar where hesapid=? and tc=?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, hesapno);
            preparedStatement.setString(2, tc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                hesapId = rs.getInt("hesapid");
                bakiye = rs.getDouble("bakiye");
                kur = rs.getString("kur");

            }
            
                bakiye = bakiye + tutar;
                JOptionPane.showMessageDialog(mEkran, mesaj2);

                String sorgu3 = "update hesaplar set bakiye=? where hesapid=? and tc=?";
                preparedStatement = con.prepareStatement(sorgu3);
                preparedStatement.setDouble(1, bakiye);
                preparedStatement.setInt(2, hesapno);
                preparedStatement.setString(3, tc);
                preparedStatement.executeUpdate();
                String tarih = tarih();
                String sorgu4 = "insert into islemler (tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih)"
                        + "values(?,?,?,?,?,?,?,?)";
                preparedStatement = con.prepareStatement(sorgu4);
                preparedStatement.setString(1, tc);
                preparedStatement.setString(2, "NULL");
                preparedStatement.setString(3, String.valueOf(hesapno));
                preparedStatement.setString(4, "Para Yatırma");
                preparedStatement.setDouble(5, tutar);
                preparedStatement.setDouble(6, bakiye);
                preparedStatement.setDouble(7, 0);
                preparedStatement.setString(8, tarih);
                preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void kurEkle(String birim, Double kur) {
        Yonetici yon = new Yonetici();
        String sorgu = "INSERT INTO kurlar (birim,deger) VALUES (?,?);";
        String mesaj = "Yeni kur başarıyla eklendi.";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, birim);
            preparedStatement.setDouble(2, kur);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void krediGuncelle(double faiz, double gecikme) {
        Yonetici yon = new Yonetici();
        String sorgu = "update admin set faizorani=?,gecikmeorani=? where id=1";
        String mesaj = "Kredi oranları güncellendi.";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setDouble(1, faiz);
            preparedStatement.setDouble(2, gecikme);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void maasGuncelle(double maas) {
        Yonetici yon = new Yonetici();
        String sorgu = "update admin set maas=? where id=1";

        String mesaj = "Maaşlar  güncellendi.";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setDouble(1, maas);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String tarih() {
        String sorgu = "select date from admin where id=1";
        String sorgu1 = "update admin set date=? where id=1";
        String dbDate = "";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                dbDate = rs.getString("date");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dbDate;
    }

    public void tarihGunEkle(int ekle) {
        Yonetici yon = new Yonetici();
        String sorgu1 = "update admin set date=? where id=1";
        String dbDate = tarih();
        String mesaj = "Tarih Başarıyla Güncellendi.";
        LocalDate Date = LocalDate.parse(dbDate);
        Date = Date.plusDays(ekle);
        String strDate = String.valueOf(Date);
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, strDate);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void tarihAyEkle(int ekle) {
        Yonetici yon = new Yonetici();
        String mesaj = "Tarih Başarıyla Güncellendi.";
        String sorgu1 = "update admin set date=? where id=1";
        String dbDate = tarih();
        LocalDate Date = LocalDate.parse(dbDate);
        Date = Date.plusMonths(ekle);
        String strDate = String.valueOf(Date);
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, strDate);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tarihYilEkle(int ekle) {
        Yonetici yon = new Yonetici();
        String mesaj = "Tarih Başarıyla Güncellendi.";
        String sorgu1 = "update admin set date=? where id=1";
        String dbDate = tarih();
        LocalDate Date = LocalDate.parse(dbDate);
        Date = Date.plusYears(ekle);
        String strDate = String.valueOf(Date);
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, strDate);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(yon, mesaj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Islem> ozetGoruntule(String tcmus) {
        String dbDate = tarih();
        ArrayList<Islem> cikti = new ArrayList<Islem>();
        LocalDate Date = LocalDate.parse(dbDate);

        String ayString = "";
        if (String.valueOf(Date.getMonthValue()).length() == 1) {
            ayString = "0" + String.valueOf(Date.getMonthValue());
        }
        else{
             ayString = String.valueOf(Date.getMonthValue());
        }
        String tarih1 = String.valueOf(Date.getYear()) + "-" + ayString + "-01";

        String tarih2 = String.valueOf(Date.getYear()) + "-" + ayString + "-31";

        String ay = String.valueOf(Date.getMonthValue());
        if (ay.length() == 1) {

            ay = "____" + "0" + ay + "__";
        }
        
       
        String sorgu = "SELECT * FROM `islemler` WHERE tc=? and (tarih BETWEEN ? AND ?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcmus);
            preparedStatement.setString(2, tarih1);
            preparedStatement.setString(3, tarih2);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String kaynak = rs.getString("kaynak");
                String hedef = rs.getString("hedef");
                String islem = rs.getString("islem");
                Double tutar = rs.getDouble("tutar");
                Double hbakiye = rs.getDouble("hbakiye");
                Double kbakiye = rs.getDouble("kbakiye");
                String date = rs.getString("tarih");

                cikti.add(new Islem(kaynak, hedef, islem, tutar, hbakiye, kbakiye, date));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<Islem> ozetGoruntuleYonetici(int ara) {
        String dbDate = tarih();
        ArrayList<Islem> cikti = new ArrayList<Islem>();
        LocalDate Date = LocalDate.parse(dbDate);

        String sorgu = "SELECT * FROM islemler ORDER BY islemno DESC limit ?";
        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ara);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("islemno");
                String kaynak = rs.getString("kaynak");
                String hedef = rs.getString("hedef");
                String islem = rs.getString("islem");
                Double tutar = rs.getDouble("tutar");
                Double hbakiye = rs.getDouble("hbakiye");
                Double kbakiye = rs.getDouble("kbakiye");
                String date = rs.getString("tarih");

                cikti.add(new Islem(id, kaynak, hedef, islem, tutar, hbakiye, kbakiye, date));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<Islem> ozetGoruntuleTemsilci(String tcmus) {

        ArrayList<Islem> cikti = new ArrayList<Islem>();

        String sorgu = "SELECT * FROM `islemler` WHERE tc=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcmus);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String kaynak = rs.getString("kaynak");
                String hedef = rs.getString("hedef");
                String islem = rs.getString("islem");
                Double tutar = rs.getDouble("tutar");
                Double hbakiye = rs.getDouble("hbakiye");
                Double kbakiye = rs.getDouble("kbakiye");
                String date = rs.getString("tarih");

                cikti.add(new Islem(kaynak, hedef, islem, tutar, hbakiye, kbakiye, date));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public double krediBorcKontrol(String tcmus) {
        MusteriEkrani mEkran = new MusteriEkrani();
        String mesaj1 = "Aylık Borcunuz Bulunmamaktadır.";
        String mesaj2 = "Aylık Borcunuz Bulunmaktadır.";
        String mesaj3 = "Aylık Borcunuz Gecikmiştir. Gecikme faizi uygulanacaktır.";
        String sorgu = "select * from kredi where tc=?";
        Double anapara = 0.0;
        Double borc = 0.0;
        Double aylikodeme = 0.0;
        Double gecikmeodeme = 0.0;
        Double faizorani = 0.0;
        Double gecikmeorani = 0.0;
        int odemesayisi = 0;
        int gecikmesayisi = 0;
        String baslangictarihi = "";
        String bitistarihi = "";
        String tarih = tarih();
        LocalDate Date = LocalDate.parse(tarih);

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcmus);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                anapara = rs.getDouble("anapara");
                borc = rs.getDouble("borc");
                aylikodeme = rs.getDouble("aylikodeme");
                gecikmeodeme = rs.getDouble("gecikmeodeme");
                faizorani = rs.getDouble("faizorani");
                gecikmeorani = rs.getDouble("gecikmeorani");
                odemesayisi = rs.getInt("odemesayisi");
                gecikmesayisi = rs.getInt("gecikmesayisi");
                baslangictarihi = rs.getString("baslangictarihi");
                bitistarihi = rs.getString("bitistarihi");

            }

            LocalDate baslangicDate = LocalDate.parse(baslangictarihi);
            LocalDate bitisDate = LocalDate.parse(bitistarihi);
            int vade = (int) ChronoUnit.MONTHS.between(baslangicDate, bitisDate);
            int ay = (int) ChronoUnit.MONTHS.between(Date, bitisDate);
            String mesaj5 = "Kredi Borcunuz Bitmiştir.";
            if (odemesayisi + gecikmesayisi == vade) {
                String sorguString = "Delete from kredi where tc=?";
                preparedStatement = con.prepareStatement(sorguString);
                preparedStatement.setString(1, tcmus);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(mEkran, mesaj5);
                return 0.0;
            }
            if (odemesayisi + gecikmesayisi + ay > vade) {

                JOptionPane.showMessageDialog(mEkran, mesaj1);
                return 0.0;
            } else if (odemesayisi + gecikmesayisi + ay == vade) {

                JOptionPane.showMessageDialog(mEkran, mesaj2);
                return aylikodeme;
            } else if (odemesayisi + gecikmesayisi + ay < vade) {

                JOptionPane.showMessageDialog(mEkran, mesaj3);
                return gecikmeodeme;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);

        }
        return 0.0;
    }

    public void krediBorcuOde(String tcmus, int id) {

        String msg = "Aylık Borcunuz Ödenmiştir.";
        MusteriEkrani mEkran = new MusteriEkrani();
        String sorgu = "select * from kredi where tc=?";
        Double anapara = 0.0;
        Double borc = 0.0;
        Double aylikodeme = 0.0;
        Double gecikmeodeme = 0.0;
        Double faizorani = 0.0;
        Double gecikmeorani = 0.0;
        int odemesayisi = 0;
        int gecikmesayisi = 0;
        String baslangictarihi = "";
        String bitistarihi = "";
        String tarih = tarih();
        LocalDate Date = LocalDate.parse(tarih);

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcmus);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                anapara = rs.getDouble("anapara");
                borc = rs.getDouble("borc");
                aylikodeme = rs.getDouble("aylikodeme");
                gecikmeodeme = rs.getDouble("gecikmeodeme");
                faizorani = rs.getDouble("faizorani");
                gecikmeorani = rs.getDouble("gecikmeorani");
                odemesayisi = rs.getInt("odemesayisi");
                gecikmesayisi = rs.getInt("gecikmesayisi");
                baslangictarihi = rs.getString("baslangictarihi");
                bitistarihi = rs.getString("bitistarihi");

            }
            String sorgu1 = "select bakiye,kur from hesaplar where hesapid=?";
            preparedStatement = con.prepareStatement(sorgu1);

            preparedStatement.setInt(1, id);
            ResultSet rs1 = preparedStatement.executeQuery();

            Double bakiye = 0.0;
            String kur = "";
            while (rs1.next()) {
                bakiye = rs1.getDouble("bakiye");
                kur = rs1.getString("kur");
            }

            LocalDate baslangicDate = LocalDate.parse(baslangictarihi);
            LocalDate bitisDate = LocalDate.parse(bitistarihi);
            int vade = (int) ChronoUnit.MONTHS.between(baslangicDate, bitisDate);
            int ay = (int) ChronoUnit.MONTHS.between(Date, bitisDate);

            if (odemesayisi + gecikmesayisi + ay > vade) {

            } else if (odemesayisi + gecikmesayisi + ay == vade) {
                if (bakiye < aylikodeme) {
                    String mesaj = "Hesapta yeterli bakiye yok";
                    JOptionPane.showMessageDialog(mEkran, mesaj);
                } else {
                    if (kur.equalsIgnoreCase("tl")) {
                        borc = borc - aylikodeme;
                        odemesayisi++;

                        String sorgu4 = "update kredi set borc=?,odemesayisi=? where tc=?";
                        try {
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);
                            preparedStatement.setInt(2, odemesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();

                            bakiye = bakiye - aylikodeme;
                            borc = borc - aylikodeme;
                            odemesayisi++;
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);
                            preparedStatement.setInt(2, odemesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();

                            String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                            preparedStatement = con.prepareStatement(sorgu5);
                            preparedStatement.setDouble(1, bakiye);
                            preparedStatement.setString(2, tcmus);
                            preparedStatement.setInt(3, id);
                            preparedStatement.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        String sorgu3 = "select deger from kurlar where birim=?";
                        try {
                            preparedStatement = con.prepareStatement(sorgu3);
                            preparedStatement.setString(1, kur);
                            ResultSet rs2 = preparedStatement.executeQuery();
                            double deger = 0.0;
                            while (rs2.next()) {
                                deger = rs2.getDouble("deger");

                            }
                            bakiye = bakiye * deger;
                            bakiye = bakiye - aylikodeme;
                            borc = borc - aylikodeme;
                            odemesayisi++;
                            String sorgu4 = "update kredi set borc=? ,odemesayisi=? where tc=?";
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);

                            preparedStatement.setInt(2, odemesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();
                            bakiye = bakiye / deger;
                            String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                            preparedStatement = con.prepareStatement(sorgu5);
                            preparedStatement.setDouble(1, bakiye);
                            preparedStatement.setString(2, tcmus);
                            preparedStatement.setInt(3, id);
                            preparedStatement.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
                JOptionPane.showMessageDialog(mEkran, msg);

                String sorgu10 = "INSERT INTO islemler(tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih) VALUES (?,?,?,?,?,?,?,?)";
                String tar = tarih();
                try {
                    preparedStatement = con.prepareStatement(sorgu10);
                    preparedStatement.setString(1, tcmus);
                    preparedStatement.setString(2, String.valueOf(id));
                    preparedStatement.setString(3, "Banka");
                    preparedStatement.setString(4, "Kredi Ödeme");
                    preparedStatement.setDouble(5, aylikodeme);
                    preparedStatement.setDouble(6, 0.0);
                    preparedStatement.setDouble(7, 0.0);
                    preparedStatement.setString(8, tar);
                    preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (odemesayisi + gecikmesayisi + ay < vade) {

                if (bakiye < gecikmeodeme) {
                    String mesaj = "Hesapta yeterli bakiye yok";
                    JOptionPane.showMessageDialog(mEkran, mesaj);
                } else {
                    if (kur.equalsIgnoreCase("tl")) {
                        borc = borc - gecikmeodeme;
                        gecikmesayisi++;

                        String sorgu4 = "update kredi set borc=?,gecikmesayisi=? where tc=?";
                        try {
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);
                            preparedStatement.setInt(2, gecikmesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();

                            bakiye = bakiye - gecikmeodeme;
                            borc = borc - gecikmeodeme;
                            gecikmesayisi++;
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);
                            preparedStatement.setInt(2, gecikmesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();

                            String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                            preparedStatement = con.prepareStatement(sorgu5);
                            preparedStatement.setDouble(1, bakiye);
                            preparedStatement.setString(2, tcmus);
                            preparedStatement.setInt(3, id);
                            preparedStatement.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        String sorgu3 = "select deger from kurlar where birim=?";
                        try {
                            preparedStatement = con.prepareStatement(sorgu3);
                            preparedStatement.setString(1, kur);
                            ResultSet rs2 = preparedStatement.executeQuery();
                            double deger = 0.0;
                            while (rs2.next()) {
                                deger = rs2.getDouble("deger");

                            }
                            bakiye = bakiye * deger;
                            bakiye = bakiye - gecikmeodeme;
                            borc = borc - gecikmeodeme;
                            gecikmesayisi++;
                            String sorgu4 = "update kredi set borc=? ,gecikmesayisi=? where tc=?";
                            preparedStatement = con.prepareStatement(sorgu4);
                            preparedStatement.setDouble(1, borc);
                            preparedStatement.setInt(2, gecikmesayisi);
                            preparedStatement.setString(3, tcmus);
                            preparedStatement.executeUpdate();
                            bakiye = bakiye / deger;
                            String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                            preparedStatement = con.prepareStatement(sorgu5);
                            preparedStatement.setDouble(1, bakiye);
                            preparedStatement.setString(2, tcmus);
                            preparedStatement.setInt(3, id);
                            preparedStatement.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
                JOptionPane.showMessageDialog(mEkran, msg);

                String sorgu10 = "INSERT INTO islemler(tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih) VALUES (?,?,?,?,?,?,?,?)";
                String tar = tarih();
                try {
                    preparedStatement = con.prepareStatement(sorgu10);
                    preparedStatement.setString(1, tcmus);
                    preparedStatement.setString(2, String.valueOf(id));
                    preparedStatement.setString(3, "Banka");
                    preparedStatement.setString(4, "Kredi Ödeme");
                    preparedStatement.setDouble(5, gecikmeodeme);
                    preparedStatement.setDouble(6, 0.0);
                    preparedStatement.setDouble(7, 0.0);
                    preparedStatement.setString(8, tar);
                    preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void krediTumOde(String tcmus, int id) {
        MusteriEkrani mEkran = new MusteriEkrani();
        Double borc = 0.0;
        Double bakiye = 0.0;
        Double anapara = 0.0;
        Double faizorani = 0.0;
        Double kalanodeme = 0.0;

        String kur = "";

        String sorgu = "select * from kredi where tc=?";
        String sorgu1 = "select bakiye,kur from hesaplar where hesapid=?";
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setInt(1, id);
            ResultSet rs1 = preparedStatement.executeQuery();

            while (rs1.next()) {
                bakiye = rs1.getDouble("bakiye");
                kur = rs1.getString("kur");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcmus);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                borc = rs.getDouble("borc");
                anapara = rs.getDouble("anapara");
                faizorani = rs.getDouble("faizorani");

            }
            kalanodeme = borc - anapara * faizorani / 100;

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (bakiye < kalanodeme) {
            String mesaj = "Hesapta yeterli bakiye yok";
            JOptionPane.showMessageDialog(mEkran, mesaj);
        } else {
            if (kur.equalsIgnoreCase("tl")) {

                bakiye = bakiye - kalanodeme;

                String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                try {
                    preparedStatement = con.prepareStatement(sorgu5);
                    preparedStatement.setDouble(1, bakiye);
                    preparedStatement.setString(2, tcmus);
                    preparedStatement.setInt(3, id);
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                String sorgu3 = "select deger from kurlar where birim=?";
                try {
                    preparedStatement = con.prepareStatement(sorgu3);
                    preparedStatement.setString(1, kur);
                    ResultSet rs2 = preparedStatement.executeQuery();
                    double deger = 0.0;
                    while (rs2.next()) {
                        deger = rs2.getDouble("deger");

                    }
                    bakiye = bakiye * deger;
                    bakiye = bakiye - kalanodeme;

                    bakiye = bakiye / deger;
                    String sorgu5 = "update hesaplar set bakiye=? where tc=? and hesapid=?";
                    preparedStatement = con.prepareStatement(sorgu5);
                    preparedStatement.setDouble(1, bakiye);
                    preparedStatement.setString(2, tcmus);
                    preparedStatement.setInt(3, id);
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            String sorguString = "delete from kredi where tc=?";
            try {
                preparedStatement = con.prepareStatement(sorguString);
                preparedStatement.setString(1, tcmus);

                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            }
            String uyari = "Kredi Borcunuz Bitmiştir.";
            JOptionPane.showMessageDialog(mEkran, uyari);
        }

        String sorgu10 = "INSERT INTO islemler(tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih) VALUES (?,?,?,?,?,?,?,?)";
        String tar = tarih();
        try {
            preparedStatement = con.prepareStatement(sorgu10);
            preparedStatement.setString(1, tcmus);
            preparedStatement.setString(2, String.valueOf(id));
            preparedStatement.setString(3, "Banka");
            preparedStatement.setString(4, "Kredi Ödeme");
            preparedStatement.setDouble(5, kalanodeme);
            preparedStatement.setDouble(6, 0.0);
            preparedStatement.setDouble(7, 0.0);
            preparedStatement.setString(8, tar);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void krediCek(String tcmus, Double anapara, int vade) {
        MusteriEkrani mEkran = new MusteriEkrani();
        String uyari = "Krediniz Bitmeden Başka Bir Kredi Çekemezsiniz.";
        String sorgu = "SELECT faizorani,gecikmeorani FROM admin WHERE id=1";
        Double tutar = 0.0;
        Double faizOran = 0.0;
        Double gecikmeOran = 0.0;
        Double aylikOdeme = 0.0;
        Double gecikmeOdeme = 0.0;
        String baslangictarihi = "";
        String bitistarihi = "";
        String tarih = tarih();
        LocalDate Date = LocalDate.parse(tarih);
        Date = Date.plusMonths(1);
        baslangictarihi = String.valueOf(Date);
        bitistarihi = String.valueOf(Date.plusMonths(vade));
        String sorgu20 = "select * from kredi where tc=?";
        try {
            preparedStatement = con.prepareStatement(sorgu20);
            preparedStatement.setString(1, tcmus);
            ResultSet rs50 = preparedStatement.executeQuery();
            String kontrol = "";
            while (rs50.next()) {
                kontrol = rs50.getString("tc");
            }

            if (kontrol.equals(tcmus)) {
                JOptionPane.showMessageDialog(mEkran, uyari);
            } else {
                try {
                    preparedStatement = con.prepareStatement(sorgu);
                    ResultSet rs = preparedStatement.executeQuery();
                    while (rs.next()) {
                        faizOran = rs.getDouble("faizorani");
                        gecikmeOran = rs.getDouble("gecikmeorani");

                    }
                    tutar = anapara + (anapara * faizOran / 100);
                    aylikOdeme = (tutar / vade);
                    gecikmeOdeme = (tutar / vade + (tutar / vade * gecikmeOran / 100));
                    String mesaj = "Krediniz onaylanmıştır.Geri Ödenecek Tutar:" + tutar
                            + "\n " + vade + " vadeli aylık ödeme tutarınız " + aylikOdeme
                            + " olarak ayarlanmıştır . Aylık bu tutarı ödeyememeniz durumunda\n"
                            + " yalnızca 1 aylık ödemeniz gereken tutar"
                            + gecikmeOdeme + " olacaktir.\n"
                            + "Başlangıç : " + baslangictarihi + " Bitiş : " + bitistarihi;
                    JOptionPane.showMessageDialog(mEkran, mesaj);
                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sorgu1 = "INSERT INTO kredi(tc,anapara,borc,aylikodeme,gecikmeodeme,faizorani,gecikmeorani,odemesayisi,gecikmesayisi,baslangictarihi,bitistarihi) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    preparedStatement = con.prepareStatement(sorgu1);
                    preparedStatement.setString(1, tcmus);
                    preparedStatement.setDouble(2, anapara);
                    preparedStatement.setDouble(3, tutar);
                    preparedStatement.setDouble(4, aylikOdeme);
                    preparedStatement.setDouble(5, gecikmeOdeme);
                    preparedStatement.setDouble(6, faizOran);
                    preparedStatement.setDouble(7, gecikmeOran);
                    preparedStatement.setInt(8, 0);
                    preparedStatement.setInt(9, 0);
                    preparedStatement.setString(10, baslangictarihi);
                    preparedStatement.setString(11, bitistarihi);
                    preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sorgu10 = "INSERT INTO islemler(tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih) VALUES (?,?,?,?,?,?,?,?)";
                String tar = tarih();
                try {
                    preparedStatement = con.prepareStatement(sorgu10);
                    preparedStatement.setString(1, tcmus);
                    preparedStatement.setString(2, "Banka");
                    preparedStatement.setString(3, tcmus);
                    preparedStatement.setString(4, "Kredi Çekme");
                    preparedStatement.setDouble(5, tutar);
                    preparedStatement.setDouble(6, 0.0);
                    preparedStatement.setDouble(7, 0.0);
                    preparedStatement.setString(8, tar);
                    preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void maaslariOde() {
        String sorgu = "SELECT * FROM temsilci";
        String sorgu2 = "select maas from admin where id=1";
        String sorgu3 = "insert into islemler(tc,kaynak,hedef,islem,tutar,hbakiye,kbakiye,tarih) values(?,?,?,?,?,?,?,?)";
        String tarih = tarih();
        int temSay = 0;
        Double maas = 0.0;
        try {
            preparedStatement = con.prepareStatement(sorgu);
            ResultSet rs1 = preparedStatement.executeQuery();
            while (rs1.next()) {
                temSay = rs1.getRow();
            }
            preparedStatement = con.prepareStatement(sorgu2);
            ResultSet rs2 = preparedStatement.executeQuery();
            while (rs2.next()) {
                maas = rs2.getDouble("maas");
            }
            preparedStatement = con.prepareStatement(sorgu3);
            preparedStatement.setString(1, "Banka");
            preparedStatement.setString(2, "Banka");
            preparedStatement.setString(3, "Temsilciler");
            preparedStatement.setString(4, "Maaş Ödeme");
            preparedStatement.setDouble(5, temSay * maas);
            preparedStatement.setDouble(6, 0.0);
            preparedStatement.setDouble(7, 0.0);
            preparedStatement.setString(8, tarih);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mesaj = "Maaşlar Ödendi.";
        Yonetici yon = new Yonetici();
        JOptionPane.showMessageDialog(yon, mesaj);
    }

    public void musteriGenelDurum(String tcmus) {
        MusteriEkrani mEkran = new MusteriEkrani();
        String tarih = tarih();
    }

    public void bankaGenelDurum() {
        Yonetici yon = new Yonetici();
        String tarih = tarih();
        LocalDate Date = LocalDate.parse(tarih);
        String yil = String.valueOf(Date.getYear());
        String ay = String.valueOf(Date.getMonthValue());
        if (ay.length() == 1) {
            ay = "0" + ay;
        }
        String gider = "SELECT * from islemler WHERE kaynak='Banka' and year(tarih)=? and month(tarih)=?";
        String gelir = "SELECT * FROM `islemler` WHERE hedef='Banka' and year(tarih)=? and month(tarih)=?";

        Double gelirBank = 0.0;
        Double giderBank = 0.0;
        try {
            preparedStatement = con.prepareStatement(gider);
            preparedStatement.setString(1, yil);
            preparedStatement.setString(2, ay);
            ResultSet rs1 = preparedStatement.executeQuery();

            while (rs1.next()) {
                giderBank = giderBank + rs1.getDouble("tutar");
            }
            preparedStatement = con.prepareStatement(gelir);
            preparedStatement.setString(1, yil);
            preparedStatement.setString(2, ay);
            ResultSet rs2 = preparedStatement.executeQuery();
            while (rs2.next()) {
                gelirBank = gelirBank + rs2.getDouble("tutar");
            }
            String msj = "Gelir = " + gelirBank + "\n"
                    + "Gider = " + giderBank + "\n"
                    + "Kar = " + (gelirBank - giderBank);
            JOptionPane.showMessageDialog(yon, msj);
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Double[] musterikrediBilgi(String tcmus) {
        Double anapara = 0.0;
        Double borc = 0.0;
        Double aylikodeme = 0.0;
        Double faizorani = 0.0;
        Double gecikmeodeme = 0.0;

        String sorgu = "select * from kredi where tc=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcmus);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                anapara = rs.getDouble("anapara");
                borc = rs.getDouble("borc");
                aylikodeme = rs.getDouble("aylikodeme");
                faizorani = rs.getDouble("faizorani");
                gecikmeodeme = rs.getDouble("gecikmeodeme");
            }
            Double[] dizi = {anapara, borc, aylikodeme, faizorani, gecikmeodeme};
            return dizi;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int aylikBorcKontrol(String tcmus) {

        MusteriEkrani mEkran = new MusteriEkrani();
        String sorgu = "select * from kredi where tc=?";

        int odemesayisi = 0;
        int gecikmesayisi = 0;
        String baslangictarihi = "";
        String bitistarihi = "";
        String tarih = tarih();
        LocalDate Date = LocalDate.parse(tarih);

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcmus);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                odemesayisi = rs.getInt("odemesayisi");
                gecikmesayisi = rs.getInt("gecikmesayisi");
                baslangictarihi = rs.getString("baslangictarihi");
                bitistarihi = rs.getString("bitistarihi");

            }
if(baslangictarihi.equals(""))
{
    return -2;
}
            LocalDate baslangicDate = LocalDate.parse(baslangictarihi);
            LocalDate bitisDate = LocalDate.parse(bitistarihi);
            
            int vade = (int) ChronoUnit.MONTHS.between(baslangicDate, bitisDate);
            int ay = (int) ChronoUnit.MONTHS.between(Date, bitisDate);

            if (odemesayisi + gecikmesayisi + ay > vade) {
                return -1;
            } else if (odemesayisi + gecikmesayisi + ay == vade) {
                return 0;
            } else if (odemesayisi + gecikmesayisi + ay < vade) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -2;
    }

    public static void main(String[] args) {
        Islemler islemler = new Islemler();

    }
}

import javax.swing.JOptionPane;


public class Musteri extends javax.swing.JFrame {

    
    public Musteri() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        anaMenu = new javax.swing.JButton();
        mEkle = new javax.swing.JToggleButton();
        girisYap = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tcGir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        anaMenu.setText("Ana Menü");
        anaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuActionPerformed(evt);
            }
        });

        mEkle.setText("Yeni Müşteri");
        mEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEkleActionPerformed(evt);
            }
        });

        girisYap.setText("Giriş");
        girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapActionPerformed(evt);
            }
        });

        jLabel1.setText("TC:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(anaMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcGir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tcGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(girisYap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anaMenu)
                    .addComponent(mEkle))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void anaMenuActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        AnaMenu anamenu=new AnaMenu();
        setVisible(false);
        anamenu.setVisible(true);
    }                                       

    private void mEkleActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        MusteriEkle mEkle=new MusteriEkle();
        mEkle.setVisible(true);
    }                                     

    private void girisYapActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String tc=tcGir.getText();
         String mesaj = "Giriş Başarılı";   
        String mesaj2 = "Giriş Başarısız";
        Islemler islemler = new Islemler();
        boolean girisbasarili = islemler.musterigirisYap(tc);
        
        if (girisbasarili) {
            
            JOptionPane.showMessageDialog(this, mesaj);
            setVisible(false);
            
            MusteriEkrani mEkran = new MusteriEkrani(tc);
           
            mEkran.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, mesaj2);
        }
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton anaMenu;
    private javax.swing.JToggleButton girisYap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton mEkle;
    private javax.swing.JTextField tcGir;
    // End of variables declaration                   
}

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Emir Ertürk
 */
public class MusteriEkle extends javax.swing.JFrame {

    /**
     * Creates new form MusteriEkle
     */
    public MusteriEkle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adGir = new javax.swing.JTextField();
        soyadGir = new javax.swing.JTextField();
        tcGir = new javax.swing.JTextField();
        emailGir = new javax.swing.JTextField();
        telGir = new javax.swing.JTextField();
        mEkle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sehirGir = new javax.swing.JTextField();
        ilceGir = new javax.swing.JTextField();
        mahalleGir = new javax.swing.JTextField();
        sokakGir = new javax.swing.JTextField();
        kapiNoGir = new javax.swing.JTextField();
        postakoduGir = new javax.swing.JTextField();
        anaMenuDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 330, 435));

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("TC:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefon:");

        mEkle.setText("Ekle");
        mEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEkleActionPerformed(evt);
            }
        });

        jLabel7.setText("Şehir:");

        jLabel8.setText("İlçe:");

        jLabel9.setText("Mahalle:");

        jLabel10.setText("Sokak:");

        jLabel11.setText("Kapı No:");

        jLabel12.setText("Posta Kodu:");

        anaMenuDon.setText("Ana Menü");
        anaMenuDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(mEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(anaMenuDon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postakoduGir, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adGir)
                                    .addComponent(soyadGir)
                                    .addComponent(emailGir)
                                    .addComponent(telGir)
                                    .addComponent(tcGir)
                                    .addComponent(sehirGir)
                                    .addComponent(ilceGir)
                                    .addComponent(mahalleGir)
                                    .addComponent(sokakGir)
                                    .addComponent(kapiNoGir))))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soyadGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tcGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sehirGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ilceGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mahalleGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sokakGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kapiNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(postakoduGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEkle)
                    .addComponent(anaMenuDon))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void mEkleActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
          
          String mesaj="Yeni müşteri başarıyla eklendi.";
          Islemler islemler=new Islemler();
        
        String ad=adGir.getText();
        String soyad=soyadGir.getText();
        String tc=tcGir.getText();
        String email=emailGir.getText();
        String tel=telGir.getText();
      
        String sehir=sehirGir.getText();
        String ilce=ilceGir.getText();
        String mahalle=mahalleGir.getText();
        String sokak=sokakGir.getText();
        String kapino=kapiNoGir.getText();
        String postakodu=postakoduGir.getText();
       Adres adres=new Adres(tc, sehir,ilce, mahalle,sokak,kapino,postakodu);
          islemler.defaultMusteriEkle(ad, soyad, tc, email, tel, adres);
         
          JOptionPane.showMessageDialog(this, mesaj);
            setVisible(false);
    }                                     

    private void anaMenuDonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        setVisible(false);
        AnaMenu aMenu=new AnaMenu();
        aMenu.setVisible(true);
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField adGir;
    private javax.swing.JButton anaMenuDon;
    private javax.swing.JTextField emailGir;
    private javax.swing.JTextField ilceGir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kapiNoGir;
    private javax.swing.JButton mEkle;
    private javax.swing.JTextField mahalleGir;
    private javax.swing.JTextField postakoduGir;
    private javax.swing.JTextField sehirGir;
    private javax.swing.JTextField sokakGir;
    private javax.swing.JTextField soyadGir;
    private javax.swing.JTextField tcGir;
    private javax.swing.JTextField telGir;
    // End of variables declaration                   
}

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriEkrani extends javax.swing.JFrame {

    public String tc;
    public int hesapId;
    public String kur;
    DefaultTableModel model;
    DefaultTableModel model2;

    public MusteriEkrani(String tcGir) {
        initComponents();
        tc = tcGir;
        model = (DefaultTableModel) hesapTablo.getModel();
        model2 = (DefaultTableModel) islemTablo.getModel();
        hesapGoruntule(tc);
        Islemler islemler = new Islemler();
        tarihGirM.setText(islemler.tarih());

    }

    public void islemGoruntule(String tc) {
        Islemler islemler = new Islemler(tc);
        model2.setRowCount(0);
        ArrayList<Islem> islem = new ArrayList<Islem>();
        islem = islemler.ozetGoruntule(tc);
        if (islem != null) {
            for (Islem is : islem) {
                Object[] eklenecek = {is.getKaynak(), is.getHedef(), is.getIslem(), is.getTutar(), is.getHbakiye(), is.getKbakiye(), is.getDate()};
                model2.addRow(eklenecek);
            }
        }
    }

    public void hesapGoruntule(String tc) {
        Islemler islemler = new Islemler();
        model.setRowCount(0);
        ArrayList<Hesap> hesap = new ArrayList<Hesap>();
        hesap = islemler.hesaplariGetir(tc);

        if (hesap != null) {
            for (Hesap hesaplar : hesap) {
                Object[] eklenecek = {hesaplar.getHesapid(), hesaplar.getBakiye(), hesaplar.getKur()};
                model.addRow(eklenecek);
            }
        }
    }

    public void tabloGuncelle(String tc) {
        hesapGoruntule(tc);
    }

    public MusteriEkrani() {
        initComponents();
        model = (DefaultTableModel) hesapTablo.getModel();
        hesapGoruntule(tc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ParaCek = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        tutarGir = new javax.swing.JTextField();
        paraCekme = new javax.swing.JButton();
        iptal1 = new javax.swing.JButton();
        ParaYatir = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        tutarGir2 = new javax.swing.JTextField();
        ParaYatirma = new javax.swing.JButton();
        iptal2 = new javax.swing.JToggleButton();
        HesapAc = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birimGir = new javax.swing.JTextField();
        hesapOlustur = new javax.swing.JButton();
        birimler = new javax.swing.JLabel();
        BilgiGuncelle = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adGir = new javax.swing.JTextField();
        soyadGir = new javax.swing.JTextField();
        emailGir = new javax.swing.JTextField();
        telGir = new javax.swing.JTextField();
        guncelleButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tcGir = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sehirGir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ilceGir = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mahalleGir = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        sokakGir = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        kapiNoGir = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        postakoduGir = new javax.swing.JTextField();
        ParaGonder = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gonderenId = new javax.swing.JTextField();
        alanId = new javax.swing.JTextField();
        tutar = new javax.swing.JTextField();
        gonderButton = new javax.swing.JButton();
        OzetGoruntule = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        islemTablo = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        KrediCek = new javax.swing.JFrame();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        krediTutar = new javax.swing.JTextField();
        krediVade = new javax.swing.JTextField();
        krediOnayla = new javax.swing.JButton();
        KrediOde = new javax.swing.JFrame();
        krediOdemeYap = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        krediGetHesapNo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        krediOdenecekTutar = new javax.swing.JLabel();
        krediMesajAlan = new javax.swing.JLabel();
        krediTumOde = new javax.swing.JButton();
        paraCek = new javax.swing.JButton();
        paraYatir = new javax.swing.JButton();
        hesapAc = new javax.swing.JButton();
        hesapSil = new javax.swing.JButton();
        baskaKisiyeparaGonder = new javax.swing.JButton();
        bilgiGuncelle = new javax.swing.JButton();
        krediCek = new javax.swing.JButton();
        krediOde = new javax.swing.JButton();
        ozetGoruntule = new javax.swing.JButton();
        anaMenuDon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hesapTablo = new javax.swing.JTable();
        hesaplarArasiParaGonder = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tarihGirM = new javax.swing.JLabel();

        ParaCek.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ParaCek.setBounds(new java.awt.Rectangle(600, 200, 400, 200));
        ParaCek.setLocation(new java.awt.Point(600, 200));

        jLabel1.setText("Tutar Gir:");

        tutarGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutarGirActionPerformed(evt);
            }
        });

        paraCekme.setText("Onayla");
        paraCekme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekmeActionPerformed(evt);
            }
        });

        iptal1.setText("İptal");
        iptal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ParaCekLayout = new javax.swing.GroupLayout(ParaCek.getContentPane());
        ParaCek.getContentPane().setLayout(ParaCekLayout);
        ParaCekLayout.setHorizontalGroup(
            ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaCekLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paraCekme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iptal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutarGir))
                .addGap(102, 102, 102))
        );
        ParaCekLayout.setVerticalGroup(
            ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaCekLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutarGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paraCekme)
                    .addComponent(iptal1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        ParaYatir.setBounds(new java.awt.Rectangle(600, 200, 400, 200));

        jLabel2.setText("Tutar Gir:");

        tutarGir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutarGir2ActionPerformed(evt);
            }
        });

        ParaYatirma.setText("Onayla");
        ParaYatirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatirmaActionPerformed(evt);
            }
        });

        iptal2.setText("İptal");
        iptal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ParaYatirLayout = new javax.swing.GroupLayout(ParaYatir.getContentPane());
        ParaYatir.getContentPane().setLayout(ParaYatirLayout);
        ParaYatirLayout.setHorizontalGroup(
            ParaYatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaYatirLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(ParaYatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ParaYatirLayout.createSequentialGroup()
                        .addComponent(ParaYatirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iptal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ParaYatirLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutarGir2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        ParaYatirLayout.setVerticalGroup(
            ParaYatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatirLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(ParaYatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tutarGir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParaYatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParaYatirma)
                    .addComponent(iptal2))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        HesapAc.setBounds(new java.awt.Rectangle(600, 200, 400, 300));

        jLabel3.setText("Hesap Birimi Giriniz:");

        jLabel4.setText("Bankamızda Bulunan Kurlar:");

        hesapOlustur.setText("Hesap Oluştur");
        hesapOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapOlusturActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HesapAcLayout = new javax.swing.GroupLayout(HesapAc.getContentPane());
        HesapAc.getContentPane().setLayout(HesapAcLayout);
        HesapAcLayout.setHorizontalGroup(
            HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapAcLayout.createSequentialGroup()
                .addGroup(HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HesapAcLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birimGir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birimler, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HesapAcLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(hesapOlustur)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        HesapAcLayout.setVerticalGroup(
            HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapAcLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(birimler, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HesapAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(birimGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hesapOlustur)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        BilgiGuncelle.setBounds(new java.awt.Rectangle(600, 200, 600, 500));

        jLabel5.setText("Ad:");

        jLabel6.setText("Soyad:");

        jLabel7.setText("Email:");

        jLabel8.setText("Telefon:");

        guncelleButton.setText("Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("TC:");

        jLabel15.setText("Şehir:");

        jLabel9.setText("İlçe:");

        jLabel16.setText("Mahalle:");

        jLabel21.setText("Sokak:");

        jLabel22.setText("Kapı No:");

        jLabel29.setText("Posta Kodu:");

        javax.swing.GroupLayout BilgiGuncelleLayout = new javax.swing.GroupLayout(BilgiGuncelle.getContentPane());
        BilgiGuncelle.getContentPane().setLayout(BilgiGuncelleLayout);
        BilgiGuncelleLayout.setHorizontalGroup(
            BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adGir, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(soyadGir)
                                    .addComponent(tcGir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                    .addComponent(jLabel29))
                                .addGap(43, 43, 43)
                                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailGir, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(telGir)
                                    .addComponent(sehirGir)
                                    .addComponent(ilceGir)
                                    .addComponent(mahalleGir)
                                    .addComponent(sokakGir)
                                    .addComponent(kapiNoGir)
                                    .addComponent(postakoduGir)))))
                    .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        BilgiGuncelleLayout.setVerticalGroup(
            BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BilgiGuncelleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(soyadGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tcGir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sehirGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ilceGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(mahalleGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(sokakGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(kapiNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BilgiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(postakoduGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guncelleButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        ParaGonder.setBounds(new java.awt.Rectangle(600, 200, 500, 400));

        jLabel11.setText("Paranın Çekileceği Hesap No:");

        jLabel12.setText("Paranın Gönderileceği Hesap No:");

        jLabel13.setText("Tutar:");

        gonderButton.setText("Gönder");
        gonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ParaGonderLayout = new javax.swing.GroupLayout(ParaGonder.getContentPane());
        ParaGonder.getContentPane().setLayout(ParaGonderLayout);
        ParaGonderLayout.setHorizontalGroup(
            ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaGonderLayout.createSequentialGroup()
                .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaGonderLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gonderenId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alanId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParaGonderLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(gonderButton)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        ParaGonderLayout.setVerticalGroup(
            ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaGonderLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(gonderenId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(alanId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ParaGonderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gonderButton)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        OzetGoruntule.setBounds(new java.awt.Rectangle(600, 200, 625, 500));

        islemTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "kaynak", "hedef", "islem", "tutar", "kbakiye", "hbakiye", "tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(islemTablo);
        if (islemTablo.getColumnModel().getColumnCount() > 0) {
            islemTablo.getColumnModel().getColumn(0).setResizable(false);
            islemTablo.getColumnModel().getColumn(1).setResizable(false);
            islemTablo.getColumnModel().getColumn(2).setResizable(false);
            islemTablo.getColumnModel().getColumn(3).setResizable(false);
            islemTablo.getColumnModel().getColumn(4).setResizable(false);
            islemTablo.getColumnModel().getColumn(5).setResizable(false);
            islemTablo.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel17.setText("Çekilen Ana Para:");

        jLabel18.setText("Ödenen Faiz:");

        jLabel19.setText("Aylık Borç:");

        jLabel20.setText("Kalan Borç:");

        javax.swing.GroupLayout OzetGoruntuleLayout = new javax.swing.GroupLayout(OzetGoruntule.getContentPane());
        OzetGoruntule.getContentPane().setLayout(OzetGoruntuleLayout);
        OzetGoruntuleLayout.setHorizontalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OzetGoruntuleLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OzetGoruntuleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OzetGoruntuleLayout.setVerticalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OzetGoruntuleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OzetGoruntuleLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OzetGoruntuleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        KrediCek.setBounds(new java.awt.Rectangle(600, 200, 400, 300));

        jLabel27.setText("Kaç Para Çekilecek:");

        jLabel28.setText("Kaç Ay Vade:");

        krediOnayla.setText("Kredi Onayla");
        krediOnayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediOnaylaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KrediCekLayout = new javax.swing.GroupLayout(KrediCek.getContentPane());
        KrediCek.getContentPane().setLayout(KrediCekLayout);
        KrediCekLayout.setHorizontalGroup(
            KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediCekLayout.createSequentialGroup()
                .addGroup(KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KrediCekLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(krediTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(krediVade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(KrediCekLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(krediOnayla)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        KrediCekLayout.setVerticalGroup(
            KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediCekLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(krediTutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KrediCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(krediVade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(krediOnayla)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        KrediOde.setBounds(new java.awt.Rectangle(600, 200, 400, 300));

        krediOdemeYap.setText("Ödeme Yap");
        krediOdemeYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediOdemeYapActionPerformed(evt);
            }
        });

        jLabel30.setText("Paranın Çekileceği Hesap No:");

        jLabel31.setText("Ödenecek Tutar:");

        krediTumOde.setText("Tamamını Öde");
        krediTumOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediTumOdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KrediOdeLayout = new javax.swing.GroupLayout(KrediOde.getContentPane());
        KrediOde.getContentPane().setLayout(KrediOdeLayout);
        KrediOdeLayout.setHorizontalGroup(
            KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediOdeLayout.createSequentialGroup()
                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KrediOdeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(krediMesajAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(KrediOdeLayout.createSequentialGroup()
                                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(krediGetHesapNo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(krediOdenecekTutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(KrediOdeLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(krediOdemeYap)
                        .addGap(18, 18, 18)
                        .addComponent(krediTumOde)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        KrediOdeLayout.setVerticalGroup(
            KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KrediOdeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(krediMesajAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(krediGetHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(krediOdenecekTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(KrediOdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krediOdemeYap)
                    .addComponent(krediTumOde))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));
        setLocation(new java.awt.Point(600, 200));

        paraCek.setText("Para Çek");
        paraCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekActionPerformed(evt);
            }
        });

        paraYatir.setText("Para Yatır");
        paraYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirActionPerformed(evt);
            }
        });

        hesapAc.setText("Hesap Aç");
        hesapAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapAcActionPerformed(evt);
            }
        });

        hesapSil.setText("Hesap Sil");
        hesapSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapSilActionPerformed(evt);
            }
        });

        baskaKisiyeparaGonder.setText("Başka Kişiye Para Gönder");
        baskaKisiyeparaGonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baskaKisiyeparaGonderActionPerformed(evt);
            }
        });

        bilgiGuncelle.setText("Bilgileri Güncelle");
        bilgiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgiGuncelleActionPerformed(evt);
            }
        });

        krediCek.setText("Kredi Çek");
        krediCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediCekActionPerformed(evt);
            }
        });

        krediOde.setText("Kredi  Öde");
        krediOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediOdeActionPerformed(evt);
            }
        });

        ozetGoruntule.setText("Aylik Özet");
        ozetGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ozetGoruntuleActionPerformed(evt);
            }
        });

        anaMenuDon.setText("Ana Menü");
        anaMenuDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuDonActionPerformed(evt);
            }
        });

        hesapTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hesap No", "Bakiye", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hesapTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hesapTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hesapTablo);
        if (hesapTablo.getColumnModel().getColumnCount() > 0) {
            hesapTablo.getColumnModel().getColumn(0).setResizable(false);
            hesapTablo.getColumnModel().getColumn(1).setResizable(false);
            hesapTablo.getColumnModel().getColumn(2).setResizable(false);
        }

        hesaplarArasiParaGonder.setText("Hesaplar Arası Para Gönder");
        hesaplarArasiParaGonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplarArasiParaGonderActionPerformed(evt);
            }
        });

        jLabel14.setText("Tarih:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(krediCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bilgiGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hesapSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hesapAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paraYatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baskaKisiyeparaGonder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paraCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hesaplarArasiParaGonder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(ozetGoruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(krediOde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anaMenuDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tarihGirM, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tarihGirM, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bilgiGuncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paraCek)
                        .addGap(4, 4, 4)
                        .addComponent(paraYatir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hesapAc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hesapSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baskaKisiyeparaGonder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hesaplarArasiParaGonder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediCek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediOde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ozetGoruntule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anaMenuDon))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void paraCekActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ParaCek.setVisible(true);


    }                                       

    private void anaMenuDonActionPerformed(java.awt.event.ActionEvent evt) {                                           

        AnaMenu anamenu = new AnaMenu();
        setVisible(false);
        anamenu.setVisible(true);
    }                                          

    private void hesapTabloMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        int selectedrow = hesapTablo.getSelectedRow();
        hesapId = (int) model.getValueAt(selectedrow, 0);
        kur = (String) model.getValueAt(selectedrow, 2);

    }                                       

    private void baskaKisiyeparaGonderActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        ParaGonder.setVisible(true);
        gonderenId.setText("");
        alanId.setText("");
        tutar.setText("");
    }                                                     

    private void paraCekmeActionPerformed(java.awt.event.ActionEvent evt) {                                          

        Double para = Double.parseDouble(tutarGir.getText());
        Islemler islemler = new Islemler();
        islemler.hesapParaCek(tc, para, hesapId, kur);
        tutarGir.setText("");
        ParaCek.setVisible(false);
        setVisible(true);
        hesapGoruntule(tc);
    }                                         

    private void tutarGirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void paraYatirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ParaYatir.setVisible(true);
    }                                         

    private void ParaYatirmaActionPerformed(java.awt.event.ActionEvent evt) {                                            

        Double para = Double.parseDouble(tutarGir2.getText());
        Islemler islemler = new Islemler();
        islemler.hesapParaYatir(tc, para, hesapId, kur);
        tutarGir2.setText("");
        ParaYatir.setVisible(false);
        setVisible(true);
        hesapGoruntule(tc);
    }                                           

    private void hesapSilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int selectedrow = hesapTablo.getSelectedRow();
        hesapId = (int) model.getValueAt(selectedrow, 0);
        Islemler islemler = new Islemler();
        islemler.hesapSil(tc, hesapId);
        hesapGoruntule(tc);

    }                                        

    private void iptal1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        ParaCek.setVisible(false);
    }                                      

    private void iptal2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        ParaYatir.setVisible(false);
    }                                      

    private void hesapAcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        HesapAc.setVisible(true);
        Islemler islemler = new Islemler();
        String birim = islemler.birimleriGoruntule();
        birimler.setText(birim);
    }                                       

    private void hesapOlusturActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        Islemler islemler = new Islemler();
        islemler.hesapOlustur(tc, birimGir.getText());
        HesapAc.setVisible(false);
        hesapGoruntule(tc);
        birimGir.setText("");
    }                                            

    private void bilgiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        BilgiGuncelle.setVisible(true);
        Islemler islemler = new Islemler();
        ArrayList<String> cikti = new ArrayList<String>();
        cikti = islemler.musteriBilgiGetir(tc);
        adGir.setText((cikti.get(0)));
        soyadGir.setText((cikti.get(1)));
        tcGir.setText((cikti.get(2)));
        emailGir.setText((cikti.get(3)));
        telGir.setText((cikti.get(4)));
       
        Adres adres = islemler.adresBilgiGetir(tc);

        sehirGir.setText(adres.getSehir());
        ilceGir.setText(adres.getIlce());
        mahalleGir.setText(adres.getMahalle());
        sokakGir.setText(adres.getSokak());
        kapiNoGir.setText(adres.getKapino());
        postakoduGir.setText(adres.getPostakodu());
    }                                             

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        String mesaj = "Müşteri Bilgileri Başarıyla Güncellendi.";
        Islemler islemler = new Islemler();

        String ad = adGir.getText();
        String soyad = soyadGir.getText();
        String email = emailGir.getText();
        String tel = telGir.getText();
        String yTc = tcGir.getText();
        String sehir=sehirGir.getText();
     String ilce=ilceGir.getText();
    String mahalle=mahalleGir.getText();
    String sokak=sokakGir.getText();
     String kapino= kapiNoGir.getText();
     String postakodu= postakoduGir.getText();
           Adres adres=new Adres(sehir, ilce, mahalle, sokak, kapino, postakodu);   
        islemler.musteriGuncelle(ad, soyad, email, tel, adres, tc);
        JOptionPane.showMessageDialog(this, mesaj);
        BilgiGuncelle.setVisible(false);
    }                                              

    private void hesaplarArasiParaGonderActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
        ParaGonder.setVisible(true);
        gonderenId.setText("");
        alanId.setText("");
        tutar.setText("");
    }                                                       

    private void gonderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        Islemler islemler = new Islemler();
        int id1 = Integer.parseInt(gonderenId.getText());
        int id2 = Integer.parseInt(alanId.getText());
        Double bakiye = Double.parseDouble(tutar.getText());
        islemler.paraGonder(id1, id2, bakiye, tc);
        ParaGonder.setVisible(false);
        hesapGoruntule(tc);

    }                                            

    private void ozetGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        OzetGoruntule.setVisible(true);
        jLabel23.setText("");
        jLabel26.setText("");
        jLabel25.setText("");
        jLabel24.setText("");
        Islemler islemler = new Islemler();
     int kontrol = islemler.aylikBorcKontrol(tc);
       
        Double[] dizi = islemler.musterikrediBilgi(tc);
       
        if (kontrol == -1) {
            jLabel23.setText(String.valueOf(dizi[0]));
            jLabel26.setText("");
            jLabel25.setText("");
            jLabel24.setText(String.valueOf(dizi[1]));
        } else if (kontrol == 0) {
            jLabel23.setText("");
            jLabel26.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel23.setText(String.valueOf(dizi[0]));
            jLabel26.setText(String.valueOf(dizi[2] - (dizi[0] / (dizi[1] / dizi[2]))));
            jLabel25.setText(String.valueOf(dizi[2]));
            jLabel24.setText(String.valueOf(dizi[1]));
        } else if (kontrol == 1) {
            jLabel23.setText("");
            jLabel26.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel23.setText(String.valueOf(dizi[0]));
            jLabel26.setText(String.valueOf(dizi[4] - (dizi[0] / (dizi[1] / dizi[2]))));
            jLabel25.setText(String.valueOf(dizi[4]));
            jLabel24.setText(String.valueOf(dizi[1]+dizi[4] - (dizi[0] / (dizi[1] / dizi[2]))));

        }

        islemGoruntule(tc);


    }                                             

    private void tutarGir2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void krediCekActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        KrediCek.setVisible(true);
    }                                        

    private void krediOnaylaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Double anapara = Double.parseDouble(krediTutar.getText());
        int vade = Integer.valueOf(krediVade.getText());
        Islemler islemler = new Islemler();
        islemler.krediCek(tc, anapara, vade);
        KrediOde.setVisible(false);


    }                                           

    private void krediOdeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        KrediOde.setVisible(true);
        Islemler islemler = new Islemler();
        double para = islemler.krediBorcKontrol(tc);
        krediOdenecekTutar.setText(String.valueOf(para));
    }                                        

    private void krediOdemeYapActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Islemler islemler = new Islemler();
        int id = Integer.valueOf(krediGetHesapNo.getText());
        islemler.krediBorcuOde(tc, id);

    }                                             

    private void krediTumOdeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Islemler islemler = new Islemler();
        int id = Integer.valueOf(krediGetHesapNo.getText());
        islemler.krediTumOde(tc, id);
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JFrame BilgiGuncelle;
    private javax.swing.JFrame HesapAc;
    private javax.swing.JFrame KrediCek;
    private javax.swing.JFrame KrediOde;
    private javax.swing.JFrame OzetGoruntule;
    private javax.swing.JFrame ParaCek;
    private javax.swing.JFrame ParaGonder;
    private javax.swing.JFrame ParaYatir;
    private javax.swing.JButton ParaYatirma;
    private javax.swing.JTextField adGir;
    private javax.swing.JTextField alanId;
    private javax.swing.JButton anaMenuDon;
    private javax.swing.JButton baskaKisiyeparaGonder;
    private javax.swing.JButton bilgiGuncelle;
    private javax.swing.JTextField birimGir;
    private javax.swing.JLabel birimler;
    private javax.swing.JTextField emailGir;
    private javax.swing.JButton gonderButton;
    private javax.swing.JTextField gonderenId;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JButton hesapAc;
    private javax.swing.JButton hesapOlustur;
    private javax.swing.JButton hesapSil;
    private javax.swing.JTable hesapTablo;
    private javax.swing.JButton hesaplarArasiParaGonder;
    private javax.swing.JTextField ilceGir;
    private javax.swing.JButton iptal1;
    private javax.swing.JToggleButton iptal2;
    private javax.swing.JTable islemTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kapiNoGir;
    private javax.swing.JButton krediCek;
    private javax.swing.JTextField krediGetHesapNo;
    private javax.swing.JLabel krediMesajAlan;
    private javax.swing.JButton krediOde;
    private javax.swing.JButton krediOdemeYap;
    private javax.swing.JLabel krediOdenecekTutar;
    private javax.swing.JButton krediOnayla;
    private javax.swing.JButton krediTumOde;
    private javax.swing.JTextField krediTutar;
    private javax.swing.JTextField krediVade;
    private javax.swing.JTextField mahalleGir;
    private javax.swing.JButton ozetGoruntule;
    private javax.swing.JButton paraCek;
    private javax.swing.JButton paraCekme;
    private javax.swing.JButton paraYatir;
    private javax.swing.JTextField postakoduGir;
    private javax.swing.JTextField sehirGir;
    private javax.swing.JTextField sokakGir;
    private javax.swing.JTextField soyadGir;
    private javax.swing.JLabel tarihGirM;
    private javax.swing.JLabel tcGir;
    private javax.swing.JTextField telGir;
    private javax.swing.JTextField tutar;
    private javax.swing.JTextField tutarGir;
    private javax.swing.JTextField tutarGir2;
    // End of variables declaration                   
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emir Ertürk
 */
public class Musteriler {

    private String ad;
    private String soyad;
    private String tc;
    private String email;
    private String tel;
    private String adres;
    private int temsilciNo;

    public Musteriler(String ad, String soyad, String tc, String email, String tel, String adres, int temsilciNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.email = email;
        this.tel = tel;
        this.adres = adres;
        this.temsilciNo = temsilciNo;
    }

    public Musteriler(String ad, String soyad, String tc, String email, String tel, int temsilciNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.email = email;
        this.tel = tel;
        this.temsilciNo = temsilciNo;
    }

   

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTemsilciNo() {
        return temsilciNo;
    }

    public void setTemsilciNo(int temsilciNo) {
        this.temsilciNo = temsilciNo;
    }

}

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Emir Ertürk
 */
public class Temsilci extends javax.swing.JFrame {

    

    /**
     * Creates new form Temsilci
     */
    public Temsilci() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        anaMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idGir = new javax.swing.JTextField();
        sifreGir = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        girisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        anaMenu.setText("Ana Menü");
        anaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Temsilci Girişi");

        jLabel2.setText("Temsilci İd:");

        sifreGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreGirActionPerformed(evt);
            }
        });

        jLabel3.setText("Şifre:");

        girisYap.setText("Giriş Yap");
        girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(anaMenu)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(girisYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sifreGir)
                    .addComponent(idGir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(girisYap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(anaMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void anaMenuActionPerformed(java.awt.event.ActionEvent evt) {                                        

        AnaMenu anamenu = new AnaMenu();
        setVisible(false);
        anamenu.setVisible(true);
    }                                       

    private void girisYapActionPerformed(java.awt.event.ActionEvent evt) {                                         

        int id = Integer.parseInt(idGir.getText());
        String sifre = new String(sifreGir.getPassword());

        String mesaj = "Giriş Başarılı";   
        String mesaj2 = "Giriş Başarısız";
        Islemler islemler = new Islemler(id);
        boolean girisbasarili = islemler.temsilcigirisYap(id, sifre);
        
        if (girisbasarili) {
            
            JOptionPane.showMessageDialog(this, mesaj);
            setVisible(false);
            
            TemsilciEkrani tEkran = new TemsilciEkrani(id);
           
            tEkran.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, mesaj2);
        }
    }                                        

    private void sifreGirActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temsilci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton anaMenu;
    private javax.swing.JButton girisYap;
    private javax.swing.JTextField idGir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField sifreGir;
    // End of variables declaration                   
}

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Emir Ertürk
 */
public class TemsilciEkrani extends javax.swing.JFrame {

    Temsilci temsilci = new Temsilci();
    public int temId;

    DefaultTableModel model;
    DefaultTableModel model2;

    public TemsilciEkrani(int id) {

        initComponents();
        model = (DefaultTableModel) musteriTablo.getModel();
        musteriGoruntule(id);
        temId = id;
        temsilciIdLabel.setText(String.valueOf(temId));
        Islemler islemler = new Islemler();
        tarihGirT.setText(islemler.tarih());
        model2 = (DefaultTableModel) islemTablo.getModel();
    }

    public TemsilciEkrani() {

        initComponents();
        model = (DefaultTableModel) musteriTablo.getModel();
        musteriGoruntule(temId);

        temsilciIdLabel.setText(String.valueOf(temId));
        Islemler islemler = new Islemler();
        tarihGirT.setText(islemler.tarih());
        model2 = (DefaultTableModel) islemTablo.getModel();
    }

    public void musteriGoruntule(int id) {
        Islemler islemler = new Islemler(id);
        model.setRowCount(0);
        ArrayList<Musteriler> musteri = new ArrayList<Musteriler>();
        musteri = islemler.musterileriGetir(id);

        if (musteri != null) {
            for (Musteriler musteriler : musteri) {
                Object[] eklenecek = {musteriler.getAd(), musteriler.getSoyad(), musteriler.getTc(), musteriler.getEmail(), musteriler.getTel(), musteriler.getAdres(), musteriler.getTemsilciNo()};

                model.addRow(eklenecek);
            }
        }
    }

    public void islemGoruntule(String tc) {
        Islemler islemler = new Islemler(tc);
        model2.setRowCount(0);
        ArrayList<Islem> islem = new ArrayList<Islem>();
        islem = islemler.ozetGoruntuleTemsilci(tc);
        if (islem != null) {
            for (Islem is : islem) {
                Object[] eklenecek = {is.getKaynak(), is.getHedef(), is.getIslem(), is.getTutar(), is.getHbakiye(), is.getKbakiye(), is.getDate()};
                model2.addRow(eklenecek);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        OzetGoruntule = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        islemTablo = new javax.swing.JTable();
        mEkle = new javax.swing.JButton();
        mGuncelle = new javax.swing.JToggleButton();
        mSil = new javax.swing.JToggleButton();
        mIslem = new javax.swing.JToggleButton();
        mDurum = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adGir = new javax.swing.JTextField();
        soyadGir = new javax.swing.JTextField();
        emailGir = new javax.swing.JTextField();
        telGir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        musteriTablo = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        anaMenu = new javax.swing.JToggleButton();
        mesajYazisi = new javax.swing.JTextField();
        temsilciIdLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tarihGirT = new javax.swing.JLabel();
        tcGir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sehirGir = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ilceGir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mahalleGir = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sokakGir = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        kapiNoGir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        postakoduGir = new javax.swing.JTextField();

        OzetGoruntule.setBounds(new java.awt.Rectangle(600, 200, 625, 437));

        islemTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "kaynak", "hedef", "islem", "tutar", "kbakiye", "hbakiye", "tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(islemTablo);
        if (islemTablo.getColumnModel().getColumnCount() > 0) {
            islemTablo.getColumnModel().getColumn(0).setResizable(false);
            islemTablo.getColumnModel().getColumn(1).setResizable(false);
            islemTablo.getColumnModel().getColumn(2).setResizable(false);
            islemTablo.getColumnModel().getColumn(3).setResizable(false);
            islemTablo.getColumnModel().getColumn(4).setResizable(false);
            islemTablo.getColumnModel().getColumn(5).setResizable(false);
            islemTablo.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout OzetGoruntuleLayout = new javax.swing.GroupLayout(OzetGoruntule.getContentPane());
        OzetGoruntule.getContentPane().setLayout(OzetGoruntuleLayout);
        OzetGoruntuleLayout.setHorizontalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OzetGoruntuleLayout.setVerticalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OzetGoruntuleLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        mEkle.setText("Müşteri Ekle");
        mEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEkleActionPerformed(evt);
            }
        });

        mGuncelle.setText("Müşteri Güncelle");
        mGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGuncelleActionPerformed(evt);
            }
        });

        mSil.setText("Müşteri Sil");
        mSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSilActionPerformed(evt);
            }
        });

        mIslem.setText("Müşteri İşlem Görüntüle");
        mIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIslemActionPerformed(evt);
            }
        });

        mDurum.setText("Müşteri Genel Durum");
        mDurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDurumActionPerformed(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("TC Kimlik:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefon:");

        musteriTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "TC", "Email", "Telefon", "Temsilci İd:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        musteriTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musteriTablo);
        if (musteriTablo.getColumnModel().getColumnCount() > 0) {
            musteriTablo.getColumnModel().getColumn(0).setResizable(false);
            musteriTablo.getColumnModel().getColumn(1).setResizable(false);
            musteriTablo.getColumnModel().getColumn(2).setResizable(false);
            musteriTablo.getColumnModel().getColumn(3).setResizable(false);
            musteriTablo.getColumnModel().getColumn(4).setResizable(false);
            musteriTablo.getColumnModel().getColumn(5).setResizable(false);
        }

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        anaMenu.setText("Ana Menü");
        anaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuActionPerformed(evt);
            }
        });

        mesajYazisi.setForeground(new java.awt.Color(255, 51, 51));

        jLabel7.setText("Temsilci İd:");

        jLabel8.setText("Müşteri Ara:");

        jLabel9.setText("Tarih:");

        jLabel10.setText("Şehir:");

        jLabel11.setText("İlçe :");

        jLabel12.setText("Mahalle:");

        jLabel13.setText("Sokak:");

        jLabel14.setText("Kapı No:");

        jLabel15.setText("Posta Kodu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aramaCubugu))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(temsilciIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(soyadGir, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailGir, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telGir)
                                            .addComponent(adGir)
                                            .addComponent(tcGir, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(65, 65, 65))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sehirGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ilceGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mahalleGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sokakGir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(kapiNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(postakoduGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mDurum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mIslem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tarihGirT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(temsilciIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tarihGirT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mGuncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mIslem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDurum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anaMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soyadGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tcGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sehirGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mahalleGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(kapiNoGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ilceGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(sokakGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(postakoduGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void mEkleActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:     
        Islemler islemler = new Islemler();
        mesajYazisi.setText("");
        String ad = adGir.getText();
        String soyad = soyadGir.getText();
        String tc = tcGir.getText();
        String email = emailGir.getText();
        String tel = telGir.getText();
        //String adres = adresGir.getText();
        int id = temId;
        String sehir = sehirGir.getText();
        String ilce = ilceGir.getText();
        String mahalle = mahalleGir.getText();
        String sokak = sokakGir.getText();
        String kapino = kapiNoGir.getText();
        String postakodu = postakoduGir.getText();
        Adres adres = new Adres(tc, sehir, ilce, mahalle, sokak, kapino, postakodu);
        islemler.musteriEkle(ad, soyad, tc, email, tel, adres, id);
        mesajYazisi.setText("Yeni müşteri başarıyla eklendi");
        islemler.musteriSayisiArttir(id);
        musteriGoruntule(id);

    }                                     

    private void mGuncelleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Islemler islemler = new Islemler();
        String ad = adGir.getText();
        String soyad = soyadGir.getText();
        String tc = tcGir.getText();
        String email = emailGir.getText();
        String tel = telGir.getText();
        //String adres = adresGir.getText();
        int selectedrow = musteriTablo.getSelectedRow();
        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Müşteri tablosu boş.");
            } else {
                mesajYazisi.setText("Müşteri seçin.");
            }
        } else {
              String sehir=sehirGir.getText();
     String ilce=ilceGir.getText();
    String mahalle=mahalleGir.getText();
    String sokak=sokakGir.getText();
     String kapino= kapiNoGir.getText();
     String postakodu= postakoduGir.getText();
           Adres adres=new Adres(sehir, ilce, mahalle, sokak, kapino, postakodu);      
              islemler.musteriGuncelle(ad, soyad, email, tel, adres, tc);
            musteriGoruntule(temId);
            mesajYazisi.setText("Müşteri başarıyla güncellendi");
        }
    }                                         

    private void mSilActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        Islemler islemler = new Islemler();
        mesajYazisi.setText("");
        int selectedrow = musteriTablo.getSelectedRow();
        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Müşteri tablosu boş.");
            } else {
                mesajYazisi.setText("Müşteri seçin.");
            }
        } else {
            String tc = (String) model.getValueAt(selectedrow, 2);

            islemler.musteriSil(tc);
            islemler.musteriSayisiAzalt(temId);
            musteriGoruntule(temId);
            mesajYazisi.setText("Müşteri başarıyla silindi");
        }
    }                                    

    private void mIslemActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        int selectedrow = musteriTablo.getSelectedRow();
        String tc = (String) model.getValueAt(selectedrow, 2);
        OzetGoruntule.setVisible(true);
        islemGoruntule(tc);
    }                                      

    private void mDurumActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:


    }                                      

    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String ara = aramaCubugu.getText();
        dinamikAra(ara);
    }                                       

    private void anaMenuActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        AnaMenu anamenu = new AnaMenu();
        setVisible(false);
        anamenu.setVisible(true);

    }                                       

    private void musteriTabloMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int selectedrow = musteriTablo.getSelectedRow();
        adGir.setText(model.getValueAt(selectedrow, 0).toString());
        soyadGir.setText(model.getValueAt(selectedrow, 1).toString());
        tcGir.setText(model.getValueAt(selectedrow, 2).toString());
        emailGir.setText(model.getValueAt(selectedrow, 3).toString());
        telGir.setText(model.getValueAt(selectedrow, 4).toString());
        // adresGir.setText(model.getValueAt(selectedrow, 5).toString());
        Islemler islemler = new Islemler();
        Adres adres = islemler.adresBilgiGetir(model.getValueAt(selectedrow, 2).toString());

        sehirGir.setText(adres.getSehir());
        ilceGir.setText(adres.getIlce());
        mahalleGir.setText(adres.getMahalle());
        sokakGir.setText(adres.getSokak());
        kapiNoGir.setText(adres.getKapino());
        postakoduGir.setText(adres.getPostakodu());
    }                                         
    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        musteriTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TemsilciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemsilciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemsilciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemsilciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JFrame OzetGoruntule;
    private javax.swing.JTextField adGir;
    private javax.swing.JToggleButton anaMenu;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JTextField emailGir;
    private javax.swing.JTextField ilceGir;
    private javax.swing.JTable islemTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kapiNoGir;
    private javax.swing.JToggleButton mDurum;
    private javax.swing.JButton mEkle;
    private javax.swing.JToggleButton mGuncelle;
    private javax.swing.JToggleButton mIslem;
    private javax.swing.JToggleButton mSil;
    private javax.swing.JTextField mahalleGir;
    private javax.swing.JTextField mesajYazisi;
    private javax.swing.JTable musteriTablo;
    private javax.swing.JTextField postakoduGir;
    private javax.swing.JTextField sehirGir;
    private javax.swing.JTextField sokakGir;
    private javax.swing.JTextField soyadGir;
    private javax.swing.JLabel tarihGirT;
    private javax.swing.JTextField tcGir;
    private javax.swing.JTextField telGir;
    private javax.swing.JLabel temsilciIdLabel;
    // End of variables declaration                   
}

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Emir Ertürk
 */
public class Yonetici extends javax.swing.JFrame {

    /**
     * Creates new form Yonetici
     */
     DefaultTableModel model2;
    public Yonetici() {
        initComponents();
        Islemler islemler = new Islemler();
        tarihGirY.setText(islemler.tarih());
        model2 = (DefaultTableModel) islemTablo.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ZamanDegistir = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        tarihGir = new javax.swing.JLabel();
        gunEkleButton = new javax.swing.JButton();
        ayEkleButton = new javax.swing.JButton();
        yilEkleButton = new javax.swing.JButton();
        zamanGir = new javax.swing.JTextField();
        KurEkle = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kurButton = new javax.swing.JButton();
        birimgirText = new javax.swing.JTextField();
        degergirText = new javax.swing.JTextField();
        KrediIslemleri = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        faizOraniGir = new javax.swing.JTextField();
        gecikmeOraniGir = new javax.swing.JTextField();
        krediGuncelle = new javax.swing.JButton();
        MaasGuncelle = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        maasGir = new javax.swing.JTextField();
        maasGirButton = new javax.swing.JButton();
        OzetGoruntule = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        islemTablo = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        islemListele = new javax.swing.JTextField();
        islemListe = new javax.swing.JButton();
        anaMenu = new javax.swing.JButton();
        durumGoruntuleButton = new javax.swing.JButton();
        kurEklebutton = new javax.swing.JButton();
        krediButton = new javax.swing.JButton();
        mEkle = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        islemGoruntuleButton = new javax.swing.JButton();
        zamanButton = new javax.swing.JButton();
        maasButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tarihGirY = new javax.swing.JLabel();
        maasOdeButton = new javax.swing.JButton();

        ZamanDegistir.setBounds(new java.awt.Rectangle(600, 200, 400, 300));

        jLabel1.setText("Şimdiki Tarih:");

        gunEkleButton.setText("Gün Ekle");
        gunEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunEkleButtonActionPerformed(evt);
            }
        });

        ayEkleButton.setText("Ay Ekle");
        ayEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayEkleButtonActionPerformed(evt);
            }
        });

        yilEkleButton.setText("Yıl Ekle");
        yilEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yilEkleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ZamanDegistirLayout = new javax.swing.GroupLayout(ZamanDegistir.getContentPane());
        ZamanDegistir.getContentPane().setLayout(ZamanDegistirLayout);
        ZamanDegistirLayout.setHorizontalGroup(
            ZamanDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZamanDegistirLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(ZamanDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yilEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ayEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gunEkleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zamanGir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ZamanDegistirLayout.createSequentialGroup()
                        .addComponent(tarihGir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        ZamanDegistirLayout.setVerticalGroup(
            ZamanDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZamanDegistirLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(ZamanDegistirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tarihGir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(zamanGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gunEkleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ayEkleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yilEkleButton)
                .addGap(30, 30, 30))
        );

        KurEkle.setBounds(new java.awt.Rectangle(600, 200, 400, 300));

        jLabel2.setText("Kur İsmi Girin:");

        jLabel3.setText("TL Cinsinden Değeri :");

        kurButton.setText("Kur Ekle");
        kurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KurEkleLayout = new javax.swing.GroupLayout(KurEkle.getContentPane());
        KurEkle.getContentPane().setLayout(KurEkleLayout);
        KurEkleLayout.setHorizontalGroup(
            KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KurEkleLayout.createSequentialGroup()
                .addGroup(KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KurEkleLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degergirText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birimgirText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(KurEkleLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(kurButton)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        KurEkleLayout.setVerticalGroup(
            KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KurEkleLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(birimgirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KurEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(degergirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kurButton)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        KrediIslemleri.setBounds(new java.awt.Rectangle(600, 200, 300, 200));

        jLabel4.setText("Kredi Faiz Oranı:");

        jLabel5.setText("Kredi Gecikme Oranı:");

        krediGuncelle.setText("Güncelle");
        krediGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KrediIslemleriLayout = new javax.swing.GroupLayout(KrediIslemleri.getContentPane());
        KrediIslemleri.getContentPane().setLayout(KrediIslemleriLayout);
        KrediIslemleriLayout.setHorizontalGroup(
            KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediIslemleriLayout.createSequentialGroup()
                .addGroup(KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KrediIslemleriLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(faizOraniGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gecikmeOraniGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(KrediIslemleriLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(krediGuncelle)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        KrediIslemleriLayout.setVerticalGroup(
            KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediIslemleriLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(faizOraniGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KrediIslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gecikmeOraniGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(krediGuncelle)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        MaasGuncelle.setBounds(new java.awt.Rectangle(600, 200, 300, 300));

        jLabel6.setText("Temsilci Maaşları:");

        maasGirButton.setText("Güncelle");
        maasGirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maasGirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MaasGuncelleLayout = new javax.swing.GroupLayout(MaasGuncelle.getContentPane());
        MaasGuncelle.getContentPane().setLayout(MaasGuncelleLayout);
        MaasGuncelleLayout.setHorizontalGroup(
            MaasGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaasGuncelleLayout.createSequentialGroup()
                .addGroup(MaasGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MaasGuncelleLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maasGir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MaasGuncelleLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(maasGirButton)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        MaasGuncelleLayout.setVerticalGroup(
            MaasGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaasGuncelleLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(MaasGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maasGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(maasGirButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        OzetGoruntule.setBounds(new java.awt.Rectangle(600, 200, 700, 700));

        islemTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "islemno", "kaynak", "hedef", "islem", "tutar", "kbakiye", "hbakiye", "tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(islemTablo);
        if (islemTablo.getColumnModel().getColumnCount() > 0) {
            islemTablo.getColumnModel().getColumn(0).setResizable(false);
            islemTablo.getColumnModel().getColumn(1).setResizable(false);
            islemTablo.getColumnModel().getColumn(2).setResizable(false);
            islemTablo.getColumnModel().getColumn(3).setResizable(false);
            islemTablo.getColumnModel().getColumn(4).setResizable(false);
            islemTablo.getColumnModel().getColumn(5).setResizable(false);
            islemTablo.getColumnModel().getColumn(6).setResizable(false);
            islemTablo.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel8.setText("Son X Adet İşlemleri Listele:");

        islemListele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                islemListeleKeyReleased(evt);
            }
        });

        islemListe.setText("Listele");
        islemListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemListeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OzetGoruntuleLayout = new javax.swing.GroupLayout(OzetGoruntule.getContentPane());
        OzetGoruntule.getContentPane().setLayout(OzetGoruntuleLayout);
        OzetGoruntuleLayout.setHorizontalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OzetGoruntuleLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(OzetGoruntuleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(islemListele, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(islemListe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OzetGoruntuleLayout.setVerticalGroup(
            OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OzetGoruntuleLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(OzetGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(islemListele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(islemListe))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        anaMenu.setText("Ana Menü");
        anaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuActionPerformed(evt);
            }
        });

        durumGoruntuleButton.setText("Genel Durum Görüntüle");
        durumGoruntuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durumGoruntuleButtonActionPerformed(evt);
            }
        });

        kurEklebutton.setText("Kur Ekle");
        kurEklebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurEklebuttonActionPerformed(evt);
            }
        });

        krediButton.setText("Kredi İşlemleri");
        krediButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediButtonActionPerformed(evt);
            }
        });

        mEkle.setText("Müşteri Ekle");
        mEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEkleActionPerformed(evt);
            }
        });

        jButton5.setText("Deadlock Analizi");

        islemGoruntuleButton.setText("İşlemleri Görüntüle");
        islemGoruntuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemGoruntuleButtonActionPerformed(evt);
            }
        });

        zamanButton.setText("Sistem Zamanını Değiştir");
        zamanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamanButtonActionPerformed(evt);
            }
        });

        maasButton.setText("Maaş Güncelle");
        maasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maasButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Tarih:");

        maasOdeButton.setText("Maaşları Öde");
        maasOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maasOdeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tarihGirY, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(maasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durumGoruntuleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kurEklebutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(krediButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(islemGoruntuleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zamanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maasOdeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tarihGirY, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(durumGoruntuleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kurEklebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(krediButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(islemGoruntuleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zamanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maasOdeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anaMenu)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
public void islemGoruntule(int ara) {
        Islemler islemler = new Islemler();
        model2.setRowCount(0);
        ArrayList<Islem> islem = new ArrayList<Islem>();
islem=islemler.ozetGoruntuleYonetici(ara);
        if (islem != null) {
            for (Islem is : islem) {
                Object[] eklenecek = {is.getIslem(),is.getKaynak(), is.getHedef(), is.getIslem(), is.getTutar(), is.getHbakiye(), is.getKbakiye(), is.getDate()};
                model2.addRow(eklenecek);
            }
        }
    }
 
    private void anaMenuActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        AnaMenu anamenu=new AnaMenu();
        setVisible(false);
        anamenu.setVisible(true);
    }                                       

    private void krediButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        KrediIslemleri.setVisible(true);
    }                                           

    private void mEkleActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        MusteriEkle mEkle=new MusteriEkle();
        mEkle.setVisible(true);
        
           
             
    }                                     

    private void zamanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        ZamanDegistir.setVisible(true);
        Islemler islemler=new Islemler();
        tarihGir.setText(islemler.tarih());
        zamanGir.setText("");
    }                                           

    private void kurButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Islemler islemler=new Islemler();
        String birim=birimgirText.getText();
        Double deger=Double.parseDouble(degergirText.getText());
        islemler.kurEkle(birim,deger);
        KurEkle.setVisible(false);
    }                                         

    private void kurEklebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
       KurEkle.setVisible(true);
        birimgirText.setText("");
       degergirText.setText("");
    }                                             

    private void krediGuncelleActionPerformed(java.awt.event.ActionEvent evt) {                                              
      Islemler islemler=new Islemler();
        double faizOran=Double.valueOf(faizOraniGir.getText());
        double gecikmeOran=Double.valueOf(gecikmeOraniGir.getText());
        islemler.krediGuncelle(faizOran,gecikmeOran);
    }                                             

    private void maasButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         MaasGuncelle.setVisible(true);
    }                                          

    private void maasGirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
       Islemler islemler=new Islemler();
       Double maas=Double.valueOf(maasGir.getText());
         islemler.maasGuncelle(maas);
    }                                             

    private void durumGoruntuleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    //    DurumGoruntule.setVisible(true);
         Islemler islemler=new Islemler();
         islemler.bankaGenelDurum();
    }                                                    

    private void gunEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       Islemler islemler=new Islemler();
     islemler.tarihGunEkle(Integer.valueOf(zamanGir.getText()));
    }                                             

    private void ayEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         Islemler islemler=new Islemler();
     islemler.tarihAyEkle(Integer.valueOf(zamanGir.getText()));
    }                                            

    private void yilEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
         Islemler islemler=new Islemler();
     islemler.tarihYilEkle(Integer.valueOf(zamanGir.getText()));
    }                                             

    private void islemGoruntuleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
         OzetGoruntule.setVisible(true);
       islemGoruntule(10000);
    }                                                    

    private void islemListeleKeyReleased(java.awt.event.KeyEvent evt) {                                         
        // TODO add your handling code here:
    
        
       
    }                                        

    private void islemListeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        model2.setRowCount(0);
        int ara = Integer.valueOf(islemListele.getText());
         Islemler islemler=new Islemler();
        
         islemGoruntule(ara);
    }                                          

    private void maasOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Islemler islemler =new Islemler();
        islemler.maaslariOde();
    }                                             
 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yonetici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JFrame KrediIslemleri;
    private javax.swing.JFrame KurEkle;
    private javax.swing.JFrame MaasGuncelle;
    private javax.swing.JFrame OzetGoruntule;
    private javax.swing.JFrame ZamanDegistir;
    private javax.swing.JButton anaMenu;
    private javax.swing.JButton ayEkleButton;
    private javax.swing.JTextField birimgirText;
    private javax.swing.JTextField degergirText;
    private javax.swing.JButton durumGoruntuleButton;
    private javax.swing.JTextField faizOraniGir;
    private javax.swing.JTextField gecikmeOraniGir;
    private javax.swing.JButton gunEkleButton;
    private javax.swing.JButton islemGoruntuleButton;
    private javax.swing.JButton islemListe;
    private javax.swing.JTextField islemListele;
    private javax.swing.JTable islemTablo;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton krediButton;
    private javax.swing.JButton krediGuncelle;
    private javax.swing.JButton kurButton;
    private javax.swing.JButton kurEklebutton;
    private javax.swing.JButton mEkle;
    private javax.swing.JButton maasButton;
    private javax.swing.JTextField maasGir;
    private javax.swing.JButton maasGirButton;
    private javax.swing.JButton maasOdeButton;
    private javax.swing.JLabel tarihGir;
    private javax.swing.JLabel tarihGirY;
    private javax.swing.JButton yilEkleButton;
    private javax.swing.JButton zamanButton;
    private javax.swing.JTextField zamanGir;
    // End of variables declaration                   
}
