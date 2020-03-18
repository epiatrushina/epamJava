import java.util.Scanner;
import domain.FanClub;
import service.FanClubService;
import service.impl.FanClubServiceImpl;

public class Start {

    private static FanClubService service = new FanClubServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название команды");
        FanClub fanClub = new FanClub();
        if (scanner.hasNext()) {
            fanClub.setName(scanner.next());
        }

        System.out.println("Введите страну команды");
        if (scanner.hasNext()) {
            fanClub.setCountry(scanner.next());
        }

        fanClub = service.create(fanClub);

        System.out.println(fanClub);
    }
}