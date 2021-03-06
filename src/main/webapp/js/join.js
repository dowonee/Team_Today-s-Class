var xhr = new XMLHttpRequest();
function setThumbnail(event) {
	if (event.files && event.files[0]) {
		var reader = new FileReader();
		reader.onload = function(e) {
			document.getElementById('preview').src = e.target.result;
		};
		reader.readAsDataURL(event.files[0]);
	} else {
		document.getElementById('preview').src = "";
	}
}
$("#submit").click(function() {
	if ($("[name=id]").val() == "") {
		alert("아이디를 입력해주세요");
		$("[name=id]").focus();
	} else if ($("[name=pass]").val() == "") {
		alert("비밀번호를 입력해주세요");
		$("[name=pass]").focus();
	} else if ($("[name=re_pass]").val() == "") {
		alert("비밀번호를 확인란에 입력해주세요");
		$("[name=re_pass]").focus();
	} else if ($("[name=name]").val() == "") {
		alert("이름을 입력해주세요");
		$("[name=name]").focus();
	} else if ($("[name=phone]").val() == "") {
		alert("휴대번호 입력해주세요");
		$("[name=phone]").focus();
	} else if ($("[name=zipcode]").val() == "") {
		alert("우편번호를 입력해주세요");
		$("[name=zipcode]").focus();
	} else {
		$("[name=choice]").val("회원가입");
		$("form").submit();
	}
});
$("#idCheck").click(function() {
	if ($("[name=id]").val().indexOf(" ") >= 0) {
		alert("아이디에 공백을 사용할 수 없습니다.");
		$("[name=id]").focus();
		return;
	}else{
		var id = $("[name=id]").val();
		var snd = "id="+id;
		xhr.open("post","idcheck.do",true);
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send(snd);
		xhr.onreadystatechange = function(){
			if(xhr.readyState==4&&xhr.status==200){
				alert(xhr.responseText);
				if(xhr.responseText=="이 아이디는 사용 불가능합니다"){
					$("[name=id]").val("");
				}
			}
		}
	}
})
var passCheck = /^[a-z0-9!@#$%^&*-+=]{8,15}$/;
$("[name=pass]").blur(function() {
	if (!passCheck.test($("[name=pass]").val())) {
		if ($("table tr:eq(3) td br").length) {

		}
		else {
			$("table tr:eq(3) td").append("<br><span style='color:red;'>비밀번호는 영문자+숫자+특수문자 조합으로 8~15자리 사용해야합니다</span>");
		}
	} else {
		$("table tr:eq(3) td br").remove();
		$("table tr:eq(3) td span").remove();
	}
})
$("[name=re_pass]").blur(function() {
	if ($("[name=re_pass]").val() != $("[name=pass]").val()) {
		if ($("table tr:eq(5) td br").length) {
		}
		else {
			$("table tr:eq(5) td").append("<br><span style='color:red;'>다시한번 확인해주세요</span>");
		}
	} else {
		$("table tr:eq(5) td br").remove();
		$("table tr:eq(5) td span").remove();
	}
})
function sample6_execDaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {
			var addr = '';
			var extraAddr = '';
			if (data.userSelectedType === 'R') {
				addr = data.roadAddress;
			} else {
				addr = data.jibunAddress;
			}
			document.querySelector("[name=zipcode]").value = data.zonecode;
			document.querySelector("[name=addr1]").value = addr;
			document.querySelector("[name=addr2]").focus();
		}
	}).open();
}
$("#click").click(function(){
	$("[name=profile]").click();
})
function show () {
	// 인원선택 팝업창 띄우기
	document.querySelector(".background").className = "background show";
}
function close () { 
	// 팝업창 닫기
	document.querySelector(".background").className = "background";
}
document.querySelector("#show").addEventListener('click', show);
document.querySelector("#close").addEventListener('click', close);

function show2 () {
	// 인원선택 팝업창 띄우기
	document.querySelector(".background2").className = "background2 show2";
}
function close2 () { 
	// 팝업창 닫기
	document.querySelector(".background2").className = "background2";
}
document.querySelector("#show2").addEventListener('click', show2);
document.querySelector("#close2").addEventListener('click', close2);