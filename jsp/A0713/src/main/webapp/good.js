/**
 * 
 */
	function select() {
		let email3 = document.getElementById("email3");
		let email = document.getElementById("email2");
		email.value = email3.value;
	}
	
	function on() {
		if(f.id.value.length<=3){
			alert("아이디는 4자이상이어야합니다");
			return false;
		}
		else if(f.pw.value !== f.pwc.value){
			alert("비밀번호가 서로 다릅니다");
			return false;
		}
		else if(f.paddr.value.indexOf("-")===-1){
			alert("우편번호는 -가 포함되어야합니다");
			f.paddr.focus();
			return false;
		}
		else if(f.name.value==="" || 
				f.id.value==="" ||
				f.email.value==="" ||
				f.email2.value==="" ||
				f.paddr.value==="" ||
				f.addr.value==="" ||
				f.addr2.value===""){
			alert("필수 항목을 입력하지 않았습니다");
			return false;
		}
		return true;
	}