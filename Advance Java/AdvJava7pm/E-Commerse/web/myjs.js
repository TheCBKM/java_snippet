var request;
function getDetails(){
    request=new XMLHttpRequest();
    request.onreadystatechange=getData;
    var v=document.getElementById("uid").value;
    alert(v);
    request.open("get", "ShowUser?uid"+v, true);
    request.send(null);    
}
function getData(){
    if(request.readyState==4 && request.status==200){
     var res=request.responseText;
     alert(res);
     var s=res.split(",");
        document.getElementById("uid").value=s[0];
        document.getElementById("unm").value=s[1];
        document.getElementById("add").value=s[2];
        document.getElementById("mob").value=s[3];
        document.getElementById("pass").value=s[4];
        document.getElementById("utype").value=s[5];
    }    
    else
        alert("Error....");
}

