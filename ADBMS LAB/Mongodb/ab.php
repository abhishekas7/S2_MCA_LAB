<?php

$con = new MongoDB\Driver\Manager('mongodb://localhost:27017');
echo "connected";
echo "<br>";

function insert(){
	$writer=new MongoDB\Driver\BulkWrite;
$writer->insert(["name"=>"student1"]);
$writer->insert(["name"=>"student1","rollno"=>3]);
$con->executeBulkwrite('rmcaa.stu',$writer);
echo "inserted";
}

function show(){
	global $con;
	$query= new MongoDB\Driver\Query([],[]);
	$documents=$con->executeQuery('rmcaa.stu',$query);
	foreach ($documents as $doc){
		print_r($doc);
		echo "<br>";
		print_r($doc->rollno);
	}
	
	echo "in";
	
	
}

show();
?>
<html>
<table border="1">
<tr>
<td><?php $doc ?></td>
</tr>
</table>
</html>
