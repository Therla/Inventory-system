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
   <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script> 
  <script type="text/javascript">
$(function(){
    //退出功能
  $("#out").click(function(){
  	var flag= window.confirm("确定退出");
  	if(flag){
  		window.location.href="signOut.do";
  	}
  });
	$("#emp_id").val(${info.emp_id});
	$("#emp_name").val("${info.emp_name}");
	
	
	
	//文本框验证
	$.fn.validate = function(tips){
	
	    if($(this).val() == "" || $.trim($(this).val()).length == 0){
	        alert(tips + "不能为空！");
	        throw SyntaxError(); //如果验证不通过，则不执行后面
	    }
	};
	$("#smit").click(function(){
		$("#emp_id").validate("员工编号");
		$("#emp_name").validate("姓名");
		$("#commodity_id").validate("商品编码");
		$("#commodity_name").validate("商品名称");
		$("#commodity_type").validate("商品类型");
		$("#number").validate("数量");
		$("#selling_time").validate("售货时间");
		$("#commodity_price").validate("价格");
		
		//插入数据
		var emp_id=$("#emp_id").val();
	  	var emp_name=$("#emp_name").val();
	 	var commodity_id=$("#commodity_id").val();
	 	var commodity_name=$("#commodity_name").val();
	 	var commodity_type=$("#commodity_type").val();
	 	var number=$("#number").val();
	 	var selling_time=$("#selling_time").val();
	 	var commodity_price=$("#commodity_price").val();

	 	$.post("sale_insert.do",
			    {
					emp_id:emp_id,
					emp_name:emp_name,
					commodity_id:commodity_id,
					commodity_name:commodity_name,
					commodity_type:commodity_type,
					number:number,
					selling_time:selling_time,
					commodity_price:commodity_price

			    },
			    function(data){
			     	alert(data);
				 	$("#commodity_id").val("");
				 	$("#commodity_name").val("");
				 	$("#commodity_type").val("");
				 	$("#number").val("");
				 	$("#selling_time").val("");
				 	$("#commodity_price").val("");
		});
	
	});
	
});
 

  </script>
  </head>
  <body class="bg-1">

 

    <!-- Preloader -->
    <div class="mask"><div id="loader"></div></div>
    <!--/Preloader -->

    <!-- Wrap all page content here -->
    <div id="wrap">

      


      <!-- Make page fluid -->
      <div class="row">
        




        <!-- Fixed navbar -->
        <div class="navbar navbar-default navbar-fixed-top navbar-transparent-black mm-fixed-top" role="navigation" id="navbar">
          


          <!-- Branding -->
          <div class="navbar-header col-md-2">
            <a class="navbar-brand" >
              <strong>XX</strong>超市
            </a>
            <div class="sidebar-collapse">
              <a>
                <i class="fa fa-bars"></i>
              </a>
            </div>
          </div>
          <!-- Branding end -->


          <!-- .nav-collapse -->
          <div class="navbar-collapse">
                        
            <!-- Page refresh -->
            <ul class="nav navbar-nav refresh">
              <li class="divided">
                <a  class="page-refresh"><i class="fa fa-refresh"></i></a>
              </li>
            </ul>
            <!-- /Page refresh -->

            

            <!-- Quick Actions -->
            <ul class="nav navbar-nav quick-actions">
              
              <li class="dropdown divided">
                
                

               

             

                <li class="dropdown divided user" id="current-user">
               
                  <a  href="/market/staff/manage.html" class="dropdown-toggle options" data-toggle="dropdown">
                    <strong>员工：${info.emp_name}</strong>
                  </a>
                  
                  
  
                    <li class="divider"></li>
                    <li class="divider"></li>
  
                    <li>
                      <a href="javascript:void(0)" id="out"><i class="fa fa-power-off"></i> 登出</a>
                    </li>
                  </ul>
                </li>
  
              <!-- /Quick Actions -->
  
  
  
              <!-- 菜单栏 -->
              <ul class="nav navbar-nav side-nav" id="sidebar">
                
                <li class="collapsed-content"> 
                  <ul>
                    <li class="search"><!-- Collapsed search pasting here at 768px --></li>
                  </ul>
                </li>
  
                <li class="navigation" id="navigation">
                  <a  class="sidebar-toggle" data-toggle="#navigation">菜单栏 <i class="fa fa-angle-up"></i></a>
                  
                  <ul class="menu">
                    
                    <li class="active">
                      <a href="/market/staff/index.jsp">
                        <i class="fa fa-tachometer"></i> 主页
                      </a>
                    </li>
  
                    <li class="dropdown">
                      <a  class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-desktop"></i> 商品销售管理 <b class="fa fa-plus dropdown-plus"></b>
                    
                      </a>
                      <ul class="dropdown-menu">
                        <li>
                          <a href="/market/staff/sale_insert.jsp">
                            <i class="fa fa-caret-right"></i> 销售查询
                          </a>
                        </li>
                      </ul>
                    </li>
                   
                    <li class="dropdown">
                      <a  class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-th-large"></i> 系统管理 <b class="fa fa-plus dropdown-plus"></b>
                      </a>
                      <ul class="dropdown-menu">
                        <li>
                          <a href="/market/staff/manage.jsp">
                            <i class="fa fa-caret-right"></i> 密码修改
                          </a>
                        </li>
                      </ul>
                    </li>
                    </ul>
  
                  
  
                

                

              
            <!-- Sidebar end -->





          </div>
          <!--/.nav-collapse -->





        </div>
        <!-- Fixed navbar end -->
        




        
        <!-- Page content -->
        <div id="content" class="col-md-12">
          

          <!-- page header -->
          <div class="pageheader">
            

            <h2><i class="fa fa-tachometer"></i> 销售信息录入
            <span>请录入所需要的商品信息</span></h2>
            



          </div>
          <!-- /page header -->
          
          




           <!-- col 12 -->
           <div class="col-md-12">



         <!-- tile -->
         <section class="tile color transparent-black">


          <!-- tile header -->
          <div class="tile-header">
            <h1><strong>销售商品</strong> 录入</h1>
            <div class="controls">
              <a  class="refresh"><i class="fa fa-refresh"></i></a>
              <a  class="remove"><i class="fa fa-times"></i></a>
            </div>
          </div>
          <!-- /tile header -->

          <!-- tile body -->
          <div class="tile-body">
            
            <div class="row">

              <div class="form-group col-sm-6">
                <label for="exampleInputEmail">员工编号</label>
                <input type="text" class="form-control" id="emp_id" name="emp_id">
              </div>
              <div class="form-group col-sm-6">
                <label for="exampleInputEmail">姓名</label>
                <input type="text" class="form-control" id="emp_name" name="emp_name">
              </div>
              <div class="form-group col-sm-3">
                <label for="exampleInputEmail">商品编码</label>
                <input type="text" class="form-control" id="commodity_id" name="commodity_id">
              </div>
              <div class="form-group col-sm-3">
                <label for="exampleInputPassword1">商品名称</label>
                <input type="text" class="form-control" id="commodity_name" name="commodity_name">
              </div>
              <div class="form-group col-sm-3">
                <label for="exampleInputPassword2">商品类型</label>
                <input type="text" class="form-control" id="commodity_type" name="commodity_type">
              </div>
              <div class="form-group col-sm-3">
                <label for="exampleInputCity">数量</label>
                <input type="text" class="form-control" id="number" name="number">
              </div>

            </div>

            <div class="row">

              <div class="form-group col-sm-4">
                <label for="exampleInputCity">进货时间</label>
                <input type="text" class="form-control" id="selling_time" name="selling_time">
              </div>
              <div class="form-group col-sm-4">
                <label for="exampleInputCity">价格</label>
                <input type="text" class="form-control" id="commodity_price" name="commodity_price">
              </div>
              

          </div>
            <div class="form-group  footer-white">
              <div>
                <button type="button" class="btn btn-greensea" id="smit">提交</button><!--添加提交动作-->
                <button type="button" class="btn btn-red" id="res">重置</button>
              </div>
            </div>
          <!-- /tile body -->
        


        </section>
        <!-- /tile -->




          </div>
          <!-- /col 6 -->


          
        </div>
        <!-- /row -->
        <!-- Page content end -->




      






      </div>
      <!-- Make page fluid-->




    </div>
    <!-- Wrap all page content end -->



    <section class="videocontent" id="video"></section>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="assets/js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="assets/js/vendor/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/vendor/mmenu/js/jquery.mmenu.min.js"></script>
    <script type="text/javascript" src="assets/js/vendor/sparkline/jquery.sparkline.min.js"></script>
    <script type="text/javascript" src="assets/js/vendor/nicescroll/jquery.nicescroll.min.js"></script>
    <script type="text/javascript" src="assets/js/vendor/animate-numbers/jquery.animateNumbers.js"></script>
    <script type="text/javascript" src="assets/js/vendor/videobackground/jquery.videobackground.js"></script>
    <script type="text/javascript" src="assets/js/vendor/blockui/jquery.blockUI.js"></script>

    <script src="assets/js/vendor/flot/jquery.flot.min.js"></script>
    <script src="assets/js/vendor/flot/jquery.flot.time.min.js"></script>
    <script src="assets/js/vendor/flot/jquery.flot.selection.min.js"></script>
    <script src="assets/js/vendor/flot/jquery.flot.animator.min.js"></script>
    <script src="assets/js/vendor/flot/jquery.flot.orderBars.js"></script>
    <script src="assets/js/vendor/easypiechart/jquery.easypiechart.min.js"></script>

    <script src="assets/js/vendor/rickshaw/raphael-min.js"></script> 
    <script src="assets/js/vendor/rickshaw/d3.v2.js"></script>
    <script src="assets/js/vendor/rickshaw/rickshaw.min.js"></script>

    <script src="assets/js/vendor/morris/morris.min.js"></script>

    <script src="assets/js/vendor/tabdrop/bootstrap-tabdrop.min.js"></script>

    <script src="assets/js/vendor/summernote/summernote.min.js"></script>

    <script src="assets/js/vendor/chosen/chosen.jquery.min.js"></script>

    <script src="assets/js/minimal.min.js"></script>

    <script>
    $(function(){

      // Initialize card flip
      $('.card.hover').hover(function(){
        $(this).addClass('flip');
      },function(){
        $(this).removeClass('flip');
      });

      // Initialize flot chart
      var d1 =[ [1, 715],
            [2, 985],
            [3, 1525],
            [4, 1254],
            [5, 1861],
            [6, 2621],
            [7, 1987],
            [8, 2136],
            [9, 2364],
            [10, 2851],
            [11, 1546],
            [12, 2541]
      ];
      var d2 =[ [1, 463],
                [2, 578],
                [3, 327],
                [4, 984],
                [5, 1268],
                [6, 1684],
                [7, 1425],
                [8, 1233],
                [9, 1354],
                [10, 1200],
                [11, 1260],
                [12, 1320]
      ];
      var months = ["January", "February", "March", "April", "May", "Juny", "July", "August", "September", "October", "November", "December"];

      // flot chart generate
      var plot = $.plotAnimator($("#statistics-chart"), 
        [
          {
            label: 'Sales', 
            data: d1,    
            lines: {lineWidth:3}, 
            shadowSize:0,
            color: '#ffffff'
          },
          { label: "Visits",
            data: d2, 
            animator: {steps: 99, duration: 500, start:200, direction: "right"},   
            lines: {        
              fill: .15,
              lineWidth: 0
            },
            color:['#ffffff']
          },{
            label: 'Sales',
            data: d1, 
            points: { show: true, fill: true, radius:6,fillColor:"rgba(0,0,0,.5)",lineWidth:2 }, 
            color: '#fff',        
            shadowSize:0
          },
          { label: "Visits",
            data: d2, 
            points: { show: true, fill: true, radius:6,fillColor:"rgba(255,255,255,.2)",lineWidth:2 }, 
            color: '#fff',        
            shadowSize:0
          }
        ],{ 
        
        xaxis: {

          tickLength: 0,
          tickDecimals: 0,
          min:1,
          ticks: [[1,"JAN"], [2, "FEB"], [3, "MAR"], [4, "APR"], [5, "MAY"], [6, "JUN"], [7, "JUL"], [8, "AUG"], [9, "SEP"], [10, "OCT"], [11, "NOV"], [12, "DEC"]],

          font :{
            lineHeight: 24,
            weight: "300",
            color: "#ffffff",
            size: 14
          }
        },
        
        yaxis: {
          ticks: 4,
          tickDecimals: 0,
          tickColor: "rgba(255,255,255,.3)",

          font :{
            lineHeight: 13,
            weight: "300",
            color: "#ffffff"
          }
        },
        
        grid: {
          borderWidth: {
            top: 0,
            right: 0,
            bottom: 1,
            left: 1
          },
          borderColor: 'rgba(255,255,255,.3)',
          margin:0,
          minBorderMargin:0,              
          labelMargin:20,
          hoverable: true,
          clickable: true,
          mouseActiveRadius:6
        },
        
        legend: { show: false}
      });

      $(window).resize(function() {
        // redraw the graph in the correctly sized div
        plot.resize();
        plot.setupGrid();
        plot.draw();
      });

      $('#mmenu').on(
        "opened.mm",
        function()
        {
          // redraw the graph in the correctly sized div
          plot.resize();
          plot.setupGrid();
          plot.draw();
        }
      );

      $('#mmenu').on(
        "closed.mm",
        function()
        {
          // redraw the graph in the correctly sized div
          plot.resize();
          plot.setupGrid();
          plot.draw();
        }
      );

      // tooltips showing
      $("#statistics-chart").bind("plothover", function (event, pos, item) {
        if (item) {
          var x = item.datapoint[0],
              y = item.datapoint[1];

          $("#tooltip").html('<h1 style="color: #418bca">' + months[x - 1] + '</h1>' + '<strong>' + y + '</strong>' + ' ' + item.series.label)
            .css({top: item.pageY-30, left: item.pageX+5})
            .fadeIn(200);
        } else {
          $("#tooltip").hide();
        }
      });

      
      //tooltips options
      $("<div id='tooltip'></div>").css({
        position: "absolute",
        //display: "none",
        padding: "10px 20px",
        "background-color": "#ffffff",
        "z-index":"99999"
      }).appendTo("body");

      //generate actual pie charts
      $('.pie-chart').easyPieChart();


      //server load rickshaw chart
      var graph;

      var seriesData = [ [], []];
      var random = new Rickshaw.Fixtures.RandomData(50);

      for (var i = 0; i < 50; i++) {
        random.addData(seriesData);
      }

      graph = new Rickshaw.Graph( {
        element: document.querySelector("#serverload-chart"),
        height: 150,
        renderer: 'area',
        series: [
          {
            data: seriesData[0],
            color: '#6e6e6e',
            name:'File Server'
          },{
            data: seriesData[1],
            color: '#fff',
            name:'Mail Server'
          }
        ]
      } );

      var hoverDetail = new Rickshaw.Graph.HoverDetail( {
        graph: graph,
      });

      setInterval( function() {
        random.removeData(seriesData);
        random.addData(seriesData);
        graph.update();

      },1000);

      // Morris donut chart
      Morris.Donut({
        element: 'browser-usage',
        data: [
          {label: "Chrome", value: 25},
          {label: "Safari", value: 20},
          {label: "Firefox", value: 15},
          {label: "Opera", value: 5},
          {label: "Internet Explorer", value: 10},
          {label: "Other", value: 25}
        ],
        colors: ['#00a3d8', '#2fbbe8', '#72cae7', '#d9544f', '#ffc100', '#1693A5']
      });

      $('#browser-usage').find("path[stroke='#ffffff']").attr('stroke', 'rgba(0,0,0,0)');

      //sparkline charts
      $('#projectbar1').sparkline('html', {type: 'bar', barColor: '#22beef', barWidth: 4, height: 20});
      $('#projectbar2').sparkline('html', {type: 'bar', barColor: '#cd97eb', barWidth: 4, height: 20});
      $('#projectbar3').sparkline('html', {type: 'bar', barColor: '#a2d200', barWidth: 4, height: 20});
      $('#projectbar4').sparkline('html', {type: 'bar', barColor: '#ffc100', barWidth: 4, height: 20});
      $('#projectbar5').sparkline('html', {type: 'bar', barColor: '#ff4a43', barWidth: 4, height: 20});
      $('#projectbar6').sparkline('html', {type: 'bar', barColor: '#a2d200', barWidth: 4, height: 20});

      // sortable table
      $('.table.table-sortable th.sortable').click(function() {
        var o = $(this).hasClass('sort-asc') ? 'sort-desc' : 'sort-asc';
        $('th.sortable').removeClass('sort-asc').removeClass('sort-desc');
        $(this).addClass(o);
      });

      //todo's
      $('#todolist li label').click(function() {
        $(this).toggleClass('done');
      });

      // Initialize tabDrop
      $('.tabdrop').tabdrop({text: '<i class="fa fa-th-list"></i>'});

      //load wysiwyg editor
      $('#quick-message-content').summernote({
        toolbar: [
          //['style', ['style']], // no style button
          ['style', ['bold', 'italic', 'underline', 'clear']],
          ['fontsize', ['fontsize']],
          ['color', ['color']],
          ['para', ['ul', 'ol', 'paragraph']],
          ['height', ['height']],
          //['insert', ['picture', 'link']], // no insert buttons
          //['table', ['table']], // no table button
          //['help', ['help']] //no help button
        ],
        height: 143   //set editable area's height
      });

      //multiselect input
      $(".chosen-select").chosen({disable_search_threshold: 10});
      
    })
 </script>     


  </body>
</html>
      
    