/**
 * 
 */
function check(){
	if(fr.id.value === ""){
		alert("id공백");
		return false;
	}
	if(fr.age.value === ""){
		alert("age공백");
		return false;
	}
	else if (isNaN(fr.age.value)){
		alert("문자입력");
		return false;
	}
	return true;
}