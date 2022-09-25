function viewContact()
{
    var name=document.getElementById("name").value;
    if(name.length===0) {
    	document.getElementById("ername").innerHTML="Name Field is mandatory";
    }else{
    	document.getElementById("frm").submit;
    }
}
