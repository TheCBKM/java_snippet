


var request;

function getCities(){
    request=new XMLHttpRequest();
    request.onreadystatechange=getResult;
    var v=document.getElementById("st").value;
    request.open("get", "ShowCity?st="+v, true);
    request.send(null);
    
}
function getResult(){
    if(request.readyState==4 && request.status==200)
        document.getElementById("ct").innerHTML=request.responseText;
    
}

