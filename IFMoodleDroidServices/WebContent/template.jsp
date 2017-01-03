<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Moodle Services</title>

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Theme CSS -->
<link href="css/agency.min.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" class="index">
<form action="#complete" method="POST" name="api_request" class="form-horizontal" role="form" id="console">
    <fieldset>
      <input name="endpoint" value="get-several-artists" type="hidden">
      
        
          <input id="csrf_token" name="csrf_token" value="1481033587.04##13956621122efacdb829e4150548fa6779fd3cb0" type="hidden">
        
      
        
          
            <div class="form-group">
              <label class="col-sm-3 control-label required" for="ids">Spotify Artist IDs</label>
              <div class="col-sm-8">
                
                    
                    
                    <input class="form-control stored-field" id="ids" name="ids" placeholder="2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6" value="" type="text">
                
                
              </div>
            </div>
          
        
      
        
          
            <div class="form-group">
              <label class="col-sm-3 control-label" for="oauth">OAuth Token</label>
              <div class="col-sm-8">
                
                  <div class="input-group input-group-split">
                    
                      <input autocomplete="off" class="form-control" id="oauth" name="oauth" placeholder="OAuth Access Token" value="" type="text">
                      <span class="input-group-btn">
                        <input class="btn btn-sm btn-primary" data-target="getOAuthToken" data-toggle="modal" id="oauthPopup" value="Get OAuth Token" type="button">
                      </span>
                    
                  </div>
                
                
              </div>
            </div>
          
        
      
      <hr>
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-9 col-md-8 col-lg-7 col-xs-12 col-xs-offset-0">
          <input class="btn btn-sm btn-primary col-sm-4 col-xs-12 btn-try-it" value="Try it" type="submit">
          <input class="btn btn-sm btn-default col-sm-7 col-xs-12 fill-sample-data" id="fill-sample-data" value="Fill sample data" onclick="fillSampleData({&quot;_overrides&quot;: {&quot;playlist_id&quot;: null, &quot;user_id&quot;: null}, &quot;ids&quot;: &quot;2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6&quot;})" type="button">
        </div>
      </div>
      <div class="form-group curl-preview-wrapper">
        <label class="col-sm-3 control-label">cURL Command</label>
        <div class="col-sm-9">
          <div class="zero-clipboard">
            <span class="btn-clipboard">Copy</span>
          </div>
          <pre class="kbd curl-preview">curl -X GET "https://api.spotify.com/v1/artists" -H "Accept: application/json"</pre>
        </div>
      </div>
    </fieldset>
  </form>

	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

	<!-- Contact Form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

	<!-- Theme JavaScript -->
	<script src="js/agency.min.js"></script>

</body>

</html>