$(document).ready(function(){  
	
	$.ajax({ 
		url: $("#basePath").val()+"menuxx.do", 
		context: document.body, 
		type: 'POST',
		success: function(result){
        alert(result);
      }});
	
    }); 

function changeFrameSize(){
	var h = document.body.clientHeight;
	var w = document.body.clientWidth;
	$("#content-body").height(h+"px");
	$("#content-body").width(w+"px");
}