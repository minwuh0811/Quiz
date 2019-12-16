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

INSERT INTO `questions` (`questionid`, `question`, `choice1`, `choice2`, `choice3`, `choice4`, `rightchoice`) VALUES
(1, 'Which city is the capital of Sweden?', 'Stockholm', 'Malmo', 'Göteborg', 'Örebro', 'Stockholm'),
(2, 'Who is the president of U.S.A?', 'Donald Trump', 'Barack Obama', 'George W. Bush', 'Bill Clinton', 'Donald Trump');