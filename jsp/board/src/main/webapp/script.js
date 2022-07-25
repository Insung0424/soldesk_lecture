function inputCheck() // 회원가입버튼을 누르면 호출되는 함수 입력하지 않은 값이 있으면 경고창이 뜸
                        // 정상이면 회원가입이 완료됨
{
    if (document.regFrm.id.value == "") {
        alert("아이디 입력 필요");
        document.regFrm.id.focus();
        return;
    }
 
    if (document.regFrm.pwd.value == "") {
        alert("비밀번호 입력 필요");
        document.regFrm.pwd.focus();
        return;
    }
 
    if (document.regFrm.pwd.value == "") {
        alert("비밀번호를 확인하세요");
        document.regFrm.pwd.focus();
        return;
    }
 
    if (document.regFrm.pwd.value != document.regFrm.repwd.value) // 입력한 비밀번호와 대조
                                                                    // 안 맞으면 경고 메시지 나옴
                                                                   
    {
        alert("비밀번호가 일치하지 않습니다");
        document.regFrm.repwd.value = "";
        document.regFrm.id.focus();
        return;
    }
 
    if (document.regFrm.name.value == "") {
        alert("이름 입력 필요");
        document.regFrm.name.focus();
        return;
    }
 
    if (document.regFrm.birthday.value == "") {
        alert("생년월일 입력 필요");
        document.regFrm.birthday.focus();
        return;
    }
 
    if (document.regFrm.email.value == "") {
        alert("이메일 입력 필요");
        document.regFrm.email.focus();
        return;
    }
 
    var str = document.regFrm.email.value;
    var atPos = str.indexOf('@');
    var atLastPos = str.lastIndexOf('@');
    var dotPos = str.indexOf('.');
    var spacePos = str.indexOf('');
    var commaPos = str.indexOf(',');
    var eMailSize = str.length;
    if (atPos > 1 && atPos == atLastPos && dotPos > 3 && spacePos == -1
            && commaPos == -1 && atPos + 1 < dotPos && dotPos + 1 < eMailSize)
        ;
    else {
        alert('이메일 주소 형식이 잘못됨');
        document.regFrm.email.focus();
        return;
        // 이메일 형식을 검사하는 부분입니다.
    }
 
    if (document.regFrm.zipcode.value == "") {
        alert("우편번호를 검색해 주세요");
        return;
    }
 
    if (document.regFrm.job.value == "") {
        alert("직업 입력 필요");
        document.regFrm.job.focus();
        return;
    }
 
    document.regFrm.submit();
}
 
function win_close() {
    self.close();
}