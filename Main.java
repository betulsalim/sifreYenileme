import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sifre, sifre2, yanit;
        String userName;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (userName.equals("betulsalim")) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
            System.out.println("yeni kullanıcı adı oluşturmak ister misiniz?(E/H) ");
            yanit = input.nextLine();
            if (yanit.equals("E")) {
                System.out.println("Yeni kullanıcı adınızı giriniz ama eski kullanıcı adınızla aynı olmasın.");
                userName = input.nextLine();
                if (userName.equals("betulsalim6")) {
                    System.out.println("kullanıcı adı oluşturulamadı");
                } else {
                    System.out.println("kullanıcı adı oluşturuldu");
                }
            }
        }
            if (sifre.equals("betsal")) {
                System.out.println("true");
            } else {
                System.out.println("false");
                System.out.println("yeni şifre oluşturmak ister misiniz?(E/H) ");
                yanit = input.nextLine();
                if (yanit.equals("E")) {
                    System.out.println("Yeni şifrenizi giriniz ama eski şifrenizle aynı olmasın.");
                    sifre2 = input.nextLine();
                    if (sifre2.equals("betsal")) {
                        System.out.println("Şifre oluşturulamadı");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                }
            }


        }
    }
