// function pr(c,n){
//   for(var i=0;i<=n;i++){
//     document.writeln(c);
//   }
// }

// var i = prompt("수식");
// document.write(eval(i));
// var n1 = prompt("n1");
// var n2 = prompt("n2");
// var n3 = prompt("sign");
// document.write(eval(n1+n3+n2));

// var names = new Array("a","bb","ccc","dddd","eeeee");
// for(var k in names){
//   document.writeln(names[k]);
// }
// var max=names[0];
// for(var i=0;i<names.length;i++){
//   if(max.length<names[i].length){
//     max=names[i];
//   }
// }
// document.write("<br>"+max);
// names.sort;
// document.write("<br>"+names[0]);
// names.sort;
// document.write("<br>"+names);

// function cl() {
//   var a = document.getElementsByTagName("span");
//   for (i = 0; i < a.length; i++) {
//     a[i].style.color = "red";
//   }
// }

// var p;
// function init(){
//   p=document.getElementById("p");
//   p.addEventListener("mouseover",over);
//   p.addEventListener("mouseout",out);
// }
// function over(){
//   p.style.backgroundColor = "orchid";
// }
// function out(){
//   p.style.backgroundColor="white";
// }

// var p;
// function init(){
//   p = document.getElementById("p");
//   p.onmouseover = over;
//   p.onmouseout = out;
// }
// function over(){
//   p.style.backgroundColor = "orchid";
// }
// function out(){
//   p.style.backgroundColor="white";
// }

// function c1(){
//   var i = document.getElementById("p1");
//   var c = document.createElement("div");
//   c.innerHTML = "서버";
//   i.appendChild(c);
//   c.onclick=function(){
//     var p = this.parentElement; // p 태그(this.parentElement)
//     p.removeChild(this); // p 태그에서 나 를 지움
//   }
// }
// function c2(){
//   var i = document.getElementById("p2");
//   var c = document.createElement("div");
//   c.innerHTML = "짜장면";
//   i.appendChild(c);
//   c.onclick=function(){
//     var p = this.parentElement;
//     p.removeChild(this);
//   }
// }
    
// var num=null;
// function cl(){
//   var n = document.getElementsByName("food");
//   //라디오 버튼을 찾아옴
//   for(var i=0;i<n.length;i++){
//     if(n[i].checked==true){
//       //어떤 라디오 버튼이 체크 되있는지 확인
//       num=n[i];
//       //체크된 버튼을 저장
//     }
//   }
//   alert(num.value+" 주문");
// }

// 배경색이 있는 부분을 클릭하면 promp()함수를 출력하고
// prompt()에 문자열을 입력하면순서대로 브라우저에 출력된다.

// function c(){
//   var i = document.getElementById("d1");
//   var n = prompt("anything");
//   var newd = document.createElement("div");
//   newd.innerText = n;
//   i.appendChild(newd);
// }

// function ce(){
//   var i = document.getElementById("dd");
//   i.value = "";
// }
// function result() {
//   var i = document.getElementById("dd");
//   i.value = eval(i.value);
// }
// function add(n){
//   var i = document.getElementById("dd");
//   i.value += n;
// }

// function c() {
//   var i = document.getElementById("aa");
//   i.value = "0";
// }
// function r() {
//   var i = document.getElementById("aa");
//   i.value = eval(i.value);
// }
// function ch(n){
//   var i = document.getElementById("aa");
//   i.value += n.value;
// }

// function on(){
//   var n = document.getElementsByClassName("qq");
//   var inp = document.getElementsByClassName("aa");
//   var count = 0;
//   for(var i=0;i<n.length;i++){
//     if(eval(n[i].textContent) == inp[i].value){
//       count++;
//     }
//     else{
//       n[i].style.textDecoration = "line-through";
//     }
//   }
//   var s = document.getElementById("grade");
//   s.textContent = count;
// }

