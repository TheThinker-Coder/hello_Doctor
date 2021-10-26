<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

     <style media="screen" type="text/css">

        .chat {
                width: 100%;
                height: 200px;
                border: 1px solid silver;
                overflow-y: scroll;
        }

        #msg {width: 99%;}

        h1 {text-align: center;}

        </style>
        <link rel="stylesheet" type="text/css" href="styles.css">
       
        <title>The Chat Room</title>

    <script type="text/javascript">
    
    var wsUrl;
    if (window.location.protocol == 'http:') {
        wsUrl = 'ws://';
    } else {
        wsUrl = 'wss://';
    }
    var ws = new WebSocket(wsUrl + window.location.host + "/hello_Doctor/chat");
        
    ws.onmessage = function(event) {
      var mySpan = document.getElementById("chat");
      mySpan.innerHTML+=event.data+"<br/>";
    };
     
    ws.onerror = function(event){
        console.log("Error ", event)
    } 
    function sendMsg() {
        var msg = document.getElementById("msg").value;
        if(msg)
        {
            ws.send(msg);
        }
        document.getElementById("msg").value="";
    }


    function addText()
    {
        var username = document.getElementById('msg').value;
        var msg = document.getElementById('h').value;
        olist = document.getElementById('list');
        op = document.createElement('p');
        op.innerHTML = username + "- <g>" + msg + "</g>";
        ocontent = document.getElementById('content');
        ocontent.appendChild(op);             //Add new line on click
        olist.scrollTop = olist.scrollHeight; //Adjust Height
        document.getElementById('h').value = '';
        var xmlhttp;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        }
        else
        {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.open("POST", "chatstore?uname=" + username + "&msg=" + msg, true);

        xmlhttp.onreadystatechange = function()
        {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
            {
                document.getElementById("result").innerHTML = 'sent';
                document.getElementById("result").innerHTML = '';
            }
        }
        xmlhttp.send(null);
    }
        
</script>
 

</head>

    <body>
    
    <link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
	<nav id="navbar-example2" class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="AdminPannel.jsp">HELLO DOCTOR</a>
		<ul class="nav nav-pills">
				</nav>
    



      <div class="container-fluid">
        
      </div>
    </div>
   
        <p id="result"></p>
        Welcome, 
       
            <div id="chat" class = "chat">
            </div>
              <input type="text"  class="form-control"name="msg" id="msg">
              <br>
              <br>
             
              <button  class="btn btn-primary" onclick="return sendMsg();">Send Message </button>
    

  </div>
  
</body>

</html>