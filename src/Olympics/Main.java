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


        Referee roni = new JumpingReferee("Roni", 22, "Male", Ukraine, 10, Referee.eJudgingType.jumping, 81);
        Referee mor = new JumpingReferee("Mor", 25, "Female", Israel, 11, Referee.eJudgingType.jumping, 70);
        Referee sharon = new JumpingReferee("Sharon", 24, "Female", Hong_Kong, 3, Referee.eJudgingType.jumping, 50);
        Referee omri = new JumpingReferee("Omri", 28, "Male", Austria, 5, Referee.eJudgingType.jumping, 40);
        Referee tal = new JumpingReferee("Tal", 20, "Male", Germany, 1, Referee.eJudgingType.jumping, 1);

        Referee or = new RunnerReferee("Or", 22, "Male", Turkey, 7, Referee.eJudgingType.running, 60);
        Referee effi = new RunnerReferee("Effi", 35, "Male", Israel, 11, Referee.eJudgingType.running, 41);
        Referee eran = new RunnerReferee("Eran", 24, "Male", Australia, 5, Referee.eJudgingType.running, 21);
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
        Athlete Salvatore_Antibo = new Runner("Thomas Burke", 21, "male", Italy, 0, Athlete.eSportTypes.running, 33);
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


        Athlete dennisMarkov = new RunnerAndJumper("DennisMarkov", 27, "Male", United_States, 0, Athlete.eSportTypes.runningAndJumping, 44, 5);
        Athlete DiegoSimaona = new RunnerAndJumper("DiegoSimaona", 29, "Male", United_States, 0, Athlete.eSportTypes.runningAndJumping, 44, 7);
        Athlete Alex_Janero = new RunnerAndJumper("Alex Janero", 17, "Male", Russian, 0, Athlete.eSportTypes.runningAndJumping, 40, 7);
        Athlete donaldMarcisio = new RunnerAndJumper("Donald Marcisio", 21, "Male", Russian, 0, Athlete.eSportTypes.runningAndJumping, 41, 4);
        Athlete MichaelChernakov = new RunnerAndJumper("Michael Chernakov", 22, "Male", Russian, 0, Athlete.eSportTypes.runningAndJumping, 40, 8);
        Athlete neymarJunior = new RunnerAndJumper("Neymar Junior", 22, "Male", New_Zealand, 0, Athlete.eSportTypes.runningAndJumping, 34, 5);
        Athlete javierGarcia = new RunnerAndJumper("Javier Garcia", 33, "Male", New_Zealand, 0, Athlete.eSportTypes.runningAndJumping, 41, 8);
        Athlete leonardoSilva = new RunnerAndJumper("Leonardo Silva", 29, "Male", Jamaica, 0, Athlete.eSportTypes.runningAndJumping, 40, 8);
        Athlete diegoKhizverg = new RunnerAndJumper("Diego Khizverg", 23, "Male", Jamaica, 0, Athlete.eSportTypes.runningAndJumping, 31, 8);
        Athlete AntónioSilva = new RunnerAndJumper("António Silva", 28, "Male", France, 0, Athlete.eSportTypes.runningAndJumping, 42, 9);
        Athlete benlulusilva = new RunnerAndJumper("Benlulu silva", 23, "Male", France, 0, Athlete.eSportTypes.runningAndJumping, 31, 8);
        Athlete efraimMessi = new RunnerAndJumper("Efraim Messi", 23, "Male", Italy, 0, Athlete.eSportTypes.runningAndJumping, 25, 8);
        Athlete vladimirMorinio = new RunnerAndJumper("Vladimir Morinio", 28, "Male", Spain, 0, Athlete.eSportTypes.runningAndJumping, 31, 7);
        Athlete vladislavRoitenberg = new RunnerAndJumper("Vladislav Roitenberg", 23, "Male", Spain, 0, Athlete.eSportTypes.runningAndJumping, 40, 8);
        Athlete diegoSalmonela = new RunnerAndJumper("Diego Salmonela", 23, "Male", Poland, 0, Athlete.eSportTypes.runningAndJumping, 33, 3);
        Athlete coronaVirus = new RunnerAndJumper("Corona Virus", 23, "Male", France, 0, Athlete.eSportTypes.runningAndJumping, 34, 6);
        Athlete effiHanamer = new RunnerAndJumper("Effi Hanamer", 27, "Male", Jamaica, 0, Athlete.eSportTypes.runningAndJumping, 33, 8);
        Athlete artoruDikaprio = new RunnerAndJumper("Artoru Dikaprio", 23, "Male", jordan, 0, Athlete.eSportTypes.runningAndJumping, 31, 8);
        Athlete galShalit = new RunnerAndJumper("Gal Shalit", 26, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 41, 8);
        Athlete leonidZevel = new RunnerAndJumper("Leonid Zevel ", 25, "Male", jordan, 0, Athlete.eSportTypes.runningAndJumping, 33, 6);
        Athlete ajikBululu = new RunnerAndJumper("Ajik Bululu", 33, "Male", New_Zealand, 0, Athlete.eSportTypes.runningAndJumping, 39, 4);
        Athlete dimaSimonenko = new RunnerAndJumper("Dima Simonenko", 23, "Male", Ukraine, 0, Athlete.eSportTypes.runningAndJumping, 37, 5);
        Athlete meirAmsalem = new RunnerAndJumper("Eran Zeavi", 29, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 35, 8);
        Athlete eranZeavi = new RunnerAndJumper("Diego Khizverg", 40, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 35, 9);
        Athlete effiHanmborgeri = new RunnerAndJumper("Effi Hanmborgeri", 18, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 34, 8);
        Athlete tomerGolan = new RunnerAndJumper("Tomer Golan", 23, "Male", Israel, 0, Athlete.eSportTypes.runningAndJumping, 31, 2);


        //Running teams:
        Team running_UnitedStates = new Team(0, United_States, Athlete.eSportTypes.running);
        running_UnitedStates.addAthlete(dennisMarkov);
        running_UnitedStates.addAthlete(DiegoSimaona);
        running_UnitedStates.addAthlete(Thomas_Burke);
        running_UnitedStates.addAthlete(Francis_Lane);

        Team running_Russian = new Team(0, Russian, Athlete.eSportTypes.running);
        running_Russian.addAthlete(Alex_Janero);
        running_Russian.addAthlete(donaldMarcisio);
        running_Russian.addAthlete(MichaelChernakov);
        running_Russian.addAthlete(Ilya_Markov);

        Team running_NewZealand = new Team(0, New_Zealand, Athlete.eSportTypes.running);
        running_NewZealand.addAthlete(neymarJunior);
        running_NewZealand.addAthlete(javierGarcia);
        running_NewZealand.addAthlete(John_Holland);
        running_NewZealand.addAthlete(Arthur_Porritt);

        Team running_Jamaica = new Team(0, Jamaica, Athlete.eSportTypes.running);
        running_Jamaica.addAthlete(leonardoSilva);
        running_Jamaica.addAthlete(diegoKhizverg);
        running_Jamaica.addAthlete(Winthrop_Graham);
        running_Jamaica.addAthlete(Bert_Cameron);

        Team running_Israel = new Team(0, Israel, Athlete.eSportTypes.running);
        running_Israel.addAthlete(meirAmsalem);
        running_Israel.addAthlete(eranZeavi);
        running_Israel.addAthlete(effiHanmborgeri);
        running_Israel.addAthlete(tomerGolan);

        Team running_France = new Team(0, France, Athlete.eSportTypes.running);
        running_France.addAthlete(AntónioSilva);
        running_France.addAthlete(benlulusilva);
        running_France.addAthlete(Roger_Bambuck);
        running_France.addAthlete(Claude_Piquemal);


        //Jumping teams:

        Team Jumping_Italy = new Team(0, Italy, Athlete.eSportTypes.jumping);
        Jumping_Italy.addAthlete(Mario_Lanzi);
        Jumping_Italy.addAthlete(Luigi_Beccali);
        Jumping_Italy.addAthlete(efraimMessi);


        Team Jumping_Spain = new Team(0, Spain, Athlete.eSportTypes.jumping);
        Jumping_Spain.addAthlete(Valentí_Massana);
        Jumping_Spain.addAthlete(vladimirMorinio);
        Jumping_Spain.addAthlete(vladislavRoitenberg);


        Team Jumping_Ukraine = new Team(0, Ukraine, Athlete.eSportTypes.jumping);
        Jumping_Ukraine.addAthlete(dimaSimonenko);
        Jumping_Ukraine.addAthlete(Bohdan_Bondarenko);
        Jumping_Ukraine.addAthlete(Roman_Shchurenko);

        Team Jumping_Poland = new Team(0, Poland, Athlete.eSportTypes.jumping);
        Jumping_Poland.addAthlete(diegoSalmonela);
        Jumping_Poland.addAthlete(Ryszard_Podlas);
        Jumping_Poland.addAthlete(Jan_Werner);

        Team Jumping_France = new Team(0, France, Athlete.eSportTypes.jumping);
        Jumping_France.addAthlete(coronaVirus);
        Jumping_France.addAthlete(Paul_Genevay);
        Jumping_France.addAthlete(Bernard_Laidebeur);


//creating stadiums:
        Stadium CampNou = new Stadium("Camp Nou", "Barcelona", 99354);
        Stadium EstadioSantiagoBernabéu = new Stadium("Estadio Santiago Bernabéu", "Madrid", 85454);
        Stadium EstadioMetropolitano = new Stadium("Estadio Metropolitano", "Madrid", 68456);
        Stadium EstadioBenitoVillamarín = new Stadium("Estadio Benito Villamarín", "Madrid", 60724);
        Stadium EstadioRamónSánchezPizjuán = new Stadium("Estadio Ramón Sánchez Pizjuán", "Sevilia", 45500);
        Stadium ElMolinón = new Stadium("El Molinón", "Gijón", 30000);
        Stadium EstadioNuevoArcángel = new Stadium("Estadio Nuevo Arcángel", "Córdoba", 15425);
        Stadium NouEstadi = new Stadium("Nou Estadi", "Tarragona", 12000);


        TeamCompetition jump_c = new TeamCompetition(CampNou, eran, Athlete.eSportTypes.jumping, new Date(1, 12, 2020), new Clock(8, 0));
        jump_c.addTeams(Jumping_Italy);
        jump_c.addTeams(Jumping_Spain);
        jump_c.addTeams(Jumping_Ukraine);
        jump_c.addTeams(Jumping_Poland);
        jump_c.addTeams(Jumping_France);

        TeamCompetition run_c = new TeamCompetition(EstadioSantiagoBernabéu, or, Athlete.eSportTypes.running, new Date(2, 12, 2020), new Clock(12, 0));
        run_c.addTeams(running_UnitedStates);
        run_c.addTeams(running_NewZealand);
        run_c.addTeams(running_Russian);
        run_c.addTeams(running_Jamaica);
        run_c.addTeams(running_Israel);
        run_c.addTeams(running_France);

        PersonalCompetition personal_run_Entervales = new PersonalCompetition(EstadioMetropolitano, effi, Athlete.eSportTypes.running, new Date(3, 12, 2020), new Clock(17, 0));
        personal_run_Entervales.addAthlete(Archie_Hahn);
        personal_run_Entervales.addAthlete(Nathaniel_Cartmell);
        personal_run_Entervales.addAthlete(Salvatore_Antibo);
        personal_run_Entervales.addAthlete(António_Leitão);
        personal_run_Entervales.addAthlete(Fermín_Cacho);
        personal_run_Entervales.addAthlete(José_Pedraza);
        personal_run_Entervales.addAthlete(Oleksandr_Krykun);
        personal_run_Entervales.addAthlete(Denis_Kapustin);
        personal_run_Entervales.addAthlete(Chen_Ding);
        personal_run_Entervales.addAthlete(Edson_Ribeiro);
        personal_run_Entervales.addAthlete(Ruhi_Sarialp);
        personal_run_Entervales.addAthlete(Harry_Jerome);
        personal_run_Entervales.addAthlete(Wilson_Kipketer);
        personal_run_Entervales.addAthlete(Jerzy_Pietrzyk);
        personal_run_Entervales.addAthlete(Kevan_Gosper);
        personal_run_Entervales.addAthlete(Manfred_Germar);
        personal_run_Entervales.addAthlete(effiHanamer);
        personal_run_Entervales.addAthlete(artoruDikaprio);


        PersonalCompetition personal_run_300m = new PersonalCompetition(EstadioBenitoVillamarín, timor, Athlete.eSportTypes.running, new Date(3, 12, 2020), new Clock(11, 0));
        personal_run_300m.addAthlete(Rui_Silva);
        personal_run_300m.addAthlete(Javier_García);
        personal_run_300m.addAthlete(Raúl_González);
        personal_run_300m.addAthlete(Oleksandr_Bagach);
        personal_run_300m.addAthlete(Cai_Zelin);
        personal_run_300m.addAthlete(André_da_Silva);
        personal_run_300m.addAthlete(Baron_Porritt);
        personal_run_300m.addAthlete(Eşref_Apak);
        personal_run_300m.addAthlete(Ben_Johnson);
        personal_run_300m.addAthlete(Ernst_Schultz);
        personal_run_300m.addAthlete(Usain_Bolt);
        personal_run_300m.addAthlete(Zbigniew_Jaremski);
        personal_run_300m.addAthlete(David_Lean);
        personal_run_300m.addAthlete(Jocelyn_Delecour);
        personal_run_300m.addAthlete(Heinz_Fütterer);
        personal_run_300m.addAthlete(Romeo_Bertini);
        personal_run_300m.addAthlete(Morris_Kirksey);


        PersonalCompetition personal_jump = new PersonalCompetition(EstadioRamónSánchezPizjuán, omri, Athlete.eSportTypes.jumping, new Date(4, 12, 2020), new Clock(11, 0));
        personal_jump.addAthlete(galShalit);
        personal_jump.addAthlete(leonidZevel);
        personal_jump.addAthlete(ajikBululu);
        personal_jump.addAthlete(Jordi_Llopart);
        personal_jump.addAthlete(Ernesto_Canto);
        personal_jump.addAthlete(Vladimir_Andreyev);
        personal_jump.addAthlete(Wang_Zhen);
        personal_jump.addAthlete(Mike_Ryan);
        personal_jump.addAthlete(Robson_da_Silva);
        personal_jump.addAthlete(Andrzej_Zieliński);
        personal_jump.addAthlete(Donovan_Bailey);
        personal_jump.addAthlete(Devon_Morris);
        personal_jump.addAthlete(Leon_Gregory);
        personal_jump.addAthlete(Walter_Tewksbury);
        personal_jump.addAthlete(Lothar_Knörzer);


        Olympics spain2020 = new Olympics(new Date(1, 12, 2020), new Date(16, 12, 2020));
        spain2020.addTeamCompetition(jump_c);
        spain2020.addTeamCompetition(run_c);
        spain2020.addPersonalCompetition(personal_run_Entervales);
        spain2020.addPersonalCompetition(personal_run_300m);
        spain2020.addPersonalCompetition(personal_jump);

    }
}

