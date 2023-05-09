// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      byte catWeight = 3;
      System.out.println(catWeight);
      short dogWeight = 20;
      System.out.println(dogWeight);
      int manWeight = 70 ;
      System.out.println(manWeight);
      long elephantWeight = 2000 ;
      System.out.println(elephantWeight);
      float mouseWeight = 0.75f ;
      System.out.println(mouseWeight);
      double rabbitWeight = 3.849;
      System.out.println(rabbitWeight);

      System.out.println("Второе задание ");

        float a = 27.12f;
      System.out.println(a);
        long b = 987678965549L;
      System.out.println(b);
        float c = 2.786f;
      System.out.println(c);
        short d = 569;
      System.out.println(d);
        short e = -159;
      System.out.println(e);
        int f = 27897;
      System.out.println(f);
        byte g = 67;
      System.out.println(g);

      System.out.println("Третье задание ");

      byte ludmilaPavlovna = 23;
      byte annaSergeevna = 27;
      byte ekaterinaAndreevna = 30;
      short book = 480;
      int allStudy = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna ;
      int paper = book / allStudy;
      System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

      System.out.println("Четвертое задание ");

      byte time = 2;
      byte doIt = 16;
      int work = doIt / time;
      int time20 = time * 10;
      int hours = time20 * 3;
      int day = hours * 24;
      int day3 = day * 3;
      int mounts = day3 * 10;
      int workTime20 = work * time20;
      byte A = 1 ;
      byte B = 3 ;
      byte C = 1 ;
      System.out.println("За " + time20 + " минут, машина произвела " + workTime20 + " штук бутылок");
      int workDay = work * day ;
      System.out.println("За " + day + " минут, машина произвела " + workDay + " штук бутылок");
      int workDay3 = work * day3;
      System.out.println("За " + day3 + " минут, машина произвела " + workDay3 + " штук бутылок");
      int workMots = work * mounts;
      System.out.println("За " + mounts + " минут, машина произвела " + workMots + " штук бутылок");
      System.out.println("За " + A + " День, машина произвела " + workDay + " штук бутылок");
      System.out.println("За " + B + " Дня, машина произвела " + workDay3 + " штук бутылок");
      System.out.println("За " + C + " Месяц, машина произвела " + workMots + " штук бутылок");

      System.out.println("Пятое задание ");

      byte allCollor = 120;
      byte classRoom = 6;
      byte white = 2;
      byte brown = 4;
      int allClass = allCollor / classRoom;
      int whiteCollor = allClass * white;
      int brownCollor = allClass * brown;
      System.out.println("В школе где  " + allClass + " классов, нужно " + whiteCollor + " бынок белой краски и " + brownCollor + " банок коричневой краски");

      System.out.println(" Шестое задание ");
      byte bananas = 80;
      byte milk = 105;
      byte ice = 100;
      byte egg = 70;
      int bananas5 = bananas*5;
      int milk2 = milk * 2;
      int ice2 = ice *2;
      int egg4 = egg*4;
      int summa = bananas5+milk2+ice2+egg4;
      double summa1 = summa / 1000;
      System.out.println(+summa+ " грамм или " + summa1 + " килограмм ");

      System.out.println(" Седьмое задание ");

      byte weight = 7;
      double lostWeight = 0.25;
      double lostWeight2 = 0.5;
      double lostDay = weight / lostWeight;
      double lostDay2 = weight /  lostWeight2;
      double srednee = lostDay+lostDay2;
      double srednee2= srednee/2;
      System.out.println(+lostDay+ " дней  " + lostDay2 + " дней " +srednee2+ " дней в среднем");

      System.out.println(" Восьмое задание ");
      int Masha = 67760;
      int Denis = 83690;
      int kristina = 76230;
      int Masha1 = Masha/100*110;
      int Denis1 = Denis/100*110;
      int kristina1 =kristina/100*110;
      int dohodMasha = Masha/100*10;
      int dohodDenis1 = Denis/100*10;
      int dohodKristina1 =kristina/100*10;
      int yearMasha = dohodMasha * 12;
      int yearDenis = dohodDenis1*12;
      int yearKristia = dohodKristina1* 12;
      System.out.println(" Маша теперь получает " + Masha1 + " Годовой доход вырос на " +yearMasha);
      System.out.println(" Денис теперь получает " + Denis1 + " Годовой доход вырос на " +yearDenis);
      System.out.println(" Кристина теперь получает " + kristina1 + " Годовой доход вырос на " +yearKristia);




    }
}