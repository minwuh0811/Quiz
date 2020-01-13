<?php
include 'DatabaseConnection.php';
?>
<style>
    <?php include 'Quiz.css';?>
</style>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            var startPoint=0;
            $("button").click(function(){
                startPoint= startPoint+2;
                $("#scores").load("load-scores.php", {startNewPoint: startPoint});
            });
        });
    </script>
    <title>Document</title>
</head>
<body> 
    <Header class="Header">
          <h1 class="Rubrik">Quizzy</h1>

    </Header>
          
        <! knappar under rubrik>
    <button class="Butt1">Rules<span class="more">There are 15 questions and only one correct answer. For each correct answer, user will get one point.</span></button>
    <button class="Butt2">About<span class="more"> We are five students who were told to create a game so we created Quizzy, hope you like it! </span></button>      
                            
        <! listan med highscore>
    <p id="highscore">Highscore:</p>
<div id="scores">
    <?php
        echo"<ul>";
        $sql = "SELECT username, score FROM game ORDER BY score DESC LIMIT 0, 2";
        $result = mysqli_query($mysqli, $sql);
        if (mysqli_num_rows($result) >0) {
           while($row=mysqli_fetch_assoc($result)){
               echo "<li>";
               echo "Username: ". $row["username"] . " Score: " . $row["score"];
               echo "</li>";
        }
    }    else {
    echo "no scores ";
    }
    echo"</ul>";
    ?>
</div>

        <! vi som har gjort hemsidan och datum>
<button id="moreScores">Show more scores</button>        
<footer>
  <p class="text">Made by: Ann Mathenge, Anara Zhunusova, 
      Caroline Alfredsson, Min Wu, Amar Kovacevic</p>

</footer>
</body>
</html>