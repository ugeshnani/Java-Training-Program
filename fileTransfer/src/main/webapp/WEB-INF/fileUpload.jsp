<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<head>
<title>Account Update</title>
</head>


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0s/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery.sumoselect/3.0.2/sumoselect.min.css">
<link rel="stylesheet" 
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.sumoselect/3.0.2/jquery.sumoselect.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<style>
body {
	/* height: 100%; */
	margin: 0;
	background-size: 1366px 768px;
	background-repeat: no-repeat;
	background-color:#daf7f8;
	display: compact;
}
.form-inline .form-control{
	width:100%;
}
.form-inline label{padding-right:10px;}
.form-inline{padding-top:3px;padding-bottom:3px;}
.sumo_responseType {
	width: 270px;
}
div.a {
  font-size: 10px;
}
.select-all {
	height: 35px !important;
}

.btnOk {
	color: blue;
}

.btnCancel {
	color: red;
}

.request_div_width {
	width: 970px !important;
}

.header_color {
	background-color: cornflowerblue !important;
	border-color: #FAEBD7;
}

.header_back_color {
	background-color: lightseagreen !important;
}

.select_box_height {
	height: 30px;
}

.mid_position {
	margin-left: 5%;
}

.option_position {
	margin-left: 5%;
	margin-top: 1%;
}

.footer_position {
	bottom: -5%;
	position: fixed;
	width: 100%;
}

.required:after {
	content: " *";
	color: red;
}

.confirm_content {
	display: inline;
}

.dp_none {
	display: none;
}

.anchor_tag_height {
	margin-top: 6px;
}

.button_bold {
	font-weight: bold;
}

.button_bold_wo_color {
	font-weight: bold;
}

.menu_color {
	background-color: lightblue;
}
.navbar-default{
  background-color: #98AFC7;
 /*  border-color: #425766; */
}
.alert{
	padding: 10px !important;
}
.ui-datepicker-trigger{
	position: absolute;
    right: 20px;
    height: 20px;
    bottom: 5px;
}
.topnav-right {
  float: right;
}

/* Ugesh added */

.col-lg-6 {
    width: 100%;
}
</style>
<script>
    $(document).ready(function () {
        getFileNames();
  });
    $("#enrollmentSpecialist").on("click", function(e){
        e.preventDefault();
        var esName= $("#enrollmentSpecialist").val();
        console.log(esName);
        if(esName.length()==0){
          alert("Please select Enrollment Specialist Name");
        }
        deleteUser(esName);
    });

function getFileName(){
    
    console.log("inside getFileNAme function");
    $.ajax({
        type: 'POST',
        url: 'getFileName',
       
        success: function(data){
            for(var i=0;i<data.length;i++){
                var value=data[i]["fileNames"]
                $("#fileNames").append('$<option>',{value:value}.text(value));
            }
        },
        error: function(e){
            console.log(e);
        },
        dataType: "json",
        contentType: "application/json; charset=utf-8"
    });
}


function saveESS() {
	console.log("print");
// 	document.addESSForm.action = "saveESS.do";
	
		$.ajax({
			type: "POST",
		    url: './saveESS.do',
		    success: function(result){
		    	alert();
		    // when successfully return from your java  
		    }, error: function(){
		       // when got error
		    }
		}); 
		 

	document.addESSForm.submit();
}
</script>
<body>
	
    <div class ="container">
        <div class ="row">
            <div class="col-lg-12">
                <div class="row">
                <form:form>
                    <div class="col-lg-3"  >
                    <label class="control-label" style="float:center;margin-top:50px" >File Name</label>	
                    </div>
                    <div class="col-lg-3">
                    <select path="enrollmentSpecialist" style="float:center;margin-top:50px" id="fileNames" class="form-control input-sm" style="float:right;">
                        <option value="" label="Choose"></option>
                        <option value="Ellen Ward" label="Ellen Ward"> Ellen Ward</option>
                        <option value="Michael Andrews" label="Michael Andrews">Michael Andrews</option>
                        <option value="multi-Tenant" label="Multi-Tenant">multi-Tenant</option>
                    <select>
                    </div> 
                     </form:form> 
                </div>
        </div>
      </div>
    </div>
	
	
	
</body>
</html>