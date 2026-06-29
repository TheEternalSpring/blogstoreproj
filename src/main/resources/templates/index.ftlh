<!doctype html>
<html lang=">">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Blog</title>
    <link rel="stylesheet" href="static/stylesheet.css">
</head>
<body>
<div>
    <a href="index">Home</a>
    <a href="about">About Us</a>
</div>

<#list posts>
<dl>
    <#items as post>
        <dt>${post.title}</dt>
        <dd>[${post.userID}]</dd>
        <dd>==${post.body}</dd>
        <br>
    </#items>
</dl>
<#else>
<p>No posts
    </#list>

</body>
</html>