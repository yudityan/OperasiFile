package dit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Admin implements PC{
    private String usernameAdm;
    private String password;;


    Transaksi t = new Transaksi();
    Member m = new Member();
    Scanner in=new Scanner(System.in);
    protected void display(int a, int b){
        try {
            FileWriter fileWriter = new FileWriter("Hasil.txt");
            fileWriter.write("Id user : "+a);
            fileWriter.write("\nbiaya : "+b+"\n");
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Gagal membuat file");
        }
        System.out.println("Id user : "+a);
        System.out.println("biaya : "+b);
    }
    private final String user(){
        String u = "usadmin";
        return u;
    }

    private String pass(){
        String p = "pwadmin";
        return p;
    }
    protected boolean mengisi(){
        boolean a = false;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukan username : ");
        usernameAdm = in.next();
        setUsernameAdm(usernameAdm);

        if(usernameAdm.equals(user())){
            System.out.print("Masukan Password : ");
            password=in.next();
            setPassword(password);
            if(password.equals(pass())){
                a = true;
                System.out.println("Anda masuk sebagai Admin");
            }

            else{
                System.out.println("Password Salah");
            }
        }
        else {
            System.out.println("Anda Bukan Admin");
        }
        return a;


    }
    protected int mengatur(){
        int harga;
        int diskon;
        System.out.println("Masukan Tarif harga per-jam :");
        harga = in.nextInt();
        t.setTarif(harga);
        return t.setTarif(harga);
    }
    protected int mengatur(int a){
        int diskon;
        System.out.println("Masukan Diskon untuk member(%) : ");
        diskon = in.nextInt();
        t.setDiskon(a*diskon/100);
        return t.setDiskon(a*diskon/100);
    }


    public String getUsernameAdm() {
        return usernameAdm;
    }
    public void setUsernameAdm(String usernameAdm) {
        this.usernameAdm = usernameAdm;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void printUser() {
        System.out.println("Testing");
    }
    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }


}

