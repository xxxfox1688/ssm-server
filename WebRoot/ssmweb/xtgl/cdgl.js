/**
 * 
 */
$(document).ready(
		function() {
			// 上级菜单初始化
			$.ajax({
				url : $("#basePath").val() + "menu/getAllParentMenu.do",
				type : 'POST',
				success : function(result) {
					for (var i = 0; i < result.length; i++) {
						$("#sjcd_dj").append(
								"<option value='" + result[i].id + "'>"
										+ result[i].menu_name + "</option>");
					}
				}
			});
			
			//初始化树形菜单
			var defaultData;
			$.ajax({
				url : $("#basePath").val()+"menu/queryMenuInfo.do", 
				type : 'POST',
				dataType: "json",
				success : function(result) {
					defaultData=result;
					$('#tree').treeview({
						data: defaultData,
						//nodeIcon: 'glyphicon glyphicon-globe',
						emptyIcon: '', //没有子节点的节点图标
						//collapsed: true,
						showBorder: false,
						onNodeSelected: function(event, data) {
		                    alert(data.nodeId);
		                    if (data.nodes === undefined || data.nodes === null) {
		                        return;
		                    }
		                }
					});
				}
			});

		});

function cd_dj_check() {
	if ($("#cd_dj").val() == "2") {
		$("#sjcd_dj_div").show();
	} else {
		$("#sjcd_dj_div").hide();
	}
}

function addMenu() {
	var test = $('select');
	for (var i = 0; i < test.length; i++) {
		if (test[i].value == "") {
			Ewin.alert({
				message : $('label[for="' + test[i].id + '"]').text()
						+ "：下拉框未选择"
			});
			return;
		}
	}

	$.ajax({
		url : $("#basePath").val() + "cdgl/addMenu.do",
		data : {
			"menu_name" : $("#menu_name").val(),
			"menu_jc" : $("#menu_jc").val(),
			"menu_url" : $("#menu_url").val(),
			"yx_bz" : $("#yx_bz").val(),
			"xy_bz" : $("#xy_bz").val(),
			"cd_dj" : $("#cd_dj").val(),
			"sjcd_dj" : $("#sjcd_dj").val()
		},
		type : 'POST',
		success : function(result) {
			if (result == "success") {
				Ewin.alert({
					message : "菜单增加成功！"
				});
				$("#cdgl_form")[0].reset();
			} else {
				Ewin.alert({
					message : "菜单增加失败！"
				});
			}
		},
		error : function(result) {
			Ewin.alert({
				message : "菜单增加失败！"
			});
		}
	});
}
