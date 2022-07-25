function on(){
	if(f.id.value === "" || f.age.value === ""){
	  alert("아이디와 나이는 반드시 입력되야 합니다");
    history.go(-1);
    return false;
	}
	else if(isNaN(f.age.value)){
	  alert("나이칸에는 문자로 입력할 수 없습니다");
    history.go(-1);
    return false;
	}
  return true;
}