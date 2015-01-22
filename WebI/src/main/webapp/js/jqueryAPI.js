$( document ).ready(function(){
	$("#validate").click(function() {
		$(".validate").addClass("error");
		alert(1);
	});
});


// or:
//$( window ).load( //all code when Window is load // );



function validate2(){
$(".validate").addClass("error");
alert(2);
};