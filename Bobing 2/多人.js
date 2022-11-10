
 var u = alert(window.name);
 console.log(u);
var num = document.getElementById("box");
        var num0 = false;
        var num1 = document.getElementById('one');
        var num2 = document.getElementById('two');
        var num3 = document.getElementById('three');
        var num4 = document.getElementById('four');
        var num5 = document.getElementById('five');
        var num6 = document.getElementById('six');
        var time1 = Math.random()*700;
        var time2 = Math.random()*700;
        var time3 = Math.random()*700;
        var time4 = Math.random()*700;
        var time5 = Math.random()*700;
        var time6 = Math.random()*700;
        var time11 = Math.floor((time1/117));
        var time22 = Math.floor((time2/117));
        var time33 = Math.floor((time3/117));
        var time44 = Math.floor((time4/117));
        var time55 = Math.floor((time5/117));
        var time66 = Math.floor((time6/117));
        
        var arr = [];
        arr[0] = time11;
        arr[1] = time22;
        arr[2] = time33;
        arr[3] = time44;
        arr[4] = time55;
        arr[5] = time66;
        var n1 = 0;
        var n2 = 0;
        var n3 = 0;
        var n4 = 0;
        var n5 = 0;
        var n6 = 0;
        for(var i = 0 ; i <= 5 ; i++){
            if( arr[i] === 0  ){
                n2++;
            }
            else if(arr[i] === 1){
                n5++;
            }
            else if(arr[i] === 2){
                n3++;
            }
            else if(arr[i] === 3){
                n1++;
            }
            else if(arr[i] === 4){
                n6++;
            }
            else if(arr[i] === 5){
                n4++;
            }
        }
        console.log(n1);
        console.log(n2);
        console.log(n3);
        console.log(n4);
        console.log(n5);
        console.log(n6);
       
        num.onclick =  function(){
            num1.style.animationPlayState = "running";
            num2.style.animationPlayState = "running";
            num3.style.animationPlayState = "running";
            num4.style.animationPlayState = "running";
            num5.style.animationPlayState = "running";
            num6.style.animationPlayState = "running";
            num0 = true;
       time1 = 115 * time11;
       var timer1 = setTimeout(function(){
        num1.style.animationPlayState = "paused";
       },time1);

       time2 = 115 * time22;
       var timer2= setTimeout(function(){
        num2.style.animationPlayState = "paused";
       },time2);

       time3 = 115 * time33;
       var timer3 = setTimeout(function(){
        num3.style.animationPlayState = "paused";
       },time3);

       time4 = 115 * time44;
       var timer4 = setTimeout(function(){
        num4.style.animationPlayState = "paused";
       },time4);

       time5 = 115 * time55;
       var timer5 = setTimeout(function(){
        num5.style.animationPlayState = "paused";
       },time5);

       time6 = 115 * time66;
       var timer6 = setTimeout(function(){
        num6.style.animationPlayState = "paused";
       },time6);
       var text = document.getElementById("t1");
        if(n4 === 4 && n1 === 2){
            text.innerHTML = "恭喜您!获得了\n状元插金花 - 状元"
        }
        else if(n4 === 6 ){
            text.innerHTML = "恭喜您!获得了\n满堂红 - 状元"
        }
        else if(n1 === 6){
            text.innerHTML = "恭喜您!获得了\n遍地锦 - 状元"
        }
        else if(n6 === 6 ){
            text.innerHTML = "恭喜您!获得了\n黑六勃 - 状元"
        }
        else if(n5 === 6 ){
            text.innerHTML = "恭喜您!获得了\n黑六勃 - 状元"
        }
        else if(n3 === 6 ){
            text.innerHTML = "恭喜您!获得了\n黑六勃 - 状元"
        }
        else if(n2 === 6 ){
            text.innerHTML = "恭喜您!获得了\n黑六勃 - 状元"
        }
        else if(n4 === 5 && n6 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if(n4 === 5 && n5 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if(n4 === 5 && n3 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if(n4 === 5 && n2 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if(n4 === 5 && n1 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if(n4 === 5 && n6 === 1 ){
            text.innerHTML = "恭喜您!获得了\n五红 - 状元"
        }
        else if( n1 === 5 || n2 === 5 || n3 === 5 || n5 === 5 || n6 === 5 ){
            //多人要添加
            // if(n6 === 1){

            // }
            // else if(n5 === 1){

            // }
            // else if(n4 === 1){

            // }
            // else if(n3 === 1){

            // }
            // else if(n2 === 1){

            // }
            // else if(n1 === 1){

            // }

            text.innerHTML = "恭喜您!获得了\n五子登科 - 状元"
        }
        else if( n4 === 4 ){
            var u = 0;
            // u = (n6 * 6) + ( n5 * 5 ) + ( n4 * 4 ) + ( n3 * 3 ) + ( n2 * 2 ) + ( n1 * 1 )
            text.innerHTML = "恭喜您!获得了\n四点红 - 状元"
        }
        else if( n1 === 1 &&  n2 === 1 &&  n3 === 1 &&  n4 === 1 &&  n5 === 1 &&  n6 === 1 ){
            text.innerHTML = "恭喜您!获得了\n对堂 - 榜眼"
        }
        else if( n4 === 3 ){
            text.innerHTML = "恭喜您!获得了\n三红 - 探花"
        }
        else if( n1 === 4 || n2 === 4 ||  n3 === 4 || n5 === 4 || n6 === 4 ){
            text.innerHTML = "恭喜您!获得了\n四进 - 进士"
        }
        else if( n4 === 2 ){
            text.innerHTML = "恭喜您!获得了\n二举 - 举人"
        }
        else if( n4 === 1 ){
            text.innerHTML = "恭喜您!获得了\n一秀 - 秀才"
        }
        else{
            text.innerHTML = "太可惜了！没有奖项啊！"
        }
        
        }