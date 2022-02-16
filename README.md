![header](https://capsule-render.vercel.app/api?type=waving&color=auto&height=300&section=header&text=Today's%20Class&fontSize=90)
---

<p align="center"><img src="https://github.com/dowonee/Team_Today-s-Class/blob/cdac82c8c9454c2ca601c77b21ced40795febd8d/%EC%98%A4%EB%8A%98%EC%9D%98%EC%88%98%EC%97%85%20(2).png?raw=true"></p>

## ⚡ 프로젝트 계획
> 학생과 선생님의 매칭을 서비스하는 재능 판매 플랫폼입니다. 
> 

---      

## ⚡ 프로젝트 기간
> 2021.08.20 - 2021.09.15

---

## ⚡ 페이지구성
> <a href="https://ibb.co/7tcVrvx"><img src="https://i.ibb.co/5hDvsTX/1.jpg" alt="1" border="0"></a>
<a href="https://ibb.co/CHZTSyy"><img src="https://i.ibb.co/Js4MSTT/2.jpg" alt="2" border="0"></a>

---

## ⚡ ERD
> <a href="https://ibb.co/XypxsHx"><img src="https://i.ibb.co/yh5Fy2F/3.png" alt="3" border="0"></a>

---

## ⚡ Permission
> <a href="https://ibb.co/CKbXpct"><img src="https://i.ibb.co/v43rCFB/5.png" alt="5" border="0"></a>
<a href="https://ibb.co/QFJTxcw"><img src="https://i.ibb.co/HDKb928/6.png" alt="6" border="0"></a>
<a href="https://ibb.co/QFJTxcw"><img src="https://i.ibb.co/HDKb928/6.png" alt="6" border="0"></a>
<a href="https://ibb.co/RgNjJxz"><img src="https://i.ibb.co/dftmHdG/8.png" alt="8" border="0"></a>

---

## ⚡ 맡은 기능구현

* 메인화면  

> <a href="https://ibb.co/KxNcpvj"><img src="https://i.ibb.co/9Hwmk59/9.png" alt="9" border="0"></a>

* 클래스 리스트

> <a href="https://ibb.co/fFgsX73"><img src="https://i.ibb.co/RbFqgWX/10.png" alt="10" border="0"></a>

* 클래스 상세페이지

> <a href="https://ibb.co/w69jnf3"><img src="https://i.ibb.co/gg5h0xH/11.png" alt="11" border="0"></a>  
> 
```
	var bookmark = "${bookmark}";
	if(bookmark!=null&&bookmark!=""){
		if(bookmark=="1"){
			$("#c_like").css("background","#6482FF");
			$("i").css("color","white");
			
		}else if(bookmark=="2"){
			$("#c_like").css("background","white");
			$("i").css("color","#6482FF");
		}
	}
```

* 고수 신청페이지

> <a href="https://ibb.co/cJcGxPC"><img src="https://i.ibb.co/G7vKFXt/12.jpg" alt="12" border="0"></a>
<a href="https://ibb.co/ZcRHgxP"><img src="https://i.ibb.co/ssp51qG/13.jpg" alt="13" border="0"></a>
<a href="https://ibb.co/cyByQrh"><img src="https://i.ibb.co/wdkd4zh/14.jpg" alt="14" border="0"></a>

```
	function cal() {
		if (document.getElementById("price").value
				&& document.getElementById("classtime").value) {
			document.getElementById('tot').value = parseInt(document
					.getElementById('price').value)
					* parseInt(document.getElementById('classtime').value);
			document.getElementById('tot2').value = document.getElementById('tot').value;
			document.getElementById('vat').value = parseInt(document.getElementById('tot2').value) * 0.1;
			document.getElementById('fee').value = (parseInt(document.getElementById('tot2').value) - parseInt(document.getElementById('vat').value))*0.2;
			document.getElementById('tax').value =  Math.round((parseInt(document.getElementById('tot2').value) - parseInt(document.getElementById('vat').value) - parseInt(document.getElementById('fee').value)) * 0.033);
			document.getElementById('final').value = (parseInt(document.getElementById('tot2').value) - parseInt(document.getElementById('vat').value) - parseInt(document.getElementById('fee').value) - parseInt(document.getElementById('tax').value))
		}
	}
```

* 외주 신청페이지

> <a href="https://ibb.co/SyQKZQ6"><img src="https://i.ibb.co/T2KHNKw/18.jpg" alt="18" border="0"></a>
<a href="https://ibb.co/fkSM285"><img src="https://i.ibb.co/QPc9f8R/19.jpg" alt="19" border="0"></a>

```
    $(function() {
        $("#datepicker").datepicker({
            dateFormat: 'yy-mm-dd' 
            ,showOtherMonths: true 
            ,showMonthAfterYear:true
            ,changeYear: true 
            ,changeMonth: true                 
            ,showOn: "both" 
            ,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" 
            ,buttonImageOnly: true
            ,buttonText: "선택"
            ,yearSuffix: "년"
            ,monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'] 
            ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']
            ,dayNamesMin: ['일','월','화','수','목','금','토']
            ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일']
            ,minDate: "-1M" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
            ,maxDate: "+1M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)                
        });       
        
	     	$(function() {
			$("#datepicker").datepicker();
		});   
	     	
        //초기값을 오늘 날짜로 설정
        $('#datepicker').datepicker('setDate', 'today');   
    });
```

* 외주 리스트

> <a href="https://ibb.co/QHvZhM7"><img src="https://i.ibb.co/VCYdbT0/20.png" alt="20" border="0"></a>

* 외주 상세페이지

> <a href="https://ibb.co/WPQL1M5"><img src="https://i.ibb.co/Hx0jQb4/21.png" alt="21" border="0"></a>

* 마이페이지
> <a href="https://ibb.co/NFNfn0P"><img src="https://i.ibb.co/XW56kng/15.jpg" alt="15" border="0"></a>
<a href="https://ibb.co/zhPL3NB"><img src="https://i.ibb.co/5WszQ2S/16.jpg" alt="16" border="0"></a>
<a href="https://ibb.co/p1HfY3x"><img src="https://i.ibb.co/tH0qVb4/17.jpg" alt="17" border="0"></a>
<a href="https://ibb.co/SyQKZQ6"><img src="https://i.ibb.co/T2KHNKw/18.jpg" alt="18" border="0"></a>
<a href="https://ibb.co/fkSM285"><img src="https://i.ibb.co/QPc9f8R/19.jpg" alt="19" border="0"></a>

```
	$(document).ready(function() {
		if($(".rev_btn").val()=='승인대기'){
			$(this).css('background','#6482FF');
		} 
		if($(".rev_btn").val()=='승인완료'){
			$(this).css('background','#f5007a');
		} 
		
		
		$(".rev_btn").click(function(){
			confirm("승인하시겠습니까?");
			$(this).val("승인완료");
			if($(".rev_btn").val()=='승인완료'){
				$(this).css('background','#f5007a');
			} 
			if($(".rev_btn").val()=='승인대기'){
				$(this).css('background','#6482FF');
			} 
		});
	});
```

```
		String SAVEFOLDER = "D:\\javaexp\\workspace\\project9\\src\\main\\webapp\\upload";
		String ENCTYPE = "UTF-8";
		int MAXSIZE =  1024 * 1024 *100;
		MultipartRequest multi = null;
		String filename = null;
		File file = new File(SAVEFOLDER);
		if (!file.exists())
			file.mkdirs();
		multi = new MultipartRequest(request, SAVEFOLDER, MAXSIZE, ENCTYPE, new DefaultFileRenamePolicy());
		if (multi.getFilesystemName("formimg") != null) {
			filename = multi.getFilesystemName("formimg");
		}
```

## ⚡ ISSUES
<details markdown="1">
<summary>펼치기</summary>

<a href="https://ibb.co/j89XFbQ"><img src="https://i.ibb.co/WHNJ1GM/1.png" alt="1" border="0"></a>
<a href="https://ibb.co/TvpNFKQ"><img src="https://i.ibb.co/C1NSTJj/2.png" alt="2" border="0"></a>

</details>
