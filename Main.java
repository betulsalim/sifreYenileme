import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String sifre;
        String userName;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if(userName.equals("betulsalim")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(sifre.equals("betsal")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
