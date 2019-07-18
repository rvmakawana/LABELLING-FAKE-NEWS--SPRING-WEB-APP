<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fake News</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<h1>Fake News Detection</h1>
 <div class="container">
<form action="/update" method="post">
 <input type="hidden" class="form-control" name="id"  value="${fake.id}"/>

 ${fake.tweet_text}
  <div class="form-group row">
    <label for="score" class="col-sm-2 col-form-label">Ground Truth Score</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control-plaintext" name="score" id="score" >
    </div>
  </div>
   <div class="form-group row">
    <label for="impac" class="col-sm-2 col-form-label">Impact Score</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control-plaintext" name="impac" id="impac" >
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Save</button>
    </div>
  </div>
</form>
</div>
</body>
</html>