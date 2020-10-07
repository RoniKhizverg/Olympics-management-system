package Olympics;

import Time.Clock;
import Time.Date;
import personalities.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Country Israel = new Country("Israel", "Atikva");
        Country United_States = new Country("United States", "The Star-Spangled Banner");
        Country Italy = new Country("Italy", "Il Canto degli Italian");
        Country jordan = new Country("jordan", "as-Salām al-Malakī al-ʾUrdunī");
        Country Australia = new Country("Australia", "Advance Australia Fair");
        Country Canada = new Country("Canada", "O Canada");
        Country Denmark = new Country("Denmark", "Nanna Lüders Jensen");
        Country Germany = new Country("Germany", "Deutschlandlied");
        Country Mexico = new Country("Mexico ", "Himno Nacional Mexicano");
        Country Poland = new Country("Poland", "National Anthem of Poland");
        Country Turkey = new Country("Turkey", "İstiklal Marşı");
        Country Austria = new Country("Austria", "Land der Berge, Land am Strome");
        Country China = new Country("China", "March of the Volunteers");
        Country France = new Country("France", "La Marseillaise");
        Country Hong_Kong = new Country("Hong Kong", "God Save the Queen");
        Country Jamaica = new Country("Jamaica", "Jamaica, Land We Love");
        Country New_Zealand = new Country("New_Zealand", "God Defend New Zealand");
        Country Portugal = new Country("Portugal", "A Portuguesa");
        Country Russian = new Country("Russian", "Госуда́рственный гимн Росси́йской Федера́ции");
        Country Spain = new Country("Spain", "Marcha Real");
        Country Ukraine = new Country("Ukraine", "Shche ne Vmerla Ukrainy ni Slava, ni volia");
        Country Brazil = new Country("Brazil", "Hino Nacional Brasileiro");


        Referee ronni = new JumpingReferee("Roni", 22, "Male", Ukraine, 10, Referee.eJudgingType.jumping, 81);
        Referee mor = new JumpingReferee("Mor", 25, "Female", Israel, 11, Referee.eJudgingType.jumping, 70);
        Referee sharon = new JumpingReferee("Sharon", 24, "Female",Hong_Kong , 3, Referee.eJudgingType.jumping, 50);
        Referee omri = new JumpingReferee("Omri", 28, "Male", Austria, 5, Referee.eJudgingType.jumping, 40);
        Referee tal = new JumpingReferee("Tal", 20, "Male", Germany, 1, Referee.eJudgingType.jumping, 1);

        Referee or = new RunnerReferee("Or", 22, "Male", Turkey, 7, Referee.eJudgingType.running, 60);
        Referee effi = new RunnerReferee("Effi", 35, "Male", Israel, 11, Referee.eJudgingType.running, 41);
        Referee eran = new RunnerReferee("Eran", 24, "Male",Australia , 5, Referee.eJudgingType.running, 21);
        Referee timor = new RunnerReferee("Timor", 29, "Male", Russian, 9, Referee.eJudgingType.running, 30);
        Referee alina = new RunnerReferee("Alina", 45, "Female", Ukraine, 4, Referee.eJudgingType.running, 20);

        //Jumpers
        //Usa
        Jumper Frank_Jarvis = new Jumper("Frank Jarvis", 21, "Male", United_States, 0, Athlete.eSportTypes.jumping, 3);
        Jumper Walter_Tewksbury = new Jumper("Walter_Tewksbury", 23, "Male", United_States, 0, Athlete.eSportTypes.jumping, 4);
        //Italy
        Athlete Mario_Lanzi = new Jumper("Mario Lanzi", 29, "male", Italy, 0, Athlete.eSportTypes.jumping, 4);
        Athlete Luigi_Beccali = new Jumper("Luigi Beccali", 23, "male", Italy, 0, Athlete.eSportTypes.jumping, 3);
        //Germany
        Athlete Lothar_Knörzer = new Jumper("Lothar Knörzer", 19, "male", Germany, 0, Athlete.eSportTypes.jumping, 3);
        Athlete Leonhard_Pohl = new Jumper("Leonhard Pohl", 23, "male", Germany, 0, Athlete.eSportTypes.jumping, 3);
        //France
        Athlete Paul_Genevay = new Jumper("Paul Genevay", 21, "male", France, 0, Athlete.eSportTypes.jumping, 5);
        Athlete Bernard_Laidebeur = new Jumper("Bernard Laidebeur", 23, "Male", France, 0, Athlete.eSportTypes.jumping, 7);
        //Australia
        Athlete Graham_Gipson = new Jumper("Graham Gipson", 21, "Male", Australia, 0, Athlete.eSportTypes.jumping, 6);
        Athlete Leon_Gregory = new Jumper("Leon Gregory", 24, "Male", Australia, 0, Athlete.eSportTypes.jumping, 3);
        //Poland
        Athlete Ryszard_Podlas = new Jumper("Ryszard Podlas", 27, "Male", Poland, 0, Athlete.eSportTypes.jumping, 5);
        Athlete Jan_Werner = new Jumper("Jan Werner", 28, "Male", Poland, 0, Athlete.eSportTypes.jumping, 5);
        //Jamaica
        Athlete Howard_Davis = new Jumper("Leon Gregory", 21, "Male", Jamaica, 0, Athlete.eSportTypes.jumping, 8);
        Athlete Devon_Morris = new Jumper("Devon Morris", 20, "Male", Jamaica, 0, Athlete.eSportTypes.jumping, 6);
        //Canda
        Athlete Andre_De_Grasse = new Jumper("Andre De Grasse", 25, "Male", Canada, 0, Athlete.eSportTypes.jumping, 5);
        Athlete Donovan_Bailey = new Jumper("Donovan Bailey", 33, "Male", Canada, 0, Athlete.eSportTypes.jumping, 5);
        //Turkey
        Athlete Andrzej_Zieliński = new Jumper("Andrzej Zieliński", 29, "Male", Turkey, 0, Athlete.eSportTypes.jumping, 5);
        //NewZealan
        Athlete Barry_Magee = new Jumper("Barry Magee", 22, "Male", New_Zealand, 0, Athlete.eSportTypes.jumping, 7);
        Athlete Mike_Ryan = new Jumper("Mike Ryan", 28, "Male", New_Zealand, 0, Athlete.eSportTypes.jumping, 4);
        //Brazil
        Athlete Arnaldo_da_Silva = new Jumper("Arnaldo da Silva", 25, "Male", Brazil, 0, Athlete.eSportTypes.jumping, 5);
        Athlete Robson_da_Silva = new Jumper("Robson da Silva", 33, "Male", Brazil, 0, Athlete.eSportTypes.jumping, 6);
        //China
        Athlete Wang_Zhen = new Jumper("Wang Zhen", 29, "Male", China, 0, Athlete.eSportTypes.jumping, 4);
        //Russian
        Athlete Valeriy_Borchin = new Jumper("Valeriy Borchin", 22, "Male", Russian, 0, Athlete.eSportTypes.jumping, 6);
        Athlete Vladimir_Andreyev = new Jumper("Vladimir Andreyev", 28, "Male", Russian, 0, Athlete.eSportTypes.jumping, 8);
        //Ukraine
        Athlete Bohdan_Bondarenko = new Jumper("Bohdan Bondarenko", 20, "Male", Ukraine, 0, Athlete.eSportTypes.jumping, 3);
        Athlete Roman_Shchurenko = new Jumper("Roman Shchurenko", 18, "Male", Ukraine, 0, Athlete.eSportTypes.jumping, 4);
        //Mexico
        Athlete Ernesto_Canto = new Jumper("Ernesto Canto", 21, "Male", Mexico, 0, Athlete.eSportTypes.jumping, 7);
        //Spain
        Athlete Valentí_Massana = new Jumper("Valentí Massana", 28, "Male", Spain, 0, Athlete.eSportTypes.jumping, 4);
        Athlete Jordi_Llopart = new Jumper("Jordi Llopart", 27, "Male", Spain, 0, Athlete.eSportTypes.jumping, 3);
                                                                        //Runners
        //Usa
        Athlete Thomas_Burke = new Runner("Thomas Burke", 23, "male", United_States, 0, Athlete.eSportTypes.running, 25);
        Athlete Francis_Lane = new Runner("Francis Lane", 24, "male", United_States, 0, Athlete.eSportTypes.running, 40);
        Athlete Archie_Hahn = new Runner("Archie Hahn", 23, "male", United_States, 0, Athlete.eSportTypes.running, 35);
        Athlete Nathaniel_Cartmell = new Runner("Nathaniel Cartmell", 23, "male", United_States, 0, Athlete.eSportTypes.running, 33);
        Athlete Morris_Kirksey = new Runner("g", 23, "male", United_States, 0, Athlete.eSportTypes.running, 32);
        //Italy
        Athlete Salvatore_Antibo = new Runner("Thomas Burke", 21, "male", Italy, 0, Athlete.eSportTypes.jumping, 33);
        Athlete Romeo_Bertini = new Runner("Romeo Bertini", 23, "male", Italy, 0, Athlete.eSportTypes.running, 40);
        //Germany
        Athlete Heinz_Fütterer = new Runner("g", 22, "male", Germany, 0, Athlete.eSportTypes.running, 35);
        Athlete Manfred_Germar = new Runner("Manfred Germar", 23, "male", Germany, 0, Athlete.eSportTypes.running, 33);
        //France

        Athlete Roger_Bambuck = new Runner("g", 20, "Male", France, 0, Athlete.eSportTypes.running, 36);
        Athlete Claude_Piquemal = new Runner("Claude Piquemal", 28, "Male", France, 0, Athlete.eSportTypes.running, 38);
        Athlete Jocelyn_Delecour = new Runner("Jocelyn Delecour", 22, "Male", France, 0, Athlete.eSportTypes.running, 39);
        //Australia

        Athlete David_Lean = new Runner("David Lean", 25, "Male", Australia, 0, Athlete.eSportTypes.running, 39);
        Athlete Kevan_Gosper = new Runner("Kevan Gosper", 26, "Male", Australia, 0, Athlete.eSportTypes.running, 45);
        //Poland

        Athlete Zbigniew_Jaremski = new Runner("Zbigniew Jaremski", 29, "Male", Poland, 0, Athlete.eSportTypes.running, 32);
        Athlete Jerzy_Pietrzyk = new Runner("Jerzy Pietrzyk", 30, "Male", Poland, 0, Athlete.eSportTypes.running, 31);
        //Jamaica

        Athlete Winthrop_Graham = new Runner("Winthrop Graham", 22, "Male", Jamaica, 0, Athlete.eSportTypes.running, 33);
        Athlete Bert_Cameron = new Runner("Bert Cameron", 25, "Male", Jamaica, 0, Athlete.eSportTypes.running, 33);
        Athlete Usain_Bolt = new Runner("Usain Bolt", 27, "Male", Jamaica, 0, Athlete.eSportTypes.running, 49);
        //Denmark
        Athlete Wilson_Kipketer = new Runner("Wilson Kipketer", 29, "Male", Denmark, 0, Athlete.eSportTypes.running, 35);
        Athlete Ernst_Schultz = new Runner("Ernst Schultz", 20, "Male", Denmark, 0, Athlete.eSportTypes.running, 30);
        //Canda

        Athlete Ben_Johnson = new Runner("Ben Johnson", 18, "Male", Canada, 0, Athlete.eSportTypes.running, 33);
        Athlete Harry_Jerome = new Runner("Harry Jerome", 17, "Male", Canada, 0, Athlete.eSportTypes.running, 36);
        //Turkey
        Athlete Eşref_Apak = new Runner("Eşref Apak", 21, "Male", Turkey, 0, Athlete.eSportTypes.running, 41);
        Athlete Ruhi_Sarialp = new Runner("Ruhi Sarialp", 20, "Male", Turkey, 0, Athlete.eSportTypes.running, 42);
        //NewZealand

        Athlete John_Holland = new Runner("John Holland", 27, "Male", New_Zealand, 0, Athlete.eSportTypes.running, 44);
        Athlete Arthur_Porritt = new Runner("Arthur Porritt", 29, "Male", New_Zealand, 0, Athlete.eSportTypes.running, 35);
        Athlete Baron_Porritt = new Runner("Baron Porritt", 20, "Male", New_Zealand, 0, Athlete.eSportTypes.running, 37);
        //Brazil

        Athlete André_da_Silva = new Runner("André da Silva", 18, "Male", Brazil, 0, Athlete.eSportTypes.running, 37);
        Athlete Edson_Ribeiro = new Runner("Edson Ribeiro", 17, "Male", Brazil, 0, Athlete.eSportTypes.running, 39);
        //China
        Athlete Cai_Zelin = new Runner("Cai Zelin", 21, "Male", China, 0, Athlete.eSportTypes.running, 42);
        Athlete Chen_Ding = new Runner("Chen Ding", 37, "Male", China, 0, Athlete.eSportTypes.running, 41);
        //Russian

        Athlete Ilya_Markov = new Runner("Ilya Markov", 27, "Male", Russian, 0, Athlete.eSportTypes.running, 44);
        Athlete Denis_Kapustin = new Runner("Denis Kapustin", 29, "Male", Russian, 0, Athlete.eSportTypes.running, 47);
        //Ukraine

        Athlete Oleksandr_Bagach = new Runner("Edson Ribeiro", 17, "Male", Ukraine, 0, Athlete.eSportTypes.running, 33);
        Athlete Oleksandr_Krykun = new Runner("Oleksandr Krykun", 30, "Male", Ukraine, 0, Athlete.eSportTypes.running, 31);
        //Mexico
        Athlete Raúl_González = new Runner("Raúl González", 30, "Male", Mexico, 0, Athlete.eSportTypes.running, 44);
        Athlete José_Pedraza = new Runner("José Pedraza", 22, "Male", Mexico, 0, Athlete.eSportTypes.running, 40);
        //Spain

        Athlete Javier_García = new Runner("Javier García", 29, "Male", Spain, 0, Athlete.eSportTypes.running, 35);
        Athlete Fermín_Cacho = new Runner("Fermín Cacho", 20, "Male", Spain, 0, Athlete.eSportTypes.running, 33);
        //Portugal
        Athlete Rui_Silva = new Runner("Rui Silva", 22, "Male", Portugal, 0, Athlete.eSportTypes.running, 31);
        Athlete António_Leitão = new Runner("António Leitão", 28, "Male", Portugal, 0, Athlete.eSportTypes.running, 41);


        Athlete dennisMarkov = new RunnerAndJumper("DennisMarkov", 27, "Male", Denmark, 0, Athlete.eSportTypes.runningAndJumping, 44,5);
        Athlete DiegoSimaona = new RunnerAndJumper("DiegoSimaona", 29, "Male", Spain, 0, Athlete.eSportTypes.runningAndJumping, 44,7);
        Athlete Alex_Janero = new RunnerAndJumper("Alex Janero", 17, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 40,7);
        Athlete donaldMarcisio = new RunnerAndJumper("Donald Marcisio", 21, "Male", Italy, 0, Athlete.eSportTypes.runningAndJumping, 41,4);
        Athlete MichaelChernakov = new RunnerAndJumper("Michael Chernakov", 22, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 40,8);
        Athlete neymarJunior = new RunnerAndJumper("Neymar Junior", 22, "Male", Brazil, 0, Athlete.eSportTypes.runningAndJumping, 34,5);
        Athlete javierGarcia = new RunnerAndJumper("Javier Garcia", 33, "Male", Spain, 0, Athlete.eSportTypes.runningAndJumping, 41,8);
        Athlete leonardoSilva = new RunnerAndJumper("Leonardo Silva", 29, "Male", Italy, 0, Athlete.eSportTypes.runningAndJumping, 40,8);
        Athlete diegoKhizverg = new RunnerAndJumper("Diego Khizverg", 23, "Male", Australia, 0, Athlete.eSportTypes.runningAndJumping, 31,8);
        Athlete AntónioSilva_ = new RunnerAndJumper("António Silva", 28, "Male", Portugal, 0, Athlete.eSportTypes.runningAndJumping, 42,9);





        Team t = new Team(0, United_States, Athlete.eSportTypes.running);
        t.addAthlete(Frank_Jarvis);
      //  t.addAthlete(a);
        Team t1 = new Team(0, Russian, Athlete.eSportTypes.jumping);
//        t1.addAthlete(b);
//        t1.addAthlete(d);

        Team t2 = new Team(0, Jamaica, Athlete.eSportTypes.running);
//        t2.addAthlete(e);
//        t2.addAthlete(f);

        Team t3 = new Team(0, Brazil, Athlete.eSportTypes.running);
//        t3.addAthlete(g);
//        t3.addAthlete(h);
//        t3.addAthlete(i);


        Stadium s = new Stadium("a", "B", 200);
//        TeamCompetition ps = new TeamCompetition(s, Athlete.eSportTypes.running, new Date(12, 12, 1996), new Clock(12, 15));
//        ps.addTeams(t);
//        ps.addTeams(t1);
//        ps.addTeams(t2);
//        ps.addTeams(t3);
       // System.out.println(ps.toString());
      //  System.out.println("The winners are : \n " + ps.getTeamsWinners());
    }
}

