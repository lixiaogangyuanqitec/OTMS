$(function(){
	InitLeftMenu();
})

//初始化左侧
function InitLeftMenu() {
	 			var _menus = {"menus":[
							{"menuid":"1","icon":"icon-sys","menuname":"订单管理",
								"menus":[{"menuname":"订单管理1","icon":"icon-ok","url":"http://www.16sucai.com"},
										{"menuname":"订单管理2","icon":"icon-ok","url":"demo.html"},
										{"menuname":"订单管理3","icon":"icon-ok","url":"demo2.html"},
										{"menuname":"订单管理4","icon":"icon-ok","url":"demo2.html"},
										{"menuname":"订单管理5","icon":"icon-ok","url":"demo.html"},
										{"menuname":"订单管理6","icon":"icon-ok","url":"demo.html"}
									]
							},{"menuid":"8","icon":"icon-sys","menuname":"任务管理",
								"menus":[{"menuname":"任务管理1","icon":"icon-ok","url":"demo.html"},
										{"menuname":"任务管理2","icon":"icon-ok","url":"demo1.html"}
									]
							}
					]};
    $(".easyui-accordion").empty();
    var menulist = "";
   
    $.each(_menus.menus, function(i, n) {
        menulist += '<div title="'+n.menuname+'"  icon="'+n.icon+'" style="overflow:auto;">';
		menulist += '<ul>';
        $.each(n.menus, function(j, o) {
			menulist += '<li><div><a target="mainFrame" href="' + o.url + '" ><span class="icon '+o.icon+'" ></span>' + o.menuname + '</a></div></li> ';
        })
        menulist += '</ul></div>';
    })

	$(".easyui-accordion").append(menulist);
	
	$('.easyui-accordion li a').click(function(){
		var tabTitle = $(this).text();
		var url = $(this).attr("href");
		addTab(tabTitle,url);
		$('.easyui-accordion li div').removeClass("selected");
		$(this).parent().addClass("selected");
	}).hover(function(){
		$(this).parent().addClass("hover");
	},function(){
		$(this).parent().removeClass("hover");
	});

	$(".easyui-accordion").accordion();
}

function addTab(subtitle,url){
	if(!$('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('add',{
			title:subtitle,
			content:createFrame(url),
			closable:true,
			width:$('#mainPanle').width()-10,
			height:$('#mainPanle').height()-26
		});
	}else{
		$('#tabs').tabs('select',subtitle);
	}
	tabClose();
}

function createFrame(url)
{
	var s = '<iframe name="mainFrame" scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}

function tabClose()
{
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children("span").text();
		$('#tabs').tabs('close',subtitle);
	})

	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY,
		});
		
		var subtitle =$(this).children("span").text();
		$('#mm').data("currtab",subtitle);
		
		return false;
	});
}


//安全退出按钮
function loginout_link(){
	$.messager.confirm("操作提示", "您确定要退出吗？", function (data) {
        if (data) {
            window.location.href=$('#project_name').val()+"login/toLoginPage";
        }
    });
}
