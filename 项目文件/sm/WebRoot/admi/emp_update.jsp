<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>XX超市后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8" />

 
    <!-- Bootstrap -->
<link href="assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet"><link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/vendor/animate/animate.min.css">
    <link type="text/css" rel="stylesheet" media="all" href="assets/js/vendor/mmenu/css/jquery.mmenu.all.css" />
    <link rel="stylesheet" href="assets/js/vendor/videobackground/css/jquery.videobackground.css">
    <link rel="stylesheet" href="assets/css/vendor/bootstrap-checkbox.css">

    <link rel="stylesheet" href="assets/js/vendor/rickshaw/css/rickshaw.min.css">
    <link rel="stylesheet" href="assets/js/vendor/morris/css/morris.css">
    <link rel="stylesheet" href="assets/js/vendor/tabdrop/css/tabdrop.css">
    <link rel="stylesheet" href="assets/js/vendor/summernote/css/summernote.css">
    <link rel="stylesheet" href="assets/js/vendor/summernote/css/summernote-bs3.css">
    <link rel="stylesheet" href="assets/js/vendor/chosen/css/chosen.min.css">
    <link rel="stylesheet" href="assets/js/vendor/chosen/css/chosen-bootstrap.css">

    <link href="assets/css/minimal.css" rel="stylesheet">

  <link href="assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet"><link href="assets/css/font-awesome.min.css" rel="stylesheet">
   <script src="assets/js/jquery-1.11.3/jquery.min.js"></script> 
   <script type="text/javascript">
   $(function(){
   
   	//文本框验证
	$.fn.validate = function(tips){
	
	    if($(this).val() == "" || $.trim($(this).val()).length == 0){
	        alert(tips + "不能为空！");
	        throw SyntaxError(); //如果验证不通过，则不执行后面
	    }
	};


	//用户信息添加
  $("#smit").click(function(){
  
  		$("#emp_id").validate("员工编号");
		$("#emp_name").validate("员工姓名");
		$("#emp_account").validate("员工账号");
		$("#emp_pwd").validate("员工密码");
		$("#addres").validate("家庭住址");
		$("#phone").validate("电话号码");
  	
  	
	var id=$("#emp_id").val();
  	var name=$("#emp_name").val();
 	var account=$("#emp_account").val();
 	var pwd=$("#emp_pwd").val();
 	var sex=$("#sex").val();
 	var addres=$("#addres").val();
 	var phone=$("#phone").val();
 		$.post("emp_update",
    {
		emp_id:id,
 		emp_name:name,
 		emp_account:account,
 		emp_pwd:pwd,
 		sex:sex,
 		addres:addres,
 		phone:phone
    },
    function(data){
    	alert(data);
		 $("#emp_id").val("");
		$("#emp_name").val("");
		$("#emp_account").val("");
		$("#emp_pwd").val("");
		$("#addres").val("");
		$("#phone").val("");
    });

	
  });
   
   });
   </script>
 </head>
 <body>
 		 <div id="content" class="col-md-12">
         
          <!-- content main container -->
          <div class="main">




            <!-- row -->
            <div class="row">

              <!-- col 12 -->
              <div class="col-md-12">



                <!-- tile -->
                <section class="tile color transparent-black">



                  <!-- tile header -->
                  <!-- /tile header -->

                  <!-- tile body -->
                  <div class="tile-body">
                    
                    <form class="form-horizontal" role="form">
                      
                      <div class="form-group">
                        <label  class="col-sm-4 control-label">员工编号</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control" name="emp_id" id="emp_id"><!--员工编号看这里！！！-->
                        </div>
                      </div>

                      <div class="form-group">
                        <label  class="col-sm-4 control-label">员工姓名</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control" name="emp_name" id="emp_name"><!--员工姓名！！！-->
                        </div>
                      </div>

                      <div class="form-group">
                        <label  class="col-sm-4 control-label">员工账号</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control" id="emp_account" name="emp_account" >
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label  class="col-sm-4 control-label">员工密码</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control" id="emp_pwd" name="emp_pwd" >
                        </div>
                      </div>

                      <div class="form-group">
                        <label  class="col-sm-4 control-label">员工性别</label>
                        <div class="col-sm-8">
                          <label><input type="radio" name="sex" value="男" id="sex">男</label>
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                          <label><input type="radio" name="sex" value="女" id="sex">女</label>
                        
                        </div>
                      </div>

                      <div class="form-group">
                        <label  class="col-sm-4 control-label">家庭地址</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control"name="addres" id="addres">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="col-sm-4 control-label">电话号码</label>
                        <div class="col-sm-8">
                          <input type="text" class="form-control" name="phone" id="phone">
                        </div>
                      </div>

                      

                      <div class="form-group form-footer footer-white">
                        <div class="col-sm-offset-4 col-sm-8">
						<button type="button" class="btn btn-greensea" id="smit">提交</button>
                          
                          <button type="reset" class="btn btn-red">重置</button>
                        </div>
                      </div>
                    

                    </form>

                  </div>
                  <!-- /tile body -->
                  
                


                </section>
                <!-- /tile -->



        
       



      






      </div>
      <!-- Make page fluid-->




    </div>
    <!-- Wrap all page content end -->
 		</div>
  </body>
</html>
      
