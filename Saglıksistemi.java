
package saglıksistemi;
import java.util.Scanner;
        
class Saglıksıstemi1
{
    String kullanıcıadı;
    int şifre;
    private int tcno;
     Saglıksıstemi1()
     {
    
     } 
   Saglıksıstemi1(int şifre,String kullanıcıadı)
   {
         this.şifre=şifre;
         this.kullanıcıadı=kullanıcıadı;
     
   }
  
   String kullanıcıadı(String ad)
   {
       String sonuc=ad;
       System.out.println("Sistemimize hoşgeldin"+sonuc);
       return sonuc;
   }
   int şifre(int sayı)
   {
    
       System.out.println("mevcut şifreniz"+sayı);   
       return sayı;
   }
  public  int gettcno()
  {
      return tcno;
  }
  public void settcno(int tc)
  {
      tcno=tc;
     
      
  }
    
}

class Türet extends Saglıksıstemi1
{
    
  
}

public class Saglıksistemi 
{

    
    public static void main(String[] args) 
    {
        Scanner klavye=new Scanner(System.in);
        Saglıksıstemi1 giriş=new Saglıksıstemi1(185542002,"muhammet çelebi");
        System.out.println("kullanıcı adınızı giriniz");
        String ad=klavye.nextLine();
        giriş.kullanıcıadı=ad;
        
        System.out.println("Şifrenizi giriniz");
        int sıfre=klavye.nextInt();
        giriş.şifre=sıfre;
       
        System.out.println("tc kimlik numaranızı giriniz");
        int tcno=klavye.nextInt();
        giriş.settcno(tcno);
        System.out.println("hoşgeldin"+giriş.kullanıcıadı);
        System.out.println("şifreniz"+giriş.şifre);
        System.out.println("tc kimlik numaranız"+giriş.gettcno());
        Türet hesapla=new Türet();
        hesapla.kullanıcıadı="yeni";
        System.out.println(hesapla.kullanıcıadı);
        
        
    }
    
}
