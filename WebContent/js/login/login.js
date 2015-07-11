$(function(){
	password_focus();//密码框得到或失去焦点
	init_login_error();//初始化登录错误信息提示
})


//初始化登录错误信息提示
function init_login_error(){
	if($('#error_info').val()==""){
		$('#span_error_info').html("");
	}else{
		$('#span_error_info').html($('#error_info').val());
	}
}

//密码框得到或失去焦点
function password_focus(){
	//得到焦点
	$("#password").focus(function(){
		$("#left_hand").animate({
			left: "150",
			top: " -38"
		},{step: function(){
			if(parseInt($("#left_hand").css("left"))>140){
				$("#left_hand").attr("class","left_hand");
			}
		}}, 2000);
		$("#right_hand").animate({
			right: "-64",
			top: "-38px"
		},{step: function(){
			if(parseInt($("#right_hand").css("right"))> -70){
				$("#right_hand").attr("class","right_hand");
			}
		}}, 2000);
	});
	//失去焦点
	$("#password").blur(function(){
		$("#left_hand").attr("class","initial_left_hand");
		$("#left_hand").attr("style","left:100px;top:-12px;");
		$("#right_hand").attr("class","initial_right_hand");
		$("#right_hand").attr("style","right:-112px;top:-12px");
	});
}


//登录按钮的点击事件
function login_link_button(){
	if($("#username").val()==''){
		$("#username").attr("style","border:2px solid red;");
	}else{
		$("#username").attr("style","");
	}
	if($("#password").val()==''){
		$("#password").attr("style","border:2px solid red;");
	}else{
		$("#password").attr("style","");
	}
	if($("#password").val()!=''&&$("#username").val()!=''){
		location.href =$('#project_name').val()+'operator/validateOperator.action?username='+$("#username").val()+'&password='+hex_md5($("#password").val())
	}
}

