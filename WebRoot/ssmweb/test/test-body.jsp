<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Required Stylesheets -->
<link href="<%=basePath%>bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Required Javascript -->
<script src="<%=basePath%>skin/bower_components/jquery/dist/jquery.min.js"></script>
<script src="<%=basePath%>skin/bootstrap-treeview-dist/bootstrap-treeview.min.js"></script>
</head>
<body>
<ul><li>测试框架内容</li></ul>
<div id="tree"></div>

<script type="text/javascript">
function getTree() {
    var data = [
        {
            text: "p1",
            id: '0',
            nodes: [
                { text: "p1-1", id: '1' },
                { text: "p1-2", id: '2' },
                { text: "p1-3", id: '3' },
                {
                    text: "p1-4",
                    id: "4",
                    nodes: [
                        {
                            text: 'p1-1-1',
                            id: '5'
                        }
                    ]
                }
            ]
        }
    ];
    return data;
}
$('#tree').treeview({data: getTree(),showBorder: false,onNodeSelected: function(event, data) {
    alert(data.nodeId);
    if (data.nodes === undefined || data.nodes === null) {
        return;
    }
    //$("#tree1").treeview("deleteNode", [data.nodeId, { silent: true }]);
    //nodeData是checkedNode或者selectedNode，选中或者checked这个节点， 该节点如果有父节点的话就会被删除。
}});
//$('#tree').treeview({showBorder: false});
</script>
</body>
</html>