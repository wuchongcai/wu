
var $amend = document.querySelector('.amend')
var $input = document.querySelectorAll('.txt')
var $table = document.querySelector('tbody')
var $span = document.querySelectorAll('table span')
var $tr = document.querySelectorAll('table tr')
//var id,grade,year,term
$amend.onclick = function(){
	if($amend.value == '修改'){
		$amend.value = '保存'
		for (var i=0;i<$tr.length-2;i++) {
			$input[i].style.display = 'block'
			$input[i].value = $span[i].innerHTML
			$span[i].style.display = 'none'
			
		}
	}else if($amend.value == '保存'){
		for (var k=0;k<$tr.length-2;k++) {
			$amend.value = '修改'
			$span[k].innerHTML = $input[k].value
			$input[k].style.display = 'none'
			$span[k].style.display = 'block'
//			window.location.href = "http://localhost/selectgrade/behind/befor/studentView";
		}
	}
	
}

function gaibian(i){

	var grade = $("#"+i+"").val();
	var year = $(".sel2").val();
	var term = $(".sel3").val();

	$.ajax({
		url : '/selectgrade/behind/studentInsert',
		type : "POST",
	    data: {"id":i,"grade":grade,"year":year,"term":term},
		dataType : "json",
		success : function(data) {
//				$(".aaa").remove();
//				$.each(data,function(i,val){
			if(data.message=="成功"){
				$("#"+i+"").val(data.grade)
//	 			$(".sel2").val(data.year)
//	 			$(".sel3").val(data.term)
				}	
//				})
			}
				
					
				

	//window.location.href = "http://localhost/selectgrade/behind/studentInsert?id="+i+"&grade="+grade+"&year="+year+"&term="+term+"";
	})
	}
