// function student(name, score) {
//   this.name = name;
//   this.score = score;
//   this.getGrade = function(){
//     if(this.score>=90){
//       return "A";
//     }
//     else if(this.score>=80){
//       return "B";
//     }
//     else{
//       return "C";
//     }
//   }
// }
// function ch() {
//   var n = document.getElementById("java");
//   n.style.color = "black";
//   n.style.fontSize = "30px";
//   n.style.display = "block";
//   n.style.border = "3px dotted deeppink";
// }
// function ch(){
//   var n = document.getElementById("ramen");
//   n.innerHTML="스폰지<img src='./images/sponge.png' alt='없음'>";
// }
// function ch(obj,size,color){
//   obj.style.color = color;
//   obj.style.fontSize = size;
// }
// function ch() {
//   var n = document.getElementsByTagName("span");
//   for(var i=0;i<n.length;i++){
//     var num=n[i];
//     num.style.color="gold";
//     num.style.fontSize="30px";
//   }
// }

// function ch(){
//   var n = document.getElementById("Body");
//   var str = ["#333","orange","gold","olive","palegreen"];
//   for(var i=0;i<str.length;i++){
//     var a = parseInt(Math.random()*5); // 0 ~ 4
//     n.style.backgroundColor = str[a];
//   }
// }
// function c(){
//   var n = document.getElementById("p");
//   n.style.color = "olive";
// }
// function c() {
//   var li = document.getElementsByTagName("li");
//   for (var i = 0; i < li.length; i++) {
//     li[i].style.backgroundColor = "yellow";
//   }
// }

// function dou() {
//   var img = document.getElementById("img");
//   img.style.transform = 'scale(2)';
// }

// function get(a) {
//   var p = a.parentElement.innerText; // 3 + 4 = 답
//   var i = p.indexOf("=") // 6
//   r.innerText = eval(p.slice(0,i,-1)); // '3 + 4 '까지 slice
//   // var an = document.getElementById("p1").textContent; //내가 찾은것
//   // a.textContent = eval(an);
// }

// var student = {
//   id : 123,
//   name : "ABC",
//   grade : "A"
// }

// function di(){
//   var i = document.getElementById("Body");
//   var j = document.createElement("div"); // div 태그를 생성함
//   j.innerHTML= "new div"; 
//   j.setAttribute("id","new");
//   j.style.backgroundColor="orange";

//   j.onclick = function(){
//     var p = this.parentElement; //부모태그요소
//     p.removeChild(this); //자신을 부모로부터 제거
//   }

//   i.appendChild(j); // 부모에 자신을 덧붙임
// }

// function p(){
//   var s = document.getElementById("s1");
//   i.style.border = "3px dotted pink";
// }

// function addr(){
//   add = document.getElementsByName("aa")[1].value+
//   ','+ document.getElementsByName("tel")[1].value;

//   item = document.createElement("li")
//   node = document.createTextNode(add);
//   item.appendChild(node);

//   result = document.getElementById("addr");
//   result.appendChild(item);
// }

// function re(){
//   document.getElementById("addr").innerHTML="";
// }

// var dan = prompt("단");
// function d(){
//   for(var i=1;i<=9;i++){
//     document.write(dan + " X " + i + " = " + (dan*i)+"<br>");
//   }
// }
// d();

// function gu(){
//   var n = prompt("input");
//   document.write(Number.isInteger(n)+"<br>");

//   while(!Number.isInteger(n)){ // n 이 정수가 아닐 때 까지 - > 정수면 멈춤
//     if(n<=9 && n>=1){
//       for(var i=1;i<=9;i++){
//         document.write(i*n + "<br>");
//       }
//       break;
//     }
//     else{
//       document.write("input");
//       break;
//     }
//   }
// }
// gu();

// document.write("<ul>");
//   for(var i=0;i<food.length;i++){
//     document.write("<li>"+food[i]+"</li>");
//   }
// document.write("</ul>");

// var a = new String("hi hi hi");
// var b = "!!!";
// document.write(a.slice(0,2));
// document.write(a.substr(3,5));
// var i = a.split(" ");
// for(var j=0;j<i.length;j++){
//   document.write(i[j]);
// }

function cl(){
  var name = document.getElementsByName("f");
  var n = document.createElement("p");
  nd = document.createTextNode("서버");
  name.appendChild(n);
  
}





