/**
 * 
 */
$(document).ready(function(){  
	//上级菜单初始化
	$.ajax({ 
		url: $("#basePath").val()+"menu/getAllParentMenu.do", 
		type: 'POST',
		success: function(result){
        for (var i = 0; i < result.length; i++) {
        	$("#sjcd_dj").append("<option value='"+result[i].id+"'>"+result[i].menu_name+"</option>");
		}
      }});
});

function tj(){
	var test = $('select');
	for (var i = 0; i < test.length; i++) {
		if(test[i].value==""){
			Ewin.alert({ message: $('label[for="'+ test[i].id +'"]').text()+"：下拉框未选择" });
//			alert($('label[for="'+ test[i].id +'"]').text()+"下拉框未选择")
			return;
		}
	}
}