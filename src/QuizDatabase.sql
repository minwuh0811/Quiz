DROP TABLE IF EXISTS `game`;
DROP TABLE IF EXISTS `questions`;

CREATE TABLE IF NOT EXISTS `game` (
  `gameid` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  PRIMARY KEY (`gameid`)
) ENGINE=Innodb  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

CREATE TABLE IF NOT EXISTS `questions` (
  `questionid` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(500) NOT NULL,
  `choice1` varchar(100) NOT NULL,
  `choice2` varchar(100) NOT NULL,
  `choice3` varchar(100) NOT NULL,
  `choice4` varchar(100) NOT NULL,
  `rightchoice` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`questionid`)
) ENGINE=Innodb  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

INSERT INTO `questions` (`questionId`, `question`, `choice1`, `choice2`, `choice3`, `choice4`, `rightchoice`) VALUES
('1', '1658 fick Sverige tre landskap av Danmark, två av dessa är Halland och Skåne. Vilket var det tredje?', 'Småland', 'Blekinge', 'Öland', 'Närke', 'Blekinge'),
('10', 'Koalabjörnen lever endast i Australien (vilda) och dom äter bara en sorts mat, vilken?', 'Bambu', 'Termiter', 'Eukalyptusträd', 'Acacia', 'Eukalyptusträd'),
('11', 'Vilket år var det OS i Stockholm?', '1912', '1918', '1925', '1930', '1912'),
('12', 'År 1912 lämnade Titanic hamnen och började sin resa mot New York, vilken stad åkte den ifrån?', 'London', 'Liverpool', 'Southampton', 'Plymouth', 'Southampton'),
('13', 'Vilken är världens största stad (flest invånare)?', 'New York', 'Paris', 'Tokyo', 'New Delhi', 'Tokyo'),
('14', 'Vilket är världens högsta berg?', 'K2', 'Kanchenjunga', 'Makalu', 'Mount Everest', 'Mount Everest'),
('15', 'Vilket är världens minsta land?', 'Vatikanstaten', 'Barbados', 'Monaco', 'Malta', 'Vatikanstaten'),
('16', 'I vilket land finns världens äldsta träd?', 'USA', 'England', 'Iran', 'Sverige', 'Sverige'),
('17', 'Valhajen är världens största fiskart, vad består den föda mestadels av?', 'Andra hajar', 'Andra fiskar', 'Ryggradslösa djur', 'Plankton', 'Plankton'),
('18', 'Vem har namnsdag på Julafton enligt svenska kalender?', 'Ingen', 'Adam', 'Eva', 'Jonatan, Natan och Natanael', 'Eva'),
('19', 'När grundades Google?', '1949', '1953', '1989', '1998', '1998'),
('2', 'Hur många kilo godis äter en svensk i snitt på ett år?', '17kg', '8kg', '13kg', '3kg', '17kg'),
('20', 'Mellan 1630 och 1648 pågick ett krig som Sverige deltog i, vad kallas detta krig?', '30-åriga kriget', 'Första världskriget', 'Engelska inbördeskriget', 'Sjuårskriget', '30-åriga kriget'),
('21', '1986 mördades den svenska statminister på öppen gata i Stockholm, vad hette han?', 'Ingvar Carlsson', 'Göran Persson', 'Carl Bildt', 'Olof Palme ', 'Olof Palme '),
('22', 'Vad är 3x9?', '23', '29', '27', '30', '27'),
('23', 'Vad heter Egyptens huvudstad?', 'Kairo', 'Kapstaden', 'Lagos', 'Giza', 'Kairo'),
('24', 'Vad är kroppens största organ?', 'Levern', 'Huden', 'Gallblåsan', 'Bukspottskörteln', 'Huden'),
('25', 'I vilket språk säger man ”hasta la vista”?', 'Italienska', 'Spanska', 'Tyska', 'Franska', 'Spanska'),
('26', 'Vilken är Sveriges största ö?', 'Öland', 'Hisingen', 'Gotland ', 'Orust', 'Gotland '),
('27', 'Vem målade Mona Lisa?', 'Leonardo Dicaprio', 'Leonardo da Vinci ', 'Vincent van Gogh', 'Michelangelo', 'Leonardo da Vinci '),
('28', 'I vilken kategori ingår gråsuggan?', 'Ryggradslösa djur', 'Insekter', 'Däggdjur', 'Kräftdjur', 'Kräftdjur'),
('29', 'Vad var det som kallades Digerdöden/svarta döden?', 'Påssjuka', 'Fågelinfluensan', 'Pesten', 'Röda hund', 'Pesten'),
('3', 'Vilken av dessa är inte en insekt?', 'Kackerlacka', 'Silverfisk', 'Fästing', 'Bladlus', 'Fästing'),
('30', 'Hur högt är Eiffeltornet?', '150 meter', '250 meter', '300 meter', '350 meter', '300 meter'),
('4', 'Vad är sant om fettisdagen?', 'Det är alltid andra tisdagen i februari', 'Den är 46 dagar före påsk', 'Den inträffar bara när det är skottår', 'På denna dag är man ledig', 'Den är 46 dagar före påsk'),
('5', 'Hur snabbt kan en gepard springa?', '50 km/h', '30 km/h', '100 km/h ', '80 km/h', '100 km/h '),
('6', 'Hos vem slår hjärtat snabbast?', 'Människan', 'Tiger', 'Elefant', 'Mus', 'Mus'),
('7', 'Hur stort hjärta har en blåval ungefär?', 'Bil', 'Badkar', 'Stol', 'Dom har inget hjärta', 'Bil'),
('8', 'Vad är det för årstid i Australien när det är sommar i Sverige?', 'Sommar', 'Vår', 'Höst', 'Vinter', 'Vinter'),
('9', 'Vad heter huvudstaden i Australien?', 'Canberra', 'Sydney', 'Wellington', 'Melbourne', 'Canberra');