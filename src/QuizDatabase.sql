

CREATE TABLE IF NOT EXISTS `game` (
  `gameId` varchar(20) NOT NULL,
  `score` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  PRIMARY KEY (`gameid`)
) ENGINE=Innodb  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

CREATE TABLE IF NOT EXISTS `questions` (
  `questionId` varchar(11) NOT NULL,
  `question` varchar(500) NOT NULL,
  `choice1` varchar(100) NOT NULL,
  `choice2` varchar(100) NOT NULL,
  `choice3` varchar(100) NOT NULL,
  `choice4` varchar(100) NOT NULL,
  `rightchoice` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`questionid`)
) ENGINE=Innodb  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

INSERT INTO `questions` (`questionId`, `question`, `choice1`, `choice2`, `choice3`, `choice4`, `rightchoice`) VALUES (1, 'Which city is the capital of Sweden?', 'Stockholm', 'Malmo', 'Göteborg', 'Örebro', 'Stockholm')