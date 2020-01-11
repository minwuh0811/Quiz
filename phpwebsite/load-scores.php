
<?php
 include 'DatabaseConnection.php';
        $startNewPoint= $_POST['startNewPoint'];

        $sql = "SELECT username, score FROM game ORDER BY score DESC LIMIT $startNewPoint, 2";
        $result = mysqli_query($mysqli, $sql);
        if (mysqli_num_rows($result) >0) {
           while($row=mysqli_fetch_assoc($result)){
               echo "<li>";
               echo "Username: ". $row["username"] . " Score: " . $row["score"];
               echo "</li>";
        }
    }    else {
    echo "no more scores! ";
    }
    ?>
<style>
    <?php include 'load-scores.css';?>
</style>    

