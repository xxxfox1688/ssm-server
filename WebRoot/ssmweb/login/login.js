/**
 * 
 */

function login(){
	//������˵�չʾ
	$.ajax({ 
		url: $("#basePath").val()+"signIn.do", 
		context: document.body, 
		data: {user_name:$("#user_name").val(),user_pwd:hex_md5($("#user_pwd").val())} ,
		type: 'POST',
		success: function(result){
        alert(result);
      }});
}