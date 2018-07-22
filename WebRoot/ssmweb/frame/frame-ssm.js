$(document).ready(function(){  
	
	//左侧栏菜单展示
	$.ajax({ 
		url: $("#basePath").val()+"menuxx.do", 
		context: document.body, 
		type: 'POST',
		success: function(result){
        for (var i = 0; i < result.length; i++) {
			//父级菜单
			if (result[i].cd_dj=='1') {
				var option = new Array();
				option.push("<li class='treeview' id='"+result[i].menu_jc+"_li'>            ");
				option.push("  <a href='#'>                   ");
				option.push("    <i class='fa fa-files-o'></i>");
				option.push("    <span>"+result[i].menu_name+"</span>  ");
				option.push("    <span class='pull-right-container'>  ");
				option.push("    <i class='fa fa-angle-left pull-right'></i>  ");
				option.push("    </span>  ");
				option.push("  </a>                           ");
				option.push("  <ul class='treeview-menu' id='"+result[i].menu_jc+"_ul'>     ");
				option.push("  </ul>                          ");
				option.push("</li>                            ");
				$("#menu_base").append(option.join(""));
			}
		}
        for (var i = 0; i < result.length; i++) {
        	var previous_id;
        	var option = "";
        	//子级菜单
			if (result[i].cd_dj=='2') {
				var option = "<li onclick='getContent("+result[i].menu_url+")'><a><i class='fa fa-circle-o'></i> "+result[i].menu_name+"</a></li>";
				for (var j = 0; j < result.length; j++) {
					if(result[j].id==result[i].sjcd_id){
						previous_id = result[j].menu_jc+"_ul";
						break;
					}
				}
			}
			$("#"+previous_id+"").append(option);
        }
        
      }});
	
    }); 

function changeFrameSize(){
	var h = document.body.clientHeight;
	var w = document.body.clientWidth;
	$("#content-body").height(h+"px");
	$("#content-body").width(w+"px");
}